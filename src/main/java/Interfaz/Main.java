package Interfaz;

import Memoria.*;
import Procesamiento.*;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        int opcion = -1 ; // Opción del menú inicializada en -1

        Scanner scanner = new Scanner(System.in); // Objeto scanner para leer la entrada del usuario

        while (opcion != 0) { // Mientras la opción no sea 0
            System.out.println("\n1. Abrir un archivo que contenga un experimento\n");
            System.out.println("\n2. Crear un nuevo experimento\n");
            System.out.println("\n3. Crear una población de bacterias y añadirla al experimento actual\n");
            System.out.println("\n4. Visualizar los nombres de todas las poblaciones de bacterias del experimento actual\n");
            System.out.println("\n5. Borrar una población de bacterias del experimento actual\n");
            System.out.println("\n6. Ver información detallada de una población de bacterias del experimento actual\n");
            System.out.println("\n7. Guardar (se supone que para usar esta opción previamente hemos abierto un archivo)\n");
            System.out.println("\n8. Guardar como\n");
            System.out.println("\n0. Salir\n");
            System.out.println("\n¿Qué opción desea realizar?\n");

            opcion = scanner.nextInt(); // Leemos la opción del usuario

            switch (opcion) {
                case 1: // Si el usuario inroduce la opción es 1
                    System.out.println("Opción 1: Abrir un archivo que contenga un experimento\n");

                    System.out.println("Que dirección de archivo desea abrir?");
                    String direccionArchivo = scanner.next(); // Leemos la dirección del archivo

                    Experimento experimento = Leer.leerExperimentoDesdeArchivo(direccionArchivo); // Leemos el experimento del archivo
                    if (experimento != null) {
                        System.out.println("Se ha leído el experimento correctamente");
                        System.out.println(experimento.tooString());
                    } else {
                        System.out.println("No se ha podido leer el experimento");
                    }

                    break;

                case 2: // Si el usuario inroduce la opción es 2
                    System.out.println("Opción 2: Crear un nuevo experimento\n");

                    System.out.println("Introduzca el ID del experimento");
                    int idExperimento = scanner.nextInt(); // Leemos el ID del experimento
                    ArrayList<Poblacion> poblaciones = new ArrayList<Poblacion>(); // Creamos una lista de poblaciones vacía
                    Laboratorio laboratorio = new Laboratorio(); // Creamos un laboratorio

                    System.out.println("Introduzca el nombre del experimento");
                    String nombreExperimento = scanner.next(); // Leemos el nombre del experimento

                    System.out.println("Introduzca la dirección del archivo");
                    direccionArchivo = scanner.next();
                    laboratorio.crearExperimento(idExperimento, nombreExperimento, direccionArchivo, poblaciones); // Creamos un nuevo experimento
                    System.out.println("Se ha creado el experimento correctamente con ID: " + idExperimento + " y nombre: " + nombreExperimento);

                    break;

                case 3: // Si el usuario inroduce la opción es 3
                    System.out.println("Opción 3 : Crear una población de bacterias y añadirla al experimento actual\n");

                    System.out.println("Introduzca el ID de la población");
                    int idPoblacion = scanner.nextInt(); // Leemos el ID de la población
                    System.out.println("Introduzca el nombre de la población");
                    String nombrePoblacion = scanner.next(); // Leemos el nombre de la población
                    System.out.println("Introduzca la fecha de inicio de la población");
                    String fechaInicio = scanner.next(); // Leemos la fecha de inicio de la población
                    System.out.println("Introduzca la fecha de fin de la población");
                    String fechaFin = scanner.next(); // Leemos la fecha de fin de la población
                    System.out.println("Introduzca el número de bacterias de la población");
                    break;

                case 4: // Si el usuario inroduce la opción es 4
                    System.out.println("Opción 4 : Visualizar los nombres de todas las poblaciones de bacterias del experimento actual\n");
                    break;
                case 5: // Si el usuario inroduce la opción es 5
                    System.out.println("Opción 5 : Borrar una población de bacterias del experimento actual\n");
                    break;
                case 6: // Si el usuario inroduce la opción es 6
                    System.out.println("Opción 6 : Ver información detallada de una población de bacterias del experimento actual\n");
                    break;
                case 7: // Si el usuario inroduce la opción es 7
                    System.out.println("Opción 7 : Guardar (se supone que para usar esta opción previamente hemos abierto un archivo)\n");
                    break;
                case 8: // Si el usuario inroduce la opción es 8
                    System.out.println("Opción 8  : Guardar como\n");
                    break;
                case 0: // Si el usuario inroduce la opción es 0
                    System.out.println("¡Hasta pronto!");
                    break;
                default: // Si la opción no es ninguna de las anteriores
                    System.out.println("La opción introducida no es válida");
                    break;
            }
        }

        scanner.close(); // Cerramos el scanner
    }
}