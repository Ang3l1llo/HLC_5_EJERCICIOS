package Clases;

public abstract class Personaje {
    protected String nombre;
    protected int puntosDeVida;
    protected int ataque;

    public Personaje(String nombre, int puntosDeVida, int ataque) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public boolean estaVivo() {
        return puntosDeVida > 0;
    }

    public void recibirDanio(int danio) {
        puntosDeVida -= danio;
        System.out.println(nombre + " recibe " + danio + " puntos de daño. Vida restante: " + puntosDeVida);
    }

    public abstract void atacar(Personaje objetivo);
}

