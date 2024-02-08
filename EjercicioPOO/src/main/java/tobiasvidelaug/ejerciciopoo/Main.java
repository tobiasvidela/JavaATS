/**
 * Construir un programa que calcule el área y le perímetro de un cuadrilátero
 * dada la longitud de sus dos lados. Los valores de la longitud deberán 
 * introducirse por línea de órdenes. Si es un cuadrado, sólo se proporcionará 
 * la longitud de uno de sus lados al constructor.
 */

package tobiasvidelaug.ejerciciopoo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cuadrilatero cuadrilatero1;
        
        float lado1, lado2;
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 1: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 2: "));
        
        if(lado1 == lado2) {
            cuadrilatero1 = new Cuadrilatero(lado1);
        } else {
            cuadrilatero1 = new Cuadrilatero(lado1,lado2);
        }
        
        JOptionPane.showMessageDialog(null, "El perímetro del cuadrilátero es: "+cuadrilatero1.getPerimetro()+"\nEl área es: "+cuadrilatero1.getArea(), "Cuadrilátero", JOptionPane.PLAIN_MESSAGE);
    }
}
