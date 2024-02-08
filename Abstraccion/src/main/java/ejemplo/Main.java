package ejemplo;

public class Main {
    public static void main(String[] args) {
        Planta planta = new Planta();
        AnimalCarnivoro animalC = new AnimalCarnivoro();
        AnimalHerbivoro animalH = new AnimalHerbivoro();
        
        planta.alimentarse();
        animalC.alimentarse();
        animalH.alimentarse();
    }
}
