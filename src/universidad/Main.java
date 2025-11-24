package universidad;

public class Main {

    public static void main(String[] args) {

        Profesor prof = new Profesor("Ing. Héctor Juan Pérez", "PROF-001", "Programación Web");

        // Estudiantes
        Estudiante s1 = new Estudiante("Ana Castillo", "EST-001", "Tec. Desarrollo Software");
        Estudiante s2 = new Estudiante("Luis Andrade", "EST-002", "Tec. Desarrollo Software");
        Estudiante s3 = new Estudiante("Martha Castro", "EST-003", "Tec. Desarrollo Software");

        // Notas
        s1.agregarNota(8.5);
        s1.agregarNota(9.0);

        s2.agregarNota(7.0);
        s2.agregarNota(6.5);

        s3.agregarNota(9.5);
        s3.agregarNota(8.0);
        s3.agregarNota(7.5);

        // Curso
        Curso curso = new Curso("INF101", "Fundamentos de Programación");
        curso.asignarProfesor(prof);

        curso.inscribirEstudiante(s1);
        curso.inscribirEstudiante(s2);
        curso.inscribirEstudiante(s3);

        System.out.println("=== INFORMACIÓN DEL CURSO ===");
        curso.mostrarInformacionCurso();
        System.out.println();
        curso.listarEstudiantes();

        System.out.println("\n=== PROMEDIOS INDIVIDUALES ===");
        System.out.printf("%s - Promedio: %.2f\n", s1.getNombre(), s1.calcularPromedio());
        System.out.printf("%s - Promedio: %.2f\n", s2.getNombre(), s2.calcularPromedio());
        System.out.printf("%s - Promedio: %.2f\n", s3.getNombre(), s3.calcularPromedio());

        System.out.println("\n=== PROMEDIO GENERAL DEL CURSO ===");
        System.out.printf("Promedio general: %.2f\n", curso.calcularPromedioGeneral());
    }
}
