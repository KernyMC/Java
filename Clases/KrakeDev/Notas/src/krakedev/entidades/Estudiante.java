package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String cedula;
    private ArrayList<Nota> notas;

    public Estudiante(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.notas = new ArrayList<>();
    }

    public void agregarNota(Nota nuevaNota) {
        if (nuevaNota.getCalificacion() >= 0 && nuevaNota.getCalificacion() <= 10) {
            for (Nota nota : notas) {
                if (nota.getMateria().getCodigo().equals(nuevaNota.getMateria().getCodigo())) {
                    return;
                }
            }
            notas.add(nuevaNota);
        }
    }

    public void modificarNota(String codigo, double nuevaNota) {
        if (nuevaNota >= 0 && nuevaNota <= 10) {
            for (int i = 0; i < notas.size(); i++) {
                if (notas.get(i).getMateria().getCodigo().equals(codigo)) {
                    notas.get(i).setCalificacion(nuevaNota);
                    return;
                }
            }
            System.out.println("No se encontró el código de la materia.");
        }
    }

    public double calcularPromedioNotasEstudiante() {
        double suma = 0;
        for (int i = 0; i < notas.size(); i++) {
            suma += notas.get(i).getCalificacion();
        }
        return notas.size() > 0 ? suma / notas.size() : 0;
    }

    public void mostrar() {
        System.out.println("Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + "]");
        for (int i = 0; i < notas.size(); i++) {
            notas.get(i).mostrar();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }
}