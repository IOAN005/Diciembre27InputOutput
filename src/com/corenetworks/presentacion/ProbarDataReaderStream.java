package com.corenetworks.presentacion;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ProbarDataReaderStream {
    public static void main(String[] args) {
    //1.Declarar las variables
        FileInputStream fEntrada=null;
        DataInputStream buffer=null;
        //2.Actiones entrada salida
        try {
            fEntrada= new FileInputStream("Primitivos.dat");
            buffer=new DataInputStream(fEntrada);
            System.out.println("byte "+buffer.readByte());
            System.out.println("short" + buffer.readShort());
            System.out.println("int" + buffer.readInt());
            System.out.println("long " +buffer.readLong());
            System.out.println("double"+buffer.readDouble());
            System.out.println("float" + buffer.readFloat());
            System.out.println("char"+buffer.readChar());
            System.out.println("boolean" +buffer.readBoolean());
            //3.Cerrar los flujos
            buffer.close();
            fEntrada.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
