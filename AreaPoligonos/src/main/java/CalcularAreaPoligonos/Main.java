package CalcularAreaPoligonos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Lista enlazada o Arreglo dinámico
    static ArrayList<Poligono> poligono = new ArrayList<>();
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        //llenar un poligono
        llenarPoligono();
        
        mostrarResultados();
    }
    
    public static void llenarPoligono() {
        int opcion;
        char respuesta;
        do {
            do {
                System.out.println("Digite qué polígono desea");
                System.out.println("1. Triángulo");
                System.out.println("2. Rectángulo");
                System.out.print("Opción: ");
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1 -> {
                        //llenar un triángulo
                        llenarTriangulo();
                    }
                    case 2 -> {
                        //llenar un rectángulo
                        llenarRectangulo();
                    }
                }
            } while (opcion < 1 || opcion > 2);
            
            System.out.print("¿Seguir introduciendo polígonos? (s/n): ");
            respuesta = entrada.next().charAt(0);
            System.out.println("");
        } while (respuesta == 's' || respuesta == 'S');
    }
    
    public static void llenarTriangulo() {
        double lado1, lado2, lado3;
        
        System.out.print("Digite el lado1 del triángulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("Digite el lado2 del triángulo: ");
        lado2 = entrada.nextDouble();
        System.out.print("Digite el lado3 del triángulo: ");
        lado3 = entrada.nextDouble();
        
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        poligono.add(triangulo);
    }
    
    public static void llenarRectangulo() {
        double lado1, lado2;
        
        System.out.print("Digite el lado1 del rectángulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("Digite el lado2 del rectángulo: ");
        lado2 = entrada.nextDouble();
        
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        poligono.add(rectangulo);
    }
    
    public static void mostrarResultados() {
        for(Poligono poli : poligono){
            System.out.println(poli.toString()); //Mostrar datos del polígono
            System.out.println("Area: "+poli.area()+"\n"); //Mostrar Area del polígono
        }
    }
}
