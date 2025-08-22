/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio01;

/**
 *
 * @author matia
 */
public class Tesla extends VehiculoElectrico {
    
    private boolean autopilot;

    public Tesla(boolean autopilot, double capacidadBateria, double autonomia, String marca, String modelo, int año, double precio) {
        super(capacidadBateria, autonomia, marca, modelo, año, precio);
        this.autopilot = autopilot;
    }
    
    
    @Override
    public void modoEcoActivar(){
        double nuevaAutonomia = autonomia*1.5;
        
        
        
        System.out.println("Modo eco Activado. Autonomia previa: " + autonomia + "Autonomia modo eco: " + nuevaAutonomia);
    }
    @Override
    public double calcularEficiencia(){
       double x = capacidadBateria/autonomia;

        return x;
    }
    
    public void activarAutopilot() {
        if (autopilot) {
            System.out.println("Autopilot activado en el Tesla " + modelo);
        } else {
            System.out.println("Este Tesla no cuenta con Autopilot.");
        }
    }
    
    
}
