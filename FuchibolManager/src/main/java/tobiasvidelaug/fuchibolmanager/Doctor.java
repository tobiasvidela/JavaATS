package tobiasvidelaug.fuchibolmanager;

public class Doctor extends Persona {
    private String titulo;
    private int expYears;

    public Doctor(String titulo, int expYears, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.titulo = titulo;
        this.expYears = expYears;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getExpYears() {
        return expYears;
    }

    public void setExpYears(int expYears) {
        this.expYears = expYears;
    }

    @Override
    public String toString() {
        return "Doctor: \n" + super.toString() + "\nTítulo: " + titulo + "\nAños de Experiencia: " + expYears + "\n";
    }
}
