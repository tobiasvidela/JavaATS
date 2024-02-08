package tobiasvidelaug.matrizsimetrica;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MatrizSimetrica {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFil, nCol;
        boolean simetrica = true;
        
        nFil = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de columnas: "));
        
        matriz = new int[nFil][nCol];
        
        System.out.println("Digite la matriz:");
        for(int i=0; i<nFil; i++){
            for(int j=0; j<nCol; j++){
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        //Prueba de simetría
        if(nFil == nCol){ //si es matriz cuadrada
            //verificar si es igual a su traspuesta
            int i = 0, j;
            while(simetrica && i<nFil){
                j = 0;
                while(simetrica && j<i){
                    if(matriz[i][j] != matriz[j][i]){
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }
            if(simetrica){
                JOptionPane.showMessageDialog(null, "La matriz es simétrica.");
            } else {
                JOptionPane.showMessageDialog(null, "La matriz no es simétrica.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La matriz no es simétrica.");
        }
    }
}
