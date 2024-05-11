/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Cliente;
import Entidades.Conductor;
import java.util.ArrayList;
import Entidades.Viaje;
import java.time.LocalDate;

/**
 *
 * @author OSMAR LOPEZ
 */
public class Historico {
    
    private LocalDate fecha;
    private Conductor conductor;
    private Cliente cliente;
    private ArrayList<Viaje> viajes;

    public Historico() {
    }

    public Historico(LocalDate fecha, Conductor conductor, Cliente cliente, ArrayList<Viaje> viajes) {
        this.fecha = fecha;
        this.conductor = conductor;
        this.cliente = cliente;
        this.viajes =  new ArrayList();
    }

    public ArrayList<Viaje> getViajes() {
        return viajes;
    }

    public void setViajes(ArrayList<Viaje> viajes) {
        this.viajes = viajes;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Historico{" + "fecha=" + fecha + ", conductor=" + conductor + ", cliente=" + cliente + ", viajes=" + viajes + '}';
    }
    
}
