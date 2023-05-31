package entities;

import java.time.Duration;
import java.util.ArrayList;

public class VooDireto extends Voo {

    public VooDireto(int ano, int mes, int dia, int hora, int min, int m, Rota rt, Status sts) {
        super(ano, mes, dia, hora, min, m, rt, sts);
    }

    public VooDireto(Rota rt, Status sts) {
        super(rt, sts);
    }

    public Rota getRota() {
        return super.getRota();
    }

    public Duration getDuratio() {
        return super.getDuracao();
    }
}
