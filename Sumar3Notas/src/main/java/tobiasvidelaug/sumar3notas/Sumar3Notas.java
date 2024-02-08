/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tobiasvidelaug.sumar3notas;

import java.util.Scanner;

/**
 *
 * @author tobias
 */

/*
Hacer un programa que calcule e imprima la suma de tres calificaciones.
*/

public class Sumar3Notas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] notas = {0.0, 0.0, 0.0};
        
        System.out.println("");
        System.out.println("Digite 3 calificaciones: ");
        notas[0] = entrada.nextDouble();
        notas[1] = entrada.nextDouble();
        notas[2] = entrada.nextDouble();
        
        double suma = 0;
        
        for (double nota: notas) {
            suma += nota;
        }
        System.out.println("\n La suma de las calificaciones ingresadas es: "+suma);
        //Extra
        System.out.println("");
        System.out.println("\n Salario Semanal");
        System.out.println("\nDigite sus horas semanales trabajadas: ");
        float hSemana = entrada.nextFloat();
        System.out.println("\nDigite su salario por hora trabajada: ");
        float salarioHora = entrada.nextFloat();
        float salarioFinal = hSemana * salarioHora;
        System.out.println("Salario semanal: "+salarioFinal);
        System.out.println("");
    }
}
