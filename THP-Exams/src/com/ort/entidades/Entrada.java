package com.ort.entidades;

public class Entrada {
	private Funcion funcion;
	private int cantidad;
	private double precioTotal;
	
	public Entrada(int cantidad, Funcion funcion) {
		setCantidad(cantidad);
		setFuncion(funcion);
		this.precioTotal = calcularPrecioTotal(this.cantidad, this.funcion.getPrecioButaca());
	}
	
	private void setCantidad(int cantidad) {
		if (cantidad > 0) {
			this.cantidad = cantidad;
		}
	}
	
	public void setFuncion(Funcion funcion) {
		if (funcion != null) {
			this.funcion = funcion;
		}
	}
	
	private double calcularPrecioTotal(int cantidad, double precioButaca){
		return cantidad * precioButaca;		
	}
	
	public Funcion getFuncion() {
		return this.funcion;
	}
	
	public double getPrecioTotal() {
		return this.precioTotal;
	}
	
	public String toString() {
		String stringADevolver;
		stringADevolver = "Cantidad: " + this.cantidad +  " - " +
				"Precio total: " + this.precioTotal;
		
		return stringADevolver;
	}
	
}
