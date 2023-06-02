/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package org.uide.examenparcial;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Aula {
    
    private Pizarra pizarra;
    private Computadora computadora;
    private Mesa mesa;
    private Silla silla;
    private Infocus infocus;
    private Parlante parlante;
    private Extintor extintor;
    
     public boolean abrirAula(){
        return true;
    }
    
     public boolean cerrarAula(){
        return true;
    }

    public Pizarra getPizarra() {
        return pizarra;
    }

    public void setPizarra(Pizarra pizarra) {
        this.pizarra = pizarra;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Silla getSilla() {
        return silla;
    }

    public void setSilla(Silla silla) {
        this.silla = silla;
    }

    public Infocus getInfocus() {
        return infocus;
    }

    public void setInfocus(Infocus infocus) {
        this.infocus = infocus;
    }

    public Parlante getParlante() {
        return parlante;
    }

    public void setParlante(Parlante parlante) {
        this.parlante = parlante;
    }

    public Extintor getExtintor() {
        return extintor;
    }

    public void setExtintor(Extintor extintor) {
        this.extintor = extintor;
    }
     
    

    public static void main(String[] args) {
        
        
        
        List<Computadora> listaComputadoras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 2; i++) {
            System.out.println("Ingrese los datos de la computadora " + i + ":");

            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();

            System.out.print("Velocidad: ");
            int velocidad = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Marca: ");
            String marca = scanner.nextLine();

            System.out.print("Fuente de alimentación: ");
            String fuenteAlimentacion = scanner.nextLine();

            System.out.print("Capacidad: ");
            int capacidad = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Capacidad de RAM: ");
            int capacidadRam = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Procesador: ");
            String procesador = scanner.nextLine();

            List<String> puertos = new ArrayList<>();
            System.out.print("Puertos (separados por comas): ");
            String puertosStr = scanner.nextLine();
            String[] puertosArr = puertosStr.split(",");
            for (String puerto : puertosArr) {
                puertos.add(puerto.trim());
            }

            Computadora computadora = new Computadora(modelo, velocidad, marca, fuenteAlimentacion,
                    capacidad, capacidadRam, procesador, puertos);

            listaComputadoras.add(computadora);
            System.out.println("Computadora agregada correctamente.");
            System.out.println();
        }

        System.out.println("Datos de las computadoras:");
        for (int i = 0; i < listaComputadoras.size(); i++) {
            Computadora computadora = listaComputadoras.get(i);
            System.out.println("Computadora " + (i + 1) + ":");
            System.out.println("Modelo: " + computadora.getModelo());
            System.out.println("Velocidad: " + computadora.getVelocidad());
            System.out.println("Marca: " + computadora.getMarca());
            System.out.println("Fuente de alimentación: " + computadora.getFuenteAlimentacion());
            System.out.println("Capacidad: " + computadora.getCapacidad());
            System.out.println("Capacidad de RAM: " + computadora.getCapacidadRam());
            System.out.println("Procesador: " + computadora.getProcesador());
            System.out.println("Puertos: " + computadora.getPuertos());
            System.out.println();
        }
        
        
        
        
        
        List<Extintor> listaExtintores = new ArrayList<>();
        Scanner scanner1 = new Scanner(System.in);

        for (int i = 1; i <= 2; i++) {
            System.out.println("Ingrese los datos del extintor " + i + ":");

            System.out.print("Propietario: ");
            String propietario = scanner1.nextLine();

            System.out.print("Marca: ");
            String marca = scanner1.nextLine();

            System.out.print("Tipo: ");
            String tipo = scanner1.nextLine();

            System.out.print("Clase: ");
            String clase = scanner1.nextLine();

            System.out.print("Fecha de carga: ");
            String fechaCarga = scanner1.nextLine();

            System.out.print("Fecha de vencimiento: ");
            String fechaVencimiento = scanner1.nextLine();

            Extintor extintor = new Extintor(propietario, marca, tipo, clase, fechaCarga, fechaVencimiento);
            listaExtintores.add(extintor);

            System.out.println("Extintor agregado correctamente.");
            System.out.println();
        }
        

        System.out.println("Datos de los extintores:");
        for (int i = 0; i < listaExtintores.size(); i++) {
            Extintor extintor = listaExtintores.get(i);
            System.out.println("Extintor " + (i + 1) + ":");
            System.out.println("Propietario: " + extintor.getPropietario());
            System.out.println("Marca: " + extintor.getMarca());
            System.out.println("Tipo: " + extintor.getTipo());
            System.out.println("Clase: " + extintor.getClase());
            System.out.println("Fecha de carga: " + extintor.getFechaCarga());
            System.out.println("Fecha de vencimiento: " + extintor.getFechaVencimiento());
            System.out.println();
        }
        
        
        
        
        List<Infocus> listaInfocus = new ArrayList<>();
        Scanner scanner2 = new Scanner(System.in);

        for (int i = 1; i <= 2; i++) {
            System.out.println("Ingrese los datos del proyector Infocus " + i + ":");

            System.out.print("Marca: ");
            String marca = scanner2.nextLine();

            System.out.print("Modelo: ");
            String modelo = scanner2.nextLine();

            System.out.print("Conexión: ");
            String conexion = scanner2.nextLine();

            System.out.print("Peso: ");
            double peso = scanner2.nextDouble();
            scanner2.nextLine(); 

            System.out.print("Potencia de la lámpara: ");
            int potenciaLampara = scanner2.nextInt();
            scanner2.nextLine(); 

            Infocus infocus = new Infocus(marca, modelo, conexion, peso, potenciaLampara);
            listaInfocus.add(infocus);

            System.out.println("Proyector Infocus agregado correctamente.");
            System.out.println();
        }

        System.out.println("Datos de los proyectores Infocus:");
        for (int i = 0; i < listaInfocus.size(); i++) {
            Infocus infocus = listaInfocus.get(i);
            System.out.println("Proyector Infocus " + (i + 1) + ":");
            System.out.println("Marca: " + infocus.getMarca());
            System.out.println("Modelo: " + infocus.getModelo());
            System.out.println("Conexión: " + infocus.getConexion());
            System.out.println("Peso: " + infocus.getPeso());
            System.out.println("Potencia de la lámpara: " + infocus.getPotenciaLampara());
            System.out.println();
        }
    
    
        
        
        

        
        List<Pizarra> listaPizarras = new ArrayList<>();
        Scanner scanner3 = new Scanner(System.in);

        for (int i = 1; i <= 2; i++) {
            System.out.println("Ingrese el color de la pizarra " + i + ":");
            String color = scanner3.nextLine();
            Pizarra pizarra = new Pizarra(color);
            listaPizarras.add(pizarra);
        }

        System.out.println("Colores de las pizarras:");
        for (int i = 0; i < listaPizarras.size(); i++) {
            Pizarra pizarra = listaPizarras.get(i);
            System.out.println("Pizarra " + (i + 1) + ": " + pizarra.getColor());
        }
        
    }
}
    
        
       
    

