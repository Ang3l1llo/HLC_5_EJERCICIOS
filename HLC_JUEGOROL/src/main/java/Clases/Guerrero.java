package Clases;

public class Guerrero extends Personaje{
    public Guerrero(String nombre, int puntosDeVida, int ataque) {
        super(nombre, puntosDeVida, ataque);
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(nombre + " ataca a " + objetivo.getNombre() + " con un ataque cuerpo a cuerpo.");
        objetivo.recibirDanio(ataque);
    }
}
