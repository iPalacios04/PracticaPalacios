package org.example;

import java.util.*;
public class Poblacion extends Dosis{

    private String nombre;
    private Date fechaInicial;
    private Date fechaFinal;
    private int numBacterias;
    private double temperatura;
    private Luminosidad luz;
    private Dosis dosisComida;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getNumBacterias() {
        return numBacterias;
    }

    public void setNumBacterias(int numBacterias) {
        this.numBacterias = numBacterias;
    }

    public double getTemperatura() {
        return temperatura;
    }


    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }


    public Luminosidad getLuz() {
        return luz;
    }


    public void setLuz(Luminosidad luz) {
        this.luz = luz;
    }

    public Dosis getDosisComida() {
        return dosisComida;
    }

    public void setDosisComida(Dosis dosisComida) {
        this.dosisComida = dosisComida;
    }

    public Poblacion(String nombre, Date fechaInicial, Date fechaFinal, int numBacterias, double temperatura, Luminosidad luz, Dosis dosisComida, int cantidadInicial, int diaIntroducido, int cantidadDiaIntroducido, int cantidadAnadir, Scanner scanner, String nombre1, Date fechaInicial1, Date fechaFinal1, int numBacterias1, double temperatura1, Luminosidad luz1, Dosis dosisComida1) {
        super(nombre, fechaInicial, fechaFinal, numBacterias, temperatura, luz, dosisComida, cantidadInicial, diaIntroducido, cantidadDiaIntroducido, cantidadAnadir, scanner);
        this.nombre = nombre1;
        this.fechaInicial = fechaInicial1;
        this.fechaFinal = fechaFinal1;
        this.numBacterias = numBacterias1;
        this.temperatura = temperatura1;
        this.luz = luz1;
        this.dosisComida = dosisComida1;
    }

    public String toString(){
        return "Poblacion{Nombre: " + nombre +
            "\nFecha Inicial: " + fechaInicial +
            "\nFecha Final: " + fechaFinal +
            "\nNumero de Bacterias: " + numBacterias +
            "\nTemperatura: " + temperatura +
            "\nLuminosidad: " + luz +
            "\nDosis de Comida: " + dosisComida +"}";

    }
}

