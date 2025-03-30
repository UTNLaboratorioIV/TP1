package Ejercicio1;

public class Empleado {
	
	//atributos
	private final int id;
	private static int proximoID = 1000;
	private String nombre;
	private int edad;
	
	//constructores
	public Empleado() {
		id = proximoID++;
		nombre = "sin nombre";
		edad = 99;
	}
	
	public Empleado(String nombre, int edad) {
		this.id = proximoID++;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	// Getters and Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getId() {
		return id;
	}

	//Metodo toString()
	
	@Override
	public String toString() {
		return "Empleado ID = " + id + ", Nombre = " + nombre + ", Edad = " + edad;
	}

	
	
	
}
