package com.example.demo.Models;

public class Usuarios {
    private String Usuario;
    private String Email;
    private int Persona_id;

    public Usuarios(String usuario, String email, int persona_id) {
        this.Usuario = usuario;
        this.Email = email;
        this.Persona_id = persona_id;
    }

    public Usuarios(){}


    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        this.Usuario = usuario;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public int getPersona_id() {
        return Persona_id;
    }

    public void setPersona_id(int id) {
        this.Persona_id = id;
    }

}
