package Procesamiento;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Experimento extends Laboratorio{

    private ArrayList<Poblacion> Poblacion = new ArrayList<Poblacion>();

    public void abrirExperimento(String rutaArchivo){
        try {

            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
            String linea = lector.readLine();
            while (linea != null){
                String[] datos = linea.split(",");
                Poblacion poblacion = new Poblacion();
                poblacion.setNombre(datos[0]);
                poblacion.setFechaInicial(datos[1]);
                poblacion.setFechaFinal(datos[2]);
                poblacion.setNumBacterias(Integer.parseInt(datos[3]));
                poblacion.setTemperatura(Double.parseDouble(datos[4]));
                poblacion.setLuz(datos[5]);
                poblacion.setDosisComida(Integer.parseInt(datos[6]), Integer.parseInt(datos[7]), Integer.parseInt(datos[8]), Integer.parseInt(datos[9]), Integer.parseInt(datos[10]));
                Poblacion.add(poblacion);
                linea = lector.readLine();
            }
            lector.close();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al abrir el archivo"+ e.getMessage());
        }
    }

    public Experimento (ArrayList<Poblacion> Poblacion){
        this.Poblacion = Poblacion;
    }

    public Poblacion crearPoblacion(String nombre, String fechaInicial, String fechaFinal, int numBacterias, double temperatura, Luminosidad luz, int cantidadInicial, int diaFinIncremento, int maximaCantidad, int cantidadFinal, int dosis){
        Poblacion poblacion = new Poblacion();
        poblacion.setNombre(nombre);
        poblacion.setFechaInicial(fechaInicial);
        poblacion.setFechaFinal(fechaFinal);
        poblacion.setNumBacterias(numBacterias);
        poblacion.setTemperatura(temperatura);
        poblacion.setLuz(luz);
        poblacion.setDosisComida(cantidadInicial, diaFinIncremento, maximaCantidad, cantidadFinal, dosis);
        return nuevaPoblacion;
    }

}
