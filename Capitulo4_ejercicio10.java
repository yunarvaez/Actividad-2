package Actividad_2;

import java.util.Scanner;

public class Capitulo4_ejercicio10 {
    public static void main(String[] args) {
        int numero_inscripcion, estrato;
        double patrimonio, pago_por_matricula;
        String nombres;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el número de inscripción del estudiante: ");
        numero_inscripcion = entrada.nextInt();

        entrada.nextLine(); //consumo de línea

        System.out.println("Ingrese el nombre del estudiante: ");
        nombres = entrada.nextLine();

        System.out.println("Ingrese el patrimonio: ");
        patrimonio = entrada.nextDouble();

        System.out.println("Ingrese el estrato: ");
        estrato = entrada.nextInt();

        entrada.close();

        pago_por_matricula = 50000;
        if((patrimonio>2000000)&&(estrato>3)){
            pago_por_matricula = pago_por_matricula + patrimonio*0.03;
        }
        System.out.printf("El estudiante con número de inscripción %d y nombre %s debe pagar $%.2f.",numero_inscripcion, nombres, pago_por_matricula);
    }
}
