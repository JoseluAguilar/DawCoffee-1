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
        //Creamos la cafetera
        Cafetera cafetera = new Cafetera();
        //Mensaje de bienvenida
        System.out.println("Bienvenido a la máquina de café Daw Coffee, donde servimos los mejores cafés del mundo.\nElija una bebida:");

        //Creamos un While True para que se ejecute siempre excepto si apagamos la máquina
        while(true){
             // El método main
            System.out.println(cafetera.seleccionarBebida(Interfaz.menuRaiz()));
        }  
    }
}
