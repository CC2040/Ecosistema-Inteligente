package org.uax.Ecosistema.Organismo;

public class Animal extends Organismo {
    private String nombre;
    public Animal(int posicionX, int posicionY, int salud, int edad, boolean estadoReproductivo, String nombre) {
        super(posicionX, posicionY, salud, edad, estadoReproductivo);
        this.nombre = nombre;
    }
    //Setters y Getters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodos propios Animal
    public void moverse(int x, int y) {
        setPosicionX(x);
        setPosicionY(y);
        System.out.println("El animal " + nombre + " se movió a la posición (" + x + ", " + y + ")");
    }

    public void predacion(Animal predador) {
        System.out.println("El "+predador.getNombre()+" ha cazado");
        predador.setSalud(predador.getSalud()+10);
    }
public void presa(Animal presa) {
        System.out.println("El "+presa.getNombre()+" ha sido cazado");
        presa.setSalud(0);
}

    //Metodos generales Organismo
    @Override
    public void hacerRuido() {
        System.out.println("El"+nombre+"hace ruido");
    }
    @Override
    public void enfermar() {
        System.out.println("El"+nombre+"se ha enfermado");
        setSalud(salud-10);
    }
    @Override
    public String toString() {
        return "\n\t\t" + "Nombre='" + nombre +"\n\t\t"+
                "PosicionX=" + posicionX +"\n\t\t" +
                "PosicionY=" + posicionY +"\n\t\t"+
                "Salud=" + salud +"\n\t\t" +
                "Edad=" + edad +"\n\t\t" +
                "Estado Reproductivo=" + estadoReproductivo+"\n";
    }
}
