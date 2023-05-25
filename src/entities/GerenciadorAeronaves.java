package entities;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class GerenciadorAeronaves {
    private HashMap<String, Aeronave> aeronaves;
    private Aeronave aero;

    // add com arquivos

    private static GerenciadorAeronaves instance;

    private GerenciadorAeronaves() {
        aeronaves = new HashMap<String, Aeronave>();
    }

    public static GerenciadorAeronaves getInstance() {
        if (instance == null) instance = new GerenciadorAeronaves();
        return instance;
    }

    public Aeronave buscar(String codigo) {
        return aeronaves.get(codigo);
    }

    public void inserir(Aeronave aeronave) {
        aeronaves.put(aeronave.getCodigo(), aeronave);
    }

    public Boolean leituraDados(String file) {
        Path p = Paths.get(file);
        try (BufferedReader reader = Files.newBufferedReader(p, Charset.forName("utf8"))) {
            String line = null;

            while ((line = reader.readLine()) != null) {
                String[] dado = line.split(";");
                String cod = dado[0];
                String descricao = dado[1];
                Integer assentos = Integer.parseInt(dado[2]);
                Aeronave a = new Aeronave(cod, descricao, assentos);
                inserir(a);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ;
        return true;
    }


    @Override
    public String toString() {
        StringBuilder rt = new StringBuilder("\n\n            Gerenciador Aeronaves");
        for (Aeronave a : aeronaves.values()) {
            rt.append("\n");
            rt.append(a.toString());
        }
        return rt.toString();
    }
}
