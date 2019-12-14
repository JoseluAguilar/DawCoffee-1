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
public class Usuario {

    private String usuario = "root";
    private String contrasenia = "root";

    public Usuario(){

    }

    public String getUsuario() {
        return usuario;
    }

    private String getContrasenia() {
        return contrasenia;
    }

    private void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public void socket(String user, String passwd){
        if((user.equals(this.usuario))||(passwd==this.contrasenia)){
            System.out.println("Bienvenido, " + this.usuario);
        }
    }

}
