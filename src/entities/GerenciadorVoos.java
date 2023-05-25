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

