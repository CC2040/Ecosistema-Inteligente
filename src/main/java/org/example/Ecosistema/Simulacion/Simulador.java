package org.example.Ecosistema.Simulacion;
import org.example.Ecosistema.Ambiente.Ambiente;
import org.example.Ecosistema.Organismo.Organismo;

public class Simulador {
    private Ambiente ambiente;
    private Organismo organismo;

    public Simulador(Ambiente ambiente, Organismo organismo) {
        this.ambiente = ambiente;
        this.organismo = organismo;
    }
}
