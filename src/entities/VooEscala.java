package entities;

public class VooEscala extends Voo{

    private Rota rotaFinal;
    public VooEscala(int ano, int mes, int dia, int hora, int min, int m, Rota rt, Status sts, Rota rf) {
        super(ano, mes, dia, hora, min, m, rt, sts);
        rotaFinal = rf;
    }

    public VooEscala(int m, Rota rt, Status sts, Rota rf) {
        super(m, rt, sts);
        rotaFinal = rf;
    }

    @Override
    public String toString() {
        return  super.toString()+ " -> "+ rotaFinal;
    }

}
