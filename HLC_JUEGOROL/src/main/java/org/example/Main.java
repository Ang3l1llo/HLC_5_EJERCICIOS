package org.example;

import Clases.*;

public class Main {
    public static void main(String[] args) {

        Guerrero guerrero = new Guerrero("Aragorn", 100, 15);
        Mago mago = new Mago("Gandalf", 80, 10);

        Hechizo bolaDeFuego = new Hechizo("Bola de Fuego", 25);
        Hechizo rayo = new Hechizo("Rayo", 20);

        mago.aprenderHechizo(bolaDeFuego);
        mago.aprenderHechizo(rayo);


        guerrero.atacar(mago);
        mago.lanzarHechizo(guerrero, "Bola de Fuego");
        guerrero.atacar(mago);
        mago.lanzarHechizo(guerrero, "Rayo");


        System.out.println(guerrero.getNombre() + " tiene " + guerrero.getPuntosDeVida() + " puntos de vida.");
        System.out.println(mago.getNombre() + " tiene " + mago.getPuntosDeVida() + " puntos de vida.");
    }
}