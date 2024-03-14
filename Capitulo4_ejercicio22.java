package Actividad_2;

import java.util.Scanner;

public class Capitulo4_ejercicio22 {
    public static void main(String[] args) {
        String nombre_empleado;
        double salario_por_hora, numero_horas_trabajada, salario_total;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado: ");
        nombre_empleado = entrada.nextLine();

        System.out.println("ingrese el salario básico por hora: ");
        salario_por_hora = entrada.nextDouble();

        System.out.println("Ingrese el número de horas trabajadas: ");
        numero_horas_trabajada = entrada.nextDouble();

        entrada.close();

        salario_total = salario_por_hora * numero_horas_trabajada;

        System.out.printf("Nombre del empleado: %s\n",nombre_empleado);

        if (salario_total > 450000){
            System.out.printf("Salario total: %.2f",salario_total);
        }
    }
}
