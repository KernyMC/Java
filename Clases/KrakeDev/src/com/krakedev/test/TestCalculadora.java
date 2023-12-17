package com.krakedev.test;

import com.krakedev.Calculadora;

public class TestCalculadora {
    public static void main(String[] args) {
        Calculadora calcu;
        int suma, resta;
        double division, multiplicacion, promedio;
        calcu = new Calculadora();
        suma = calcu.sumar(1, 5);
        resta = calcu.restar(3, 6);
        division = calcu.dividir(10, 2);
        multiplicacion = calcu.multiplicar(5, 10);
        promedio = calcu.promediar(10, 8, 9);
        
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La division es: " + division);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("El promedio es: " + promedio);
        calcu.mostrarResultado();


    }
}
