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
public class Programa {
    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera();
        // El método main
        System.out.println(cafetera.seleccionarBebida(Interfaz.menuRaiz()));
    }
}
