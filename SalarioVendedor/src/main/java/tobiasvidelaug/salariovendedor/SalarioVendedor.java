/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tobiasvidelaug.salariovendedor;

import java.util.Scanner;

/**
 *
 * @author tobias
 */

/*
Una compañía de venta de autos usados paga a su personal de ventas un salario de
$1000 mensuales, más una comisión de $150 po cada auto vendido, más el 5% del 
valor de la venta por auto. Cada mes el capturista de la empresa ingresa en la 
computadora los datos pertinentes. Hacer un programa que calcule e imprima el 
salario mensual de un vendedor dado.
*/

public class SalarioVendedor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int salarioMensual = 1000;
        
        System.out.println(" Ingrese el nombre del vendedor: ");
        String nombre = entrada.nextLine();
        System.out.println(" Ingrese la cantidad de autos vendidos: ");
        int autosVendidos = entrada.nextInt();
        System.out.println(" Ingrese el valor total de las ventas: ");
        double valorTotalDeVentas = entrada.nextDouble();
        
        double SalarioMensualFinal = salarioMensual + 150*autosVendidos + 0.05*valorTotalDeVentas;
        
        System.out.println("\n El salario mensual de "+nombre+" es de: "+SalarioMensualFinal);
        System.out.println("");
    }
}
