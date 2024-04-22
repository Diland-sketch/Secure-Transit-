/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package securetransit;

import java.util.ArrayList;

/**
 *
 * @author OSMAR LOPEZ
 */
public class Ruta {
    
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Parada> paradas;

    public Ruta() {
    }

    public Ruta(ArrayList<Vehiculo> vehiculos, ArrayList<Parada> paradas) {
        this.vehiculos = new ArrayList();
        this.paradas = new ArrayList();
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Parada> getParadas() {
        return paradas;
    }

    public void setParadas(ArrayList<Parada> paradas) {
        this.paradas = paradas;
    }

    @Override
    public String toString() {
        return "Ruta{" + "vehiculos=" + vehiculos + ", paradas=" + paradas + '}';
    }
    
}
