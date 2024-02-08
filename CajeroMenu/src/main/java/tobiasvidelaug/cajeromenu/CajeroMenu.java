/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tobiasvidelaug.cajeromenu;

import javax.swing.JOptionPane;

/**
 *
 * @author tobias
 */

/*
Hacer un programa que simule un cajero automático con un saldo inicial de $1000,
con el siguiente menú de opciones:
    1. Ingresar dinero a la cuenta
    2. Retirar dinero de la cuenta
    3. Salir
*/

public class CajeroMenu {

    public static void main(String[] args) {
        final int saldoInicial = 1000;
        int opcion;
        float ingreso, retiro, saldoActual = saldoInicial;
        
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                  Cajero Automático
                                                                  \t1. Ingresar dinero a la cuenta
                                                                  \t2. Retirar dinero de la cuenta
                                                                  \t3. Salir"""));
            switch(opcion){
                case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea ingresar: "));
                        saldoActual += ingreso;
                        JOptionPane.showMessageDialog(null, "Dinero en cuenta: "+saldoActual);
                        break;
                case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea retirar: "));
                        if(retiro>saldoInicial){
                            JOptionPane.showMessageDialog(null,"No cuenta con el sueldo suficiente.");
                        } else {
                            saldoActual -= retiro;
                            JOptionPane.showMessageDialog(null, "Dinero en cuenta: "+saldoActual);
                        }
                case 3: break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
                    break;
            }
        } while (opcion != 3);
    }
}
