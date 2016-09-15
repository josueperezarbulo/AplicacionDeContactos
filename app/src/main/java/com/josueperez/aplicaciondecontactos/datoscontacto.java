package com.josueperez.aplicaciondecontactos;

/**
 * Created by Yo on 22/08/2016.
 */
public class datoscontacto {
    private String nombre;
    private String telefono;
    private String fecha;
    private String descripcion;

    public datoscontacto(String nombre, String telefono, String fecha, String descripcion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
