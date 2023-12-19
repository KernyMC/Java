package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

import java.util.ArrayList;

public class TestBuscarMenores {
    public static void main(String[] args) {
        MaquinaDulces maquina = new MaquinaDulces();
        maquina.agregarCelda("A1");
        maquina.agregarCelda("A2");
        maquina.agregarCelda("B1");
        maquina.agregarCelda("B2");
        maquina.agregarCelda("C1");
        maquina.agregarCelda("C2");

        maquina.cargarProducto(new Producto("KE34", "Papitas", 0.85), "A1", 4);
        maquina.cargarProducto(new Producto("BDCR", "Doritos", 0.5), "A2", 5);
        maquina.cargarProducto(new Producto("JET", "Jet", 0.25), "B1", 6);
        maquina.cargarProducto(new Producto("DTDT", "DeTodito", 0.6), "B2", 7);
        maquina.cargarProducto(new Producto("CHTS", "Chitos", 1.0), "C1", 8);
        maquina.cargarProducto(new Producto("RFLS", "Ruffles", 1.5), "C2", 9);

        ArrayList<Producto> productosMenores = maquina.buscarMenores(1.0);

        System.out.println("Productos Menores: " + productosMenores.size());
        for (int i = 0; i < productosMenores.size(); i++) {
            Producto producto = productosMenores.get(i);
            System.out.println("Nombre: " + producto.getNombre() + " Precio:" + producto.getPrecio());
        }
    }
}