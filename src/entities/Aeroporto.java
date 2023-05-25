package entities;

/*
    Aeroporto: possui um código, um nome e uma localização geográfica (latitude e longitude);
 */
public class Aeroporto implements Comparable<Aeroporto> {
    private String codigo;
    private String nome;
    private Geo geo;
    private static int qtd = 0;

    public Aeroporto(String codigo, String nome, float latitude, float longitude) {
        geo = new Geo();
        this.codigo = codigo;
        this.nome = nome;
        this.geo.setLatitude(latitude);
        this.geo.setLongitude(longitude);
        qtd++;


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

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public static int getQtd() {
        return qtd;
    }

    public static void distancia(Voo voo) {

    }

    @Override
    public int compareTo(Aeroporto o) {
        return nome.compareTo(o.getNome());
    }

    @Override
    public String toString() {
        return String.format("|%3s| %-30s %6.4f | %6.4f", codigo, nome, geo.getLatitude(), geo.getLongitude());
    }

}
