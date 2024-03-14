package Actividad_2;

import java.util.Scanner;

public class Capitulo4_ejercicio24 {
    public static void main(String[] args) {
        //Se tienen tres esferas (A,B,C) de diferente peso, elaborar un algoritmo que determine cuál es
        //la esfera de mayor peso.
        double A, B, C;
        char mayor;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el peso de A: ");
        A = entrada.nextDouble();

        System.out.println("Ingrese el peso de B: ");
        B = entrada.nextDouble();

        System.out.println("Ingrese el peso de C: ");
        C = entrada.nextDouble();

        entrada.close();

        if (A > B && A > C){
            mayor = 'A';
        } else if (B > C) {
            mayor = 'B';
        } else {
            mayor = 'C';
        }
        System.out.println("La esfera de mayor peso es la esfera "+mayor);
    }
}
