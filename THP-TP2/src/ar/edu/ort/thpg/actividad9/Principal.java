package ar.edu.ort.thpg.actividad9;

public class Principal {

	public static void main(String[] args) {
		//"INICIO EJERICIO 9 - CORRALITO CORRALÓN"
		
		Domicilio domicilio = new Domicilio("Yatay", "240", "Almagro");
		
		//CAJA DE AHORRO
		Persona fulanoGomez = new Persona("12345678","Fulano","Gomez", domicilio);
		CuentaBancaria cuenta1 = new CuentaBancaria(fulanoGomez, TipoCuenta.CAJA_DE_AHORRO);
		System.out.println(cuenta1.toString());

		
		//"CUENTA CORRIENTE"
		Persona menganaTorres = new Persona("9123456","Mengana","Torres", domicilio);
		CuentaBancaria cuenta2 = new CuentaBancaria(menganaTorres, TipoCuenta.CUENTA_CORRIENTE);
		System.out.println(cuenta2.toString());
	}

}
