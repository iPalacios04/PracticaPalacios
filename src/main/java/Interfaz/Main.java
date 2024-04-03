package Interfaz;

import Procesamiento.Experimento;

import java.util.Scanner;

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

                    Experimento experimento = leer

                    break;
                case 2: // Si el usuario inroduce la opción es 2
                    System.out.println("Opción 2");
                    break;
                case 3: // Si el usuario inroduce la opción es 3
                    System.out.println("Opción 3");
                    break;
                case 4: // Si el usuario inroduce la opción es 4
                    System.out.println("Opción 4");
                    break;
                case 5: // Si el usuario inroduce la opción es 5
                    System.out.println("Opción 5");
                    break;
                case 6: // Si el usuario inroduce la opción es 6
                    System.out.println("Opción 6");
                    break;
                case 7: // Si el usuario inroduce la opción es 7
                    System.out.println("Opción 7");
                    break;
                case 8: // Si el usuario inroduce la opción es 8
                    System.out.println("Opción 8");
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