package ClasesYObjetos;

import javax.swing.*;

public class CalculadoraBasica {
    int opcion;
    public void iniciar() {
        String opciones[] = {"1. Sumar","2. Restar","3. Multiplicar","4. Dividir","0. Salir"};
        do{
            opcion = ((String) JOptionPane.showInputDialog(null, """
                                                                                              Bienvenido!
                                                                                                                                  
                                                                 Puedes presionar "1" y "Enter" para sumar,
                                                                 o también hacer click en la opción de
                                                                 debajo y luego en "Aceptar".
                                                                 
                                                                 """, "Calculadora Básica", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0])).charAt(0);
            //arreglar codigo ascii de opcion
            switch (opcion) {
                case 48 -> opcion = 0;
                case 49 -> opcion = 1;
                case 50 -> opcion = 2;
                case 51 -> opcion = 3;
                case 52 -> opcion = 4;
                default -> opcion = 0;
            }
            if (opcion != 0) {
                operar(opcion);
            }
        } while(opcion != 0);
    }
    public void operar(int opcion) {
        //pedir números para operar
        double num1, num2, resultado;
        num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite un número: ", "Número 1", JOptionPane.PLAIN_MESSAGE));
        num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite un número: ", "Número 2", JOptionPane.PLAIN_MESSAGE));
        Operacion op = new Operacion();
        
        switch (opcion) {
            case 1:
                resultado = op.sumar(num1, num2);
                JOptionPane.showMessageDialog(null, resultado, ("Suma de "+num1+" y "+num2), JOptionPane.PLAIN_MESSAGE);
                break;
            case 2:
                resultado = op.restar(num1, num2);
                JOptionPane.showMessageDialog(null, resultado, ("Resta de "+num1+" y "+num2), JOptionPane.PLAIN_MESSAGE);
                break;
            case 3:
                resultado = op.multiplicar(num1, num2);
                JOptionPane.showMessageDialog(null, resultado, ("Multiplicación de "+num1+" y "+num2), JOptionPane.PLAIN_MESSAGE);
                break;
            case 4:
                while (num2 == 0) {
                    JOptionPane.showMessageDialog(null, "No se puede dividir por cero.", "Error", JOptionPane.ERROR_MESSAGE);
                    num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite un número: ", "Número 2", JOptionPane.PLAIN_MESSAGE));
                }
                resultado = op.dividir(num1, num2);
                JOptionPane.showMessageDialog(null, resultado, ("División de "+num1+" y "+num2), JOptionPane.PLAIN_MESSAGE);
                break;
            case 0:
            default:
                break;
        }
    }
}
