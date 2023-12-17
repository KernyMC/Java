package com.krakedev;

public class Cuadrado {

    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int nuevoLado) {
        lado = nuevoLado;
    }

    public double areaCuadrado(){
        double area;
        area = lado * lado;
        return area;
    }
    public double calcularPerimetro(){
        double perimetro;
        perimetro = 4 * lado;
        return perimetro;
    }

    public Cuadrado(int lado) {
        this.lado = lado;
    }
}