package entities;

import java.util.ArrayList;

public class GerenciadorCias {
    private Cia cia;
    private ArrayList<Cia> cias;
    private static GerenciadorCias instance;

    private GerenciadorCias() {
        cias = new ArrayList<>();
    }

    public static GerenciadorCias getInstance() {
        if (instance == null) {
            instance = new GerenciadorCias();
        }
        return instance;
    }

    public void inserir(Cia cia) {
        cias.add(cia);
    }

    public Cia buscarCod(String cod) {
        for (Cia c : cias) if (c.getCodigo().equalsIgnoreCase(cod)) return c;
        return null;
    }

    public Cia buscarNome(String nome) {
        for (Cia c : cias) if (c.getNome().equalsIgnoreCase(nome)) return c;
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\n\n            Gerenciador de Companhias");
        for (Cia c : cias) {
            sb.append("\n");
            sb.append(c.toString());
        }
        return String.format("%s", sb);
    }
}
