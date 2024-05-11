/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author OSMAR LOPEZ
 */
public abstract class Usuario {
    
    private String nombres;
    private String apellidos;
    private String id;
    private char sexo;
    private String telefono;

    public Usuario() {
    }

    public Usuario(String nombres, String apellidos, String id, char sexo, String telefono) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.id = id;
        this.sexo = sexo;
        this.telefono = telefono;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", id=" + id + ", sexo=" + sexo + ", telefono=" + telefono + '}';
    }
    
    public abstract void realizarViaje(Viaje v);
    public abstract void cancelarViaje(Viaje v);
    public abstract Usuario busquedaPersona(Usuario p);
    
}
