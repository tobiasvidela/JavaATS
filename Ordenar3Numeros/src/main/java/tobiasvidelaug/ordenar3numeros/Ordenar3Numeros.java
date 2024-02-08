/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tobiasvidelaug.ordenar3numeros;

import javax.swing.JOptionPane;

/**
 *
 * @author tobias
 */

/*
Pedir y ordenar de mayor a menor tres números.
*/

public class Ordenar3Numeros {

    public static void main(String[] args) {
        int num1, num2, num3;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        if((num1 > num2) && (num2 > num3)){
            JOptionPane.showMessageDialog(null, " Orden: "+num1+" - "+num2+" - "+num3);
        } else if((num1 > num3) && (num3 > num2)){
            JOptionPane.showMessageDialog(null, " Orden: "+num1+" - "+num3+" - "+num2);
        } else if((num2 > num3) && (num3 > num1)){
            JOptionPane.showMessageDialog(null, " Orden: "+num2+" - "+num3+" - "+num1);
        } else if((num2 > num1) && (num1 > num3)){
            JOptionPane.showMessageDialog(null, " Orden: "+num2+" - "+num1+" - "+num3);
        } else if((num3 > num1) && (num1 > num2)){
            JOptionPane.showMessageDialog(null, " Orden: "+num3+" - "+num1+" - "+num2);
        } else {
            JOptionPane.showMessageDialog(null, " Orden: "+num3+" - "+num2+" - "+num1);
        }
    }
}
