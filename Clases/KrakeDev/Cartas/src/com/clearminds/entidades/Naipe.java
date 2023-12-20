package com.clearminds.entidades;

import java.util.ArrayList;
import com.clearminds.entidades.Random;
public class Naipe {
    private ArrayList<Numero> numerosPosibles;
    private ArrayList<Carta> cartas;

    public Naipe() {
        numerosPosibles = new ArrayList<>();
        cartas = new ArrayList<>();


        numerosPosibles.add(new Numero("A", 11));
        for (int i = 2; i <= 10; i++) {
            numerosPosibles.add(new Numero(String.valueOf(i), i));
        }
        numerosPosibles.add(new Numero("10", 10));
        numerosPosibles.add(new Numero("Q", 10));
        numerosPosibles.add(new Numero("K", 10));

        Palos palos = new Palos();
        for (int i = 0; i < numerosPosibles.size(); i++) {
            Numero numero = numerosPosibles.get(i);
            cartas.add(new Carta(numero, palos.getCorazonRojo()));
            cartas.add(new Carta(numero, palos.getCorazonNegro()));
            cartas.add(new Carta(numero, palos.getDiamante()));
            cartas.add(new Carta(numero, palos.getTrebol()));
        }
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public ArrayList<Carta> barajar() {
        ArrayList<Carta> auxiliar = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            int posicion = Random.obtenerPosicion();            Carta carta = cartas.get(posicion);
            if (carta.getEstado().equals("N")) {
                auxiliar.add(carta);
                carta.setEstado("C");
            }
        }

        for (int i = 0; i < cartas.size(); i++) {
            Carta carta = cartas.get(i);
            if (carta.getEstado().equals("N")) {
                auxiliar.add(carta);
                carta.setEstado("C");
            }
        }

        return auxiliar;
    }
}