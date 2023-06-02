/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uide.examenparcial;

/**
 *
 * @author Usuario
 */
class Extintor {
    private String propietario;
    private String marca;
    private String tipo;
    private String clase;
    private String fechaCarga;
    private String fechaVencimiento;

    public Extintor(String propietario, String marca, String tipo, String clase, String fechaCarga, String fechaVencimiento) {
        this.propietario = propietario;
        this.marca = marca;
        this.tipo = tipo;
        this.clase = clase;
        this.fechaCarga = fechaCarga;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(String fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
}
