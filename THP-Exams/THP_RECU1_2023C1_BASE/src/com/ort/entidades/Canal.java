package com.ort.entidades;

public class Canal {

	private String nombre;
	private boolean estaEnVivo;

	public Canal(String nombre) {
		this.nombre = nombre;
		estaEnVivo = false;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean estaEnVivo() {
		return this.estaEnVivo;
	}

	public boolean mismoCanal(String nombre) {
		return this.nombre.equals(nombre);
	}

	public void iniciarTransmision() {
		this.estaEnVivo = true;
	}

	public void detenerTransmision() {
		this.estaEnVivo = false;
	}

	@Override
	public String toString() {
		return "Canal [nombre=" + nombre + ", estaEnVivo=" + estaEnVivo + "]";
	}

}