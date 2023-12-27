package com.corenetworks.presentacion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ProbarFileReader {
    public static void main(String[] args) {


        //1.Definir variable
        FileReader fEntrada = null;
        char[] buffer = new char[128];
        int longitudLeida=0;
        //2Actiones entrada salida
        try {
            fEntrada =new FileReader("primer ejemplo.txt");
            System.out.println("El buffer tiene ->" + Arrays.toString(buffer));
            System.out.println("la longitud -> " + longitudLeida);
            while (longitudLeida!=-1){
                System.out.println("Entra al bucle");
                longitudLeida = fEntrada.read(buffer);
                System.out.println(Arrays.toString(buffer));


        }
            fEntrada.close();

    } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
