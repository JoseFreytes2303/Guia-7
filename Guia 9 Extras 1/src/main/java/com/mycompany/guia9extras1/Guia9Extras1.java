/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia9extras1;

import com.mycompany.guia9extras1.entidades.Meses;
import com.mycompany.guia9extras1.servicios.MesesServicios;

/**
 *
 * @author Usuario
 */
public class Guia9Extras1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Meses mes = new Meses();
        MesesServicios.adivinaMes(mes);
    }
}
