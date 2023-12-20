package com.clearminds.test;

import java.util.ArrayList;
import java.util.Arrays;
import com.clearminds.servicios.Juego;

public class TestGanador {
    public static void main(String[] args) {
        ArrayList<Integer> idsJugadores = new ArrayList<>(Arrays.asList(4, 5, 6));
        Juego juego = new Juego(idsJugadores);
        juego.entregarCartas(5);
        for (int i = 0; i < juego.getCartasJugadores().size(); i++) {
            System.out.println("Total del jugador " + (i + 1) + ": " + juego.devolverTotal(i));
        }
        System.out.println("El ganador es: " + "Jugador " + (juego.determinarGanador() + 1));
    }
}