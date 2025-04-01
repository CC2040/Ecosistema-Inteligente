package org.uax.Ecosistema.Simulacion;
import org.uax.Ecosistema.Organismo.Animal;
import org.uax.Ecosistema.Organismo.Planta;


public class Crecimiento_poblacion {
    private Animal animalNuevos;
    private Planta plantasNuevas;

    //Constructores
    public Crecimiento_poblacion() {
        plantasNuevas = null;
        animalNuevos = null;
    }
    public Crecimiento_poblacion(Planta plantasNuevas) {
        this.plantasNuevas = plantasNuevas;
        this.animalNuevos = null;
    }
    public Crecimiento_poblacion(Animal animalNuevos) {
        this.animalNuevos = animalNuevos;
        this.plantasNuevas = null;
    }

    //Setters y Getters
    public Planta getPlantasNuevas() {
        return plantasNuevas;
    }
    public void setPlantasNuevas(Planta plantasNuevas) {
        this.plantasNuevas = plantasNuevas;
    }
    public Animal getAnimalNuevos() {
        return animalNuevos;
    }
    public void setAnimalNuevos(Animal animalNuevos) {
        this.animalNuevos = animalNuevos;
    }
    //Metodos
    public Animal reproduccionAnimales(Animal animales) {
    Animal hijo = new Animal(animales.getPosicionX(), animales.getPosicionY(), 100, 0, false, animales.getNombre()+" hijo");
        return hijo;
    }
    public Planta reproduccionPlanta(Planta plantas) {
        Planta nuevaPlanta = new Planta(plantas.getPosicionX(), plantas.getPosicionY(), 100, 0, false, plantas.getNombre()+" hijo", false);
        return nuevaPlanta;
    }
}
