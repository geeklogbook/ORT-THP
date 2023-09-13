package com.ort.aplicacion;

import com.ort.entidades.Funcion;
import com.ort.entidades.Sala;

public class CambioSala {
	private Funcion funcion;
	private Sala salaAnterior;
	private Sala nuevaSala;
	
    public CambioSala(Funcion funcion, Sala salaAnterior, Sala nuevaSala) {
        this.setFuncion(funcion);
        this.setSalaAnterior(salaAnterior);
        this.setNuevaSala(nuevaSala);
    }

	public Funcion getFuncion() {
		return funcion;
	}

	public void setFuncion(Funcion funcion) {
		this.funcion = funcion;
	}

	public Sala getSalaAnterior() {
		return salaAnterior;
	}

	public void setSalaAnterior(Sala salaAnterior) {
		this.salaAnterior = salaAnterior;
	}

	public Sala getNuevaSala() {
		return nuevaSala;
	}

	public void setNuevaSala(Sala nuevaSala) {
		this.nuevaSala = nuevaSala;
	}

}
