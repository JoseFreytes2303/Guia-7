/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia9ejercicio1;

import com.mycompany.guia9ejercicio1.entidades.Cadena;
import com.mycompany.guia9ejercicio1.servicios.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia9Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello World!");
        Cadena cadena = new Cadena("Hola Mundo! Soy Jose!");
        System.out.println("La cantidad de vocales es : " + CadenaServicio.mostarVocales(cadena.getFrase()));
        String frase2 = CadenaServicio.invertirFrase(cadena.getFrase());
        System.out.println("La frase invertida es: " + frase2);
        System.out.println("Ingrese un caracter para contar cuantas veces se repite!");
        String letra = sc.next();
        CadenaServicio.vecesRepetido(letra, cadena.getFrase());
        CadenaServicio.compararLongitud(cadena.getFrase());
        CadenaServicio.unirFrase(cadena.getFrase());
        System.out.println(CadenaServicio.reemplazarLetra(cadena.getFrase()));
        System.out.println(CadenaServicio.contiene(cadena.getFrase(), letra));
        
        
        
    }
}
