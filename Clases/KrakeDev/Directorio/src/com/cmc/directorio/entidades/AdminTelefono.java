package com.cmc.directorio.entidades;

public class AdminTelefono {
    public void activarMensajeria(Telefono telefono) {
        if ("movi".equals(telefono.getOperadora())) {
            telefono.setTieneWhatsapp(true);
        }
    }

    public int contarMovi(Telefono tel1, Telefono tel2, Telefono tel3) {
        int count = 0;
        if ("movi".equals(tel1.getOperadora())) count++;
        if ("movi".equals(tel2.getOperadora())) count++;
        if ("movi".equals(tel3.getOperadora())) count++;
        return count;
    }

    public int contarClaro(Telefono tel1, Telefono tel2, Telefono tel3, Telefono tel4) {
        int count = 0;
        if ("claro".equals(tel1.getOperadora())) count++;
        if ("claro".equals(tel2.getOperadora())) count++;
        if ("claro".equals(tel3.getOperadora())) count++;
        if ("claro".equals(tel4.getOperadora())) count++;
        return count;
    }
}