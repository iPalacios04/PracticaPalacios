package Procesamiento;
import java.util.ArrayList;
import java.util.Date;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Experimento{

    public int idExperimento; // Es el identificador del experimento
    public int numExperimento; // Es el numero de experimento
    public String nombreExperimento; // Es el nombre del experimento
    private ArrayList<Poblacion> Poblaciones; // Es la lista de poblaciones del experimento

    public Experimento(int idExperimento, int numExperimento, String nombreExperimento, ArrayList<Poblacion> Poblaciones){
        this.idExperimento = idExperimento;
        this.numExperimento = numExperimento;
        this.nombreExperimento = nombreExperimento;
        this.Poblaciones = Poblaciones;
    } // Creamos el constructor de la clase Experimento

    public void addPoblacion (Poblacion poblacion){
        this.Poblaciones.add(poblacion);
    } // Añadimos una poblacion a la lista de poblaciones del experimento

    public void newPoblacion(String nombre, int idPoblacion, Date fechaInicio, Date fechaFin, int numBacterias, float temperatura, Luminosidad luminosidad, Dosis dosisComida){
        Poblacion poblacion = new Poblacion(nombre, idPoblacion, fechaInicio, fechaFin, numBacterias, temperatura, luminosidad, dosisComida);
        addPoblacion(poblacion);
    } // Creamos una nueva poblacion y la añadimos a la lista de poblaciones del experimento

}
