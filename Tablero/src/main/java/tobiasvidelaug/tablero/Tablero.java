
package tobiasvidelaug.tablero;

import javax.swing.JOptionPane;

public class Tablero {
    //pieza
    private final int pieza = 1;
    private final int vacio = 0;
    private static Object opcion = "Ninguna";
    //tablero
    private static int tablero[][];
    private static int posX;
    private static int posY;
    //movimientos
    private final String listaMovimientos[] = {"ARRIBA","IZQUIERDA","DERECHA","ABAJO","Salir"};
    private static String movimiento;
    //salir
    private static boolean seguirJugando = true;

    public Tablero(int largo, int alto) {
        //crear tablero del tamaño especificado por el usuario
        tablero = new int[alto][largo];//filas son el alto, y columnas son el largo
        //rellenar tablero, colocando la pieza en la esquina superior izquierda
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < largo; j++) {
                tablero[i][j] = vacio;
            }   
        }
    }
    
    public void iniciar() {
        posX = 0;
        posY = 0;
        tablero[posY][posX] = pieza;
        
        do{
            mostrarTablero();
            moverPieza();
        } while(seguirJugando);
    }
    
    public void mostrarTablero(){
        opcion = JOptionPane.showInputDialog(null, "\n"
                                            +tablero[0][0]+" "+tablero[0][1]+" "+tablero[0][2]+" "+tablero[0][3]+" "+tablero[0][4]+"\n"
                                            +tablero[1][0]+" "+tablero[1][1]+" "+tablero[1][2]+" "+tablero[1][3]+" "+tablero[1][4]+"\n"
                                            +tablero[2][0]+" "+tablero[2][1]+" "+tablero[2][2]+" "+tablero[2][3]+" "+tablero[2][4]+"          pos = "+"["+posY+"]["+posX+"]\n"
                                            +tablero[3][0]+" "+tablero[3][1]+" "+tablero[3][2]+" "+tablero[3][3]+" "+tablero[3][4]+"\n"
                                            +tablero[4][0]+" "+tablero[4][1]+" "+tablero[4][2]+" "+tablero[4][3]+" "+tablero[4][4]+"\n"
                                            +"\nDirección elegida: "+opcion+"\n"
                                            +"\n", "Tablero", JOptionPane.PLAIN_MESSAGE, null, listaMovimientos, listaMovimientos[0]);
        System.out.println(opcion);
        seguirJugando = !(opcion == null || opcion.toString().charAt(0) == 'S'); //cerrar cuando cancelar o la "x" sean clickeadas o sea seleccionado la opción "Salir"
    }
    
    public void moverPieza() {
        if (opcion == null) {
        } else {
            tablero[posY][posX] = vacio;
            movimiento = opcion.toString();
            switch (movimiento){
                case "ARRIBA" -> {
                    if (posY == 0) {
                        posY = 4;
                    } else {
                        posY--;
                    }
                }
                case "IZQUIERDA" -> {
                    if (posX == 0) {
                        posX = 4;
                    } else {
                        posX--;
                    }
                }
                case "DERECHA" -> {
                    if (posX == 4) {
                        posX = 0;
                    } else {
                        posX++;
                    }
                }
                case "ABAJO" -> {
                    if (posY == 4) {
                        posY = 0;
                    } else {
                        posY++;
                    }
                }
            }
            tablero[posY][posX] = pieza;
        }
    }
}
