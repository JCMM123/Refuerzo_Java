package org.example;

public class Persona {
    private String nombre = "Juan";
    private String apellido = "Carpo";
    private String cedula = "cc1000";


    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String getApellido() {
        return apellido;
    }

    protected void setApellido(String apellido) {
        this.apellido = apellido;
    }

    protected String getCedula() {
        return cedula;
    }

    protected void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
