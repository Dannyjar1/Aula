/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uide.examenparcial;

import java.util.List;

/**
 *
 * @author Usuario
 */
class Computadora {
     private String modelo;
    private int velocidad;
    private String marca;
    private String fuenteAlimentacion;
    private int capacidad;
    private int capacidadRam;
    private String procesador;
    private List<String> puertos;

    public Computadora(String modelo, int velocidad, String marca, String fuenteAlimentacion, int capacidad,
                       int capacidadRam, String procesador, List<String> puertos) {
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.marca = marca;
        this.fuenteAlimentacion = fuenteAlimentacion;
        this.capacidad = capacidad;
        this.capacidadRam = capacidadRam;
        this.procesador = procesador;
        this.puertos = puertos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFuenteAlimentacion() {
        return fuenteAlimentacion;
    }

    public void setFuenteAlimentacion(String fuenteAlimentacion) {
        this.fuenteAlimentacion = fuenteAlimentacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidadRam() {
        return capacidadRam;
    }

    public void setCapacidadRam(int capacidadRam) {
        this.capacidadRam = capacidadRam;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public List<String> getPuertos() {
        return puertos;
    }

    public void setPuertos(List<String> puertos) {
        this.puertos = puertos;
    }
    
   
}
