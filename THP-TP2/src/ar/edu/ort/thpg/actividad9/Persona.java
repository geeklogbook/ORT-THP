package ar.edu.ort.thpg.actividad9;

public class Persona {
	private String dni;
	private String nombre;
	private String apellido;
	private Domicilio domicilio;
	
	public Persona(String dni, String nombre, String apellido, Domicilio domicilio){
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
	}
	
	public String getDNI() {
		return this.dni;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public String getDomicilio() {
		return this.domicilio.toString();
	}
}
