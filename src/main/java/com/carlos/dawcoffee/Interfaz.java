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

    // Creamos constantes que necestaremos más adelante
    private static final Scanner LECTOR = new Scanner(System.in);
    private static final Usuario administrador = new Usuario();
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";
    //private Usuario = new Usuario();

    // Creamos un método para el menú principal
    public static String menuRaiz() {
        System.out.println("Bienvenido a la máquina de café Daw Coffee, donde servimos los mejores cafés del mundo.\nElija una bebida:");
        System.out.printf("%-20s%-20s%-20s\n", "00001A", "Leche", "Poco azúcar");
        System.out.printf("%-20s%-20s%-20s\n", "00010A", "Leche", "Medio azúcar");
        System.out.printf("%-20s%-20s%-20s\n", "00011A", "Leche", "Mucho azúcar");
        System.out.printf("%-20s%-20s%-20s\n", "10000A", "Chocolate", "Poco azúcar");
        System.out.printf("%-20s%-20s%-20s\n", "0344127", "Marco", "Antonio");
        System.out.printf("%-20s%-20s%-20s\n", "9532114", "Juan", "Fernando");

        System.out.print("Seleccione un producto: ");
        return LECTOR.next();
    }

    public static void entrarComoAdministrador() {
        System.out.println(ANSI_RED + "Debes iniciar sesión para continuar" + ANSI_RESET);
        String usuario, contrasenia;
        System.out.print("Introduzca el usuario: ");
        usuario = LECTOR.next();
        System.out.print("Introduzca la constraseña: ");
        contrasenia = LECTOR.next();
        boolean in = administrador.socket(usuario, contrasenia);
        if (in) {
            System.out.println("Bienvenido a la consola de administrador");
            System.out.println(ANSI_RED + "Cuidado con los cambios que haces a partir de ahora, puede modificar el funcionamiento de la máquina" + ANSI_RESET);
        } else {
            System.out.println("Fallo de inicio de sesión. Inténtelo de nuevo");
        }

    }
}
