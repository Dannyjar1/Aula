/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uide.examenparcial;

/**
 *
 * @author Usuario
 */
class Parlante {
     private String marca;
    private int año;
    private String color;
    private int potencia;
    private int volumen;

    public Parlante(String marca, int año, String color, int potencia, int volumen) {
        this.marca = marca;
        this.año = año;
        this.color = color;
        this.potencia = potencia;
        this.volumen = volumen;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
}
