package application;

import entities.*;

public class App {
    public static void main(String[] args) {

        System.out.println("------------------- CIAS AEREAS -------------------");
        Cia jj = new Cia("JJ", "LATAM Linhas Aéreas");
        Cia g3 = new Cia("G3", "Gol Linhas Aéreas SA");
        Cia tp = new Cia("TP", "TAP Portugal");
        Cia ad = new Cia("AD", "Azul Linhas Aéreas");
        System.out.println(jj.toString());
        System.out.println(g3.toString());
        System.out.println(tp.toString());
        System.out.println(ad.toString());
        System.out.println();

        System.out.println("-------------------- AERONAVES --------------------");
        Aeronave a733 = new Aeronave("733", "Boeing 737-300", 140);
        Aeronave a73g = new Aeronave("73G", "Boeing 737-700", 126);
        Aeronave a370 = new Aeronave("380", "Airbus Industrie A380", 644);
        Aeronave a764 = new Aeronave("764", "Boeing 767-400", 304);
        System.out.println(a733.toString());
        System.out.println(a73g.toString());
        System.out.println(a370.toString());
        System.out.println(a764.toString());
        System.out.println();

        System.out.println("-------------------- AEROPORTOS --------------------");
        Aeroporto poa = new Aeroporto("POA", "Aeroporto Salgado Filho", -29.9939, -51.1711);
        Aeroporto gru = new Aeroporto("GRU", "São Paulo Guarulhos Intl Apt", -23.4356, -46.4731);
        Aeroporto lis = new Aeroporto("LIS", "Lisbon", 38.7742, -9.1342);
        Aeroporto mia = new Aeroporto("MIA", "MIA Miami International Apt", 25.7933, -80.2906);
        System.out.println(poa.toString());
        System.out.println(gru.toString());
        System.out.println(lis.toString());
        System.out.println(mia.toString());
        System.out.println();

        System.out.println("-------------------- ROTAS --------------------");
        Rota r1 = new Rota(g3, gru, poa, a733);
        Rota r2 = new Rota(g3, poa, gru, a733);
        Rota r3 = new Rota(tp, mia, lis, a764);
        Rota r4 = new Rota(jj, gru, mia, a370);
        Rota r5 = new Rota(g3, gru, mia, a370);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
        System.out.println(r4.toString());
        System.out.println();

        System.out.println("-------------------- VOOS --------------------");
        Voo v1 = new Voo(2016, 8, 10, 8, 00, 1, 30, r1, "Atrasado");
        Voo v2 = new Voo(2016, 8, 10, 15, 00, 2, 00, r2, "Confirmado");
        Voo v3 = new Voo(2016, 8, 16, 12, 00, 2, 00, r3, "Cancelado");
        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(v3.toString());
        System.out.println();

        GerenciadorCias gCias = GerenciadorCias.getInstance();
        gCias.inserir(jj);
        gCias.inserir(g3);
        gCias.inserir(tp);
        gCias.inserir(ad);
        System.out.println(gCias.toString());


        GerenciadorAeronaves gAeronaves = GerenciadorAeronaves.getInstance();
        gAeronaves.inserir(a73g);
        gAeronaves.inserir(a370);
        gAeronaves.inserir(a733);
        gAeronaves.inserir(a764);
        System.out.println(gAeronaves.toString());


        GerenciadorAeroportos gAeroporto = GerenciadorAeroportos.getInstance();
        gAeroporto.inserir(poa);
        gAeroporto.inserir(gru);
        gAeroporto.inserir(mia);
        gAeroporto.inserir(lis);
        System.out.println(gAeroporto.toString());


        GerenciadorRotas gRotas = GerenciadorRotas.getInstance();
        gRotas.inserir(r1);
        gRotas.inserir(r2);
        gRotas.inserir(r3);
        gRotas.inserir(r4);
        gRotas.inserir(r5);
        System.out.println(gRotas.toString());
        System.out.println("\nbuscar: por origem Aeroporto Salgado Filho\nQual a rota");
        System.out.println(gRotas.buscarOrigem("São Paulo Guarulhos Intl Apt"));
        System.out.println("\nbuscar: por destino MIA Miami International Apt\nQual a rota");
        System.out.println(gRotas.buscarDestino("MIA Miami International Apt"));


        GerenciadorVoos gVoos = GerenciadorVoos.getInstance();
        gVoos.inserir(v1);
        gVoos.inserir(v2);
        gVoos.inserir(v3);
        System.out.println("Buscar por data yyyy-mm-dd");
        System.out.println(gVoos.buscar(2016,8,10));


    }
}