package CalculadoraRendimientos;

public class Rendimiento {
    private final double montoInicial;
    private final double interesAnual;
    private final int dias;

    public Rendimiento(double montoInicial, double interesAnual, int dias) {
        this.montoInicial = montoInicial;
        this.interesAnual = interesAnual / 100;
        this.dias = dias;
    }

    public double getMontoInicial() {
        return montoInicial;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public int getDias() {
        return dias;
    }
    
    public double rendimiento() {
        double monto = montoInicial;
        for (int i = 0; i < dias; i++) {
            monto += (monto * interesAnual) / 365;
        }
        return monto;
    }

    @Override
    public String toString() {
        return "Monto Inicial: $" + montoInicial +
                "\nInterés Anual: %" + interesAnual*100 +
                "\nDías: " + dias + 
                "\nRendimiento (monto final aproximado)= " + rendimiento() + "\n";
    }
}
