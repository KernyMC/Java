package com.cmc.repaso.entidades;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        setPrecio(precio);
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            this.precio = precio * -1;
        } else {
            this.precio = precio;
        }
    }

    public double calcularPrecioPromo(double descuento) {
        return this.precio - (this.precio * descuento / 100);
    }
}