package com.example.exament8davidmendez;

public class Tutor {
    String nombre;
    String apellidos;
    String mail;
    String clase;

    public Tutor(String nombre, String apellidos, String mail, String clase) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.mail = mail;
        this.clase = clase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
}
