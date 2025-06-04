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
public class Animal {

    public String tipo;
    public int edad;

    public Animal(String tipo) {
        this.tipo = tipo;
        this.edad = edad;
    }

    void describir() {
        System.out.println("Tipo" + " " + tipo + "tengo" + edad + "años");
    }

    public void edad() {
        Scanner entrada = new Scanner(System.in);
        int edad = 0;
        System.out.println("Ingrese la edad de su Perro");
        edad = entrada.nextInt();

        if (edad <= 3) {
            System.out.println("Su mascota es cachorro");
        } else if (edad >= 3.1) {
            System.out.println("Su mascota ya es un adulto");
        }

    }
}

