package entities;
/*
    Rota: é identificada por uma aeronave, aeroporto de origem, aeroporto de destino e companhia aérea
*/

public class Rota {
    private Cia cia;
    private Aeroporto origem;
    private Aeroporto destino;
    private Aeronave aeronave;

    public Rota(Cia cia, Aeroporto origem, Aeroporto destino, Aeronave aeronave) {
        this.cia = cia;
        this.origem = origem;
        this.destino = destino;
        this.aeronave = aeronave;
    }
    @Override
    public String toString(){
        return String.format("| %s | %s | %s | %s",cia.getCodigo(),origem.getCodigo(), destino.getCodigo(), aeronave.getCodigo());
    }

}
