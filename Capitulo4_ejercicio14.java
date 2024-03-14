package Actividad_2;

import java.util.Scanner;

public class Capitulo4_ejercicio14 {
    public static void main(String[] args) {
        double venta_depart1,venta_depart2, venta_depart3, salario_por_departamento, total_venta, porcentaje_ventas, salario1, salario2, salario3;

        Scanner entrada = new Scanner(System.in);
        venta_depart1 = entrada.nextDouble();

        venta_depart2 = entrada.nextDouble();

        venta_depart3 = entrada.nextDouble();

        salario_por_departamento = entrada.nextDouble();

        entrada.close();

        total_venta = venta_depart1 + venta_depart2 + venta_depart3;

        porcentaje_ventas = 0.33 * total_venta;

        if (venta_depart1 > porcentaje_ventas){
            salario1 = salario_por_departamento + 0.2 * salario_por_departamento;
        } else {
            salario1 = salario_por_departamento;
        }
        if (venta_depart2 > porcentaje_ventas){
            salario2 = salario_por_departamento + 0.2 * salario_por_departamento;
        } else {
            salario2 = salario_por_departamento;
        }
        if (venta_depart3 > porcentaje_ventas){
            salario3 = salario_por_departamento + 0.2 * salario_por_departamento;
        } else {
            salario3 = salario_por_departamento;
        }
        System.out.printf("Salario vendedores departamento 1: %.2f\nSalario vendedor departamento 2: %.2f\nSalario vendedor departamento 3: %.2f", salario1,salario2,salario3);
    }
}
