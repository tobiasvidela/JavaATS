package tobiasvidelaug.trasponermatriz;

import java.util.Scanner;

public class TrasponerMatriz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int traspuesta[][] = new int[3][3];
        
        System.out.println("Digite la matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("\nMatriz Original:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        
        //trasponer matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }
        
        System.out.println("\nMatriz Traspuesta:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(traspuesta[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
