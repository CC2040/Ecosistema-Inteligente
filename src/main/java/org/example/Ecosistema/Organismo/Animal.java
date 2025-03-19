package org.example.Ecosistema.Organismo;

public class Animal extends Organismo {
    private String nombre;
    public Animal(int posicionX, int posicionY, int salud, int edad, boolean estadoReproductivo, String nombre) {
        super(posicionX, posicionY, salud, edad, estadoReproductivo);
        this.nombre = nombre;
    }
    //Metodos propios Animal
    public void moverse(int x, int y) {
        setPosicionX(x);
        setPosicionY(y);
        System.out.println("El animal " + nombre + " se movió a la posición (" + x + ", " + y + ")");
    }

    //Metodos generales Organismo
    @Override
    public void reproducirse() {
        System.out.println("El"+nombre+"se ha reproducido");
        Animal hijo = new Animal(posicionX, posicionY, salud, 0, false, nombre);
    }
    @Override
    public void hacerRuido() {
        System.out.println("El"+nombre+"hace ruido");
    }
    @Override
    public void enfermar() {
        System.out.println("El"+nombre+"se ha enfermado");
        setSalud(salud-10);
    }
}
