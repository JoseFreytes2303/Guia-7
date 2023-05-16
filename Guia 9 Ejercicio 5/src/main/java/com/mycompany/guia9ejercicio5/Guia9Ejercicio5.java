/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia9ejercicio5;

import com.mycompany.guia9ejercicio5.entidades.Persona;
import com.mycompany.guia9ejercicio5.servicios.PersonaServicio;

/**
 *
 * @author Usuario
 */
public class Guia9Ejercicio5 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Persona ps = PersonaServicio.crearPersona();
        System.out.println(ps.toString());
        System.out.println("La edada de la persona es: " + PersonaServicio.calcularEdad(ps));
        System.out.println("La nueva persona es menor? : " + PersonaServicio.esMenor(ps, PersonaServicio.calcularEdad(ps)));
        
    }
}
