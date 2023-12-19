package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
    private ArrayList<Estudiante> estudiantes;

    public Curso() {
        this.estudiantes = new ArrayList<>();
    }

    public Estudiante buscarEstudiantePorCedula(String cedula) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getCedula().equals(cedula)) {
                return estudiantes.get(i);
            }
        }
        return null;
    }

    public void matricularEstudiantes(Estudiante estudiante) {
        if (buscarEstudiantePorCedula(estudiante.getCedula()) == null) {
            estudiantes.add(estudiante);
        }
    }

    public double calcularPromedioCurso() {
        double sumaPromedios = 0;
        for (int i = 0; i < estudiantes.size(); i++) {
            sumaPromedios += estudiantes.get(i).calcularPromedioNotasEstudiante();
        }
        return estudiantes.size() > 0 ? sumaPromedios / estudiantes.size() : 0;
    }

    public void mostrar() {
        System.out.println("Curso [estudiantes=" + estudiantes.size() + "]");
        for (int i = 0; i < estudiantes.size(); i++) {
            estudiantes.get(i).mostrar();
        }
    }


}