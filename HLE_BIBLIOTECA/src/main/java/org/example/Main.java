package org.example;
import Clases.*;


public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes");
        Libro libro2 = new Libro("1984", "George Orwell");
        Usuario usuario1 = new Usuario("Juan Perez", 1);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.registrarUsuario(usuario1);

        biblioteca.prestarLibro(1, "El Quijote");
        biblioteca.prestarLibro(1, "El Quijote");  // Intento de préstamo cuando ya está prestado
        biblioteca.devolverLibro(1);
        biblioteca.prestarLibro(1, "1984");
    }
}