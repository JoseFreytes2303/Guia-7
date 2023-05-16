/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia9ejercicio5.servicios;

import com.mycompany.guia9ejercicio5.entidades.Persona;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PersonaServicio {

    static Scanner sc = new Scanner(System.in);

    public static Persona crearPersona() {
        LocalDate fecha = null;
        System.out.println("Ingrese el nombre.");
        String nombre = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        do {
            System.out.println("Ingrese la fecha de su nacimiento dd/MM/yyyy");
            String fechaString = sc.next();
            try {
                Date fechaDate = sdf.parse(fechaString);
                fecha = fechaDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                //Trasnformar del tipo DATE al LocalDate, para poder calcular la edad posteriormente!
            } catch (ParseException e) {
                System.out.println("Fecha ingresa incorrecta!");
                e.printStackTrace();
            }
        } while (fecha == null);

        return new Persona(nombre, fecha);
    }

    public static int calcularEdad(Persona ps) {
        LocalDate fechaNacimiento = ps.getFecha();
        LocalDate fechaActual = LocalDate.now();
        int edad = fechaNacimiento.until(fechaActual).getYears();
        return edad;
    }
    
    public static boolean esMenor(Persona ps, int edad){
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();
        if (edad > calcularEdad(ps)) {
            return false;
        } else {
            return true;
        }
        
    }

}
