
package tobiasvidelaug.settersygetters;

public class Clase1 {
    private int edad;
    private final String nombre;

    public Clase1(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
}
