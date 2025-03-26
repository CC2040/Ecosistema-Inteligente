package org.uax.Ecosistema.Organismo;

public class Planta extends Organismo {
    String nombre;
    boolean esVenenosa;
    public Planta(int posicionX, int posicionY, int salud, int edad, boolean estadoReproductivo, String nombre,boolean esVenenosa) {
        super(posicionX, posicionY, salud, edad, estadoReproductivo);
        this.nombre = nombre;
        this.esVenenosa = esVenenosa;
    }

    //Setters y Getters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getEsVenenosa() {
        return esVenenosa;
    }
    public void setEsVenenosa(boolean esVenenosa) {
        this.esVenenosa = esVenenosa;
    }

    //Metodos propios Planta
    public void crecer() {
        System.out.println("La planta ha crecido");
    }
    //Metodos generales Organismo
    @Override
    public void hacerRuido() {
        System.out.println("El ruido proviene de la planta");
    }

    @Override
    public void enfermar() {
        System.out.println("La planta se esta marchitado");
        setSalud(salud-10);
    }
    @Override
    public String toString() {
        return "\t\t"+"Nombre=" + nombre +"\n\t\t"
                +"PosicionX=" + posicionX +"\n\t\t"
                +"PosicionY=" + posicionY +"\n\t\t"
                +"Salud=" + salud +"\n\t\t"
                +"Edad=" + edad +"\n\t\t"
                +"Estado Reproductivo=" + estadoReproductivo +"\n\t\t"
                + "Es venenosa=" + esVenenosa+"\n" ;
    }
}
