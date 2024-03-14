package Actividad_2;

import java.util.Scanner;

public class Capitulo4_ejercicio23 {
    public static void main(String[] args) {
        //Dados los valores A, B y C que son los parámetros de una ecuación de segundo grado,
        //elaborar un algoritmo para hallar las posibles soluciones de dicha ecuación
        double A, B, C, solucion1, solucion2;


        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de A: ");
        A = entrada.nextDouble();

        System.out.println("Ingrese el valor de B: ");
        B = entrada.nextDouble();

        System.out.println("Ingrese el valor de C: ");
        C = entrada.nextDouble();

        entrada.close();

        double v = Math.pow(B,2)-4*A*C;
        solucion1 = (-B + Math.sqrt(v))/(2*A);
        solucion2 = (-B - Math.sqrt(v))/(2*A);

        System.out.printf("Las soluciones son:\n%.2f\n%.2f", solucion1,solucion2);
    }
}
