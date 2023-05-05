/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia9ejercicio2.servicios;

import com.mycompany.guia9ejercicio2.entidades.ParDeNumeros;

/**
 *
 * @author Usuario
 */
public class ParDeNumerosService {

    public static void mostrarValores(ParDeNumeros par) {
        System.out.println("El primer numero es: " + par.getNumero1());
        System.out.println("El segundo numero es: " + par.getNumero2());

    }

    public static double devolverMayor(ParDeNumeros par) {
        double num1 = par.getNumero1();
        double num2 = par.getNumero2();
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    
    public static double calcularPotencia(ParDeNumeros par){
        double num1 = par.getNumero1();
        double num2 = par.getNumero2();
        double mayor,menor;
        if ( num1 > num2 ){
            mayor = num1;
            menor = num2;
        } else {
            mayor = num2;
            menor = num1;
        }
        mayor = Math.round(mayor);
        menor = Math.round(menor);
        return Math.pow(mayor, menor);
    }
    
    public static double calcularRaiz(ParDeNumeros par){
        double num1 = par.getNumero1();
        double num2 = par.getNumero2();
        double menor;
        if( num1 > num2){
            menor = num2;
        }else {
            menor = num1;
        }
        menor = Math.abs(menor);
        System.out.println(menor);
        return Math.sqrt(menor);
    }
    
    

}
