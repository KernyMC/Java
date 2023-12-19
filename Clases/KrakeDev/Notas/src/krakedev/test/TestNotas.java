package krakedev.test;

import krakedev.entidades.Curso;
import krakedev.entidades.Estudiante;
import krakedev.entidades.Materia;
import krakedev.entidades.Nota;

public class TestNotas {
    public static void main(String[] args) {
        Curso curso = new Curso();

        Materia mat1 = new Materia("MAT1", "Matemáticas");
        Materia mat2 = new Materia("MAT2", "Física");

        Estudiante est1 = new Estudiante("Juan", "Pérez", "13223656456");
        Estudiante est2 = new Estudiante("Ana", "Gómez", "789045612");

        Nota nota1 = new Nota(mat1, 8.5);
        Nota nota2 = new Nota(mat2, 9.0);
        Nota nota3 = new Nota(mat1, 7.5);
        Nota nota4 = new Nota(mat2, 8.0);

        est1.agregarNota(nota1);
        est1.agregarNota(nota2);
        est2.agregarNota(nota3);
        est2.agregarNota(nota4);

        curso.matricularEstudiantes(est1);
        curso.matricularEstudiantes(est2);

        curso.mostrar();
        System.out.println("Promedio estudiante 1: " + est1.calcularPromedioNotasEstudiante());
        System.out.println("Promedio estudiante 2: " + est2.calcularPromedioNotasEstudiante());
        System.out.println("Promedio curso: " + curso.calcularPromedioCurso());
    }
}