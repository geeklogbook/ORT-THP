package actividad02;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1, number2, number3;
		
		System.out.print("Ingrese n�mero 1: ");
		number1 = input.nextInt();
		System.out.print("Ingrese n�mero 2: ");
		number2 = input.nextInt();
		System.out.print("Ingrese n�mero 3: ");
		number3 = input.nextInt();
		input.close();
		
		if (number1 > number2 && number1 > number3) {
			System.out.println("El n�mero 1 es mayor. Su valor es: " + number1);
		} else {
			if (number2 > number3){
				System.out.println("El n�mero 2 es mayor. Su valor es: " + number2);
			} else {
				if (number3 > number2) {
					System.out.println("El n�mero 3 es mayor. Su valor es: " + number3);
				}
			}
		}

		
	}

}
