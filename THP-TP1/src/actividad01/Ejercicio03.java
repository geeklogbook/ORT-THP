package actividad01;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		int multiplication_5;
		float division_2;
		
		System.out.print("Por favor, ingrese un número: ");
		number = input.nextInt();
		multiplication_5 = number * 5;
		division_2 = (float)number / 2;
		input.close();
		
		System.out.println("El número multiplicado por 5 es: " + multiplication_5);
		System.out.println("El número dividido por 2 es: " + division_2);
		

	}

}
