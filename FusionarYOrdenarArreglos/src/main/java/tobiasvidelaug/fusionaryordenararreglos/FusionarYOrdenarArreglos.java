package tobiasvidelaug.fusionaryordenararreglos;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author tobias
 * 
 * Leer dos series de 10 enteros, que estarán ordenados crecientemente. Copiar 
 * (fusionar) las dos tablas en una tercera, de forma que sigan ordenados.
 */

public class FusionarYOrdenarArreglos {

    public static void main(String[] args) {
        int a[] = new int[10], b[] = new int[10], c[] = new int[20];
        boolean creciente = true;
        
        //Primer arreglo
        JOptionPane.showMessageDialog(null,"Digite el primer arreglo:");
        do{
            for(int i=0; i<a.length; i++){
                a[i] = Integer.parseInt(JOptionPane.showInputDialog((i+1)+". Digite un número entero: "));
            }
            for(int i=0; i<(a.length-1); i++){
                if(a[i] > a[i+1]){
                    creciente = false;
                    JOptionPane.showMessageDialog(null, "Los números deben ser introducidos de forma creciente.");
                    break;
                } else {
                    creciente = true;
                }
            }
        } while (!creciente);
        //Segundo arreglo
        creciente = true; //resetear condición de creciente para el segundo arreglo
        JOptionPane.showMessageDialog(null,"Digite el segundo arreglo:");
        do{
            for(int i=0; i<b.length; i++){
                b[i] = Integer.parseInt(JOptionPane.showInputDialog((i+1)+". Digite un número entero: "));
            }
            for(int i=0; i<(b.length-1); i++){
                if(b[i] > b[i+1]){
                    creciente = false;
                    JOptionPane.showMessageDialog(null, "Los números deben ser introducidos de forma creciente.");
                    break;
                } else {
                    creciente = true;
                }
            }
        } while (!creciente);
        
        //fusionar arreglos a y b en el arreglo c
        for(int i=0, j=0; i<c.length; i+=2, j++){//avanzar de dos en dos
            c[i] = a[j];
            c[i+1] = b[j];
        }
        //ordenar arreglo c con el método BubbleSort u OrdenamientoBurbuja
        for(int i=0; i<c.length; i++){
            for(int j=c.length-1; j>i; j--){
                if(c[j-1] > c[j]){
                    int temp = c[j-1];
                    c[j-1] = c[j];
                    c[j] = temp;
                }
            }
        }
        
        //Mostrar datos en c
        String arreglo = Arrays.toString(c);//convertimos c en un string y lo asignamos a una variable a imprimir por pantalla
        JOptionPane.showMessageDialog(null, "El arreglo c:\n"+arreglo);
        /*
        for(int i: c){
            System.out.print(i+" ");
        }
        System.out.println();
        */
    }
}
