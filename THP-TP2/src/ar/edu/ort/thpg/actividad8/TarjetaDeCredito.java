package ar.edu.ort.thpg.actividad8;

public class TarjetaDeCredito {
	private String numero;
	private String titular;
	private double limiteDeCompra;
	private double acumuladoActual;
	
	public TarjetaDeCredito(String numero, String titular, double limiteDeCompra) {
		this.numero = numero;
		this.titular = titular;
		this.limiteDeCompra = limiteDeCompra;
		this.acumuladoActual = 0;
	}
	
	// NUMERO
	public String getNumero() {
		return this.numero;
	}
	
	private void setNumero(String numero) {
		this.numero = numero;
	}
	
	// TITULAR
	public String getTitular() {
		return this.titular;
	}
	
	private void setTitular(String titular) {
		this.titular = titular;
	}
	
	// LIMITE DE COMPRA
	public double getLimiteDeCompra() {
		return this.limiteDeCompra;
	}

	private void setLimiteDeCompra(double limiteDeCompra) {
		this.limiteDeCompra = limiteDeCompra;
	}
	
	// ACUMULADO ACTUAL
	public double getAcumuladoActual() {
		return this.acumuladoActual;
	}

	private double montoDisponible() {
		double limiteDisponible = 0;
		limiteDisponible = this.limiteDeCompra - this.acumuladoActual;
		
		if (limiteDisponible <= 0) {
			limiteDisponible = 0;
		}
		
		return limiteDisponible;
		}

	private boolean compraPosible(double monto) {
		boolean compraPosible = false;
		double montoDisponible = montoDisponible();
		if (monto <= montoDisponible) {
			compraPosible = true;
		}
		
		return compraPosible;
	}
	
	public void actualizarLimite(double monto) {
		this.limiteDeCompra = monto;
	}

	private void acumularGastoActual(double monto) {
		this.acumuladoActual += monto;
	}

	public boolean realizarCompra(double monto) {
		boolean compraRealizada = false;
		
		if (compraPosible(monto)) {
			compraRealizada = true;
			acumularGastoActual(monto);
		}	
		
		return compraRealizada;
		
	}
	
//	+ toString(): String
	public String ToString() {
		String estado = 
				"Titular: " + this.titular + " - " +
				"Numero: " + this.numero +  " - " +
				"Limite De Compra: " + this.limiteDeCompra + " - " + 
				"Aculumado actual: " + this.acumuladoActual + " - "+
				"Monto disponible; " + montoDisponible();
		
		return estado;
		
	}

}
