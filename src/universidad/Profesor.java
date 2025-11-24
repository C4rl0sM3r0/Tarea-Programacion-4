package universidad;

// Profesor hereda de Persona
public class Profesor extends Persona {

    private String especialidad;

    public Profesor(String nombre, String identificacion, String especialidad) {
        super(nombre, identificacion); // LLama al constructor de Persona
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Polimorfismo: sobrescritura del método mostrarRol()
    @Override
    public void mostrarRol() {
        System.out.println("Rol: Profesor");
        System.out.println("Especialidad: " + especialidad);
    }
}
