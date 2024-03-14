package Actividad_2;

import java.util.Scanner;

public class Capitulo3_ejercicio18 {
    public static void main(String[] args) {
        int codigo;
        String nombres;
        double numero_horas_trabajadas_mes, valor_hora_trabajada, porcentaje_retencion, salario_bruto, salario_neto;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el código del empleado: ");
        codigo = entrada.nextInt();

        entrada.nextLine(); //consumo de línea

        System.out.println("Ingrese los nombres del empleado: ");
        nombres = entrada.nextLine();

        System.out.println("Ingrese el número de horas trabajadas al mes: ");
        numero_horas_trabajadas_mes = entrada.nextDouble();

        System.out.println("Ingrese el valor por hora trabajada: ");
        valor_hora_trabajada = entrada.nextDouble();

        System.out.println("Ingrese el porcentaje de retención en la fuente: ");
        porcentaje_retencion = entrada.nextDouble();

        entrada.close();

        salario_bruto = valor_hora_trabajada * numero_horas_trabajadas_mes;
        salario_neto = salario_bruto - (salario_bruto * (porcentaje_retencion / 100));
        System.out.printf("Código: %s\nNombres: %s\nSalario bruto: %.2f\nSalario neto: %.2f", codigo, nombres, salario_bruto, salario_neto);
    }
}
