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

        GerenciadorRotas routes = GerenciadorRotas.getInstance();
        routes.leituraDados("routes.dat");
        System.out.println(routes.toString());
        Contavel.exibirContagemObjetos(Aeroporto.getQtd(), Aeronave.getQtd(), Cia.getQtd(), Geo.getQtd(), Rota.getQtd(), Voo.getQtd());

    }
}
