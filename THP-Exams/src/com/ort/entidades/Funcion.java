package com.ort.entidades;

public class Funcion {
	private String codigo;
	private String titulo;
	private int duracion;
	private double precioButaca;
	private int butacasDisponibles;
	private Sala sala;

	public Funcion(String codigo, String titulo, int duracion, double precioButaca, int capacidadDisponible, Sala sala) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.duracion = duracion;
		this.precioButaca = precioButaca;
		this.butacasDisponibles = capacidadDisponible;
		this.sala = sala;
	}
	
	public Entrada comprarEntrada(int cantidadButacas) {
		Entrada entrada = null;
		
		if (this.butacasDisponibles >= cantidadButacas) {
			this.butacasDisponibles = this.butacasDisponibles - cantidadButacas;
			entrada = new Entrada(cantidadButacas, this);
		}
		return entrada;
	}

	public boolean cambiarSala(Sala nuevaSala) {
		boolean resultado = false;
		int vendidas;
		int totalNueva;
		
		if (this.sala != nuevaSala) {
			vendidas = getCantidadVendida();
			totalNueva = nuevaSala.getCapacidad();
			if (vendidas <= totalNueva) {
				this.sala = nuevaSala;
				this.butacasDisponibles = totalNueva - vendidas;
				resultado = true;
			}
		} 
		return resultado;
	}
	
	public boolean mismaFuncion(String codigo) {
		return this.codigo.equals(codigo);
	}

	public double getPrecioButaca() {
		return this.precioButaca;
	}

	private int getCantidadVendida() {
		return this.sala.getCapacidad() - this.butacasDisponibles;
	}

	public Sala getSala() {
		return this.sala;
	}
	
	public String toString() {
		String stringADevolver;
		stringADevolver = "Codigo: " + this.codigo +  " - " +
				"Titulo: " + this.titulo + " - " +
				"Duracion: " + this.duracion + " - " +
				"Precio butaca: " + this.precioButaca + " - " +
				"Butacas disponibles: " + this.butacasDisponibles;
		
		return stringADevolver;
	}
	

}
