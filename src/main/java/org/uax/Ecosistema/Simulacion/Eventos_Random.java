package org.uax.Ecosistema.Simulacion;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.uax.Ecosistema.Organismo.Animal;
import org.uax.Ecosistema.Organismo.Planta;
import org.uax.Ecosistema.Organismo.Organismo;

public class Eventos_Random {
    private Random random = new Random();

    public void modificarEstado(List<Organismo> organismos) {
        for (Organismo organismo : organismos) {
            if (organismo instanceof Animal) {
                modificarEstadoAnimal((Animal) organismo);
            } else if (organismo instanceof Planta) {
                modificarEstadoPlanta((Planta) organismo);
            }
        }
    }
    public void reproducionOrganismos(List<Organismo> organismos) {
        Crecimiento_poblacion poblacion = new Crecimiento_poblacion();
        List<Organismo> organismoAux= new ArrayList<Organismo>();
        for (Organismo organismo : organismos) {
            if (organismo instanceof Animal) {
                organismoAux.add(poblacion.reproduccionAnimales((Animal) organismo));


            } else if (organismo instanceof Planta) {
                organismoAux.add(poblacion.reproduccionPlanta((Planta) organismo));
            }
        }
        organismos.addAll(organismoAux);
    }

    public void modificarEstadoAnimal(Animal animal) {
        int opcion = random.nextInt(4); // Genera un número aleatorio entre 0 y 3

        switch (opcion) {
            case 0:
                // Modificar salud por herida
                System.out.println("El "+animal.getNombre()+" se ha lastimado");
                int nuevaSalud = animal.getSalud() - 10;
                animal.setSalud(Math.max(nuevaSalud, 0));
                break;
            case 1:
                //Modificar estado
                System.out.println("El "+animal.getNombre()+" ha comido una planta venenosa");
                animal.setSalud(animal.getSalud() - 20);
            case 2:
                //Evento cazador de animal
                animal.predacion(animal);
            case 3:
                //Evento caza de animal
                animal.presa(animal);
            default:
                // No hacer nada
                break;
        }
    }

    public void modificarEstadoPlanta(Planta planta) {
        int opcion = random.nextInt(2); // Genera un número aleatorio entre 0 y 1

        switch (opcion) {
            case 0:
                // Modificar salud
                System.out.println("El "+planta.getNombre()+" ha sufrido daños");
                planta.setSalud(planta.getSalud()-10);
                break;
            case 1:
                //Modificar estado
                System.out.println("El "+planta.getNombre()+" se ha enfermado");
                planta.setSalud(planta.getSalud() - 20);

            default:
                // No hacer nada
                break;
        }
    }

}

