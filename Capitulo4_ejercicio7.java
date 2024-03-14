package Actividad_2;

import java.util.Scanner;

public class Capitulo4_ejercicio7 {
    public static void main(String[] args) {
        double A,B;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor de A: ");
        A = entrada.nextDouble();

        System.out.println("Ingrese el valor de B: ");
        B = entrada.nextDouble();

        entrada.close();

        if(A>B){
            System.out.println("A es mayor que B");
        } else if (A==B) {
            System.out.println("A es igual que B");
        }else{
            System.out.println("A es menor que B");
        }

    }
}
