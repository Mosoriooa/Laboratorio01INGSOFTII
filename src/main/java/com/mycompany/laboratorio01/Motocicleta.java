/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio01;

/**
 *
 * @author matia
 */
public class Motocicleta extends Vehiculo {
    private int cilindrada;
    private boolean tieneSidecar;

    public Motocicleta(int cilindrada, boolean tieneSidecar, String marca, String modelo, int año, double precio) {
        super(marca, modelo, año, precio);
        this.cilindrada = cilindrada;
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); 
        
        System.out.println("Esto fue heredado");
        System.out.println("Cilindrada: " + this.cilindrada + " Tiene side car?: " + this.tieneSidecar);
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public void hacerCaballito(){
        System.out.println("¡Haciendo caballito!");
    }
    
    
}
