/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uide.examenparcial;

/**
 *
 * @author Usuario
 */
class Infocus {
     private String marca;
    private String modelo;
    private String conexion;
    private double peso;
    private int potenciaLampara;

    public Infocus(String marca, String modelo, String conexion, double peso, int potenciaLampara) {
        this.marca = marca;
        this.modelo = modelo;
        this.conexion = conexion;
        this.peso = peso;
        this.potenciaLampara = potenciaLampara;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getConexion() {
        return conexion;
    }

    public void setConexion(String conexion) {
        this.conexion = conexion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getPotenciaLampara() {
        return potenciaLampara;
    }

    public void setPotenciaLampara(int potenciaLampara) {
        this.potenciaLampara = potenciaLampara;
    }
    
}
