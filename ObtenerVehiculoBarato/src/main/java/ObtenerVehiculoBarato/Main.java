package ObtenerVehiculoBarato;

import javax.swing.JOptionPane;

public class Main {
    
    public static void ingresarVehiculos(int totalVehiculos, Vehiculo[] vehiculos) {
        int vehiculosIngresados = 0;
        
        JOptionPane.showMessageDialog(null, "A continuación, ingrese los vehículos (marca, modelo, precio)", "Ingresar Vehículo", JOptionPane.PLAIN_MESSAGE);
        
        do {
            String marca = JOptionPane.showInputDialog(null, "Indique la marca del vehículo: ", "Ingresar Vehículo "+(vehiculosIngresados+1), JOptionPane.PLAIN_MESSAGE);
            String modelo = JOptionPane.showInputDialog(null, "Indique el modelo del vehículo: ", "Ingresar Vehículo "+(vehiculosIngresados+1), JOptionPane.PLAIN_MESSAGE);
            float precio = Float.parseFloat(JOptionPane.showInputDialog(null, "Indique el precio del vehículo: ", "Ingresar Vehículo "+(vehiculosIngresados+1), JOptionPane.PLAIN_MESSAGE));
            
            vehiculos[vehiculosIngresados] = new Vehiculo(marca, modelo, precio);
            
            vehiculosIngresados++;
        } while (vehiculosIngresados < totalVehiculos);
    }
    
    public static void mostrarVehiculoMasBarato(Vehiculo[] vehiculos) {
        float menorPrecio = Float.MAX_VALUE;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPrecio() < menorPrecio) {
                menorPrecio = vehiculo.getPrecio();
            }
        }
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPrecio() == menorPrecio) {
                JOptionPane.showMessageDialog(null, vehiculo.mostrarDatos(), "Vehiculo Más Barato", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        int totalVehiculos;
        Vehiculo vehiculos[];
                
        Integer si_no = JOptionPane.showConfirmDialog(null, "", "Encontrar Vehículo Más Barato", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (si_no == 0) {
            totalVehiculos = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos vehículos desea agregar?", "Vehiculos", JOptionPane.QUESTION_MESSAGE));
            vehiculos = new Vehiculo[totalVehiculos];

            ingresarVehiculos(totalVehiculos, vehiculos);
            mostrarVehiculoMasBarato(vehiculos);
        }
    }
}
