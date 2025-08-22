/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio01;

/**
 *
 * @author matia
 */
public class Auto extends Vehiculo {
    
    private int numeroPuertas;
    private String tipoTransmision;

    public Auto(String marca, String modelo, int año, double precio) {
        super(marca, modelo, año, precio);
        
        this.numeroPuertas = numeroPuertas;
        this.tipoTransmision = tipoTransmision;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        
        System.out.println("Esto ha sido heredado");
        System.out.println("Numero de puertas:" + this.numeroPuertas + " Tipo de transmision: " + this.tipoTransmision);

// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public void encenderAC(){
        System.out.println("Aire acondicionado activado");
    }
    
    
    
}
