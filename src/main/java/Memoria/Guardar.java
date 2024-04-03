package Memoria;

import java.io.FileWriter;
import java.io.IOException;
import Procesamiento.*;
public class Guardar {

    public class guardarEnMemoria {
        public class GuardarEnMemoria {
            public void guardarExperimentoComo(Experimento experimento) {
                String nombreArchivo = experimento.direccionArchivo;
                try {
                    FileWriter escritor = new FileWriter(nombreArchivo);
                    escritor.write("ID del Experimento: " + experimento.idExperimento + "\n");
                    escritor.write("Nombre del Experimento: " + experimento.nombreExperimento + "\n");
                    for (Poblacion poblacion : experimento.getPoblaciones()) {
                        escritor.write("\n");
                        escritor.write("ID de la Poblacion: " + poblacion.idPoblacion + "\n");
                        escritor.write("Nombre de la Poblacion: " + poblacion.nombre + "\n");
                        escritor.write("Fecha de Inicio: " + poblacion.fechaInicio + "\n");
                        escritor.write("Fecha de Fin: " + poblacion.fechaFin + "\n");
                        escritor.write("Numero de Bacterias: " + poblacion.numBacterias + "\n");
                        escritor.write("Temperatura: " + poblacion.temperatura + "\n");
                        escritor.write("Luminosidad: " + poblacion.luminosidad + "\n");
                        escritor.write("Dosis de Comida: " + poblacion.dosisComida + "\n");
                    }
                    escritor.close();
                } catch (IOException e) {
                    System.out.println("Ocurrió un error al escribir en el archivo.");
                    e.printStackTrace();
                }
            }

            public boolean guardar(Experimento experimento) {
                String nombreArchivo = experimento.direccionArchivo;
                try {
                    FileWriter escritor = new FileWriter(nombreArchivo);
                    escritor.write("ID del Experimento: " + experimento.idExperimento + "\n");
                    escritor.write("Nombre del Experimento: " + experimento.nombreExperimento + "\n");
                    for (Poblacion poblacion : experimento.getPoblaciones()) {
                        escritor.write("\n");
                        escritor.write("ID de la Poblacion: " + poblacion.idPoblacion + "\n");
                        escritor.write("Nombre de la Poblacion: " + poblacion.nombre + "\n");
                        escritor.write("Fecha de Inicio: " + poblacion.fechaInicio + "\n");
                        escritor.write("Fecha de Fin: " + poblacion.fechaFin + "\n");
                        escritor.write("Numero de Bacterias: " + poblacion.numBacterias + "\n");
                        escritor.write("Temperatura: " + poblacion.temperatura + "\n");
                        escritor.write("Luminosidad: " + poblacion.luminosidad + "\n");
                        escritor.write("Dosis de Comida: " + poblacion.dosisComida + "\n");
                    }
                    escritor.close();
                    return true;
                } catch (IOException e) {
                    System.out.println("Ocurrió un error al escribir en el archivo.");
                    e.printStackTrace();
                    return false;
                }
            }
        }


    }
}
