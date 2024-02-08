/**
 * @author tobias
Realizar un juego para adivinar un número. Para ello generar un número aleatorio
entre cero y cien, y luego ir pidiendo números indicando "es mayor" o "es menor"
según sea mayor o menor con respecto al número ingresado por el usuario. El 
proceso termina cuando el usuario acierta el y mostrar el número de intentos.
*/


package tobiasvidelaug.adivinarnumero0y100;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class AdivinarNumero0y100 {

    public static void main(String[] args) {
        int N = (int) (Math.random()*100); //genero un nro entre 0 y 100
        int intentos = 0;
        int ingreso;
        double puntaje, coeficiente = 1.95f;
        DecimalFormat formato = new DecimalFormat("#.##");
        String puntajeFormateado;
        
        JOptionPane.showMessageDialog(null, "¡Adivina un número entre 0 y 100!");
        //System.out.println(N); //DEBUG
        do{
            ingreso = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
            intentos++;
            
            if(ingreso < N){
                JOptionPane.showMessageDialog(null, "Te faltó, digite un número más alto.");
            } else if(ingreso > N) {
                JOptionPane.showMessageDialog(null, "Te pasaste, digite un número más bajo.");
            } else {
                if(intentos == 1){
                    puntaje = 100.0;
                } else {
                    puntaje = (coeficiente / intentos) * 100;
                }
                puntajeFormateado = formato.format(puntaje);
                JOptionPane.showMessageDialog(null, "Haz adivinado el número. ¡Felicidades!\n\n Intentos: "+intentos+"\n Puntaje: "+puntajeFormateado);
            }
        } while(ingreso != N);
    }
}
