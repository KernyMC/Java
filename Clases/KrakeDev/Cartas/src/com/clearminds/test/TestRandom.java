package com.clearminds.test;

import com.clearminds.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        boolean tieneCero = false;
        boolean tieneUno = false;
        for (int i = 0; i < 10000; i++) {
            int random = Random.obtenerPosicion();
            System.out.println("Posicion obtenida: " + random);
            if (random == 0) {
                tieneCero = true;
            }
            if (random == 1) {
                tieneUno = true;
            }
            if (tieneCero && tieneUno) {
                break;
            }
        }

        if (!tieneCero || !tieneUno) {
            System.out.println("El metodo obtenerPosicion no ha arrojado 0 o 1");
        }
    }
}