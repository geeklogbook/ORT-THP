package actividad02;

import java.util.Scanner;

public class Ejercicio18 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1, number2, remainder;
		int largest = 0;
		int smallest = 0;
		
		System.out.print("Ingrese número 1: ");
		number1 = input.nextInt();
		System.out.print("Ingrese número 2: ");
		number2 = input.nextInt();
		input.close();
		
		if(number1 != number2) {
			if (number1 > number2) {
				largest = number1;
				smallest = number2;
			}
			if (number2 > number1) {
				largest = number2;
				smallest = number1;
			}
		} else {
			System.out.println("Los números son iguales");
		}
		
		remainder = largest % smallest;
		
		if (remainder == 0) {
			System.out.println("El " + largest + " ES divisible por el número " + smallest);
		} else {
			System.out.println("El " + largest + " NO ES divisible por el número " + smallest);
		}
		
		
		
		
	}

}
