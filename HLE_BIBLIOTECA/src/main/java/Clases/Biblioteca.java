package Clases;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    private List<Usuario> usuarios;
    private HashMap<Integer, Libro> prestamos;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.prestamos = new HashMap<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado: " + libro.getTitulo());
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario registrado: " + usuario.getNombre());
    }

    public void prestarLibro(int usuarioId, String tituloLibro) {
        Usuario usuario = buscarUsuario(usuarioId);
        Libro libro = buscarLibro(tituloLibro);

        if (usuario != null && libro != null) {
            if (!libro.isPrestado()) {
                libro.prestar();
                prestamos.put(usuarioId, libro);
                System.out.println("Libro prestado a: " + usuario.getNombre());
            } else {
                System.out.println("El libro ya está prestado.");
            }
        } else {
            System.out.println("Usuario o libro no encontrado.");
        }
    }

    public void devolverLibro(int usuarioId) {
        if (prestamos.containsKey(usuarioId)) {
            Libro libro = prestamos.get(usuarioId);
            libro.devolver();
            prestamos.remove(usuarioId);
            System.out.println("Libro devuelto.");
        } else {
            System.out.println("No se encontró un préstamo para este usuario.");
        }
    }

    private Usuario buscarUsuario(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    private Libro buscarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }
}
