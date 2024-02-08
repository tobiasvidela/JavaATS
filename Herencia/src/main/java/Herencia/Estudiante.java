package Herencia;

public class Estudiante extends Persona {
    private int codigo;
    private float notaFinal;

    //Constructor
    public Estudiante(String nombre, String apellidos, int edad, int codigo, float notaFinal) {
        super(nombre, apellidos, edad);
        this.codigo = codigo;
        this.notaFinal = notaFinal;
    }
    
    public void mostrarDatos() {
        System.out.println("Datos del Estudiante:");
        System.out.print("\nNombre: "+nombre);
        System.out.print("\nApellidos: "+apellidos);
        System.out.print("\nEdad: "+edad);
        System.out.print("\nCodigo: "+codigo);
        System.out.print("\nNota Final: "+notaFinal);
        System.out.println("");
    }
}
