package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {
    public static void main(String[] args) {
        Telefono t1 = new Telefono(110, "movi", "098234234");
        Telefono t2 = new Telefono(120, "claro", "098234234");
        Contacto c1 = new Contacto("Mary", "Quishpe", t1, 75.5);
        Contacto c2 = new Contacto("Johanna", "Pila", t2, 65.5);
        AdminContactos ac = new AdminContactos();
        Contacto heavier = ac.buscarMasPesado(c1, c2);
        System.out.println(heavier.getNombre());
        System.out.println(ac.compararOperadoras(c1, c2));
    }
}