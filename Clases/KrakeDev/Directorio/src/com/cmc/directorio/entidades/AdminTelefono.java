package com.cmc.directorio.entidades;

public class AdminTelefono {
    public void activarMensajeria(Telefono telefono) {
        if ("movi".equals(telefono.getOperadora())) {
            telefono.setTieneWhatsapp(true);
        }
    }
}