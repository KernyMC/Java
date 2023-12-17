package com.krakedev;

public class TestProducto {
    public static void main(String[] args) {
        Producto productoA = new Producto("Coca Cola", "Gaseosa de cola", 20, 100);
        Producto productoB = new Producto("Pepsi", "Gaseosa de cola", 18, 100);
        Producto productoC = new Producto("Sprite", "Gaseosa de lima limon", 18, 100);

        System.out.println("Nombre: " + productoA.getNombre() + " Descripcion: " + productoA.getDescripcion() + " Precio: " + productoA.getPrecio() + " Stock: " + productoA.getStockActual());
        System.out.println("Nombre: " + productoB.getNombre() + " Descripcion: " + productoB.getDescripcion() + " Precio: " + productoB.getPrecio() + " Stock: " + productoB.getStockActual());
        System.out.println("Nombre: " + productoC.getNombre() + " Descripcion: " + productoC.getDescripcion() + " Precio: " + productoC.getPrecio() + " Stock: " + productoC.getStockActual());

    }
}
