//Declaración de las excepciones de un método
package DeclaracionEnMetodo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
        
public class DeclaracionEnMetodo {
    
    public static void leerArchivo() throws FileNotFoundException { //cuando este método no va a capturar el error
        File archivo = new File("Path/texto.txt");
        FileReader fr = new FileReader(archivo);
    }
    
    public static void leerArchivo2() throws IOException { //este método tampoco va a capturar el error
        leerArchivo();
    }

    public static void main(String[] args) {
        
    }
}
