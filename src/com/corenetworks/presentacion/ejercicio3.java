package com.corenetworks.presentacion;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        //1. Declarar variables
        FileWriter fSalida = null;
        Scanner teclado = new Scanner(System.in);
        String nombre = null;
        int edad = 0,acumuladorEdades=0;
        String frase = null;
        double nota=0 ,acumuladorNotas=0;
        String promedio =null;

            try {
                fSalida = new FileWriter("ejercicio3.txt");

            fSalida.write("NOMBRE \t \t \tEDAD \t\t NOTA\n");
            fSalida.write("-".repeat(50)+ "\n");
            //2. Acciones e/S
            for(int i = 1; i <=5; i++){
                System.out.println("Escriba el nombre  " + i);
                nombre = teclado.nextLine();
                System.out.println("Escriba la edad " + i);
                edad = teclado.nextInt();
                teclado.nextLine();
                acumuladorEdades+=edad;
                System.out.println("Escriba la nota " + i);
                nota = teclado.nextDouble();

                teclado.nextLine();
                acumuladorNotas+= nota;
                frase = String.format("%-20s \t \t \t %d \t\t\t%2f\n", nombre, edad,nota);
                fSalida.write(frase);


            }
            //3. Cerrar los flujos
                fSalida.write(String.format("El promedio de edad -> %d",acumuladorEdades/5));
            fSalida.write(String.format("El promedio de notas -> %.2f",acumuladorNotas/5));


            fSalida.flush();
            fSalida.close();
            teclado.close();
            } catch (IOException e) {
        throw new RuntimeException(e);
    }

    }

}

