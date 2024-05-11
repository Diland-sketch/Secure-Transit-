/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author OSMAR LOPEZ
 */
public class Conductor extends Usuario {
    
    private Vehiculo vehiculo;

    public Conductor() {
    }

    public Conductor(Vehiculo vehiculo, String nombres, String apellidos, String id, char sexo, String telefono) {
        super(nombres, apellidos, id, sexo, telefono);
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Conductor{"+ super.toString() + "vehiculo=" + vehiculo + '}';
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
