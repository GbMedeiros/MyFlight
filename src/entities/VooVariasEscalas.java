package entities;

import java.util.ArrayList;

public class VooVariasEscalas extends Voo {

    private ArrayList<Rota> escala;
    public VooVariasEscalas(int ano, int mes, int dia, int hora, int min, int m, Rota rt, Status sts, int e) {
        super(ano, mes, dia, hora, min, m, rt, sts);
        escala = new ArrayList<Rota>();
        escala.add(rt);
    }

    public VooVariasEscalas(Rota rt, Status sts) {
        super(rt, sts);
        escala = new ArrayList<Rota>();
        escala.add(rt);
    }

    public void addRota(Rota nova){
        escala.add(nova);
    }

    public ArrayList getRotas() {
        return escala;
    }

    @Override
    public String toString() {
        return super.toString() + " paradas: " +escala;
    }
}
