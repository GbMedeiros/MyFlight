package application;

import entities.Aeronave;
import entities.Aeroporto;
import entities.Cia;
import entities.Rota;

public class App {
    public static void main(String[] args) {

        Cia jj = new Cia("JJ", "LATAM Linhas Aéreas");
        Cia g3 = new Cia("G3", "Gol Linhas Aéreas SA");
        Cia tp = new Cia("TP", "TAP Portugal");
        Cia ad = new Cia("AD", "Azul Linhas Aéreas");

        Aeronave a733 = new Aeronave("733", "Boeing 737-300", 140);
        Aeronave a73g = new Aeronave("73G", "Boeing 737-700", 126);
        Aeronave a370 = new Aeronave("380", "Airbus Industrie A380", 644);
        Aeronave a764 = new Aeronave("764", "Boeing 767-400", 304);

        Aeroporto poa = new Aeroporto("POA", "Aeroporto Salgado Filho", -29.9939, -51.1711);
        Aeroporto gru = new Aeroporto("GRU", "São Paulo Guarulhos Intl Apt", -23.4356, -46.4731);
        Aeroporto lis = new Aeroporto("LIS", "Lisbon", 38.7742, -9.1342);
        Aeroporto mia = new Aeroporto("MIA", "MIA Miami International Apt", 25.7933, -80.2906);

        Rota r1 = new Rota(g3,gru, poa, a733);
        System.out.println(r1.toString());
    }
}