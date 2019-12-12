/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.dawcoffee;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class Interfaz {
    private static final Scanner LECTOR = new Scanner(System.in);
    
    public static String menuRaiz(){
        System.out.println("Bienvenido a la máquina de café Daw Coffee, donde servimos los mejores cafés del mundo.\nElija una bebida:");
        System.out.printf("%-20s%-20s%-20s\n","00001A","Leche","Poco azúcar");
        System.out.printf("%-20s%-20s%-20s\n","00010A","Leche","Medio azúcar");
        System.out.printf("%-20s%-20s%-20s\n","00011A","Leche","Mucho azúcar");
        System.out.printf("%-20s%-20s%-20s\n","10000A","Chocolate","Poco azúcar");
        System.out.printf("%-20s%-20s%-20s\n","0344127","Marco","Antonio");
        System.out.printf("%-20s%-20s%-20s\n","9532114","Juan","Fernando");
        
        System.out.print("Seleccione un producto: ");
        return LECTOR.next();
    }
}
