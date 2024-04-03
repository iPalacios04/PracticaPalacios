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
    public String fechaInicio;
    public String fechaFin;
    public String luminosidad;

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

    public Poblacion(String nombrePoblacion, int idPoblacion, String fechaInicio, String fechaFin, int numBacterias, float temperatura, Luminosidad luminosidad, Dosis dosis) {
    }

    public String toString(){
        return "Poblacion{Nombre: " + nombre +
            "\nFecha Inicial: " + fechaInicial +
            "\nFecha Final: " + fechaFinal +
            "\nNumero de Bacterias: " + numBacterias +
            "\nTemperatura: " + temperatura +
            "\nLuminosidad: " + luz +
            "\nDosis de Comida: " + dosisComida + "}";

    } // Devuelve una representacion en cadena de la poblacion

    @Override

    public int hashCode() {
        return Objects.hash(nombre, idPoblacion, fechaInicial, fechaFinal, numBacterias, temperatura, luz, dosisComida);
    } // Devuelve el hashcode de la poblacion

    //Incluimos los getters y setters de la clase Poblacion


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdPoblacion() {
        return idPoblacion;
    }

    public void setIdPoblacion(int idPoblacion) {
        this.idPoblacion = idPoblacion;
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
}

