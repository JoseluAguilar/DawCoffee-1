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
    private static final Usuario ADMINISTRADOR = new Usuario();
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";

    // Creamos un método para el menú principal
    public static String menuRaiz() {
        System.out.printf("%-20s%-20s%-20s\n", "00001A", "Leche", "Poco azúcar");
        System.out.printf("%-20s%-20s%-20s\n", "00010A", "Leche", "Medio azúcar");
        System.out.printf("%-20s%-20s%-20s\n", "00011A", "Leche", "Mucho azúcar");
        System.out.printf("%-20s%-20s%-20s\n", "10000A", "Chocolate", "Poco azúcar");
        System.out.printf("%-20s%-20s%-20s\n", "0344127", "Marco", "Antonio");
        System.out.printf("%-20s%-20s%-20s\n", "9532114", "Juan", "Fernando");

        System.out.print("Seleccione un producto: ");
        return LECTOR.next();
    }

    public static double pagar(double precioBebida, double dineroCliente){
        System.out.print("Te falta por pagar ");
        System.out.printf("%.2f", (precioBebida - dineroCliente));
        System.out.println("€");
        System.out.print("Introduce la cantidad de dinero que quieras pagar: ");
        double pagado = LECTOR.nextDouble();
        return pagado;
    }
    
    
    public static void entrarComoAdministrador() {
        System.out.println(ANSI_RED + "Debes iniciar sesión para continuar" + ANSI_RESET);
        String usuario, contrasenia;
        int intentos = 0;
        boolean logged = false;
        while (intentos < 3 || logged) {
            System.out.print("Introduzca el usuario: ");
            usuario = LECTOR.next();
            System.out.print("Introduzca la constraseña: ");
            contrasenia = LECTOR.next();
            boolean in = ADMINISTRADOR.socket(usuario, contrasenia);
            if (in) {
                Usuario.abrirSocket(logged);
                System.out.println("Bienvenido a la consola de administrador");
                System.out.println(ANSI_RED + "Cuidado con los cambios que haces a partir de ahora, puede modificar el funcionamiento de la máquina" + ANSI_RESET);
                Usuario.cerrarSocket(logged, intentos);
            } else {
                intentos++;
                if(intentos <= 2){
                    System.out.println("Fallo de inicio de sesión. Inténtelo de nuevo");
                }
            }
        }
        if(intentos>=3){
            System.out.println("Has fallado 3 intentos de autenticación, volverás al menú principal");
            
        }
        Interfaz.menuRaiz();     
    }
}
