/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.masco;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Masco {

    /*public static void main(String[] args) {
         System.out.println("Ejemplo de herencia");
        Perro p = new Perro("Mamifero", "Pitbull");
        p.describir(); 
        p.ladrar(); 
        p.edad();
        p.vacunas();
        
       Scanner entrada = new Scanner(System.in); 
       System.out.println("Ingrse el tipo de cuenta");*/
    CuentaAhorros cuentaA = new CuentaAhorros("Kenny", 1800, 0.05);
    CuentaCorriente cuentaC = new CuentaCorriente("Jessica", 1200, 0.07);

    System.out.println ("Ingrese su tipo de cuenta (1 = Ahorros/2 = Corriente)");
        int tipoCuenta = en.nextInt();

    switch (tipoCuenta) {
        case 1:
            cuentaA.mostrarTitular();
            cuentaA.mostrarSaldo();
            cuentaA.tipoInteres();
            break;
        case 2:
            cuentaC.mostrarTitular();
            cuentaC.mostrarSaldo();
            cuentaC.tipoInteres();
            break;
        default:
            System.err.println("Error");
    }
        
        
        
        
}
}
    }
