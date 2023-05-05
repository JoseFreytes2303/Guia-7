/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia9ejercicio1.servicios;

import com.mycompany.guia9ejercicio1.entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CadenaServicio {

    static Scanner sc = new Scanner(System.in);

    public static int mostarVocales(String cadena) {
        int contador = 0;
        String vocales = "AEIOUaeiou";
        for (int i = 0; i < cadena.length(); i++) {
            if (vocales.indexOf(cadena.charAt(i)) != -1) {
                contador++;
            }
        }
        return contador;
    }

    public static String invertirFrase(String frase) {
        String frase2 = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            frase2 += frase.charAt(i);
        }
        return frase2;

    }

    public static void vecesRepetido(String letra, String frase) {
        
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra.charAt(0)) {
                contador++;
                
            }
        }
        System.out.println("El caracter " + letra + "se repite: " + contador + " veces");
    }

    public static void compararLongitud(String frase) {
        System.out.println("Ingrese una nueva frase");
        String fraseNueva = sc.nextLine();
        if (frase.length() == fraseNueva.length()) {
            System.out.println("Las dos frases son iguales!");
        } else if (frase.length() > fraseNueva.length()) {
            System.out.println("La frase original es mas larga");
        } else {
            System.out.println("La frase nueva es mas larga!");
        }
    }

    public static void unirFrase(String frase) {
        System.out.println("Ingrese una nueva frase!");
        String frase3 = sc.nextLine();
        String fraseUnida = frase + " " + frase3;
        System.out.println("La nueva frase unida queda : " + fraseUnida);
    }

    public static String reemplazarLetra(String frase) {
        System.out.println("Ingrese un caracter para reemplazar las letras A");
        String letra2 = sc.nextLine();
        String fraseReemplazo = "";
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a') {
                fraseReemplazo += letra2;
            } else {
                fraseReemplazo += frase.charAt(i);
            }
        }
        return fraseReemplazo;
    }

    public static Boolean contiene(String frase, String letra) {
        System.out.println("Ingrese una letra");
        String letraContiene = sc.nextLine();
        if (frase.contains(letraContiene)) {
            return true;
        } else {
            return false;
        }
    }

}
