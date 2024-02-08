/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tobiasvidelaug.cuadradodeunasuma;

import java.util.Scanner;

/**
 *
 * @author tobias
 */

/*
Hacer un programa que calcule el cuadrado de una suma:
    (a+b)²=a²+2ab+b²
*/

public class CuadradoDeUnaSuma {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.println("Ingrese dos números:");
        double a = in.nextDouble();
        double b = in.nextDouble();
        
        double cuadradoBinomio = 2*a*b + Math.pow(a,2) + Math.pow(b,2);
        
        System.out.println("");
        System.out.println("El cuadrado de la suma de "+a+" y "+b+" es: "+cuadradoBinomio);
        System.out.println("");
    }
}
