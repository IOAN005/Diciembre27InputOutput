package com.corenetworks.presentacion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int  suma ;
        int nota ;
        FileWriter fSalida= null;
        BufferedWriter buffer = null;

        try {
             fSalida = new FileWriter("27_Diciembre.txt");
             buffer=new BufferedWriter(fSalida);
            buffer.write("Nombre \t\t\t Edad \t\t\t Nota" +"\n");
            buffer.write("-".repeat(50)+ "\n");
            for (int i =0;i<=4;i++){
                System.out.println("escribe su nombre \t\t  edad \t\t nota");
                fSalida.write(teclado.nextLine() +'\n');

            }
            buffer.flush();
            buffer.close();
            fSalida.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
