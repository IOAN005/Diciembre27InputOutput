package com.corenetworks.presentacion;

import java.io.FileWriter;
import java.io.IOException;

public class ProbrarFileWriter {
    public static void main(String[] args) {
        //1.Declarar variables
        FileWriter fSalida = null;

        try {
            //2.Action E/S
            fSalida = new FileWriter("primer ejemplo.txt");

        fSalida.write("Hola mundo desde java");
        //3.Cerrar los flujos
        fSalida.flush();
        fSalida.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }

}
