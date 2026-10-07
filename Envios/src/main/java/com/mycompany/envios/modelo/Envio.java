/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.envios.modelo;

/**
 *
 * @author Estudiante
 */
public abstract class Envio {
    
    private String codigo;
    private double peso;

    public Envio(String codigo, double peso) {
        this.codigo = codigo;
        this.peso = peso; 
    }

    
    //GETTERS
    public String getCodigo() {
        return codigo;
    }

    public double getPeso() {
        return peso;
    }
   
    
    
    //SOBRECARGA MOSTRARDESTINO
    public void mostrarDestino(){
        System.out.println("Destino: Cobertura Nacional por defecto.");
        };
    
    public void mostrarDestino(String pais){
        System.out.println("Destino Internacional asignado: " + pais);
        };
    
    
    //METODO PARA SOBREESCRITURA 
    public abstract void calcularCosto();
    
    public static void empresa() {
        System.out.println("=========================================");
        System.out.println("       EMPRESA DE ENVÍOS LOGÍSTICA       ");
        System.out.println("=========================================");
    }
    
}
