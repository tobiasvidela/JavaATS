//Try catch para excepciones verificadas

package TryCatch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
        
public class TryCatch {
    
    public void leerArchivo() throws FileNotFoundException, IOException { //declaración en método
        //File archivo = new File("/home/tobias/NetBeansProjects/ExcepcionesVerificadas/src/main/java/TryCatch/texto.txt");
        File archivo = new File("/home/tobias/NetBeansProjects/ExcepcionesVerificadas/src/main/java/TryCatch/texto.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(fr);
        String linea;
        
        while((linea = bf.readLine()) != null) {
            System.out.println(linea);
        }
    }
    
    public void leerArchivo2() {
        try { //todo lo que pueda tener excepciones verificadas, va aquí
            leerArchivo();
        } catch(FileNotFoundException ex) { //instanciamos un objeto de la clase más cercana
            JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo deseado, por favor revise la ruta/ubicación del archivo.");
        } catch(IOException e) { //clase padre de la anterior...
            JOptionPane.showMessageDialog(null, "Ha ocurrido una excepción verificada.");
        } finally {
            //se ejecuta siempre, indistintamente de si el try ha funcionado o no
        }
        //excepcion/es capturada/s y programa puede continaur ejecutándose tranquilamente
        
        System.out.println("Programa terminado.");
    }
    
    public static void main(String[] args) {
        TryCatch prueba = new TryCatch();
        
        prueba.leerArchivo2();
    }
}

