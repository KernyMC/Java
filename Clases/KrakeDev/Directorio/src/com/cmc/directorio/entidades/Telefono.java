package com.cmc.directorio.entidades;

public class Telefono {
    private String operadora;
    private String numero;
    private int codigo;
    private boolean tieneWhatsapp;

    public Telefono(int codigo, String operadora, String numero) {
        this.codigo = codigo;
        this.operadora = operadora;
        this.numero = numero;
        this.tieneWhatsapp = false;
    }

    public void imprimir() {
        System.out.println("Operadora: " + operadora);
        System.out.println("Numero: " + numero);
        System.out.println("Codigo: " + codigo);
        System.out.println("Tiene Whatsapp: " + tieneWhatsapp);
    }

    public String getOperadora() {
        return operadora;
    }

    public void setTieneWhatsapp(boolean tieneWhatsapp) {
        this.tieneWhatsapp = tieneWhatsapp;
    }
}