/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto5tosemestres;

import java.util.Scanner;

/**
 *
 * @author Wine
 */
public class PROYECTO5TOSEMESTRES {

    public static void main(String[] args) {
  int size = 100; // Tamaño de la matriz ortogonal
        VehiculoPrimario manager = new VehiculoPrimario(size);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de gestion de vehiculos.");

        while (true) {
            System.out.println("\nSeleccione una opcion:");
            System.out.println("1. Insertar vehiculo");
            System.out.println("2. Buscar vehiculo");
            System.out.println("3. Eliminar vehiculo");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    manager.insertarVehiculo(scanner);
                    break;
                case 2:
                    manager.buscarVehiculo(scanner);
                    break;
                case 3:
                    manager.eliminarVehiculo(scanner);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
