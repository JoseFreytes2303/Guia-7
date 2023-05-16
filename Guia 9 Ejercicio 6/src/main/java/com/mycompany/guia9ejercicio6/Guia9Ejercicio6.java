/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.guia9ejercicio6;

import com.mycompany.guia9ejercicio6.entidades.Curso;
import com.mycompany.guia9ejercicio6.servicio.CursoServicio;

/**
 *
 * @author Usuario
 */
public class Guia9Ejercicio6 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Curso[] cursos = new Curso[1];
        CursoServicio.crearCurso(cursos);
        Curso curso = cursos[0];
        System.out.println("Las ganancias semanales son: " + CursoServicio.calcularGananciaSemanal(curso));

    }
}
