package CalculadoraRendimientos;

import javax.swing.JOptionPane;

public class Main {
    static Integer dias;
    static double montoInicial, interesAnual;
    
    public static void main(String[] args) {
        iniciarCalculadora();
    }
    
    public static void iniciarCalculadora() {
        Integer keepCalculating;
        do {
            keepCalculating = JOptionPane.showConfirmDialog(null, "Calcula rendimientos en base a: \n- Monto Inicial\n- Interés Anual\n- Días", "Calculadora de Rendimientos", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (keepCalculating == 0) {
                pedirDatos();
                mostrarResultados();
            }
        } while (keepCalculating == 0);
    }
    
    public static void pedirDatos() {
        montoInicial = pedirMontoInicial();
        interesAnual = pedirInteresAnual();
        dias = pedirDias();
    }
    
    public static double pedirMontoInicial() {
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el Monto Inicial: (####.##)", "Monto Inicial", JOptionPane.PLAIN_MESSAGE));
        return valor;
    }
    
    public static double pedirInteresAnual() {
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el Interés Anual: (##.##)", "Interés Anual", JOptionPane.PLAIN_MESSAGE));
        return valor;
    }
    
    public static int pedirDias() {
        int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el número de días: (#)", "Días", JOptionPane.PLAIN_MESSAGE));
        return valor;
    }
    
    public static void mostrarResultados() {
        Rendimiento resultados = new Rendimiento(montoInicial, interesAnual, dias);
        JOptionPane.showMessageDialog(null, resultados.toString(), "Resultados", JOptionPane.PLAIN_MESSAGE);
    }
}
