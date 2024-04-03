package Procesamiento;
import java.util.Date;
import java.util.Scanner;

public class Dosis {

    private double cantidadInicial; // Es la cantidad inicial de la dosis
    private int diaFinIncremento; //Es el dia en el que pasa a decrecer la cantidad de comida
    private double maximaCantidad; // Es la cantidad maxima de la dosis
    private double cantidadFinal; // Es la cantidad final de la dosis
    private double dosis;// Es la cantidad de comida que se debe proporcionar en x dia
    public Dosis(double cantidadInicial, int diaFinIncremento, double maximaCantidad, double cantidadFinal){
        if (diaFinIncremento == 1 || diaFinIncremento == 30) {
            throw new IllegalArgumentException("El dia de incremento introducido no es valido");
        }
        if (cantidadInicial > 300 || cantidadFinal > 300) {
            throw new IllegalArgumentException("La cantidad inicial y final no pueden ser mayores a 300");
        }
        if (maximaCantidad > (300 - cantidadInicial)) {
            throw new IllegalArgumentException("La cantidad maxima no puede ser mayor a 300 - cantidadInicial");
        }
        this.cantidadInicial = cantidadInicial;
        this.diaFinIncremento = diaFinIncremento;
        this.maximaCantidad = maximaCantidad;
        this.cantidadFinal = cantidadFinal;
    }

    public double calculoDosis(int dia){

        double cantidadAnadir = (maximaCantidad - cantidadInicial) / (diaFinIncremento - 1);

        if(dia <= diaFinIncremento){

            dosis = cantidadInicial + ((dia-1)* cantidadAnadir);

            return dosis;
        }
        else{

            double disminucion = (maximaCantidad - cantidadFinal / (30 - diaFinIncremento));
            dosis = maximaCantidad - disminucion * (dia - diaFinIncremento);

            return dosis;
        }
    }
}
