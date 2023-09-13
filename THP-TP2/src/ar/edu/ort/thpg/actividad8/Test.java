package ar.edu.ort.thpg.actividad8;

public class Test {

	public static void main(String[] args) {
		System.out.println("INICIA PROGRAMA");
		String numero = "4145-4141-2222-1111";
		String titular = "Juan Perez";
		double limite = 10000;
		
		TarjetaDeCredito tarjeta1 = new TarjetaDeCredito(numero, titular, 10000);
		
//		Hacer una compra de $4000
		System.out.println(tarjeta1.realizarCompra(4000));
//		Mostrar el estado de la instancia (aprovechando el m�todo toString()). Ver�s que el disponible deber�a ser de $6000.
		System.out.println(tarjeta1.ToString());
//		Bajar el l�mite a $3000.
		tarjeta1.actualizarLimite(3000);
//		Intentar otra compra de $4000 (no deber�a poder).
		System.out.println(tarjeta1.realizarCompra(4000));
//		Volver a mostrar el estado de la clase; ahora el disponible deber�a ser $0
		System.out.println(tarjeta1.ToString());
	}

}
