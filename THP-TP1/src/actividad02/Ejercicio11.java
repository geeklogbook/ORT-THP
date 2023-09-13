package actividad02;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		
		System.out.print("Ingrese un número: ");
		number = input.nextInt();
		input.close();
		
		if (number / 2 == 0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar");
		}
		
	}

}
