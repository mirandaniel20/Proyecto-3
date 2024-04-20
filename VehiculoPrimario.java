/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto5tosemestres;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Wine
 */
public class VehiculoPrimario {
     private Map<String, Nodo> vehiculos;
    private int size;

    public VehiculoPrimario (int size) {
        this.size = size;
        this.vehiculos = new HashMap<>();
    }
public void insertarVehiculo(Scanner scanner) {
        System.out.println("Ingrese los datos del vehículo:");
        System.out.print("Placa: ");
        String placa = scanner.nextLine();
        System.out.print("Color: ");
        String color = scanner.nextLine();
        System.out.print("Línea: ");
        String linea = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Propietario: ");
        String propietario = scanner.nextLine();

        Vehiculo vehiculo = new Vehiculo(placa, color, linea, modelo, propietario);
        Nodo nodo = new Nodo(vehiculo);
        vehiculos.put(placa, nodo);
        System.out.println("Vehículo insertado con éxito.");
    }

    public void buscarVehiculo(Scanner scanner) {
        System.out.print("Ingrese la placa del vehículo a buscar: ");
        String placa = scanner.nextLine();
        Nodo nodo = vehiculos.get(placa);
        if (nodo != null) {
            System.out.println("Vehículo encontrado: " + nodo.getVehiculo());
        } else {
            System.out.println("Vehículo no encontrado.");
        }
    }

    public void eliminarVehiculo(Scanner scanner) {
        System.out.print("Ingrese la placa del vehículo a eliminar: ");
        String placa = scanner.nextLine();
        if (vehiculos.containsKey(placa)) {
            vehiculos.remove(placa);
            System.out.println("Vehículo eliminado con éxito.");
        } else {
            System.out.println("Vehículo no encontrado.");
        }
    }
    
   //public MatrizVehiculos() {
   // Inicializar todos los espacios como disponibles al principio
   //     for (int i = 0; i < 74; i++) {
   //         disponibles[i] = true;
   //     }
   // }

    
    }
