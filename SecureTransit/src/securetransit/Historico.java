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
public class Historico {
    
    private ArrayList<Viaje> viajes;

    public Historico() {
    }

    public Historico(ArrayList<Viaje> viajes) {
        this.viajes = new ArrayList();
    }

    public ArrayList<Viaje> getViajes() {
        return viajes;
    }

    public void setViajes(ArrayList<Viaje> viajes) {
        this.viajes = viajes;
    }
    
}
