package application;

import entities.*;

public class TesteLeitura {
    public static void main(String[] args) {

        GerenciadorAeronaves equipament = GerenciadorAeronaves.getInstance();
        equipament.leituraDados("equipment.dat");
        System.out.println(equipament.toString());

        System.out.println("\n\n---------------------------------------------");
        System.out.println("---------------------------------------------\n\n");


        GerenciadorAeroportos airports = GerenciadorAeroportos.getInstance();
        airports.leituraDados("airports.dat");
        System.out.println(airports.toString());

        System.out.println("\n\n---------------------------------------------");
        System.out.println("---------------------------------------------\n\n");


        GerenciadorCias airlines = GerenciadorCias.getInstance();
        airlines.leituraDados("airlines.dat");
        System.out.println(airlines);
        System.out.println("fim");


        GerenciadorVoos voos = GerenciadorVoos.getInstance();
        voos.leituraDados("routes.dat");
        System.out.println(voos.toString());

        System.out.println("Distancia entre Poa - Slagado Filho e SP - Guarulhos");
        System.out.printf("Usando dois objetos geo: %5.2fkm %n",Geo.distancia(airports.buscar("AAA").getGeo(), airports.buscar("AAR").getGeo()));

        System.out.printf("De poa ate Guarulhos %5.2fkm %n",airports.buscar("BGU").getGeo().distancia(airports.buscar("BGW").getGeo()));

        //System.out.printf("Usando voo: %5.2fkm%n",Geo.distancia());

        Contavel.exibirContagemObjetos(Aeroporto.getQtd(), Aeronave.getQtd(), Cia.getQtd(), Geo.getQtd(), Rota.getQtd(), Voo.getQtd());

    }
}
