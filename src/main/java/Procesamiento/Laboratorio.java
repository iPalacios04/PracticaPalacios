package Procesamiento;

import java.util.ArrayList;
import java.util.List;

public class Laboratorio {

    public List<Experimento> experimentos;

    public Laboratorio() {
        this.experimentos = new ArrayList<Experimento>();
    }// Creamos el constructor de la clase Laboratorio

    public void crearExperimento(int idExperimento, String nombreExperimento,  String direccionArchivo, ArrayList<Poblacion> poblaciones) {
        Experimento newExperimento = new Experimento(idExperimento, nombreExperimento, direccionArchivo, poblaciones);
        this.experimentos.add(newExperimento);
    }// Creamos un nuevo experimento y lo añadimos a la lista de experimentos

    public boolean eliminarExperimento(int idExperimento){
        for (Experimento x : experimentos){
            if (x.idExperimento == idExperimento){
                experimentos.remove(x);
                return true;
            }
        }
        return false;
    }// Eliminamos un experimento de la lista de experimentos

    //Añadimos los getters y setters de la clase Laboratorio

    public List<Experimento> getExperimentos() {
        return experimentos;
    }

    public void setExperimentos(List<Experimento> experimentos) {
        this.experimentos = experimentos;
    }
}
