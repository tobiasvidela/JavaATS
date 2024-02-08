package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Operacion {
    //Métodos
    public double sumar(double num1, double num2) {
        return num1 + num2;
    }
    public double restar(double num1, double num2) {
        return num1 - num2;
    }
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }
    public double dividir(double num1, double num2) {
        if (num2 == 0) {
            return 0.0;
        } else {
            return num1 / num2;
        }
    }    
}
