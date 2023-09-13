package ar.edu.ort.thpg.actividad4;

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
		String nombreCompleto = this.nombre + " " +this.apellido;
		return nombreCompleto;
	}
		
}
