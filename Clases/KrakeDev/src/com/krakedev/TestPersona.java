package com.krakedev;

public class TestPersona {
    public static void main(String[] args) {
        Persona personaA = new Persona("Juan", 20, 1.80);
        Persona personaB = new Persona(" Pedro", 30, 1.65);
        Persona personaC = new Persona("Maria", 25, 1.70);

        System.out.println("Nombre: " + personaA.getNombre());
        System.out.println("Edad: " + personaA.getEdad());
        System.out.println("Estatura: " + personaA.getEstatura());

        System.out.println("Nombre: " + personaB.getNombre());
        System.out.println("Edad: " + personaB.getEdad());
        System.out.println("Estatura: " + personaB.getEstatura());

        System.out.println("Nombre: " + personaC.getNombre());
        System.out.println("Edad: " + personaC.getEdad());
        System.out.println("Estatura: " + personaC.getEstatura());
    }
}
