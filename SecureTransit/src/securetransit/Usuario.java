/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package securetransit;

/**
 *
 * @author OSMAR LOPEZ
 */
public class Usuario {
    
    private String nombre;
    private String apellido;
    private String id;
    private String edad;
    private char sexo;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String id, String edad, char sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", edad=" + edad + ", sexo=" + sexo + '}';
    }
    
    public void soyUsuario(Usuario usuario){
        System.out.println("Soy un usuario del software Secure Transit" + usuario);
    }
    
}
