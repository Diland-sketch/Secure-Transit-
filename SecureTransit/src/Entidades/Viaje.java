/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author OSMAR LOPEZ
 */
public class Viaje {
    
    private LocalTime horaServicio;
    private LocalTime horaLlegada;
    private String lugarSalida;
    private String lugarLlegada;

    public Viaje() {
    }

    public Viaje(LocalTime horaServicio, LocalTime horaLlegada, String lugarSalida, String lugarLlegada) {
        this.horaServicio = horaServicio;
        this.horaLlegada = horaLlegada;
        this.lugarSalida = lugarSalida;
        this.lugarLlegada = lugarLlegada;
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

    public String getLugarSalida() {
        return lugarSalida;
    }

    public void setLugarSalida(String lugarSalida) {
        this.lugarSalida = lugarSalida;
    }

    public String getLugarLlegada() {
        return lugarLlegada;
    }

    public void setLugarLlegada(String lugarLlegada) {
        this.lugarLlegada = lugarLlegada;
    }
    
    @Override
    public String toString() {
        return "RegistroServicio{" + "horaServicio=" + horaServicio + ", horaLlegada=" + horaLlegada + '}';
    }
    
}
