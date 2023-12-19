package com.krakedev.test;

import com.krakedev.evaluacion.Telefono;

public class TestTelefono {
    public static void main(String[] args) {
        Telefono tel1 = new Telefono("1234567890", "Movil");
        Telefono tel2 = new Telefono("1234567", "Convencional");
        Telefono tel3 = new Telefono("123456789", "Movil");
        Telefono tel4 = new Telefono("12345678", "Convencional");
        Telefono tel5 = new Telefono(null, "Movil");
        Telefono tel6 = new Telefono("1234567890", null);
        Telefono tel7 = new Telefono("1234567890", "Tablet");

        System.out.println("Telefono 1: " + tel1.getEstado());
        System.out.println("Telefono 2: " + tel2.getEstado());
        System.out.println("Telefono 3: " + tel3.getEstado());
        System.out.println("Telefono 4: " + tel4.getEstado());
        System.out.println("Telefono 5: " + tel5.getEstado());
        System.out.println("Telefono 6: " + tel6.getEstado());
        System.out.println("Telefono 7: " + tel7.getEstado());
    }
}