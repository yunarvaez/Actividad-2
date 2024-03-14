package Actividad_2;

import java.util.Scanner;

public class Capitulo3_ejercicio19 {
    public static void main(String[] args) {
        double  lado, perimetro,area,altura;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor del lado del triángulo equilátero: ");
        lado = entrada.nextDouble();

        entrada.close();

        perimetro = lado * 3;
        altura = Math.sqrt((Math.pow(lado,2))-Math.pow(lado/2,2)); //Hallamos el valor de la altura mediante el teorema de Pitágoras
        area = (lado*altura)/2;
        System.out.printf("Perímetro del triángulo: %.2f\nAltura del triángulo: %.2f\nÁrea del triángulo: %.2f", perimetro,altura,area);
    }
}
