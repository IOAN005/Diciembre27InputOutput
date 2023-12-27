package com.corenetworks.presentacion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileWriter fSalida=null;
        BufferedWriter buffer =null;
        System.out.println("escriba las 5 frases");
        try {
           fSalida = new FileWriter("2_Diciembre.txt");
           buffer =new BufferedWriter(fSalida);
            for(int i = 0; i < 5; i++){
                System.out.println("Escriba su frase");
                buffer.write(sc.nextLine() + "\n");
            }

            buffer.flush();
            // Cerrar los flujos
            fSalida.close();

            buffer.close();
            sc.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
