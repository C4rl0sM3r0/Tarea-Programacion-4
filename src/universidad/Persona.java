package universidad;

// Clase abstracta base
public abstract class Persona {

    // Atributos privados (encapsulación estricta)
    private String nombre;
    private String identificacion;

    // Constructor
    public Persona(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    // Método abstracto (abstracción)
    public abstract void mostrarRol();

    // Método general heredado por todas las personas
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Identificación: " + identificacion);
    }
}
