package org.example.Ecosistema.Simulacion;
import java.util.List;
import java.util.Random;
import org.example.Ecosistema.Organismo.Animal;
import org.example.Ecosistema.Organismo.Planta;
import org.example.Ecosistema.Organismo.Organismo;

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

    private void modificarEstadoAnimal(Animal animal) {
        int opcion = random.nextInt(3); // Genera un número aleatorio entre 0 y 2

        switch (opcion) {
            case 0:
                // Modificar salud
                int nuevaSalud = animal.getSalud() - random.nextInt(20);
                animal.setSalud(Math.max(nuevaSalud, 0));
                break;
            case 1:
                // Modificar estado reproductivo
                boolean nuevoEstadoReproductivo = random.nextBoolean();
                animal.setEstadoReproductivo(nuevoEstadoReproductivo);
                if (nuevoEstadoReproductivo) {
                    animal.reproducirse();
                }
                break;
            case 2:
                //Modificar estado
                System.out.println("El animal ha comido una planta venenosa");
                animal.setSalud(animal.getSalud() - 20);
            default:
                // No hacer nada
                break;
        }
    }

    private void modificarEstadoPlanta(Planta planta) {
        int opcion = random.nextInt(2); // Genera un número aleatorio entre 0 y 2

        switch (opcion) {
            case 0:
                // Modificar salud
                int nuevaSalud = planta.getSalud() - random.nextInt(20)+1;
                planta.setSalud(nuevaSalud);
                break;
            case 1:
                // Modificar estado reproductivo
                boolean nuevoEstadoReproductivo = random.nextBoolean();
                planta.setEstadoReproductivo(nuevoEstadoReproductivo);
                if (nuevoEstadoReproductivo) {
                    planta.reproducirse();
                }
                break;
            default:
                // No hacer nada
                break;
        }
    }
}

