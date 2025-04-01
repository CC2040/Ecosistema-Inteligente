package org.uax.Ecosistema.Usuario;

public class Autenticacion {
    private Usuario usuario;

    public Autenticacion(Usuario usuario) {
        this.usuario = usuario;
    }
    //Constructor por defecto
    public Autenticacion() {
        this.usuario = new Usuario();
    }
    public void Autenticacion_cliente(String usuario, int id,String contrasenia) {
        //Codigo a implementar para autenticar al cliente
    }
}
