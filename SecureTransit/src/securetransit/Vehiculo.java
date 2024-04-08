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
    
    private String placa;
    private String marcaVehiculo;
    private String colorVehiculo;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String marcaVehiculo, String colorVehiculo) {
        this.placa = placa;
        this.marcaVehiculo = marcaVehiculo;
        this.colorVehiculo = colorVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public String getColorVehiculo() {
        return colorVehiculo;
    }

    public void setColorVehiculo(String colorVehiculo) {
        this.colorVehiculo = colorVehiculo;
    }

    @Override
    public String toString() {
        return "DatosVehiculo{" + "placa=" + placa + ", marcaVehiculo=" + marcaVehiculo + ", colorVehiculo=" + colorVehiculo + '}';
    }
    
    
}
