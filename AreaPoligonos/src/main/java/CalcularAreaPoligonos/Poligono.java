package CalcularAreaPoligonos;

public abstract class Poligono {
    protected int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    @Override
    public String toString() {
        return "Numero de Lados: " + numeroLados;
    }
    
    public int getNumeroLados() {
        return numeroLados;
    }
    
    public abstract double area();
}
