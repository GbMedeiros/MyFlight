package entities;

public class Geo {
    private double latitude;
    private double longitude;
    private static final double raio = 6371;
    private static int qtd = 0;

    public Geo() {

    }

    public Geo(double lat, double lon) {
        latitude = lat;
        longitude = lon;
        qtd++;

    }

    public double getLatitude() {
        return latitude;
    }


    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public static int getQtd() {
        return qtd;
    }

    public static double distancia(Geo ponto1, Geo ponto2) {
        int raioTerra = 6371; // raio da Terra em km
        double diferencaLat = Math.toRadians(ponto2.getLatitude() - ponto1.getLatitude());
        double diferencaLon = Math.toRadians(ponto2.getLongitude() - ponto1.getLongitude());
        double a = Math.sin(diferencaLat / 2) * Math.sin(diferencaLat / 2)
                + Math.cos(Math.toRadians(ponto1.getLatitude())) * Math.cos(Math.toRadians(ponto2.getLatitude()))
                * Math.sin(diferencaLon / 2) * Math.sin(diferencaLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distancia = raioTerra * c;
        return distancia;
    }

    public double distancia(Geo ponto1) {
        int raioTerra = 6371; // raio da Terra em km
        double diferencaLat = Math.toRadians(this.latitude - ponto1.getLatitude());
        double diferencaLon = Math.toRadians(this.longitude - ponto1.getLongitude());
        double a = Math.sin(diferencaLat / 2) * Math.sin(diferencaLat / 2)
                + Math.cos(Math.toRadians(ponto1.getLatitude())) * Math.cos(Math.toRadians(this.latitude))
                * Math.sin(diferencaLon / 2) * Math.sin(diferencaLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distancia = raioTerra * c;
        return distancia;
    }

    public static double distancia(Voo voo) {
        int raioTerra = 6371; // raio da Terra em km
        double diferencaLat = Math.toRadians(voo.getRota().getDestino().getGeo().getLatitude() - voo.getRota().getOrigem().getGeo().getLatitude());
        double diferencaLon = Math.toRadians(voo.getRota().getDestino().getGeo().getLongitude() - voo.getRota().getOrigem().getGeo().getLongitude());
        double a = Math.sin(diferencaLat / 2) * Math.sin(diferencaLat / 2)
                + Math.cos(Math.toRadians(voo.getRota().getOrigem().getGeo().getLatitude())) * Math.cos(Math.toRadians(voo.getRota().getDestino().getGeo().getLatitude()))
                * Math.sin(diferencaLon / 2) * Math.sin(diferencaLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distancia = raioTerra * c;
        return distancia;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

}
