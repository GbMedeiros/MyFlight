package entities;

import java.util.ArrayList;

public class VooVariasEscalas extends Voo {

    private int escalas = 0;

    private ArrayList rotas;
    public VooVariasEscalas(int ano, int mes, int dia, int hora, int min, int m, Rota rt, Status sts, int e) {
        super(ano, mes, dia, hora, min, m, rt, sts);
        escalas = e;
        rotas = new ArrayList<>();
        rotas.add(rt);
        escalas++;
    }

    public VooVariasEscalas(int m, Rota rt, Status sts, int e) {
        super(m, rt, sts);
        rotas = new ArrayList<>();
        rotas.add(rt);
        escalas++;
    }

    public void addRota(Rota nova){
        rotas.add(nova);

    }

    @Override
    public String toString() {
        return super.toString() + " paradas: " +escalas;
    }
}
