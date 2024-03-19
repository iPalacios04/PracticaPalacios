package org.example;

import java.util.*;
public class Poblacion extends Experimento {

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

    @Override
    public int getNumBacterias() {
        return numBacterias;
    }

    @Override
    public void setNumBacterias(int numBacterias) {
        this.numBacterias = numBacterias;
    }

    @Override
    public double getTemperatura() {
        return temperatura;
    }

    @Override
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public Luminosidad getLuz() {
        return luz;
    }

    @Override
    public void setLuz(Luminosidad luz) {
        this.luz = luz;
    }

    @Override
    public Dosis getDosisComida() {
        return dosisComida;
    }

    @Override
    public void setDosisComida(Dosis dosisComida) {
        this.dosisComida = dosisComida;
    }
}
