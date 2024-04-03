package Memoria;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


import Procesamiento.Experimento;
import Procesamiento.Poblacion;
import Procesamiento.Luminosidad;
import Procesamiento.Dosis;

public class Leer {

    public static Experimento leerExperimentoDesdeArchivo(String rutaArchivo) {
        Experimento experimento = null;
        try {
            File archivo = new File(rutaArchivo);
            Scanner escaner = new Scanner(archivo);

            // Leer los detalles del Experimento
            int idExperimento = Integer.parseInt(escaner.nextLine().split(": ")[1]);
            String nombreExperimento = escaner.nextLine().split(": ")[1];

            // Crear el objeto Experimento
            experimento = new Experimento(idExperimento, nombreExperimento, rutaArchivo, new ArrayList<>());


            while (escaner.hasNextLine()) {// Leer los detalles de cada Poblacion
                escaner.nextLine();
                int idPoblacion = Integer.parseInt(escaner.nextLine().split(": ")[1]);
                String nombrePoblacion = escaner.nextLine().split(": ")[1];
                String fechaInicio = escaner.nextLine().split(": ")[1];
                String fechaFin = escaner.nextLine().split(": ")[1];
                int numBacterias = Integer.parseInt(escaner.nextLine().split(": ")[1]);
                float temperatura = Float.parseFloat(escaner.nextLine().split(": ")[1]);
                Luminosidad luminosidad = Luminosidad.valueOf(escaner.nextLine().split(": ")[1].toUpperCase());
                String dosisComida = escaner.nextLine().split(": ")[1];

                String[] partesDosisComida = dosisComida.split(","); // Parsear la cadena dosisComida en cuatro valores double
                double parte1 = Double.parseDouble(partesDosisComida[0]);
                int parte2 = Integer.parseInt(partesDosisComida[1]);
                double parte3 = Double.parseDouble(partesDosisComida[2]);
                double parte4 = Double.parseDouble(partesDosisComida[3]);

                Dosis dosis = new Dosis(parte1, parte2, parte3, parte4);
                Poblacion poblacion = new Poblacion(nombrePoblacion, idPoblacion, fechaInicio, fechaFin, numBacterias, temperatura, luminosidad, dosis);
                experimento.addPoblacion(poblacion);
            }
            escaner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return experimento;
    }
}
