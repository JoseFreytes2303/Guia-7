/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia9ejercicio6.entidades;

/**
 *
 * @author Usuario
 */
public class Curso {
    private String nombreCurso;
    private int cantidadDeHorasPorDia;
    private int cantidadDeDiasPorSemana;
    private String turno;
    private int precioPorHora;
    private String[] alumnos;

    public Curso() {
    }

    public Curso(String nombreCurso, int cantidadDeHorasPorDia, int cantidadDeDiasPorSemana, String turno, int precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadDeHorasPorDia = cantidadDeHorasPorDia;
        this.cantidadDeDiasPorSemana = cantidadDeDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = new String[5];
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadDeHorasPorDia() {
        return cantidadDeHorasPorDia;
    }

    public void setCantidadDeHorasPorDia(int cantidadDeHorasPorDia) {
        this.cantidadDeHorasPorDia = cantidadDeHorasPorDia;
    }

    public int getCantidadDeDiasPorSemana() {
        return cantidadDeDiasPorSemana;
    }

    public void setCantidadDeDiasPorSemana(int cantidadDeDiasPorSemana) {
        this.cantidadDeDiasPorSemana = cantidadDeDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    
    
    
    
}
