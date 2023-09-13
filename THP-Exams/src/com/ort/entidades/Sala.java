package com.ort.entidades;

public class Sala {
	private int numero;
	private int capacidad;
	
	public Sala(int numero, int capacidad) {
		this.numero = numero;
		this.capacidad = capacidad;
	}

	public int getCapacidad() {
		return this.capacidad;
	}

	public boolean mismaSala(int numero) {
		return this.numero == numero;
	}
	
	public String toString() {
		String stringADevolver;
		stringADevolver = "Numero: " + this.numero +  " - " +
				"Capacidad: " + this.capacidad;

		return stringADevolver;
	}
}
