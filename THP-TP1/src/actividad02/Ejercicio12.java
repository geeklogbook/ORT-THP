package actividad02;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1, number2;
		
		System.out.print("Ingrese n�mero 1: ");
		number1 = input.nextInt();
		System.out.print("Ingrese n�mero 2: ");
		number2 = input.nextInt();
		input.close();
		
		if (number1 > number2) {
			System.out.println("El n�mero 1 es mayor");
		} else {
			if (number1 < number2){
				System.out.println("El n�mero 2 es mayor");
			} else {
				System.out.println("Son iguales");
			}
		}

		
	}

}
