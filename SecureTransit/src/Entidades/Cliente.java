/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import Persistencia.Historico;

/**
 *
 * @author OSMAR LOPEZ
 */
public class Cliente extends Usuario{
    
    private ArrayList<Historico> historico;
    private ArrayList<Viaje> viajes;

    public Cliente() {
    }
    
    public Cliente(ArrayList<Historico> historico, ArrayList<Viaje> viajes, String nombres, String apellidos, String id, char sexo, String telefono) {
        super(nombres, apellidos, id, sexo, telefono);
        this.historico = new ArrayList();
        this.viajes = new ArrayList();
    }
    
    public ArrayList<Historico> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<Historico> historico) {
        this.historico = historico;
    }

    public ArrayList<Viaje> getViajes() {
        return viajes;
    }

    public void setViajes(ArrayList<Viaje> viajes) {
        this.viajes = viajes;
    }

    @Override
    public String toString() {
        return "Usuario{"+ super.toString() + "historico=" + historico + ", viajes=" + viajes + '}';
    }

    @Override
    public void realizarViaje(Viaje v) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void cancelarViaje(Viaje v) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Usuario busquedaPersona(Usuario p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
