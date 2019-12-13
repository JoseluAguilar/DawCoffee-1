/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.dawcoffee;

/**
 *
 * @author carlos
 */
public class Bebida {
    private double precio;
    private String codigo;
    private String nombre;
    
    public Bebida(double precio, String codigo, String nombre){
        this.precio =  precio;
        this.nombre = nombre;
        this.codigo = codigo;
    }
}
