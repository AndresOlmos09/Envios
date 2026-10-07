/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.envios.modelo;

/**
 *
 * @author Estudiante
 */
public class EnvioNacional extends Envio{

    private String departamento;

    public EnvioNacional(String departamento, String codigo, double peso) {
        super(codigo, peso);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
    
    
    public EnvioNacional(){
        super("ASAS",20);
        this.departamento = "Bolivar";
    }
    
    @Override
    public void calcularCosto() {
        double costo = getPeso() * 5000.0;
        System.out.println("Costo de envio Nacional :" + costo);
    }

    
    
    
    
}
