package Procesamiento;
import java.util.Date;
import java.util.Scanner;

public class Dosis {

    private int cantidadInicial; // Es la cantidad inicial de la dosis
    private int diaFinIncremento; //Es el dia en el que pasa a decrecer la cantidad de comida
    private int maximaCantidad; // Es la cantidad maxima de la dosis
    private int cantidadFinal; // Es la cantidad final de la dosis
    private int dosis;// Es la cantidad de comida que se debe proporcionar en x dia
    public Dosis(int cantidadInicial, int diaFinIncremento, int maximaCantidad, int cantidadFinal, int dosis) {
        this.cantidadInicial = cantidadInicial;
        this.diaFinIncremento = diaFinIncremento;
        this.maximaCantidad = maximaCantidad;
        this.dosis = dosis;
        this.cantidadFinal = cantidadFinal;
    }
    public int calculoDosis(int dia){

        int cantidadAnadir = (maximaCantidad - cantidadInicial) / (diaFinIncremento - 1);

        if(dia <= diaFinIncremento){

            dosis = cantidadInicial + ((dia-1)* cantidadAnadir);

            return dosis;
        }
        else{

            int disminucion = (maximaCantidad - cantidadFinal / (30 - diaFinIncremento));
            dosis = maximaCantidad - disminucion * (dia - diaFinIncremento);

            return dosis;
        }
    }
}
