package entities;

import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

public class GerenciadorCias {
    private Cia cia;
    private HashMap<String, Cia> cias;
    private static GerenciadorCias instance;

    private GerenciadorCias() {
        cias = new HashMap<>();
    }

    public static GerenciadorCias getInstance() {
        if (instance == null) {
            instance = new GerenciadorCias();
        }
        return instance;
    }

    public void inserir(Cia cia) {
        cias.put(cia.getCodigo(), cia);
    }

    public Cia buscarCod(String cod) {
        return cias.get(cod);
    }

    public Cia buscarNome(String nome) {
        return cias.get(nome);
    }

    public Boolean leituraDados(String file){
        Path p = Paths.get(file);

        try (BufferedReader reader = Files.newBufferedReader(p, Charset.forName("utf8"))) {
            String line = null;

            while ((line = reader.readLine()) != null) {
                String[] dados = line.split(";");
                String codigo = dados[0];
                String name = dados[1];

                Cia c = new Cia(codigo, name);
                inserir(c);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\n\n            Gerenciador de Companhias");
        for (Cia c : cias.values()) {
            sb.append("\n");
            sb.append(c.toString());
        }
        return String.format("%s", sb);
    }
}
