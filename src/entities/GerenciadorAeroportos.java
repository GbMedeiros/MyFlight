package entities;

import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

public class GerenciadorAeroportos {
    private HashMap<String, Aeroporto> aeroportos;
    private Aeroporto aeroporto;
    private static GerenciadorAeroportos instance;

    private GerenciadorAeroportos() {
        aeroportos = new HashMap<String, Aeroporto>();
    }

    public static GerenciadorAeroportos getInstance() {
        if (instance == null) {
            instance = new GerenciadorAeroportos();
        }
        return instance;
    }


    public Aeroporto buscar(String cod) {
        return aeroportos.get(cod);
    }

    public void inserir(Aeroporto aero) {
        aeroportos.put(aero.getCodigo(), aero);
    }

    public Boolean leituraDados(String file) {
        Path p = Paths.get(file);
        try ( BufferedReader reader = Files.newBufferedReader(p, Charset.forName("utf8")) ) {

            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] dados = line.split(";");
                String cod = dados[0];
                String name = dados[3]+":"+dados[4];

                Float lat = Float.parseFloat(dados[1]);
                Float lon = Float.parseFloat(dados[2]);

                Aeroporto a = new Aeroporto(cod, name, lat, lon);
                inserir(a);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        ;
        return true;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("\n\n            Gerenciador de Aeropostos");
        for (Aeroporto a : aeroportos.values()) {
            sb.append("\n");
            sb.append(a.toString());
        }
        return String.format("%s ", sb);
    }
}
