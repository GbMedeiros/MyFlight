package entities;

import java.util.ArrayList;

public class VooVariasEscalas extends Voo {

    private ArrayList<Cia> escala;
    public VooVariasEscalas(int ano, int mes, int dia, int hora, int min, int m, Rota rt, Status sts, int e) {
        super(ano, mes, dia, hora, min, m, rt, sts);
        escala = new ArrayList<Cia>();
        escala.add(rt.getCia());
    }

    public VooVariasEscalas(Rota rt, Status sts) {
        super(rt, sts);
        escala = new ArrayList<Cia>();
        escala.add(rt.getCia());
    }


    public ArrayList getRotas() {
        return escala;
    }

    @Override
    public String toString() {
        return super.toString() + " | Paradas: " +escala;
    }
}
