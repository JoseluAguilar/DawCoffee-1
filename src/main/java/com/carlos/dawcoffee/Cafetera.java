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
public class Cafetera {

    private double saldoAcumulado;
    private double saldoCliente;
    private double ventasRealizadas;
    private double nVentasRealizadas;

    // Creamos un constructor por defecto. No necesitaremos un constructor parametrizado
    public Cafetera() {

    }

    public String seleccionarBebida(String codigo) {
        double price = 0;
        String name = null;
        String code = null;
        switch (codigo) {

            case "00001A":
                price = 0.5;
                name = "Leche sin azúcar";
                code = codigo;
                break;
            case "000010A":
                price = 0.5;
                name = "Leche con poco azúcar";
                code = codigo;
                break;
            case "000011A":
                price = 0.5;
                name = "Leche con poco azúcar";
                code = codigo;
                break;
            case "AAAAAAA":
                Interfaz.entrarComoAdministrador();
                break;
            default:
                return "La bebida seleccionada no existe, por favor, introduce una válida";
        }
        Bebida bebida = new Bebida(price, code, name);
        System.out.println(bebida.toString()); 
        while(saldoCliente < price){
            saldoCliente += Interfaz.pagar(price, saldoCliente);
        }
        nVentasRealizadas++;
        saldoAcumulado += price;
        saldoCliente = 0;
        return "Gracias por su compra, ¡vuelva pronto!";
    }

    public double getSaldoAcumulado() {
        return saldoAcumulado;
    }

    public void setSaldoAcumulado(double saldoAcumulado) {
        this.saldoAcumulado = saldoAcumulado;
    }

    public double getSaldoCliente() {
        return saldoCliente;
    }

    public void setSaldoCliente(double saldoCliente) {
        this.saldoCliente = saldoCliente;
    }

    public double getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(double ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    public double getnVentasRealizadas() {
        return nVentasRealizadas;
    }

    public void setnVentasRealizadas(double nVentasRealizadas) {
        this.nVentasRealizadas = nVentasRealizadas;
    }

}
