/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia9ejercicio3.servicios;

import com.mycompany.guia9ejercicio3.entidades.Arreglo;

/**
 *
 * @author Usuario
 */
public class ArregloServicie {

    public static void inicializarA(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Math.random() * 10;
        }
    }

    public static void mostrar(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }

    public static void ordenar(double[] arreglo) {
        /**
         * La primera linea del metodo obtiene la longitud del arreglo.
           El primer bucle for se utiliza para recorrer el arreglo desde el primer elemento hasta el penultimo elemento.
           El segundo bucle for se utiliza para buscar el elemento mas grande dentro del arreglo que aun no ha sido ordenado.
           Si el elemento en la posicion actual es mayor que el elemento mas grande encontrado hasta ahora, se actualiza la posicion del elemento mas grande.
           Después de terminar el segundo bucle, el elemento mas grande encontrado se intercambia con el primer elemento sin ordenar.
           Este proceso continua hasta que todos los elementos hayan sido ordenados en orden descendente.
         */
        int num = arreglo.length; 
        for (int i = 0; i < num - 1; i++) { 
            int max = i; 
            for (int j = i + 1; j < num; j++) {                                  
                if (arreglo[j] > arreglo[max]) { 
                    max = j;
                }
            }
            double num2 = arreglo[max];
            arreglo[max] = arreglo[i];
            arreglo[i] = num2;
        }
    }
    
    public static void inicializarB(double[]a,double[]b){
        for (int i = 0; i < 10; i++) {
            b[i]=a[i];
        }
        for (int i = 10; i < b.length; i++) {
            b[i] = 0.5;
        }
    }
}
