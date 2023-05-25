package entities;

import javax.swing.*;

public interface Contavel {
    public static void exibirContagemObjetos(int contadorAeroportos, int contadorAeronaves, int contadorCompanhiasAereas, int contadorGeolocalizacoes, int contadorRotas, int contadorVoos) {
        int totalObjetos = contadorAeroportos + contadorAeronaves + contadorCompanhiasAereas + contadorGeolocalizacoes + contadorRotas + contadorVoos;

        System.out.println("Total de objetos criados: " + totalObjetos);
    }
}
