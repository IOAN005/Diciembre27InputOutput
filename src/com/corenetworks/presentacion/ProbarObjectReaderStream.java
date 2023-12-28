package com.corenetworks.presentacion;

import com.corenetworks.modelo.Producto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ProbarObjectReaderStream {
    public static void main(String[] args) {
       //Leer
        //1.declarar variable
        FileInputStream fEntrada;
        ObjectInputStream objecto;
        Producto p1=null;
        Producto p2= null;

        //2.Action E/S
        try {
            fEntrada= new FileInputStream("producto.dat");
            objecto= new ObjectInputStream(fEntrada);
            p1=(Producto) objecto.readObject();
            System.out.println(p1.toString());
            p2=(Producto) objecto.readObject();
            System.out.println(p2.toString());
            //3.Cierre stream
            objecto.close();
            fEntrada.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }

    }
}
