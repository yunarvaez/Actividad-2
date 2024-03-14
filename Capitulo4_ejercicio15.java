package Actividad_2;

import java.util.Scanner;

public class Capitulo4_ejercicio15 {
    public static void main(String[] args) {
        double A, B, C, D;

        Scanner entrada = new Scanner(System.in);

        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();
        D = entrada.nextDouble();

        entrada.close();

        if (A == B && A == C) {
            if (D > A){
                System.out.println("La esfera D es la diferente y es de mayor peso.");
            } else {
                System.out.println("La esfera D es la diferente y es de menor peso.");
            }
        } else if (A == B && A == D) {
            if (C > A){
                System.out.println("La esfera C es la diferente y es de mayor peso.");
            } else {
                System.out.println("La esfera C es la diferente y es de menor peso.");
            }
        } else if (A == C && A== D) {
            if (B > A){
                System.out.println("La esfera B es la diferente y es de mayor peso.");
            } else {
                System.out.println("La esfera B es la diferente y es de menor peso.");
            }
        } else {
            if (A > B){
                System.out.println("La esfera A es la diferente y es de mayor peso.");
            } else {
                System.out.println("La esfera A es la diferente y es de menor peso.");
            }
        }
    }
}
