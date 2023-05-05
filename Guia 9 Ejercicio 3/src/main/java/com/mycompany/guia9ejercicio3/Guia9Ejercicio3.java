/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia9ejercicio3;

import com.mycompany.guia9ejercicio3.servicios.ArregloServicie;

/**
 *
 * @author Usuario
 */
public class Guia9Ejercicio3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        double[] a = new double[50];
        double[] b = new double[20];
        ArregloServicie.inicializarA(a);
        ArregloServicie.mostrar(a);
        ArregloServicie.ordenar(a);
        System.out.println("-------------------");
        ArregloServicie.inicializarB(a, b);
        ArregloServicie.mostrar(a);
        System.out.println("-------------------");
        ArregloServicie.mostrar(b);
    }
}
