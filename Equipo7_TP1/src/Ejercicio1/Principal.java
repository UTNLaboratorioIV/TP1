package Ejercicio1;

//import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
			
		Empleado[] vEmp = new Empleado[5];
		
		vEmp[0] = new Empleado();
		vEmp[0].setNombre("Pablo");
		vEmp[0].setEdad(25);
		
		vEmp[1] = new Empleado();
		vEmp[1].setNombre("Itati");
		vEmp[1].setEdad(26);
		
		vEmp[2] = new Empleado();
		vEmp[2].setNombre("Maximiliano");
		vEmp[2].setEdad(27);
		
		vEmp[3] = new Empleado("Matias", 28);
		
		vEmp[4] = new Empleado("Federico", 29);
		
		for (Empleado empleado : vEmp) 
		{
			System.out.println(empleado.toString());
		}
			
		System.out.println("El proximo ID a generarse es: " + Empleado.devuelveProximoID());
	
		/*
    // Se comenta el codigo adicional para dejar unicamente lo que cumple con los enunciados solicitados por el ejercicio.
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
        */
		
    }
}