/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package securetransit;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author OSMAR LOPEZ
 */
public class RegistroServicio {
    
    private LocalTime horaServicio;
    private LocalTime horaLlegada;
    private LocalDate fechaServicio;

    public RegistroServicio() {
    }

    public RegistroServicio(LocalTime horaServicio, LocalTime horaLlegada, LocalDate fechaServicio) {
        this.horaServicio = horaServicio;
        this.horaLlegada = horaLlegada;
        this.fechaServicio = fechaServicio;
    }

    public LocalTime getHoraServicio() {
        return horaServicio;
    }

    public void setHoraServicio(LocalTime horaServicio) {
        this.horaServicio = horaServicio;
    }

    public LocalTime getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(LocalTime horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public LocalDate getFechaServicio() {
        return fechaServicio;
    }

    public void setFechaServicio(LocalDate fechaServicio) {
        this.fechaServicio = fechaServicio;
    }

    @Override
    public String toString() {
        return "RegistroServicio{" + "horaServicio=" + horaServicio + ", horaLlegada=" + horaLlegada + ", fechaServicio=" + fechaServicio + '}';
    }
    
    
    
    
}
