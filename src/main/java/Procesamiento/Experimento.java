package Procesamiento;
import java.util.ArrayList;
import java.util.Date;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Experimento{

    public String direccionArchivo; // Es la direccion del archivo del experimento
    public int idExperimento; // Es el identificador del experimento
    public String nombreExperimento; // Es el nombre del experimento
    private ArrayList<Poblacion> Poblaciones; // Es la lista de poblaciones del experimento

    public Experimento(int idExperimento, int numExperimento, String nombreExperimento, ArrayList<Poblacion> Poblaciones){
        this.idExperimento = idExperimento;
        this.nombreExperimento = nombreExperimento;
        this.Poblaciones = Poblaciones;
    } // Creamos el constructor de la clase Experimento

    public void addPoblacion (Poblacion poblacion){
        this.Poblaciones.add(poblacion);
    } // Añadimos una poblacion a la lista de poblaciones del experimento

    public void crearPoblacion(String nombre, int idPoblacion, Date fechaInicio, Date fechaFin, int numBacterias, float temperatura, Luminosidad luminosidad, Dosis dosisComida){
        Poblacion poblacion = new Poblacion(nombre, idPoblacion, fechaInicio, fechaFin, numBacterias, temperatura, luminosidad, dosisComida);
        addPoblacion(poblacion);
    } // Creamos una nueva poblacion y la añadimos a la lista de poblaciones del experimento

    public String infoPoblacion(int idExperimento){
        Poblacion poblacion = null;

        for (Poblacion x : Poblaciones){
            if (x.idPoblacion == idExperimento){
                poblacion = x;
            }
        }

        if (poblacion != null){
            return poblacion.toString();
        }
        else{
            return "La poblacion con el id indicado no se encuentra en el experimento";
        }

    } // Nos proporciona la informacion de una poblacion del experimento

    public boolean borrarPoblacion(Poblacion poblacion){
        return this.Poblaciones.remove(poblacion);
    } // Borramos una poblacion de la lista de poblaciones del experimento

    public String tooString(){
        return "Experimento{Id: " + idExperimento +
            "\nNombre: " + nombreExperimento +
            "\nPoblaciones: " + Poblaciones + "}";
    } // Devolvemos una representacion en cadena del experimento

    //Incluimos los getters y setters de la clase Experimento


    public int getIdExperimento() {
        return idExperimento;
    }

    public void setIdExperimento(int idExperimento) {
        this.idExperimento = idExperimento;
    }

    public String getNombreExperimento() {
        return nombreExperimento;
    }

    public void setNombreExperimento(String nombreExperimento) {
        this.nombreExperimento = nombreExperimento;
    }

    public ArrayList<Poblacion> getPoblaciones() {
        return Poblaciones;
    }

    public void setPoblaciones(ArrayList<Poblacion> poblaciones) {
        Poblaciones = poblaciones;
    }

    public String getDireccionArchivo() {
        return direccionArchivo;
    }

    public void setDireccionArchivo(String direccionArchivo) {
        this.direccionArchivo = direccionArchivo;
    }
}
