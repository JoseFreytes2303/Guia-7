/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia9extras2.servicios;

import com.mycompany.guia9extras2.entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AhorcadoServicio {

    public static void crearJuego(String palabra, int intentosMaximos) {
        int longitud = palabra.length();
        char[] palabra1 = new char[longitud];
        for (int i = 0; i < longitud; i++) {
            palabra1[i] = palabra.charAt(i);
            System.out.print("[" + palabra1[i] + "]");
        }
        System.out.println();
        System.out.println("Cantidad de intentos: " + intentosMaximos);
    }

    public static int longitud(String palabra) {
        return palabra.length();
    }

    public static boolean buscar(String letra, String palabra) {
        char[] letrasPalabra = palabra.toCharArray();
        for (int i = 0; i < letrasPalabra.length; i++) {
            if (letra.equals(Character.toString(letrasPalabra[i]))) {
                System.out.println("La letra se encuentra en la palabra?¡: ");
                return true;
            }
        }
        System.out.println("La letra no encuentra en la palabra?!: ");
        return false;
    }

    public static boolean encontradas(String letra, String palabra, int intentosMaximos) {
        int contador = 0;
        int letrasFaltantes = 0;
        char[] conta = palabra.toCharArray();
        for (int i = 0; i < conta.length; i++) {
            if (letra.equals(Character.toString(conta[i]))) {
                contador++;
            } else if (conta[i] != '_' && conta[i] != '[' && conta[i] != ']') { // si ya se encontró esta letra, no se cuenta como faltante
                letrasFaltantes++;
            }
        }
        if (contador > 0) {
            System.out.println("La letra ingresada esta en la palabra: " + contador + " veces.");
            letrasFaltantes = palabra.length() - letrasFaltantes - contador;
            System.out.println("Faltan: " + letrasFaltantes);
            return true;
        } else {
            System.out.println("La letra no se encuentra en la palabra.");
            intentosMaximos--;
            System.out.println("Faltan: " + (palabra.length() - letrasFaltantes - contador));
            System.out.println("Intentos : " + intentosMaximos);
            return false;
        }
    }

    public static void jugar(String palabra, int intentosMaximos) {
        crearJuego(palabra, intentosMaximos);

        int letrasFaltantes = longitud(palabra);

        while (intentosMaximos > 0 && letrasFaltantes > 0) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese una letra: ");
            String letra = sc.nextLine();

            if (buscar(letra, palabra)) {
                if (!encontradas(letra, palabra, intentosMaximos)) {
                    intentosMaximos--;
                }
                letrasFaltantes--;
            } else {
                intentosMaximos--;
            }
        }

        if (letrasFaltantes == 0) {
            System.out.println("¡Felicitaciones! ¡Has ganado!");
        } else {
            System.out.println("¡Lo siento! ¡Has perdido!");
        }
    }
}
