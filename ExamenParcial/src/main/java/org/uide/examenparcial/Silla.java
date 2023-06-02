/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uide.examenparcial;

/**
 *
 * @author Usuario
 */
class Silla {
    private String material;
    private String color;
    private int altura;
    private int largo;
    private int ancho;
    private String colorForro;

    public Silla(String material, String color, int altura, int largo, int ancho, String colorForro) {
        this.material = material;
        this.color = color;
        this.altura = altura;
        this.largo = largo;
        this.ancho = ancho;
        this.colorForro = colorForro;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public String getColorForro() {
        return colorForro;
    }

    public void setColorForro(String colorForro) {
        this.colorForro = colorForro;
    }
    
}
