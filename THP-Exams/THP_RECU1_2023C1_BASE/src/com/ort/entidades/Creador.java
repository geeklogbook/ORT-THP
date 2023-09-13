package com.ort.entidades;

import java.util.ArrayList;

public class Creador {
	private String email;
	private String nombreUsuario;
	private ArrayList<Canal> canales;

	public Creador(String email, String nombreUsuario) {
		this.email = email;
		this.nombreUsuario = nombreUsuario;
		canales = new ArrayList<>();
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public String getEmail() {
		return email;
	}
	
	public boolean registrarCanal(String nombre) {
		boolean resultado = false;

		if (buscarCanal(nombre) == null) {
			canales.add(new Canal(nombre));
			resultado = true;
		}
		return resultado;
	}

	private Canal buscarCanal(String nombre) {
		Canal canalEncontrado = null;
		int i = 0;
		int tamLista = this.canales.size();
		while (i < tamLista && canalEncontrado == null) {
			Canal canalActual = this.canales.get(i);
			if (canalActual.mismoCanal(nombre)) {
				canalEncontrado = canalActual;
			} else {
				i++;
			}
		}
		return canalEncontrado;
	}

	public boolean mismoCreador(String email) {
		return this.email.equals(email);
	}

	@Override
	public String toString() {
		return "Creador [email=" + email + ", nombreUsuario=" + nombreUsuario + "]";
	}

	public boolean iniciarTransmision(String nombreCanal) {
		boolean resultado = false;
		Canal canal = buscarCanal(nombreCanal);
		if (canal != null) {
			canal.iniciarTransmision();
			resultado = true;
		}
		return resultado;
	}

	public boolean detenerTransmision(String nombreCanal) {
		boolean resultado = false;
		Canal canal = buscarCanal(nombreCanal);
		if (canal != null) {
			canal.detenerTransmision();
			resultado = true;
		}
		return resultado;
	}
}
