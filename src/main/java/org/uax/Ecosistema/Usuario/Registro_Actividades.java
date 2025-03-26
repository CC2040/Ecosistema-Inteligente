package org.uax.Ecosistema.Usuario;

import org.uax.Ecosistema.Simulacion.Simulador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Registro_Actividades {
   private Map<Usuario, List<Simulador>> registroActividades;

   public Registro_Actividades() {
        this.registroActividades = new HashMap<>();
   }

   public Registro_Actividades(Map<Usuario, List<Simulador>> registroActividades) {
        this.registroActividades = registroActividades;
   }


    public void registrarActividad(Usuario usuario, Simulador simulador) {
       if (registroActividades.containsKey(usuario)) {
           List<Simulador> simuladores = registroActividades.get(usuario);
           simuladores.add(simulador);
           registroActividades.put(usuario, simuladores);
       }else {
           List<Simulador> simuladores = new ArrayList<>();
           simuladores.add(simulador);
           registroActividades.put(usuario, simuladores);
       }
    }
    public void mostrarSimulaciones() {
       System.out.println("Las simulaciones realizadas son");
        for (Map.Entry<Usuario, List<Simulador>> entry : registroActividades.entrySet()) {
            Usuario usuarioAux = entry.getKey();
            List<Simulador> simuladores = entry.getValue();
            System.out.println("Usuario: " + usuarioAux.getNombre());
            for (Simulador simulador : simuladores) {
                System.out.println("Simulaciones: "+"\n" + simulador.toString());
            }
        }
    }


}
