/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia9extras2.entidades;

/**
 *
 * @author Usuario
 */
public class Ahorcado {

    private String[] palabraABuscar;
    private int letrasEncontradas;
    private int intentosMaximos;
    private int intentosRealizados;

    public Ahorcado(String[] palabraABuscar, int intentosMaximos) {
        this.palabraABuscar = palabraABuscar;
        this.letrasEncontradas = 0;
        this.intentosMaximos = intentosMaximos;
        this.intentosRealizados = 0;
    }

    public String[] getPalabraABuscar() {
        return palabraABuscar;
    }

    public void setPalabraABuscar(String[] palabraABuscar) {
        this.palabraABuscar = palabraABuscar;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getIntentosMaximos() {
        return intentosMaximos;
    }

    public void setIntentosMaximos(int intentosMaximos) {
        this.intentosMaximos = intentosMaximos;
    }

    public int getIntentosRealizados() {
        return intentosRealizados;
    }

    public void setIntentosRealizados(int intentosRealizados) {
        this.intentosRealizados = intentosRealizados;
    }

}
