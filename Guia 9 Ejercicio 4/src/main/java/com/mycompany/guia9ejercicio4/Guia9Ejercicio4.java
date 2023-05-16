/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.guia9ejercicio4;

import com.mycompany.guia9ejercicio4.entidades.Fecha;
import com.mycompany.guia9ejercicio4.servicios.FechaServicie;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Guia9Ejercicio4 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Fecha fecha = new Fecha();
        Date asd = FechaServicie.fechaNacimiento(fecha);
        Date asd2 = FechaServicie.fechaActual(fecha);
        System.out.println("Fecha de nacimiento");
        System.out.println(asd);
        System.out.println("Fecha actual");
        System.out.println(FechaServicie.fechaActual(fecha));
        System.out.println("----------");
        System.out.println("La diferencia de años desde la fecha nacimiento a la actual es: ");
        System.out.println(FechaServicie.diferencia(asd, asd2));

    }
}
