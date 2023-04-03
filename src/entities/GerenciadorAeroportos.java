package entities;

import java.util.ArrayList;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> aeroportos;
    private Aeroporto aeroporto;
    private static GerenciadorAeroportos instance;

    private GerenciadorAeroportos() {
        aeroportos = new ArrayList<>();
    }

    public static GerenciadorAeroportos getInstance() {
        if (instance == null) {
            instance = new GerenciadorAeroportos();
        }
        return instance;
    }


    public Aeroporto buscar(Aeroporto aero) {
        for (Aeroporto a : aeroportos) {
            if (a.getCodigo() == aero.getCodigo()) {
                return aero;
            }
        }
        return null;
    }

    public void inserir(Aeroporto aero) {
        aeroportos.add(aero);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\n            Gerenciador de Aeropostos");
        for (Aeroporto a : aeroportos) {
            sb.append("\n");
            sb.append(a.toString());
        }
        return String.format("%s ", sb);
    }
}
