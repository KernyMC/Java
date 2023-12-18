package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {
    public static void main(String[] args) {
        Telefono telef = new Telefono(100, "movi", "098234234");
        Contacto c = new Contacto("Yossi", "Paladines", telef, 75.5);
        System.out.println(c.getNombre());
        System.out.println(c.getApellido());
        System.out.println(c.getTelefono().getOperadora());
        System.out.println(c.getTelefono().getNumero());
    }
}