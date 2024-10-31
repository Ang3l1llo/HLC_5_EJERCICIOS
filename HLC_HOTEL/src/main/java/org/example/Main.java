package org.example;
import Clases.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        Habitacion hab1 = new Habitacion(101, "Individual");
        Habitacion hab2 = new Habitacion(102, "Doble");
        hotel.agregarHabitacion(hab1);
        hotel.agregarHabitacion(hab2);

        Cliente cliente1 = new Cliente("Maria Gonzalez Sancherz", 1);

        hotel.hacerReserva(cliente1, 101, LocalDate.of(2024, 11, 1), LocalDate.of(2024, 11, 5));
        hotel.mostrarReservasActivas();

        hotel.cancelarReserva(cliente1, 101);
        hotel.mostrarReservasActivas();
    }
}