package actividad02;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1, number2;
		String operation;
		double result = 0;
		
		System.out.print("Ingrese número 1: ");
		number1 = input.nextInt();
		System.out.print("Ingrese número 2: ");
		number2 = input.nextInt();
		System.out.print("¿Qué operacion desea realizar? Opciones: +, -, *, / : ");
		operation = input.next();
		input.close();
		
		switch (operation) {
		case "+": result = number1 + number2; break;
		case "-": result = number1 - number2; break;
		case "*": result = number1 * number2; break;
		case "/": {
			if (number2 != 0) {
				result = number1 / number2;
			} else {
			    System.out.println("Error, no se puede dividir por cero");
			}
			break;
		}
		default: System.out.println("Ingreso no válido");
		}
		
		if (number2 == 0 && operation.equals("/")){
			
		} else {
			System.out.println("El resultado de la operacion es " + result);
		}
		
	

	}

}
