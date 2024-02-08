package tobiasvidelaug.ordenamientoporinsercion;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class OrdenamientoPorInsercion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, posicion, temp;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de elementos: "));
        
        arreglo = new int[nElementos];
        
        System.out.println("Digite el arreglo");
        for(int i=0; i<nElementos; i++){
            System.out.print((i+1)+". Digite un número: ");
            arreglo[i] = entrada.nextInt();
        }
        
        //Ordenamiento por Inserción
        for(int i=0; i<nElementos; i++){
            posicion = i;
            temp = arreglo[i];
            
            while((posicion > 0) && (arreglo[posicion-1] > temp)){
                arreglo[posicion] = arreglo[posicion-1];
                posicion--;
            }
            arreglo[posicion] = temp;
        }
        String arregloOrdenado = Arrays.toString(arreglo);
        JOptionPane.showMessageDialog(null, "Arreglo ordenado: "+arregloOrdenado);
    }
}
