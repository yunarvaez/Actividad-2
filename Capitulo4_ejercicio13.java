package Actividad_2;

import java.util.Scanner;

public class Capitulo4_ejercicio13 {
    public static void main(String[] args) {
        double valor_compra, valor_a_pagar, porcentaje_descuento;
        String color;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor de la compra: ");
        valor_compra = entrada.nextDouble();

        entrada.nextLine();

        System.out.println("Ingrese el color de la bolita: ");
        color = entrada.nextLine();

        entrada.close();

        if (color.equals("blanco")) {
            porcentaje_descuento = 0;
        } else if (color.equals("verde")) {
            porcentaje_descuento = 10;
        } else if (color.equals("amarillo")) {
            porcentaje_descuento = 25;
        } else if (color.equals("azul")) {
            porcentaje_descuento = 50;
        } else {
            porcentaje_descuento = 100;
        }
        valor_a_pagar = valor_compra - (valor_compra*(porcentaje_descuento/100));
        System.out.printf("El cliente debe pagar: $%.2f", valor_a_pagar);
    }
}
