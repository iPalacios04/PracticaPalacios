package org.example;
import java.util.Date;
import java.util.Scanner;

public class Dosis {

    private int cantidadInicial;
    private int diaFinIncremento; //Es el dia en el que pasa a decrecer la cantidad de comida
    private int maximaCantidad;
    private int cantidadFinal;
    private int dosis;
    public Dosis(int cantidadInicial, int diaFinIncremento, int cantidadAnadir, int cantidadFinal) {
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
