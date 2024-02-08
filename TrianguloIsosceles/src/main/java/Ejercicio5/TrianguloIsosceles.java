
package Ejercicio5;

public class TrianguloIsosceles {
    private double base;
    private double lado;

    public TrianguloIsosceles(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }
    
    public double getPerimetro() {
        return base + (lado * 2);
    }
    
    public double getArea() {
        return ((base * Math.sqrt((lado * lado) - ((base * base) / 4))) / 2);
    }
    
    public String mostrarDatos() {
        return "Base: "+base+"\nLado: "+lado+"\nPerimetro: "+getPerimetro()+"\nArea: "+getArea();
    }
}
