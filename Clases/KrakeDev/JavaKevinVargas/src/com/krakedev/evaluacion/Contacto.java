package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
    private String cedula;
    private String nombre;
    private String apellido;
    private Direccion direccion;
    private ArrayList<Telefono> telefonos;

    public Contacto(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefonos = new ArrayList<>();
    }

    // getters and setters

    public void agregarTelefono(Telefono telefono) {
        telefonos.add(telefono);
    }

    public void mostrarTelefonos() {
        for (int i = 0; i < telefonos.size(); i++) {
            Telefono telefono = telefonos.get(i);
            if ("C".equals(telefono.getEstado())) {
                System.out.println(telefono.getNumero());
            }
        }
    }

    public void imprimir() {
        System.out.println("***" + nombre + " " + apellido + "***");
        if (direccion != null) {
            System.out.println("Direccion: " + direccion.getCallePrincipal() + " y " + direccion.getCalleSecundaria());
        } else {
            System.out.println("No tiene asociada una dirección");
        }
    }
}