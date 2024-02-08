package tobiasvidelaug.tablero;

/**
 * 
 * @author tobias
 * 
 * Crear un programa que permita dirigir el movimiento de un objeto dentro de 
 * un tablero y actualice su posición dentro del mismo. Los movimientos posibles 
 * son ARRIBA, ABAJO, IZQUIERDA, y DERECHA. Tras cada movimiento el programa 
 * mostrará la nueva dirección elegida y las coordenadas de situación del 
 * objeto dentro del tablero.
 */

public class Main {
    public static void main(String[] args) {
        Tablero tab1 = new Tablero(5,5);
        tab1.iniciar();
    }
}
