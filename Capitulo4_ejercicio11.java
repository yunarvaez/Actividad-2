package Actividad_2;

import java.util.Scanner;

public class Capitulo4_ejercicio11 {
    public static void main(String[] args) {
        int num1, num2, num3, mayor;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        num1 = entrada.nextInt();

        System.out.println("Ingrese el segundo número: ");
        num2 = entrada.nextInt();

        System.out.println("Ingrese el tercer número: ");
        num3 = entrada.nextInt();

        entrada.close();

        if(num1 > num2 && num1 > num3){
            mayor = num1;
        } else if (num2 > num3) {
            mayor = num2;
        }else{
            mayor = num3;
        }
        System.out.printf("El valor mayor entre %d, %d y %d es %d.", num1, num2, num3, mayor);
    }
}

