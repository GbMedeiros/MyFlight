package entities;

/*
    Aeronave: possui um código, uma descrição e uma capacidade de passageiros
 */
public class Aeronave implements Imprimivel, Contavel{
    private String codigo;
    private String descricao;
    private int assentos;
    private static int qtd = 0;

    public Aeronave(String codigo, String descricao, int assentos) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.assentos = assentos;
        qtd++;
    }

    public void contavel() {
        System.out.println("numero de objetos criados: "+qtd);
    }
    public void imprimir() {
        System.out.println(codigo + " - " + descricao + " - " +assentos);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public static int getQtd() {
        return qtd;
    }

    @Override
    public String toString() {
        return String.format("%s %-15s %3d", codigo, descricao, assentos);
    }
}
