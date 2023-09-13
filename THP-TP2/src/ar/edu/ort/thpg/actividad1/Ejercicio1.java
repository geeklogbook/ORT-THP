package ar.edu.ort.thpg.actividad1;

public class Ejercicio1 {
	
	// Punto A
	public static int sumar(int num1, int num2) {
		return num1 + num2;
	}
	
	//Punto B
	public static String pedirNumero(int min, int max, String textoAMostrar) {
		int resultado;
		
		resultado = (int)(Math.random() * (max - min + 1) + min);
		
		return resultado + " " + textoAMostrar;
	}

}
