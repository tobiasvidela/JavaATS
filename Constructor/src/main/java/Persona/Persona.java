package Persona;

public class Persona {
    String nombre;
    int edad;
    String dni;
    
    //Constructor (no lleva valor de retorno)

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String dni) {
        this.dni = dni;
    }
    
    public void correr() {
        System.out.println("Soy "+nombre+", tengo "+edad+" años y estoy corriendo una maratón.");
    }
    
    public void correr(int km) {
        System.out.println("He corrido "+km+" kilómetros.");
    }
    
    public void mostrarDatos() {
        System.out.println("El nombre es: "+this.nombre);
        System.out.println("La edad es: "+this.edad);
    }
}
