/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.envios.modelo;

/**
 *
 * @author Estudiante
 */
public class EnvioInternacional extends Envio {
    
    private double impuestoAduana;

    public EnvioInternacional(double impuestoAduana, String codigo, double peso) {
        super(codigo, peso);
        this.impuestoAduana = impuestoAduana;
    }
    

    @Override
    public void calcularCosto() {
        double costo = (getPeso() * 15000.0) + impuestoAduana;
        System.out.println("Costo de envío Internacional (" + getCodigo() + "): $" + costo);
    }
}
