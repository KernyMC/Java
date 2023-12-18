package com.cmc.directorio.entidades;

public class AdminTelefono {
    public void activarMensajeria(Telefono telefono) {
        if ("movi".equals(telefono.getOperadora())) {
            telefono.setTieneWhatsapp(true);
        }
    }

    public int contarMovi(Telefono t1, Telefono t2, Telefono t3) {
        int count = 0;
        if ("movi".equals(t1.getOperadora())) {
            count++;
        }
        if ("movi".equals(t2.getOperadora())) {
            count++;
        }
        if ("movi".equals(t3.getOperadora())) {
            count++;
        }
        return count;
    }

    public int contarClaro(Telefono t1, Telefono t2, Telefono t3, Telefono t4) {
        int count = 0;
        if ("claro".equals(t1.getOperadora())) {
            count++;
        }
        if ("claro".equals(t2.getOperadora())) {
            count++;
        }
        if ("claro".equals(t3.getOperadora())) {
            count++;
        }
        if ("claro".equals(t4.getOperadora())) {
            count++;
        }
        return count;
    }
}