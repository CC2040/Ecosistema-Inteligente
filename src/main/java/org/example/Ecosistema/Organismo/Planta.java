package org.example.Ecosistema.Organismo;

public class Planta extends Organismo {
    String nombre;
    boolean esVenenosa;
    public Planta(int posicionX, int posicionY, int salud, int edad, boolean estadoReproductivo, String nombre,boolean esVenenosa) {
        super(posicionX, posicionY, salud, edad, estadoReproductivo);
        this.nombre = nombre;
        this.esVenenosa = esVenenosa;
    }

    //Metodos propios Planta
    public void crecer() {
        System.out.println("La planta ha crecido");
    }
    //Metodos generales Organismo
    @Override
    public void reproducirse() {
        System.out.println("La planta se ha reproducido");
        Planta hijo = new Planta(posicionX, posicionY, salud, 0, false, nombre,esVenenosa);
    }
    @Override
    public void hacerRuido() {
        System.out.println("El ruido proviene de la planta");
    }

    @Override
    public void enfermar() {
        System.out.println("La planta se esta marchitado");
        setSalud(salud-10);
    }
}
