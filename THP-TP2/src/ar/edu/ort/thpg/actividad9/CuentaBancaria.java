package ar.edu.ort.thpg.actividad9;

public class CuentaBancaria {
	private Persona titular;
	private String cbu;
	private double saldo;
	private TipoCuenta tipoCuenta;
	
	
	public CuentaBancaria(Persona titular, TipoCuenta tipoCuenta) {
		this.titular = titular;
		this.saldo = 0;
		this.tipoCuenta = tipoCuenta;
		this.cbu = generarCBU();
		
	}
	
	private String generarCBU() {
		String cbu;
		String valorTipoCuenta = Integer.toString(this.tipoCuenta.ordinal() + 10);
		String dni = this.titular.getDNI();
		String lastDniDigit = dni.substring(dni.length()-1);
		
		cbu = valorTipoCuenta + "-" + dni + "-" + lastDniDigit;
		return cbu;	
	}
	
	public String getCBU() {
		return this.cbu;
	}

	public double obtenerSaldo() {
		return this.saldo;
	}
	
	public void depositar(double monto) {
		this.saldo += monto;
	}
	
	public boolean extraer(double monto) {
		boolean operacionExitosa = false;
		
		if (this.saldo > monto ) {
			this.saldo -= monto;
			operacionExitosa = true;
		}

		
		return operacionExitosa;
	}

	public String toString() {
		String datosTitular = 
				"Nombre: " + this.titular.getNombre() + " - " + 
				"Apellido: " + this.titular.getApellido() + " - " + 
				"Dni: " + this.titular.getDNI() + " - " + 
				"Domicilio: " + this.titular.getDomicilio();
		return datosTitular;
	}
}
