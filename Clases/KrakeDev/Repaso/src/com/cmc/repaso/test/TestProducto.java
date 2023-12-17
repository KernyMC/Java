package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {
    public static void main(String[] args) {
        Producto producto = new Producto("Coca Cola", -100);

        System.out.println(producto.calcularPrecioPromo(10));

        producto.setPrecio(-200);
        System.out.println(producto.calcularPrecioPromo(20));
    }
}