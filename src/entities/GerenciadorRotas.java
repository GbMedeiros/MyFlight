package entities;

import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GerenciadorRotas {
    private ArrayList<Rota> rotas;
    private Rota rota;

    private GerenciadorRotas() {
        rotas = new ArrayList<>();
    }

    private static GerenciadorRotas instance;

    public static GerenciadorRotas getInstance() {
        if (instance == null) instance = new GerenciadorRotas();
        return instance;
    }

    //list
    public String buscarOrigem(String origem) {
        StringBuilder sb = new StringBuilder("");
        for (Rota r : rotas) {
            if (r.getOrigem().getNome().equals(origem)) {
                sb.append("\n");
                sb.append(r.toString());
            }
        }
        return String.format("%s", sb);
    }

    public String buscarDestino(String destino) {
        StringBuilder sb = new StringBuilder("");
        for (Rota r : rotas) {
            if (r.getDestino().getNome().equals(destino)) {
                sb.append("\n");
                sb.append(r.toString());
            }
        }
        return String.format("%s", sb);
    }

    //duvida

    public void inserir(Rota rota) {
        rotas.add(rota);
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
                inserir(r);

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return true;
    }


    @Override
    public String toString() {
        StringBuilder rt = new StringBuilder("\n\n            Gerenciador Rotas");
        for (Rota r : rotas) {
            rt.append("\n");
            rt.append(r.toString());
        }
        return rt.toString();
    }

}
