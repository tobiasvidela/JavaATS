package Vehiculos;

public class Main {
    public static void main(String[] args) {
        Vehiculo misVehiculos[] = new Vehiculo[4];
        
        misVehiculos[0] = new Vehiculo("AG6","Ford","T");
        misVehiculos[1] = new VehiculoTurismo("AG6","Ford","T",4);
        misVehiculos[2] = new VehiculoDeportivo("AG6","Ford","T",500);
        misVehiculos[3] = new VehiculoFurgoneta("AG6","Ford","T",2000);
        
        for (Vehiculo vehiculo : misVehiculos) {
            System.out.println(vehiculo.mostrarDatos());
        }
    }
}
