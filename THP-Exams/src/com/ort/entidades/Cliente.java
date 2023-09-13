package com.ort.entidades;

import java.util.ArrayList;

public class Cliente {
	private String dni;
	private String nombre;
	private String apellido;
	private Genero genero;
	private double saldo;
	private ArrayList<Entrada> entradas;
	
	public Cliente(String dni, String nombre, String apellido, Genero genero) {
		this.dni = dni;
		this.genero = genero;
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.entradas = new ArrayList<Entrada>();
		setSaldo();
	}
		
	
	public double getTotalCompras() {
		double montoTotal = 0;
		
		for (int i = 0; i < this.entradas.size();i++) {
			montoTotal += entradas.get(i).getPrecioTotal();
		}

		return montoTotal;
	}
	
	public double obtenerPromedioCompra() {
		double montoTotal = getTotalCompras();
		
		return montoTotal / entradas.size();
	}
    
	public void asignarEntrada(Entrada entrada) {
		this.entradas.add(entrada);
	}
	
	public void agregarEntrada(Entrada entrada) {
		this.entradas.add(entrada);	
	}
	
	public boolean mismoCliente(String dni) {
		return this.dni.equals(dni);
	}
	
	private void setSaldo() {
		this.saldo = 10000;
	}
	
	public boolean decontarSaldo(double venta) {
		boolean status = false;
		
		if (this.saldo > venta ) {
			this.saldo -= venta;
			status = true;
		}
		
		return status;		
	}
	
	public ArrayList<Entrada> getEntradas() {
		return this.entradas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
