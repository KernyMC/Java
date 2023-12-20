package com.clearminds.servicios;

import com.clearminds.entidades.Carta;
import com.clearminds.entidades.Naipe;
import java.util.ArrayList;

public class Juego {
    private Naipe naipe;
    private ArrayList<Carta> naipeBarajado;
    private ArrayList<ArrayList<Carta>> cartasJugadores;

    public Juego(ArrayList<Integer> idsJugadores) {
        naipe = new Naipe();
        naipeBarajado = naipe.barajar();
        cartasJugadores = new ArrayList<>();

        for (int i = 0; i < idsJugadores.size(); i++) {
            cartasJugadores.add(new ArrayList<Carta>());
        }
    }

    public ArrayList<ArrayList<Carta>> getCartasJugadores() {
        return cartasJugadores;
    }

    public void entregarCartas(int cartasPorJugador) {
        for (int i = 0; i < cartasPorJugador; i++) {
            for (ArrayList<Carta> cartasJugador : cartasJugadores) {
                Carta carta = naipeBarajado.remove(0);
                cartasJugador.add(carta);
            }
        }
    }

    public int devolverTotal(int idJugador) {
        ArrayList<Carta> cartasJugador = cartasJugadores.get(idJugador);
        int total = 0;
        for (int i = 0; i < cartasJugador.size(); i++) {
            total += cartasJugador.get(i).getNumero().getValor();
        }
        return total;
    }

    public int determinarGanador() {
        int idGanador = 0;
        int sumaGanador = devolverTotal(idGanador);

        for (int i = 1; i < cartasJugadores.size(); i++) {
            int sumaJugador = devolverTotal(i);
            if (sumaJugador >= sumaGanador) {
                idGanador = i;
                sumaGanador = sumaJugador;
            }
        }

        return idGanador + 1;
    }

}