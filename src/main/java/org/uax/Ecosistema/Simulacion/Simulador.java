package org.uax.Ecosistema.Simulacion;
import java.util.List;
import org.uax.Ecosistema.Ambiente.Ambiente;
import org.uax.Ecosistema.Organismo.Organismo;


public class Simulador {
    private Ambiente ambiente;
    private List<Organismo> organismo;

    public Simulador( List<Organismo> organismo,Ambiente ambiente) {
        this.ambiente = ambiente;
        this.organismo = organismo;
    }

    public void simular() {
        // Crear un objeto de la clase Eventos_Random
        Eventos_Random eventos = new Eventos_Random();
        // Modificar el estado de los organismos
        eventos.modificarEstado(organismo);
        //Simula reproduccion
        eventos.reproducionOrganismos(organismo);
        // Mostrar las estadísticas
        Estadisticas estadisticas = new Estadisticas();
        estadisticas.clasificarEstadisticas(organismo);
        estadisticas.mostrarEstadisticas();
    }
}
