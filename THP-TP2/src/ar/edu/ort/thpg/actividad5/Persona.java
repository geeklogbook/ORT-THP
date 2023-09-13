package ar.edu.ort.thpg.actividad5;

public class Persona {
	private String nombre;
	private String apellido;
	private Domicilio domicilio;

	public Persona() {
		this.nombre = "";
		this.apellido = "";
		this.domicilio = null;
	}
	
	// NOMBRE
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	// APELLIDO
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	// NOMBRE COMPLETO
	public String obtenerNombreCompleto() {
		return this.nombre + " " +this.apellido;
	}
	
	// DOMICILIO
	
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	
	// Mostrar domicilio
	public void getDomicilio() {
		if(this.domicilio != null) {
			System.out.println("Calle: " + this.domicilio.getCalle());
			System.out.println("Numero: " + this.domicilio.getNumero());
			System.out.println("Ciudad: " + this.domicilio.getCiudad());
		} else {
			System.out.println("No tiene domicilio asignado");
		}
		
	}
		
}
