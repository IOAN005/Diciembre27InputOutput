package com.corenetworks.presentacion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProbarBufferReader {
    public static void main(String[] args) {
        //1.Declaramos variable
        FileReader fEntrada = null;
        BufferedReader buffer= null;
        String linea =null;
        int contadorLineas=0;
        //2.Action de E/S
        try {
            fEntrada=new FileReader("buffered_writer.txt");
            buffer= new BufferedReader(fEntrada);
            while (true){
                linea=buffer.readLine();
                if (linea==null){
                    break;
                }
                System.out.println(linea);
                contadorLineas++;
            }
            System.out.println("Se han contado "+ contadorLineas + "lineas ");
//3.Cerrar flujo
            buffer.close();
            fEntrada.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }
}
