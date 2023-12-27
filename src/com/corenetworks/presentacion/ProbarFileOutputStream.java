package com.corenetworks.presentacion;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProbarFileOutputStream {
    public static void main(String[] args) {
        //1.Declarar variable
        FileOutputStream fSalida=null;
        DataOutputStream buffer = null;
        int contador =5;

        //2.Actiones de Entrada/Salida
        try {
            fSalida= new FileOutputStream("Datos.dat");
            buffer= new DataOutputStream(fSalida);
            buffer.writeInt(contador);
            //3.Cerrar flujos
            buffer.flush();
            buffer.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
