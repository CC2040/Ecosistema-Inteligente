package org.uax.Ecosistema.Ambiente;


public class Ambiente {
    private String clima;
    private String terreno;
    private int recursos;
    private String tiempo;

    public Ambiente(String clima, String terreno, int recursos, String tiempo) {
        this.clima = clima;
        this.terreno = terreno;
        this.recursos = recursos;
        this.tiempo = tiempo;
    }
    @Override
    public String toString() {
        return  "\t"+"Clima=" + clima + "\n\t\t" + "Terreno= " + terreno + "\n\t\t"+"Recursos=" + recursos + "\n\t\t"+ "Tiempo=" + tiempo ;
    }

}
