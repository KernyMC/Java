package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {
    public static void main(String[] args) {
        Telefono t = new Telefono(150, "movi", "098234234");
        Contacto c = new Contacto("Kevin", "Vargas", t, 75.5);
        System.out.println(c.isActivo());
        AdminContactos ac = new AdminContactos();
        ac.activarUsuario(c);
        System.out.println(c.isActivo());
    }
}