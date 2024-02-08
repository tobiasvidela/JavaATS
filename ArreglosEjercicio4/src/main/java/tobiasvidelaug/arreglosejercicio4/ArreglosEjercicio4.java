/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tobiasvidelaug.arreglosejercicio4;

import javax.swing.JOptionPane;

/**
Leer 10 nros enteros, guardarlos en un arreglo. Debemos mostrarlos en el 
siguiente orden: el primero, el último, el segundo, el penúltimo, el tercero,
etc.
*/

public class ArreglosEjercicio4 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "¡Diez enteros en un orden especial!");
        //crear arreglo y pedir al usuario que lo complete
        int[] numeros = new int[10];
        for(int i=0; i<numeros.length; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog((i+1)+". Digite un número: "));
        }
        //Mostrar arreglo en el orden especial
        JOptionPane.showMessageDialog(null, " Revise la consola.");
        
        for(int i=1; i<=5; i++){
            System.out.print(" "+numeros[i-1]+", "+numeros[(numeros.length - i)]+",");
        }
        System.out.println("");
    }
}
