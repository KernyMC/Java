package com.krakedev.test;

import com.krakedev.evaluacion.Direccion;

public class TestDireccion {
    public static void main(String[] args) {
        Direccion direccion = new Direccion("Calle Principal", "Calle Secundaria");
        System.out.println("Calle Principal: " + direccion.getCallePrincipal());
        System.out.println("Calle Secundaria: " + direccion.getCalleSecundaria());
    }
}