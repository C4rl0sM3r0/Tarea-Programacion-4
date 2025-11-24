package universidad;

import java.util.ArrayList;
import java.util.List;

// No hereda, pero usa composición
public class Curso {

    private String codigo;
    private String nombre;
    private universidad.Profesor profesor;
    private List<universidad.Estudiante> estudiantes;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    // Setters y getters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public universidad.Profesor getProfesor() { return profesor; }

    public void asignarProfesor(universidad.Profesor p) {
        this.profesor = p;
    }

    public void inscribirEstudiante(universidad.Estudiante e) {
        if (!estudiantes.contains(e)) {
            estudiantes.add(e);
        }
    }

    public void mostrarInformacionCurso() {
        System.out.println("Curso: " + nombre + " (" + codigo + ")");

        if (profesor != null) {
            System.out.println("Profesor asignado:");
            profesor.mostrarDatos();
        } else {
            System.out.println("No hay profesor asignado.");
        }

        System.out.println("Número de estudiantes inscritos: " + estudiantes.size());
    }

    public void listarEstudiantes() {
        System.out.println("=== LISTA DE ESTUDIANTES ===");
        for (Estudiante e : estudiantes) {
            System.out.println("- " + e.getNombre());
        }
    }

    public double calcularPromedioGeneral() {
        if (estudiantes.isEmpty()) return 0.0;

        double suma = 0;
        for (Estudiante e : estudiantes) {
            suma += e.calcularPromedio();
        }

        return suma / estudiantes.size();
    }
}
