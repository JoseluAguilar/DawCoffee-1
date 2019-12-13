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
    
    // Creamos constructor parametrizado
    public Bebida(double precio, String codigo, String nombre){
        this.precio =  precio;
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "La bebida " + "\"" + this.nombre + "\"" + " tiene el código " + this.codigo + " y cuesta " + this.precio + "€";
    }
    

    
}
