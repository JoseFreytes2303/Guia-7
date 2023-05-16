/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia9ejercicio4.servicios;

import com.mycompany.guia9ejercicio4.entidades.Fecha;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class FechaServicie {
    static Scanner sc = new Scanner (System.in);
    
    public static Date fechaNacimiento(Fecha fecha){
        System.out.println("Ingrese dia de su nacimiento");
        int dia = sc.nextInt();
        System.out.println("Ingrese el mes de su nacimiento");
        int mes = sc.nextInt();
        System.out.println("Ingrese el año");
        int anio = sc.nextInt();
        return new Date(anio-1900,mes-1,dia); 
    }
    
    public static Date fechaActual(Fecha fecha){
        return new Date(); 
    }
    
    public static long diferencia(Date fechaNacimiento , Date fechaActual){
        
        long b = (fechaActual.getTime() - fechaNacimiento.getTime())/31536000000L;
        return b;
    }
    
}
