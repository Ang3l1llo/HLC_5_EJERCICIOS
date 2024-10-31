package Clases;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Habitacion> habitaciones;
    private List<Reserva> reservas;

    public Hotel() {
        this.habitaciones = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
        System.out.println("Habitación agregada: " + habitacion.getNumero());
    }

    public void hacerReserva(Cliente cliente, int numeroHabitacion, LocalDate fechaInicio, LocalDate fechaFin) {
        Habitacion habitacion = buscarHabitacion(numeroHabitacion);

        if (habitacion != null && habitacion.isDisponible()) {
            habitacion.reservar();
            Reserva reserva = new Reserva(cliente, habitacion, fechaInicio, fechaFin);
            reservas.add(reserva);
            System.out.println("Reserva realizada para el cliente: " + cliente.getNombre());
        } else {
            System.out.println("La habitación no está disponible o no existe.");
        }
    }

    public void cancelarReserva(Cliente cliente, int numeroHabitacion) {
        Reserva reserva = buscarReserva(cliente, numeroHabitacion);

        if (reserva != null) {
            reservas.remove(reserva);
            reserva.getHabitacion().cancelarReserva();
            System.out.println("Reserva cancelada para el cliente: " + cliente.getNombre());
        } else {
            System.out.println("No se encontró una reserva para cancelar.");
        }
    }

    public void mostrarReservasActivas() {
        System.out.println("Reservas activas:");
        for (Reserva reserva : reservas) {
            System.out.println("Cliente: " + reserva.getCliente().getNombre() +
                    ", Habitación: " + reserva.getHabitacion().getNumero() +
                    ", Desde: " + reserva.getFechaInicio() + " Hasta: " + reserva.getFechaFin());
        }
    }

    private Habitacion buscarHabitacion(int numero) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == numero) {
                return habitacion;
            }
        }
        return null;
    }

    private Reserva buscarReserva(Cliente cliente, int numeroHabitacion) {
        for (Reserva reserva : reservas) {
            if (reserva.getCliente().equals(cliente) && reserva.getHabitacion().getNumero() == numeroHabitacion) {
                return reserva;
            }
        }
        return null;
    }
}
