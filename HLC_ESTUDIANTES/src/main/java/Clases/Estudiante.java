package Clases;
import java.util.HashMap;
import java.util.Map;

public class Estudiante {
    private String nombre;
    private int id;
    private Map<Curso, Double> cursos;

    public Estudiante(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.cursos = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public void asignarCurso(Curso curso, double calificacion) {
        cursos.put(curso, calificacion);
    }

    public double calcularPromedio() {
        if (cursos.isEmpty()) return 0.0;

        double suma = 0;
        for (double calificacion : cursos.values()) {
            suma += calificacion;
        }
        return suma / cursos.size();
    }

    public Map<Curso, Double> getCursos() {
        return cursos;
    }
}
