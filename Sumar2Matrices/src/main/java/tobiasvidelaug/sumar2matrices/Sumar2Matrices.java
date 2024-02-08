package tobiasvidelaug.sumar2matrices;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author tobias
 * 
 * Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma
 */
public class Sumar2Matrices {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        JOptionPane.showMessageDialog(null,"Suma de dos matrices 3x3");
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        
        JOptionPane.showMessageDialog(null, "Cargue la primera matriz: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("a["+i+"]["+j+"]: ");
                a[i][j] = entrada.nextInt();
            }
        }
        System.out.println("");
        JOptionPane.showMessageDialog(null, "Cargue la segunda matriz: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("b["+i+"]["+j+"]: ");
                b[i][j] = entrada.nextInt();
            }
        }
        
        //sumar las matrices a y b, guardarlo en c y mostrarlo por pantalla
        System.out.println("Suma de las matrices a y b: ");
        for(int i=0; i<3; i++){
            System.out.print(" ");
            for(int j=0; j<3; j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("");
    }
}
