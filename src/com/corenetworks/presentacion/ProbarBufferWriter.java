package com.corenetworks.presentacion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProbarBufferWriter {
    public static void main(String[] args) {
        //.1 Declarar variable
        FileWriter fSalida= null;
        BufferedWriter buffer=null;

        //.2Action entrasa / salida
        try {
            fSalida=new FileWriter("buffered_writer.txt");
            buffer=new BufferedWriter(fSalida);
            //.3Finalizar flujos
            buffer.write("usando buffered");
            buffer.flush();
            buffer.close();
            fSalida.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }


    }
}
