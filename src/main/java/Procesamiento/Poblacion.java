package Procesamiento;

import java.util.*;
public class Poblacion{

    public String nombre; // Es el nombre de la poblacion
    public int idPoblacion; // Es el identificador de la poblacion
    public Date fechaInicial; // Es la fecha de inicio de la poblacion
    public Date fechaFinal; // Es la fecha de fin de la poblacion
    public int numBacterias; // Es el numero de bacterias de la poblacion
    public double temperatura; // Es la temperatura de la poblacion
    public Luminosidad luz; // Es la luminosidad de la poblacion
    public Dosis dosisComida; // Es la dosis de comida de la poblacion

    public Poblacion (String nombre, int idPoblacion, Date fechaInicial, Date fechaFinal, int numBacterias, double temperatura, Luminosidad luz, Dosis dosisComida){
        this.nombre = nombre;
        this.idPoblacion = idPoblacion;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.numBacterias = numBacterias;
        this.temperatura = temperatura;
        this.luz = luz;
        this.dosisComida = dosisComida;
    } // Creamos el constructor de la clase Poblacion

    public String toString(){
        return "Poblacion{Nombre: " + nombre +
            "\nFecha Inicial: " + fechaInicial +
            "\nFecha Final: " + fechaFinal +
            "\nNumero de Bacterias: " + numBacterias +
            "\nTemperatura: " + temperatura +
            "\nLuminosidad: " + luz +
            "\nDosis de Comida: " + dosisComida + "}";

    } // Devuelve una representacion en cadena de la poblacion
}

