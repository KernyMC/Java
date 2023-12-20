package com.clearminds.test;

import com.clearminds.entidades.Carta;
import com.clearminds.entidades.Numero;
import com.clearminds.entidades.Palos;

public class TestCartas {
    public static void main(String[] args) {
        Numero numero = new Numero("A", 11);
        Carta carta = new Carta(numero, new Palos().getCorazonRojo());
        System.out.println(carta.mostrarInformacion());
    }
}