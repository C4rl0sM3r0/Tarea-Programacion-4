package universidad;

import java.util.ArrayList;
import java.util.List;

// Estudiante hereda de Persona e implementa Evaluable
public class Estudiante extends Persona implements Evaluable {

    private List<Double> notas;
    private String carrera;

    // Constructor
    public Estudiante(String nombre, String identificacion, String carrera) {
        super(nombre, identificacion);
        this.carrera = carrera;
        this.notas = new ArrayList<>(); // Composición
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public void agregarNota(double nota) {
        // Solo agrega si la nota es válida
        if (nota >= 0 && nota <= 10) {
            notas.add(nota);
        } else {
            System.out.println("Nota inválida: " + nota);
        }
    }

    @Override
    public double calcularPromedio() {
        if (notas.isEmpty()) return 0.0;

        double suma = 0;
        for (double n : notas) suma += n;

        return suma / notas.size();
    }

    @Override
    public void mostrarRol() {
        System.out.println("Rol: Estudiante");
        System.out.println("Carrera: " + carrera);
    }

    // Sobrescritura del método mostrarDatos()
    @Override
    public void mostrarDatos() {
        super.mostrarDatos(); // Llama al método de Persona
        mostrarRol();

        System.out.println("Notas: " + notas);
        System.out.printf("Promedio: %.2f\n", calcularPromedio());
    }
}
