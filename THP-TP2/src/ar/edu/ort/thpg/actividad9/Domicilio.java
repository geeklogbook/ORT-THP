package ar.edu.ort.thpg.actividad9;

public class Domicilio {
	private String calle;
	private String altura;
	private String barrio;
	
	public Domicilio(String calle, String altura, String barrio) {
		this.calle = calle;
		this.altura = altura;
		this.barrio = barrio;
	}
	
	public String toString() {
		String domicilio;
		
		domicilio = this.calle + " " +this.altura + " " + this.barrio; 
		return domicilio;
	}
}
