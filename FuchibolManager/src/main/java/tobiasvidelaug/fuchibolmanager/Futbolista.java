package tobiasvidelaug.fuchibolmanager;

public class Futbolista extends Persona {
    private int dorsal;
    private String posicion;

    public Futbolista(int dorsal, String posicion, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    @Override
    public String toString() {
        return "Futbolista: \n" + super.toString() + "\nDorsal: " + dorsal + "\nPosición: " + posicion + "\n";
    }
}
