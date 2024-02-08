package Herencia;

public class Persona {
    //atributos accesibles por la misma clase y clases hijas
    protected String nombre;
    protected String apellidos;
    protected int edad;

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }
}
