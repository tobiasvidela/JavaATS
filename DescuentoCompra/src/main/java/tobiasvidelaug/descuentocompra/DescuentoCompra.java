/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tobiasvidelaug.descuentocompra;

import javax.swing.JOptionPane;

/**
 *
 * @author tobias
 */

/*
En Megaplaza se hace un 20% de descuento a los clinetes cuya compra supere los 
$300. ¿Cuál será la cantidad que pagará una persona por su compra?
*/

public class DescuentoCompra {

    public static void main(String[] args) {
        double compra = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de su compra: "));
        if(compra >= 300) {
            compra -= compra * 0.2;
            JOptionPane.showMessageDialog(null,"El precio final de su compra es: "+compra);
        } else {
            JOptionPane.showMessageDialog(null,"El precio final de su compra es: "+compra);
        }
    }
}
