/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.laboratorio01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matia
 */
public class GestionVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO: Crear una lista en la que agregues distintos vehiculos y luego itera sobre cada uno para llamar al métoodo común mostrarInfo() y encender()
        
        
        Tesla teslaRojo = new Tesla(true, 2200, 500, "Tesla", "Model X", 2022, 22000);
        Motocicleta motazo = new Motocicleta(150, false, "Yamaha", "YZF-R1", 2025, 55000);
        Auto autoDePapa = new Auto("Toyota", "Yaris", 2014, 8000);   

        
        Vehiculo[] vehiculos = new Vehiculo[] {
            teslaRojo,
            motazo,
            autoDePapa
        };
        System.out.println("Listado de Vehiculos: ");
        System.out.println("vvvvvvvvvvvvvvvvvvvv");
        for(int i = 0; i<vehiculos.length; i++){
            vehiculos[i].mostrarInfo();
            vehiculos[i].encender();
            System.out.println(" ---------------------------");
        }
        
        
    
    }
    
}
