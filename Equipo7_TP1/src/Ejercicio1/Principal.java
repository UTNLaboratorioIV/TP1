package Ejercicio1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        do {
            // Pedir datos al usuario
            System.out.print("Ingrese el nombre del empleado: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese la edad del empleado: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            // Crear empleado
            Empleado empleado = new Empleado(nombre, edad);

            // Mostrar datos del empleado
            System.out.println("\nDatos del empleado registrado:");
            System.out.println(empleado);

            // Preguntar si desea agregar otro empleado
            do {
                System.out.print("\n¿Desea ingresar otro empleado? (S/N): ");
                respuesta = scanner.nextLine().trim().toUpperCase();
            } while (!respuesta.equals("S") && !respuesta.equals("N")); // Validar entrada

        } while (respuesta.equals("S"));

        System.out.println("Finalizando el programa...");
        scanner.close();
    }
}