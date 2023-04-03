package entities;

/*
    Aeronave: possui um código, uma descrição e uma capacidade de passageiros
 */
public class Aeronave {
    private String codigo;
    private String descricao;
    private int assentos;

    public Aeronave(String codigo, String descricao, int assentos) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.assentos = assentos;
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

    @Override
    public String toString() {
        return String.format("%3s %-15s %3d", codigo, descricao, assentos);
    }
}
