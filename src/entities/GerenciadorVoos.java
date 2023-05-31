package entities;

import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;

public class GerenciadorVoos {
    private VooVariasEscalas voo;
    private ArrayList<VooVariasEscalas> voos;
    private static GerenciadorVoos instance;

    private GerenciadorVoos() {
        voos = new ArrayList<>();
    }

    public static GerenciadorVoos getInstance() {
        if (instance == null) instance = new GerenciadorVoos();
        return instance;
    }

    public void inserir(VooVariasEscalas voo) {
        voos.add(voo);
    }

    public String buscar(int y, int m, int d) {
        StringBuilder sb = new StringBuilder("");
        LocalDate dat = LocalDate.of(y, m, d);
        for (Voo v : voos) {
            if (v.getData().isEqual(dat)) {
                sb.append("\n");
                sb.append(v.toString());
            } else {
                String.format("Nao possui voos");
            }
        }
        return String.format("%s", sb);
    }


    public Boolean leituraDados(String file) {

        GerenciadorCias airlines = GerenciadorCias.getInstance();
        GerenciadorAeroportos airports = GerenciadorAeroportos.getInstance();
        GerenciadorAeronaves equipments = GerenciadorAeronaves.getInstance();

        Path p = Paths.get(file);
        try (BufferedReader reader = Files.newBufferedReader(p, Charset.forName("utf8"))) {
            String line = null;

            while ((line = reader.readLine()) != null) {
                String[] dados = line.split(";");

                //# airline;from;to;codeshare;stops;equipment

                Cia cia = airlines.buscarCod(dados[0]);
                Aeroporto from = airports.buscar(dados[1]);
                Aeroporto to = airports.buscar(dados[2]);
                String codAero = dados[5].trim().substring(0, 3);
                Aeronave aviao = equipments.buscar(codAero);

                Rota r = new Rota(cia, from, to, aviao);
                VooVariasEscalas v = new VooVariasEscalas(r, Status.Confirmado );
                inserir(v);

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return true;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\n\n            Gerenciador de Voos");
        for (Voo v : voos) {
            sb.append("\n");
            sb.append(v.toString());
        }
        return String.format("%s", sb);
    }
}

