package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {
    public static void main(String[] args) {
        Telefono tel1 = new Telefono(10, "movi", "09941234123");
        Telefono tel2 = new Telefono(20, "claro", "098234234");
        Telefono tel3 = new Telefono(30, "movi", "097654321");
        Telefono tel4 = new Telefono(40, "claro", "096123456");

        AdminTelefono admin = new AdminTelefono();
        int countClaro = admin.contarClaro(tel1, tel2, tel3, tel4);
        System.out.println("Numero de telefonos 'claro' : " + countClaro);
    }
}