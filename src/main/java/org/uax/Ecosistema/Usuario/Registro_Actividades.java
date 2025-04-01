package org.uax.Ecosistema.Usuario;

import org.uax.Ecosistema.Simulacion.Simulador;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Registro_Actividades {
   private Map<Usuario, List<Simulador>> registroActividades;
   //Constructor
   public Registro_Actividades() {
     registroActividades = new HashMap<>();
   }

   public Registro_Actividades(Map<Usuario, List<Simulador>> registroActividades) {
        this.registroActividades = registroActividades;
   }

   //Añadir mas simulaciones a un usuario
     public void registrarActividad(Usuario usuario, Simulador simulador) {
     List<Simulador> simuladores = registroActividades.get(usuario);
          if (simuladores == null) {
         simuladores = new ArrayList<>();
          }
     simuladores.add(simulador);
     registroActividades.put(usuario, simuladores);
     }

     public void mostrarSimulaciones(Usuario usuario) {
     List<Simulador> simuladores = registroActividades.get(usuario);
          if (simuladores == null || simuladores.isEmpty()) {
          System.out.println("No hay simulaciones registradas para el usuario: " + usuario.getNombre() + " ID:" + usuario.getId());
          return;
          }
     System.out.println("Usuario: " + usuario.getNombre() + " ID:" + usuario.getId());
          for (Simulador simulador : simuladores) {
          System.out.println(simulador);
          }
     }

}
