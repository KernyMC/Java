package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import java.util.ArrayList;

public class MaquinaDulces {
    private ArrayList<Celda> Celdas;
    private double Saldo;

    public MaquinaDulces() {
        Celdas = new ArrayList<>();
    }

    public void agregarCelda(String codigo) {
        Celda celda = new Celda(codigo);
        Celdas.add(celda);
    }

    public void mostrarConfiguracion() {
        for (int i = 0; i < Celdas.size(); i++) {
            System.out.println("Celda: " + Celdas.get(i).getCodigo());
        }
    }
    public ArrayList<Producto> buscarMenores(double limite) {
        ArrayList<Producto> productosMenores = new ArrayList<>();
        for (int i = 0; i < Celdas.size(); i++) {
            Producto producto = Celdas.get(i).getProducto();
            if (producto != null && producto.getPrecio() <= limite) {
                productosMenores.add(producto);
            }
        }
        return productosMenores;
    }
    public Celda buscarCelda(String codigo) {
        for (int i = 0; i < Celdas.size(); i++) {
            if (Celdas.get(i).getCodigo().equals(codigo)) {
                return Celdas.get(i);
            }
        }
        return null;
    }

    public void cargarProducto(Producto producto, String codigoCelda, int cantidad) {
        Celda celdaRecuperada = buscarCelda(codigoCelda);
        if (celdaRecuperada != null) {
            celdaRecuperada.ingresarProducto(producto, cantidad);
        }
    }



    public Producto buscarProductoEnCelda(String codigoProducto) {
        for (int i = 0; i < Celdas.size(); i++) {
            if (Celdas.get(i).getProducto() != null && Celdas.get(i).getProducto().getCodigo().equals(codigoProducto)) {
                return Celdas.get(i).getProducto();
            }
        }
        return null;
    }

    public void incrementarProductos(String codigoProducto, int cantidad) {
        Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
        if (celdaEncontrada != null) {
            celdaEncontrada.setStock(celdaEncontrada.getStock() + cantidad);
        }
    }
    public double consultarPrecio(String codigoCelda) {
        Celda celda = buscarCelda(codigoCelda);
        if (celda != null && celda.getProducto() != null) {
            return celda.getProducto().getPrecio();
        } else {
            return 0;
        }
    }
    public void mostrarProductos() {
        for (int i = 0; i < Celdas.size(); i++) {
            System.out.println("Celda: " + Celdas.get(i).getCodigo());
            System.out.println("Stock: " + Celdas.get(i).getStock());
            if (Celdas.get(i).getProducto() != null) {
                System.out.println("Nombre Producto: " + Celdas.get(i).getProducto().getNombre());
                System.out.println("Precio Producto: " + Celdas.get(i).getProducto().getPrecio());
            }
        }
    }

    public double venderConCambio(String codigoCelda, double valorIngresado) {
        Celda celda = buscarCelda(codigoCelda);
        if (celda != null && celda.getProducto() != null && celda.getStock() > 0) {
            celda.setStock(celda.getStock() - 1);
            Saldo += celda.getProducto().getPrecio();
            double cambio = valorIngresado - celda.getProducto().getPrecio();
            return cambio;
        } else {
            return valorIngresado;
        }
    }

    public void vender(String codigoCelda) {
        Celda celda = buscarCelda(codigoCelda);
        if (celda != null && celda.getProducto() != null && celda.getStock() > 0) {
            celda.setStock(celda.getStock() - 1);
            Saldo += celda.getProducto().getPrecio();
        }
    }

    public Celda buscarCeldaProducto(String codigoProducto) {
        for (int i = 0; i < Celdas.size(); i++) {
            if (Celdas.get(i).getProducto() != null && Celdas.get(i).getProducto().getCodigo().equals(codigoProducto)) {
                return Celdas.get(i);
            }
        }
        return null;
    }


}