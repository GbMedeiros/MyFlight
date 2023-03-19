package entities;

/*
    Aeroporto: possui um código, um nome e uma localização geográfica (latitude e longitude);
 */
public class Aeroporto {
    private String codigo;
    private String nome;
    private Geo geo;

    public Aeroporto(String codigo, String nome, double latitude, double longitude) {
        geo = new Geo();
        this.codigo = codigo;
        this.nome = nome;
        this.geo.setLatitude(latitude);
        this.geo.setLongitude(longitude);

    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Geo getGeo() {
        return geo;
    }

    @Override
    public String toString() {
        return String.format("|%3s| %-15s %6.4f | %6.4f", codigo, nome, geo.getLatitude(), geo.getLongitude());
    }

}
