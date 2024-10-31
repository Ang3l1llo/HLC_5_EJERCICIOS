package Clases;

public class Habitacion {
    private int numero;
    private String tipo;
    private boolean disponible;

    public Habitacion(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.disponible = true; // Inicialmente, todas las habitaciones están disponibles
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void reservar() {
        disponible = false;
    }

    public void cancelarReserva() {
        disponible = true;
    }
}
