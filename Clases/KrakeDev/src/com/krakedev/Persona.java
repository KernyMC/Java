package com.krakedev;

public class Persona {
   private String nombre;
   private int edad;
   private double estatura;
   
    public String getNombre() {
         return nombre;
    }

    public int getEdad() {
         return edad;
    }

    public double getEstatura() {
         return estatura;
    }

    public void setNombre(String nuevoNombre) {
         nombre = nuevoNombre;
    }

    public void setEdad(int nuevaEdad) {
         edad = nuevaEdad;
    }

    public void setEstatura(double nuevaEstatura) {
         estatura = nuevaEstatura;
    }

    public Persona(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

}
