/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia9extras1.servicios;

import com.mycompany.guia9extras1.entidades.Meses;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MesesServicios {

    static Scanner sc = new Scanner(System.in);

    public static void adivinaMes(Meses mes) {
        int contador = 3;
        System.out.println("Adivina el mes! Tiene 3 intentos!");
        do {
            String adivina = sc.nextLine();
            if (adivina.equals(mes.getMesSecreto())) {
                System.out.println("Adivinasteee!");
                return ;
            } else {
                System.out.println("Has fallado! Intentos: " + (--contador));
            }

        } while (contador > 0);
        System.out.println("Se ha quedado sin intentos. El mes secreto era: " + mes.getMesSecreto());

    }

}
