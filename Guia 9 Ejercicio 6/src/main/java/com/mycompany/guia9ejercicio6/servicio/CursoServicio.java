/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia9ejercicio6.servicio;

import com.mycompany.guia9ejercicio6.entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CursoServicio {

    static Scanner sc = new Scanner(System.in);

    public static String[] cargarAlumnos(Curso curso) {
        System.out.println("Ingrese los nombres");
        String[] alumnos = new String[5];
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = sc.nextLine();
        }
        return alumnos;
    }

    public static void crearCurso(Curso[] cursos) {
        System.out.println("Ingrese el nombre del curso");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la cantidad de horas por día");
        int horasXdia = sc.nextInt();
        System.out.println("Ingrese la cantidad de días por semana");
        int diasXsemana = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el turno");
        String turno = sc.nextLine();
        System.out.println("Ingrese el precio por hora");
        int precioXhora = sc.nextInt();
        sc.nextLine();
        String[] alumnos = cargarAlumnos(new Curso(nombre, horasXdia, diasXsemana, turno, precioXhora, new String[5]));
        Curso curso = new Curso(nombre, horasXdia, diasXsemana, turno, precioXhora, alumnos);
        cursos[0] = curso;
    }

    public static int calcularGananciaSemanal(Curso curso) {
        int gananciaSemanal = curso.getCantidadDeHorasPorDia() * curso.getPrecioPorHora()
                * curso.getAlumnos().length * curso.getCantidadDeDiasPorSemana();
        return gananciaSemanal;
    }

    

    
}
