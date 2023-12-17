package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan Reyes");

        estudiante.calificar(7.5);
        System.out.println(estudiante.getResultado());

        estudiante.calificar(8.5);
        System.out.println(estudiante.getResultado());
    }
}