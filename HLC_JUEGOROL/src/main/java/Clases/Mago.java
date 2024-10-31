package Clases;

import java.util.List;
import java.util.ArrayList;

public class Mago extends Personaje{
    private List<Hechizo> hechizos;

    public Mago(String nombre, int puntosDeVida, int ataque) {
        super(nombre, puntosDeVida, ataque);
        this.hechizos = new ArrayList<>();
    }

    public void aprenderHechizo(Hechizo hechizo) {
        hechizos.add(hechizo);
        System.out.println(nombre + " ha aprendido el hechizo: " + hechizo.getNombre());
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(nombre + " lanza un ataque mágico a " + objetivo.getNombre() + ".");
        objetivo.recibirDanio(ataque);
    }

    public void lanzarHechizo(Personaje objetivo, String nombreHechizo) {
        for (Hechizo hechizo : hechizos) {
            if (hechizo.getNombre().equalsIgnoreCase(nombreHechizo)) {
                System.out.println(nombre + " lanza el hechizo " + nombreHechizo + " sobre " + objetivo.getNombre());
                objetivo.recibirDanio(hechizo.getDanio());
                return;
            }
        }
        System.out.println(nombre + " no conoce el hechizo: " + nombreHechizo);
    }
}
