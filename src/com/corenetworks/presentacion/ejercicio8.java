package com.corenetworks.presentacion;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ejercicio8 {
    public static void main(String[] args) {

        //1.Declarar variable
        FileOutputStream fSalida=null;
        DataOutputStream buffer = null;
        byte  numero=0;
        short num=2;
        int contador=5;
        long nu =333L;
        double suma =12.4;
        float salario =1.999F;
        char letra ='a';
        boolean  texto=true;
        //2.Action entrada salida
        try {
            fSalida = new FileOutputStream("Primitivos.dat");
            buffer = new DataOutputStream(fSalida);
            buffer.writeByte(numero);
            buffer.writeShort(num);
            buffer.writeInt(contador);
            buffer.writeLong(nu);
            buffer.writeDouble(suma);
            buffer.writeFloat(salario);
            buffer.writeChar('a');
            buffer.writeBoolean(texto);
            //3.Cerrar flujo
            buffer.flush();
            buffer.close();
            fSalida.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
