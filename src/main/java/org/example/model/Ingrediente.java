package org.example.model;
import java.util.Date;

public class Ingrediente {
    private String nombre;
    private int cantidad;
    private Date fechaIngreso;

    public Ingrediente(String nombre, int cantidad, Date fechaIngreso) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Ingrediente{" +
                "Nombre='" + nombre + '\'' +
                ", Cantidad=" + cantidad +
                ", Fecha de Ingreso=" + fechaIngreso +
                '}';
    }
}
