package ar.edu.ort.thpg.actividad5;

public class Domicilio {
	private String calle;
	private String numero;
	private String ciudad;
	
	public Domicilio() {
		this.calle = " ";
		this.numero = " ";
		this.ciudad = " ";
	}
	
	// CALLE	
	public void setCalle(String calle) {
		this.calle = calle;
	}
	
	public String getCalle() {
		return this.calle;
	}
	
	// NUMERO
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	// CIUDAD
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public String getCiudad() {
		return this.ciudad;
	}
	


}
