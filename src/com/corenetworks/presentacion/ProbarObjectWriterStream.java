package com.corenetworks.presentacion;

import com.corenetworks.modelo.Producto;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ProbarObjectWriterStream {
    public static void main(String[] args) {
        //1.Declarar variable
        FileOutputStream fSalida =null;
        ObjectOutputStream objecto;
        Producto p1;
        Producto p2;
        //2.Action E/S
        try {
            fSalida= new FileOutputStream("producto.dat");
            objecto = new ObjectOutputStream(fSalida);
            p1=new Producto(1,"te chai",1.3);
            objecto.writeObject(p1);
            p2=new Producto(2,"Queso",11.3);
            objecto.writeObject(p2);
            //3.Cerrar flujo
            objecto.flush();
            objecto.close();
            fSalida.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }


    }
}
