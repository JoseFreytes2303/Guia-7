/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.guia9ejercicio2;

import com.mycompany.guia9ejercicio2.entidades.ParDeNumeros;
import com.mycompany.guia9ejercicio2.servicios.ParDeNumerosService;

/**
 *
 * @author Usuario
 */
public class Guia9Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ParDeNumeros par = new ParDeNumeros();
        ParDeNumerosService.mostrarValores(par);
        System.out.println("-----------------------");
        System.out.println("El numero mayor es: " + ParDeNumerosService.devolverMayor(par));
        System.out.println("-----------------------");
        System.out.println("La potencia del numero mayor es: " + ParDeNumerosService.calcularPotencia(par));
        System.out.println("-----------------------");
        
        System.out.println("La raiz cuadrada del numero menor es : " + ParDeNumerosService.calcularRaiz(par));
        

       
        

    }
}
