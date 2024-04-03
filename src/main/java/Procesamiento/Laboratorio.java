package Procesamiento;

import java.util.ArrayList;
import java.util.List;

public class Laboratorio {

    public List<Experimento> experimentos;

    public Laboratorio() {
        this.experimentos = new ArrayList<>();
    }// Creamos el constructor de la clase Laboratorio

    public void crearExperimento(int idExperimento, String nombreExperimento,  String pathArchivo, ArrayList<Poblacion> poblaciones) {
        Experimento newExperimento = new Experimento(idExperimento, nombreExperimento, pathArchivo, poblaciones);
        this.experimentos.add(newExperimento);
    }// Creamos un nuevo experimento y lo añadimos a la lista de experimentos



}
