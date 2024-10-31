package Clases;

public class Libro {
    private String titulo;
    private String autor;
    private boolean prestado;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void prestar() {
        if (!prestado) {
            prestado = true;
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    public void devolver() {
        prestado = false;
    }
}
