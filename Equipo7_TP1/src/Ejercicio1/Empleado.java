package Ejercicio1;

public class Empleado {
	
	//atributos
	private final int id;
	private int proximoID = 1000;
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

}
