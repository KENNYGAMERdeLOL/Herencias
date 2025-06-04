/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.masco;

/**
 *
 * @author Usuario
 */
public class Cuenta {
      String titular;

    public Cuenta(String titular) {
        this.titular = titular;
    }
    
    public void mostrarTitular() {
        System.out.println("Titular: " + titular);
    }
}

