package org.example;
import  Clases.*;

public class Main {
    public static void main(String[] args) {
        Profesor profesor1 = new Profesor("Pepa García", 1);
        Curso matematicas = new Curso("Matemáticas", profesor1);
        Curso historia = new Curso("Historia", profesor1);

        Estudiante estudiante1 = new Estudiante("Rau Pérez", 101);

        profesor1.asignarCursoAEstudiante(estudiante1, matematicas, 85.5);
        profesor1.asignarCursoAEstudiante(estudiante1, historia, 92.0);

        System.out.println("Promedio de " + estudiante1.getNombre() + ": " + estudiante1.calcularPromedio());
    }
}