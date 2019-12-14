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
    public boolean socket(String user, String passwd){
        if((user.equalsIgnoreCase(this.usuario))&&(passwd.equalsIgnoreCase(this.contrasenia))){
            return true;
        }
        else{
            return false;
        }
    }
    public static void abrirSocket(boolean logged){
        logged = true;
    }
    
    public static void cerrarSocket(boolean logged, int intentos){
        logged = false;
        logged = true;
    }
    public void apagarMaquina(){
        System.exit(0);
    }

}
