package application;

import entities.Aeronave;
import entities.Cia;

public class App {
    public static void main(String[] args) {

        Cia c1 = new Cia("JJ", "LATAM Linhas Aéreas");
        Cia c2 = new Cia("G3", "Gol Linhas Aéreas SA");
        Cia c3 = new Cia("TP", "TAP Portugal");
        Cia c4 = new Cia("AD", "Azul Linhas Aéreas");

        Aeronave a1 = new Aeronave("733", "Boeing 737-300", 140);
        Aeronave a2 = new Aeronave("73G", "Boeing 737-700", 126);
        Aeronave a3 = new Aeronave("380", "Airbus Industrie A380", 644);
        Aeronave a4 = new Aeronave("764", "Boeing 767-400", 304);


    }
}