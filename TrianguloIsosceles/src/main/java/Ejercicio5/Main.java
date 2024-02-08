package Ejercicio5;

import java.util.Scanner;

public class Main {
    
    public static double mayorArea(TrianguloIsosceles[] triangulos) {
        double mayorArea = Double.MIN_NORMAL;
        for (TrianguloIsosceles triangulo : triangulos) {
            if (triangulo.getArea() > mayorArea) {
                mayorArea = triangulo.getArea();
            }
        }
        return mayorArea;
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base, lado;
        int numeroTriangulos;
        
        System.out.print("¿Cuántos triángulos va a ingresar? ");
        numeroTriangulos = entrada.nextInt();
        
        TrianguloIsosceles triangulos[] = new TrianguloIsosceles[numeroTriangulos];
        
        for (int i = 0; i < triangulos.length; i++) {
            System.out.println("\nDigite los valores para el triángulo "+(i+1)+":");
            System.out.print("Base: ");
            base = entrada.nextDouble();
            System.out.print("Lado: ");
            lado = entrada.nextDouble();
            
            triangulos[i] = new TrianguloIsosceles(base,lado);
            
            System.out.print("\nPerimetro: "+triangulos[i].getPerimetro());
            System.out.print("\nÁrea: "+triangulos[i].getArea()+"\n");
        }
        
        double mayorArea = mayorArea(triangulos);
                
        System.out.print("\nEl mayor area es: "+mayorArea);
    }
}
