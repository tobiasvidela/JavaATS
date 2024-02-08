package tobiasvidelaug.matrizmarco;

import javax.swing.JOptionPane;

/**
 *
 * @author tobias
 * 
 * Crear una matriz "marco" de tamaño nxn: todos sus elementos deben ser 0
 * salvo los de los bordes que deben ser 1. Mostrarla. Recordar que el 
 * numero de filas es la altura y el numero de columnas es la base o ancho.
 */

public class MatrizMarco {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Crea un marco\nElige la base y la altura:");
        int base = Integer.parseInt(JOptionPane.showInputDialog("Digite la base: "));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite la altura: "));
        int marco[][] = new int[altura][base];
        //cargar matriz
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == (altura - 1) || j == 0 || j == (base - 1)) {
                    marco[i][j] = 1;
                } else {
                    marco[i][j] = 0;
                }
            }
        }
        //mostrar matriz
        System.out.println("Matriz Marco:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print(marco[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
