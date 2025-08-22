/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio01;

/**
 *
 * @author matia
 */
public abstract class VehiculoElectrico extends Vehiculo {
    protected double capacidadBateria; // kWh
    protected double autonomia; // km

    public VehiculoElectrico(double capacidadBateria, double autonomia, String marca, String modelo, int año, double precio) {
        super(marca, modelo, año, precio);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }
    


       
    public void cargarBateria(){
        for(int i = 0; i<= capacidadBateria;i++){
            System.out.println("Cargado bateria: 0%");
        }
    }
    
    public abstract void modoEcoActivar();

    public abstract double calcularEficiencia();
    
    
}
