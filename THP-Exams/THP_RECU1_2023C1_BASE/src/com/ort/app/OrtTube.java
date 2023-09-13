package com.ort.app;

import java.util.ArrayList;

import com.ort.entidades.Creador;

public class OrtTube {
	private ArrayList<Creador> creadores;

	public OrtTube() {
		creadores = new ArrayList<>();
	}

	
	public boolean iniciarTransmision(String emailCreador, String nombreCanal) {
		boolean resultado = false;

		Creador creador = buscarCreador(emailCreador);
		if (creador != null) {
			resultado = creador.iniciarTransmision(nombreCanal);
		}

		return resultado;
	}

	public boolean detenerTransmision(String emailCreador, String nombreCanal) {
		boolean resultado = false;

		Creador creador = buscarCreador(emailCreador);
		if (creador != null) {
			resultado = creador.detenerTransmision(nombreCanal);
		}

		return resultado;
	}

	public boolean registrarCanal(String nombreCanal, String emailCreador) {
		boolean resultado = false;
		Creador creador = buscarCreador(emailCreador);

		if (creador != null) {
			resultado = creador.registrarCanal(nombreCanal);
		}
		return resultado;
	}

	public boolean registrarCreador(String email, String nombreUsuario) {
		boolean resultado = true;

		if (buscarCreador(email) == null) {
			creadores.add(new Creador(email, nombreUsuario));
		} else {
			resultado = false;
		}

		return resultado;
	}

	private Creador buscarCreador(String email) {
		Creador creadorEncontrado = null;
		int i = 0;
		int tamLista = this.creadores.size();
		while (i < tamLista && creadorEncontrado == null) {
			Creador creadorActual = this.creadores.get(i);
			if (creadorActual.mismoCreador(email)) {
				creadorEncontrado = creadorActual;
			} else {
				i++;
			}
		}
		return creadorEncontrado;
	}
}
