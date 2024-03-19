package org.example;

public class Experimento{

    private String nombre;
    private int numBacterias;
    private double temperatura;
    private Luminosidad luz;
    private Dosis dosisComida;
    private Poblacion[] poblaciones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumBacterias() {
        return numBacterias;
    }

    public void setNumBacterias(int numBacterias) {
        this.numBacterias = numBacterias;
    }

    public Luminosidad getLuz() {
        return luz;
    }

    public void setLuz(Luminosidad luz) {
        this.luz = luz;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public Dosis getDosisComida() {
        return dosisComida;
    }

    public void setDosisComida(Dosis dosisComida) {
        this.dosisComida = dosisComida;
    }

    public Poblacion[] getPoblaciones() {
        return poblaciones;
    }

    public void setPoblaciones(Poblacion[] poblaciones) {
        this.poblaciones = poblaciones;
    }
}
