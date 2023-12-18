package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {
    public static void main(String[] args) {
        Telefono t1 = new Telefono(130, "claro", "098234234");
        Telefono t2 = new Telefono(140, "claro", "098234234");
        Contacto c1 = new Contacto("Luca", "DeVeintemilla", t1, 85.5);
        Contacto c2 = new Contacto("Kerlly", "Ortiz", t2, 95.5);
        AdminContactos ac = new AdminContactos();
        Contacto heavier = ac.buscarMasPesado(c1, c2);
        System.out.println(heavier.getNombre());
        System.out.println(ac.compararOperadoras(c1, c2));
    }
}