/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.masco;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */

    public class Perro extends Animal{
    String raza; 
    int vacunas;

    public Perro(String raza, String tipo) {
        super(tipo);
        this.raza = raza;
        this.edad = edad; 
    }
    public void ladrar (){
        System.out.println("Guau Guau soy un" + " " + raza);
    
    }
    public void vacunas(){
        Scanner entrada = new Scanner(System.in);
        int vacuna = 1; 
        System.out.println("Ingrese el numero de vacunas de su mascota");
        vacuna = entrada.nextInt(); 
        
        if(vacuna <= 4){
            System.out.println("Soy un cachorro");
        }else{
              System.out.println("Soy un Adulto");
        }
               
        
        }
    
    }

