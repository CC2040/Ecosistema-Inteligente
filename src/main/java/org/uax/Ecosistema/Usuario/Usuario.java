package org.uax.Ecosistema.Usuario;


public class Usuario {
    private String nombre;
    private String id;
    private String contrasenia;

    // Constructores

    public Usuario() {
        this.nombre = "";
        this.id = "";
        this.contrasenia = "";
    }

    public Usuario(String nombre, String id, String contrasenia) {
        this.nombre = nombre;
        this.id = id;
        this.contrasenia = contrasenia;
    }

    // Getters y Setters

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getContrasenia() {
        return this.contrasenia;
    }
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    // Métodos
    public void registrarUsuario(String usuario, String id,String contrasenia) {
        setNombre(usuario);
        setId(id);
        setContrasenia(contrasenia);
    }

}
