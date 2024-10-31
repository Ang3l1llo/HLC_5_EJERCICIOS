package org.example;
import Clases.*;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Juan");

        usuario.crearProyecto("Proyecto de Desarrollo");
        Proyecto proyecto = usuario.obtenerProyecto("Proyecto de Desarrollo");

        if (proyecto != null) {
            Tarea tarea1 = new Tarea("Diseño de la interfaz", "Crear el diseño inicial de la interfaz de usuario.");
            Tarea tarea2 = new Tarea("Implementación del backend", "Desarrollar la lógica de negocio.");
            proyecto.agregarTarea(tarea1);
            proyecto.agregarTarea(tarea2);

            proyecto.listarTareas();

            tarea1.marcarComoCompletada();
            proyecto.listarTareas();
        }
    }
}