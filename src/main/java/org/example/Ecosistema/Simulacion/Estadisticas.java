package org.example.Ecosistema.Simulacion;
import java.util.ArrayList;
import java.util.List;
import org.example.Ecosistema.Organismo.Organismo;
import org.example.Ecosistema.Organismo.Animal;
import org.example.Ecosistema.Organismo.Planta;

public class Estadisticas {
    private int numeroAnimales;
    private int numeroPlantas;
    private List<Animal> animal;
    private List<Planta> planta;

    //Constructor
    public Estadisticas(int numeroAnimales, int numeroPlantas, List<Animal> animal, List<Planta> planta) {
        this.numeroAnimales = numeroAnimales;
        this.numeroPlantas = numeroPlantas;
        this.animal = animal;
        this.planta = planta;
    }
    public Estadisticas(){
        this.numeroAnimales = 0;
        this.numeroPlantas = 0;
        this.animal = null;
        this.planta = null;
    }

    //Setters y Getters
    public int getNumeroAnimales() {
        return numeroAnimales;
    }
    public void setNumeroAnimales(int numeroAnimales) {
        this.numeroAnimales = numeroAnimales;
    }
    public int getNumeroPlantas() {
        return numeroPlantas;
    }
    public void setNumeroPlantas(int numeroPlantas) {
        this.numeroPlantas = numeroPlantas;
    }
    public List<Animal> getAnimal() {
        return animal;
    }
    public void setAnimal(List<Animal> animal) {
        this.animal = animal;
    }
    public List<Planta> getPlanta() {
        return planta;
    }
    public void setPlanta(List<Planta> planta) {
        this.planta = planta;
    }

    //Metodos para clasificar las estadisticas
    public void clasificarEstadisticas(List<Organismo> organismos) {
        List<Animal> animales = new ArrayList<Animal>();
        List<Planta> plantas= new ArrayList<Planta>();
        for (Organismo organismo : organismos) {
            if (organismo instanceof Animal) {
                setNumeroAnimales(getNumeroAnimales() + 1);
                animales.add((Animal) organismo);
            } else if (organismo instanceof Planta) {
                setNumeroPlantas(getNumeroPlantas() + 1);
                plantas.add((Planta) organismo);
            }
        }
        setAnimal(animales);
        setPlanta(plantas);
    }

    public void mostrarEstadisticas(){
        System.out.println("Numero de animales: "+getNumeroAnimales());
        for (Animal animal : animal) {
            System.out.println("Nombre: "+animal.getNombre()+", Edad: "+animal.getEdad()+", Estado reproductivo: "+animal.EstadoReproductivo()+", Salud:"+animal.getSalud()+", Posicion(x,y):("+animal.getPosicionX()+","+animal.getPosicionY()+")");
        }
        System.out.println("Numero de plantas: "+getNumeroPlantas());
        for (Planta planta : planta) {
            System.out.println("Nombre: "+planta.getNombre()+", Edad: "+planta.getEdad()+", Estado reproductivo: "+planta.EstadoReproductivo()+", Salud:"+planta.getSalud()+", Es venenosa:"+planta.getEsVenenosa()+", Posicion(x,y):("+planta.getPosicionX()+","+planta.getPosicionY()+")");
        }
    }
}
