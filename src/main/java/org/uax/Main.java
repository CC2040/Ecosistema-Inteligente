package org.uax;
import java.util.ArrayList;
import java.util.List;
import org.uax.Ecosistema.Organismo.Animal;
import org.uax.Ecosistema.Organismo.Planta;
import org.uax.Ecosistema.Organismo.Organismo;
import org.uax.Ecosistema.Ambiente.Ambiente;
import org.uax.Ecosistema.Simulacion.Simulador;


public class Main {
    public static void main(String[] args) {
        // Crear organismos y ambiente
        List<Organismo> organismos = new ArrayList<>();
        organismos.add(new Planta(0, 0, 100, 1, false,"Arbol",false));
        organismos.add(new Animal(1, 1, 100, 1, true, "Perro"));
        organismos.add(new Animal(1, 3, 100, 1, true, "Perro"));
        Ambiente ambiente = new Ambiente("Tropical", "Bosque", 1000, "Día");

        // Crear simulador y sistema de autenticación
        Simulador simulador = new Simulador(organismos, ambiente);
        simulador.simular();
        /*
        SistemaAutenticacion sistemaAutenticacion = new SistemaAutenticacion();
        sistemaAutenticacion.registrarUsuario("admin", "admin");

        // Crear interfaz de usuario
        InterfazUsuario interfazUsuario = new InterfazUsuario(simulador, sistemaAutenticacion);
        interfazUsuario.mostrarMenu();*/
    }
}