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

}
