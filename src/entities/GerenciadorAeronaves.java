package entities;

import java.util.ArrayList;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> aeronaves;
    private Aeronave aero;

    private static GerenciadorAeronaves instance;

    private GerenciadorAeronaves() {
        aeronaves = new ArrayList<>();
    }

    public static GerenciadorAeronaves getInstance() {
        if (instance == null) instance = new GerenciadorAeronaves();
        return instance;
    }

    public Aeronave buscar(Aeronave aeronave) {
        for (Aeronave a : aeronaves) if (a.getCodigo() == aeronave.getCodigo()) return aeronave;
        return null;
    }

    public void inserir(Aeronave aeronave) {
        aeronaves.add(aeronave);
    }

    @Override
    public String toString() {
        StringBuilder rt = new StringBuilder("\n            Gerenciador Aeronaves");
        for (Aeronave a : aeronaves) {
            rt.append("\n");
            rt.append(a.toString());
        }
        return String.format("%s", rt);
    }
}
