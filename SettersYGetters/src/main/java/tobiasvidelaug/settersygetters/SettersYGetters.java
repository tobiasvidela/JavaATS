
package tobiasvidelaug.settersygetters;

public class SettersYGetters {

    public static void main(String[] args) {
        Clase1 objeto1 = new Clase1(21,"Tobías");
        
        objeto1.setEdad(22);
        System.out.println("La edad es: "+objeto1.getEdad());
        System.out.println("El nombre es: "+objeto1.getNombre());
    }
}
