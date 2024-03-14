package Actividad_2;

import java.util.Scanner;

public class Capitulo4_ejercicio12 {
    public static void main(String[] args) {
        String nombre_trabajador;
        double numero_horas_trabajadas, valor_hora_trabajada, horas_extra, horas_extra_excedentes, salario;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre del trabajador: ");
        nombre_trabajador = entrada.nextLine();

        System.out.println("Ingrese el número de horas trabajadas: ");
        numero_horas_trabajadas = entrada.nextDouble();

        System.out.println("Ingrese el valor de cada hora trabajada: ");
        valor_hora_trabajada = entrada.nextDouble();

        entrada.close();

        if(numero_horas_trabajadas > 40) {
        horas_extra = numero_horas_trabajadas - 40;
        if(horas_extra>8){
            horas_extra_excedentes = horas_extra - 8;
            salario = (40*valor_hora_trabajada)+(16*valor_hora_trabajada)+(horas_extra_excedentes*3*valor_hora_trabajada);
        } else {
            salario = (40*valor_hora_trabajada)+(horas_extra*2*valor_hora_trabajada);
        }
        }else{
            salario = numero_horas_trabajadas*valor_hora_trabajada;
        }
        System.out.printf("El trabajador %s devengó $%.2f.",nombre_trabajador,salario);
    }
}
