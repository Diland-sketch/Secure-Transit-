/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package securetransit;

/**
 *
 * @author OSMAR LOPEZ
 */
public class Vehiculo {
    
    private String marca;
    private String color;
    private String placa;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String color, String placa) {
        this.marca = marca;
        this.color = color;
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", color=" + color + ", placa=" + placa + '}';
    }
    
}
