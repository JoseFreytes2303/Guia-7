/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.guia9extras2;

import com.mycompany.guia9extras2.entidades.Ahorcado;
import com.mycompany.guia9extras2.servicios.AhorcadoServicio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia9Extras2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra1 = sc.nextLine();
        System.out.println("Ingrese la cantidad de intentos");
        int intentos = sc.nextInt();
        AhorcadoServicio.jugar(palabra1, intentos);
          
       

    }
}
