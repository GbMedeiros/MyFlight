package entities;
/*
    Aeroporto: possui um código, um nome e uma localização geográfica (latitude e longitude);
 */
public class Aeroporto {
    private String codigo;
    private String nome;
    private Geo geo;
    public Aeroporto(String codigo, String nome, Geo geo){
        this.codigo = codigo;
        this.nome = nome;
        this.geo = geo;
    }

}
