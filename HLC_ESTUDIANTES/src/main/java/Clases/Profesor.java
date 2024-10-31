package Clases;

public class Profesor {
    private String nombre;
    private int id;

    public Profesor(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public void asignarCursoAEstudiante(Estudiante estudiante, Curso curso, double calificacion) {
        estudiante.asignarCurso(curso, calificacion);
        System.out.println("Curso " + curso.getNombre() + " asignado a " + estudiante.getNombre() + " con calificación " + calificacion);
    }
}
