package ar.edu.ort.thpg.actividad3;

public class Persona {
	private String nombre;
	private String apellido;

	public Persona() {
		this.nombre = "";
		this.apellido = "";
	}
	
	public void ponerNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void ponerApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String obtenerNombreCompleto() {
		return this.nombre + " " +this.apellido;
	}
		
}
