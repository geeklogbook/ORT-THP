package actividad01;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1;
		double num2;
		
		System.out.print("Ingrese n�mero 1: ");
		num1 = input.nextDouble();
		System.out.print("Ingrese n�mero 2: ");
		num2 = input.nextDouble();
		input.close();
		
		System.out.println("Suma de los n�meros: " + (num1 + num2));
		System.out.println("Resta de los n�meros: " + (num1 - num2));
		System.out.println("Multiplicacion de los n�meros: " + (num1 * num2));
		if (num2 == 0) {
			System.out.println("No se puede dividir por cero");
		} else {
			System.out.println("Division de los n�meros: " + (num1 / num2));
		}
	
		
	}

}
