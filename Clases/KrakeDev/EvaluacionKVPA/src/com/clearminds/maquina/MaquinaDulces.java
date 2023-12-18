package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
    private Celda Celda1;
    private Celda Celda2;
    private Celda Celda3;
    private Celda Celda4;
    private double Saldo;

    public MaquinaDulces() {
    }

    public void configurarMaquina(String codigo1, String codigo2, String codigo3, String codigo4) {
        Celda1 = new Celda(codigo1);
        Celda2 = new Celda(codigo2);
        Celda3 = new Celda(codigo3);
        Celda4 = new Celda(codigo4);
    }

    public void mostrarConfiguracion() {
        System.out.println("Celda1: " + Celda1.getCodigo());
        System.out.println("Celda2: " + Celda2.getCodigo());
        System.out.println("Celda3: " + Celda3.getCodigo());
        System.out.println("Celda4: " + Celda4.getCodigo());
        System.out.println("Saldo: " + Saldo);
    }

    public Celda buscarCelda(String codigo) {
        if (Celda1.getCodigo().equals(codigo)) {
            return Celda1;
        } else if (Celda2.getCodigo().equals(codigo)) {
            return Celda2;
        } else if (Celda3.getCodigo().equals(codigo)) {
            return Celda3;
        } else if (Celda4.getCodigo().equals(codigo)) {
            return Celda4;
        } else {
            return null;
        }
    }

    public void cargarProducto(Producto producto, String codigoCelda, int cantidad) {
        Celda celdaRecuperada = buscarCelda(codigoCelda);
        if (celdaRecuperada != null) {
            celdaRecuperada.ingresarProducto(producto, cantidad);
        }
    }

public void mostrarProductos() {
    System.out.println("***********CELDA " + Celda1.getCodigo());
    if (Celda1.getProducto() != null) {
        System.out.println("Stock:" + Celda1.getStock());
        System.out.println("Nombre Producto:" + Celda1.getProducto().getNombre());
        System.out.println("Precio Producto: " + Celda1.getProducto().getPrecio());
        System.out.println("Código Producto:" + Celda1.getProducto().getCodigo());
    } else {
        System.out.println("Stock:0");
        System.out.println("La celda no tiene producto!!!");
    }

    System.out.println("***********CELDA " + Celda2.getCodigo());
    if (Celda2.getProducto() != null) {
        System.out.println("Stock:" + Celda2.getStock());
        System.out.println("Nombre Producto:" + Celda2.getProducto().getNombre());
        System.out.println("Precio Producto: " + Celda2.getProducto().getPrecio());
        System.out.println("Código Producto:" + Celda2.getProducto().getCodigo());
    } else {
        System.out.println("Stock:0");
        System.out.println("La celda no tiene producto!!!");
    }

    System.out.println("***********CELDA " + Celda3.getCodigo());
    if (Celda3.getProducto() != null) {
        System.out.println("Stock:" + Celda3.getStock());
        System.out.println("Nombre Producto:" + Celda3.getProducto().getNombre());
        System.out.println("Precio Producto: " + Celda3.getProducto().getPrecio());
        System.out.println("Código Producto:" + Celda3.getProducto().getCodigo());
    } else {
        System.out.println("Stock:0");
        System.out.println("La celda no tiene producto!!!");
    }

    System.out.println("***********CELDA " + Celda4.getCodigo());
    if (Celda4.getProducto() != null) {
        System.out.println("Stock:" + Celda4.getStock());
        System.out.println("Nombre Producto:" + Celda4.getProducto().getNombre());
        System.out.println("Precio Producto: " + Celda4.getProducto().getPrecio());
        System.out.println("Código Producto:" + Celda4.getProducto().getCodigo());
    } else {
        System.out.println("Stock:0");
        System.out.println("La celda no tiene producto!!!");
    }

    System.out.println("Saldo: " + Saldo);
}

    public Producto buscarProductoEnCelda(String codigoCelda) {
        Celda celda = buscarCelda(codigoCelda);
        if (celda != null) {
            return celda.getProducto();
        } else {
            return null;
        }
    }

    public double consultarPrecio(String codigoCelda) {
        Producto producto = buscarProductoEnCelda(codigoCelda);
        if (producto != null) {
            return producto.getPrecio();
        } else {
            return 0;
        }
    }

public Celda buscarCeldaProducto(String codigoProducto) {
    if (Celda1.getProducto() != null && Celda1.getProducto().getCodigo().equals(codigoProducto)) {
        return Celda1;
    } else if (Celda2.getProducto() != null && Celda2.getProducto().getCodigo().equals(codigoProducto)) {
        return Celda2;
    } else if (Celda3.getProducto() != null && Celda3.getProducto().getCodigo().equals(codigoProducto)) {
        return Celda3;
    } else if (Celda4.getProducto() != null && Celda4.getProducto().getCodigo().equals(codigoProducto)) {
        return Celda4;
    } else {
        return null;
    }
}

    public void incrementarProductos(String codigoProducto, int cantidad) {
        Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
        if (celdaEncontrada != null) {
            celdaEncontrada.setStock(celdaEncontrada.getStock() + cantidad);
        }
    }

    public void vender(String codigoCelda) {
        Celda celda = buscarCelda(codigoCelda);
        if (celda != null && celda.getStock() > 0) {
            celda.setStock(celda.getStock() - 1);
            Saldo += celda.getProducto().getPrecio();
        }
    }

    public double venderConCambio(String codigoCelda, double valorIngresado) {
        Celda celda = buscarCelda(codigoCelda);
        if (celda != null && celda.getStock() > 0) {
            celda.setStock(celda.getStock() - 1);
            Saldo += celda.getProducto().getPrecio();
            return valorIngresado - celda.getProducto().getPrecio();
        } else {
            return valorIngresado;
        }
    }

    public Celda getCelda1() {
        return Celda1;
    }

    public void setCelda1(Celda celda1) {
        Celda1 = celda1;
    }

    public Celda getCelda2() {
        return Celda2;
    }

    public void setCelda2(Celda celda2) {
        Celda2 = celda2;
    }

    public Celda getCelda3() {
        return Celda3;
    }

    public void setCelda3(Celda celda3) {
        Celda3 = celda3;
    }

    public Celda getCelda4() {
        return Celda4;
    }

    public void setCelda4(Celda celda4) {
        Celda4 = celda4;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }
}