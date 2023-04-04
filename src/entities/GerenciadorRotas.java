package entities;

import java.util.ArrayList;
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
    public String buscarDestino(String destino){
        StringBuilder sb = new StringBuilder("");
        for(Rota r : rotas){
            if (r.getDestino().getNome().equals(destino)) {
                sb.append("\n");
                sb.append(r.toString());
            }
        }
        return String.format("%s", sb);
    }


    public void inserir(Rota rota) {
        rotas.add(rota);
    }

    @Override
    public String toString() {
        StringBuilder rt = new StringBuilder("\n\n            Gerenciador Rotas");
        for (Rota r : rotas) {
            rt.append("\n");
            rt.append(r.toString());
        }
        return String.format("%s", rt);
    }
}
