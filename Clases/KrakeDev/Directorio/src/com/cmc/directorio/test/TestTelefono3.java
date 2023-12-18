package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {
    public static void main(String[] args) {
        Telefono t1 = new Telefono(30, "movi", "098234234");
        Telefono t2 = new Telefono(40, "claro", "098234234");
        Telefono t3 = new Telefono(50, "movi", "098234234");
        AdminTelefono at = new AdminTelefono();
        int count = at.contarMovi(t1, t2, t3);
        System.out.println(count);
    }
}