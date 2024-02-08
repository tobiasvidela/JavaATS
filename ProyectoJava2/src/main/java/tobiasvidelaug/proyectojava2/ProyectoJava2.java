package tobiasvidelaug.proyectojava2;

import java.util.Scanner;

/**
 *
 * @author tobias
 */

public class ProyectoJava2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("");
        System.out.println(" Ingrese un número: ");
        double numero = entrada.nextDouble();
        System.out.println("");
        double raiz = Math.sqrt(numero);
        //float -> int | double -> long
        long raizRedondeada = Math.round(raiz);
        System.out.println("La raíz de "+numero+" es: "+raiz);
        System.out.println("Redondeado es: "+raizRedondeada);
        double potencia = Math.pow(numero,2);
        System.out.println("El cuadrado de "+numero+" es: "+potencia);
        System.out.println("");
    }
}
