package Actividad_2;

import java.util.Scanner;

public class Capitulo3_ejercicio21 {
    public static void main(String[] args) {
        double lado1,lado2,lado3,perimetro, semiperimetro, area;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese los valores de los lados del triángulo: ");
        lado1 = entrada.nextDouble();
        lado2 = entrada.nextDouble();
        lado3 = entrada.nextDouble();

        entrada.close();

        perimetro = lado1 + lado2 + lado3;
        semiperimetro = perimetro/2;
        area = Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3));
        System.out.printf("Perímetro: %.2f\nSemiperímetro : %.2f\nÁrea: %.3f",perimetro,semiperimetro,area);
    }
}
