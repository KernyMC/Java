package com.cmc.repaso.entidades;

public class Item {
    private String nombre;
    private int productosActuales;
    private int productosDevueltos;
    private int productosVendidos;

    public Item(String nombre, int productosActuales) {
        this.nombre = nombre;
        this.productosActuales = productosActuales;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Productos Actuales: " + productosActuales);
        System.out.println("Productos Devueltos: " + productosDevueltos);
        System.out.println("Productos Vendidos: " + productosVendidos);
    }

    public void vender(int cantidad) {
        productosActuales -= cantidad;
        productosVendidos += cantidad;
    }

    public void devolver(int cantidad) {
        productosActuales += cantidad;
        productosVendidos -= cantidad;
        productosDevueltos += cantidad;
    }
}