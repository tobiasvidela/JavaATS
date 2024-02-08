/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tobiasvidelaug.semanasdiashoras;

import java.util.Scanner;

/**
 *
 * @author tobias
 */

/*
Construir un progama que, dado un número total de horas, devuelve el número de
semanas, días y horas equivalentes. Por ejemplo, dado un total de 1000 horas, 
debe mostrar 5 semanas, 6 días y 16 horas
*/

public class SemanasDiasHoras {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.println("Ingrese el número total de horas: ");
        double totalHoras = in.nextFloat();
        double horas = totalHoras%24;
        double dias = Math.floor((totalHoras/24)%7);
        double semanas = Math.floor((totalHoras/24)/7);
        System.out.println(totalHoras+" horas son:");
        System.out.println(semanas+" semanas, "+dias+" días y "+horas+" horas.");
        System.out.println("");
        
        //SOLUCION ATS
        /*
        int horasTotales, semanas, dias, horas;
        
        semanas = horasTotales / 168;
        dias = horasTotales%168 / 24;
        horas = horasTotales%24;
        */
    }
}
