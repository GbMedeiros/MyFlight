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

    public Cia buscarCod(Cia cia) {
        for (Cia c : cias) {
            if (c.getCodigo() == c.getCodigo()) {
                return cia;
            }
        }
        return null;
    }

    public Cia buscarNome(Cia cia) {
        for (Cia c : cias) {
            if (c.getNome() == cia.getNome()) return cia;
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\n            Gerenciador de Companhias");
        for (Cia c : cias) {
            sb.append("\n");
            sb.append(c.toString());
        }
        return String.format("%s", sb);
    }
}
