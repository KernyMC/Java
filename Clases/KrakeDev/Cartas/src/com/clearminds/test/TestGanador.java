package com.clearminds.test;

import java.util.ArrayList;
import com.clearminds.servicios.Juego;

public class TestGanador {
    public static void main(String[] args) {
        ArrayList<Integer> jugadores = new ArrayList<>();
        jugadores.add(1);
        jugadores.add(2);
        jugadores.add(3);

        Juego juego = new Juego(jugadores);
        juego.entregarCartas(5);

        for (int i = 0; i < jugadores.size(); i++) {
            int total = juego.devolverTotal(i);
            System.out.println("Total del jugador "  + (i+1) + ": " + total);
        }

        int ganador = juego.determinarGanador();
        System.out.println("El ganador es: "+ "jugador " + ganador);
    }
}