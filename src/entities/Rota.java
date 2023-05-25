package entities;
/*
    Rota: é identificada por uma aeronave, aeroporto de origem, aeroporto de destino e companhia aérea
*/

public class Rota implements Comparable<Rota> {
    private Cia cia;
    private Aeroporto origem;
    private Aeroporto destino;
    private Aeronave aeronave;
    private static int qtd = 0;

    public Rota(Cia cia, Aeroporto origem, Aeroporto destino, Aeronave aviao) {
        this.cia = cia;
        this.origem = origem;
        this.destino = destino;
        aeronave = aviao;
        qtd++;

    }

    public Cia getCia() {
        return cia;
    }

    public void setCia(Cia cia) {
        this.cia = cia;
    }

    public Aeroporto getOrigem() {
        return origem;
    }

    public void setOrigem(Aeroporto origem) {
        this.origem = origem;
    }

    public Aeroporto getDestino() {
        return destino;
    }

    public void setDestino(Aeroporto destino) {
        this.destino = destino;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

    public static int getQtd() {
        return qtd;
    }

    @Override
    public String toString(){
        String aero = "";
        if(aeronave == null)
            aero = "sem aeronave";
        else  aero = aeronave.getCodigo();
        return String.format("%s | %s | %s | %s",cia.getCodigo(),origem.getCodigo(), destino.getCodigo(), aero);
    }
    public String getRota(){
        return String.format("%s: %s-%S",cia.getCodigo(),origem.getCodigo(),destino.getCodigo());
    }

    @Override
    public int compareTo(Rota o) {
        return cia.getNome().compareTo(o.getCia().getNome());
    }
}
