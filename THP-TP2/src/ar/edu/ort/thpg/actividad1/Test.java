package ar.edu.ort.thpg.actividad1;

public class Test {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 34;
		
		// Punto A
		int result = Ejercicio1.sumar(num1, num2);
		System.out.println(result);
		
		System.out.println("");
		
		String pedirNumeroReturn = Ejercicio1.pedirNumero(1, 25, "Texto");
		System.out.println(pedirNumeroReturn);

	}

}
