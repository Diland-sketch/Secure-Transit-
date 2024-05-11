/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Cliente;
import java.time.LocalDate;

/**
 *
 * @author OSMAR LOPEZ
 */
public class Reseña {
    
    private LocalDate fecha;
    private String descripcion;
    private Cliente cliente;

    public Reseña() {
    }

    public Reseña(LocalDate fecha, String descripcion, Cliente cliente) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Rese\u00f1a{" + "fecha=" + fecha + ", descripcion=" + descripcion + ", cliente=" + cliente + '}';
    }
    
}
