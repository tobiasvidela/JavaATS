package tobiasvidelaug.proyectojava1;

import javax.swing.JOptionPane;

/**
 *
 * @author tobias
 *
 *  guarda hasta que encuentre un espacio:
 *  String name = entrada.next();
 *
 *  para un char debo usar:
 *  char letra;
 *  letra = entrada.next().charAt(0);
 *
 */

public class ProyectoJava1 {

    public static void main(String[] args) {
        //JOptionPane
        
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        cadena = JOptionPane.showInputDialog("Ingrese una cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));
        
        JOptionPane.showMessageDialog(null,"La cadena es: "+cadena);
        JOptionPane.showMessageDialog(null,"El entero es: "+entero);
        JOptionPane.showMessageDialog(null,"La letra es: "+letra);
        JOptionPane.showMessageDialog(null,"El decimal es: "+decimal);
    }
}
