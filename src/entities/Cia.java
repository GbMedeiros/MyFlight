package entities;

/*
    Companhia Aérea: possui um código e um nome;
 */
public class Cia {
    private String codigo;
    private String nome;

    public Cia(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return String.format("|%2s| %s", codigo, nome);
    }
}