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
public class Deposito {
    private double cantidadMaxima;
    private double cantidadReserva;
    private double cantidadTotal;
    private String nombre;
    private boolean reserva;
    
    public Deposito(String nombre, double cantidadMaxima, double cantidadReserva){
        //Como el depósito acaba de añadirse, por defecto indicamos que está vacío
        this.cantidadTotal = 0;
        this.reserva = true;
        this.cantidadReserva = cantidadReserva;
        this.cantidadMaxima = cantidadMaxima;
        this.nombre = nombre;
    }
    public Deposito(String nombre, double cantidadMaxima, double cantidadReserva, double cantidadActual){
        this.cantidadTotal = cantidadActual;
        if(cantidadActual >= cantidadReserva){
            this.reserva = false;
        }else{
            this.reserva = true;
        }
        this.reserva = true;
        this.cantidadReserva = cantidadReserva;
        this.cantidadMaxima = cantidadMaxima;
        this.nombre = nombre;
    }

    public void rellenarCafetera(double cantidadAniadida){
        this.cantidadTotal += cantidadAniadida;
        if(this.cantidadTotal >= cantidadReserva){
            this.reserva = false;
        }
    }
    
    public double getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(double cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public double getCantidadReserva() {
        return cantidadReserva;
    }

    public void setCantidadReserva(double cantidadReserva) {
        this.cantidadReserva = cantidadReserva;
    }

    public double getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(double cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isReserva() {
        return reserva;
    }

    public void setReserva(boolean reserva) {
        this.reserva = reserva;
    }
    
}
