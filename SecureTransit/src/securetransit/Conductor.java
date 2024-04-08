/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package securetransit;

/**
 *
 * @author OSMAR LOPEZ
 */
public class Conductor {
    
    private String nombreConductor;
    private String aparienciaConductor;
    private String detallesConductor;

    public Conductor() {
    }

    public Conductor(String nombreConductor, String aparienciaConductor, String detallesConductor) {
        this.nombreConductor = nombreConductor;
        this.aparienciaConductor = aparienciaConductor;
        this.detallesConductor = detallesConductor;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public String getAparienciaConductor() {
        return aparienciaConductor;
    }

    public void setAparienciaConductor(String aparienciaConductor) {
        this.aparienciaConductor = aparienciaConductor;
    }

    public String getDetallesConductor() {
        return detallesConductor;
    }

    public void setDetallesConductor(String detallesConductor) {
        this.detallesConductor = detallesConductor;
    }

    @Override
    public String toString() {
        return "DatosConductor{" + "nombreConductor=" + nombreConductor + ", aparienciaConductor=" + aparienciaConductor + ", detallesConductor=" + detallesConductor + '}';
    }
    
    
}
