package com.krakedev.test;

import com.krakedev.Fecha;

public class TestFecha {

    public static void main(String[] args) {
        Fecha f = new Fecha(2017, 10, 31);
        System.out.println("com.krakedev.Fecha: " + f.getDia() + "/" + f.getMes() + "/" + f.getAnio());
    }
}