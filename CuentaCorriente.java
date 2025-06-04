/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.masco;

/**
 *
 * @author Usuario
 */

    public class CuentaCorriente extends Cuenta {
    double saldo;
    double interes;

    public CuentaCorriente(String titular, double saldo, double interes) {
        super(titular);
        this.saldo = saldo;
        this.interes = interes;
    }
    
    public void mostrarSaldo(){
        System.out.println("Saldo: " + saldo);
    }
    
    public void tipoInteres(){
        double in;
        
        in = saldo * interes;
        System.out.println("Interes ganado: " + in);
    }
}

