/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package securetransit;

/**
 *
 * @author OSMAR LOPEZ
 */
public abstract class Persona {
    
    private String nombres;
    private String apellidos;
    private String id;
    private int edad;
    private char sexo;
    private String telefono;

    public Persona() {
    }

    public Persona(String nombres, String apellidos, String id, int edad, char sexo, String telefono) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.id = id;
        this.edad = edad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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
        return "Persona{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", id=" + id + ", edad=" + edad + ", sexo=" + sexo + ", telefono=" + telefono + '}';
    }
    
    public abstract void realizarViaje(Viaje v);
    public abstract void cancelarViaje(Viaje v);
    public abstract Persona busquedaPersona(Persona p);
    
}
