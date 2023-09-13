package actividad_3;

import java.util.Scanner;

public class Ejercicio30 {

	public static void main(String[] args) {
		int num1, num2;
		double result = 0;
		char operation;
		boolean continueFlag;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Ingrese que operación quiere realizar: ");
			operation = input.next().charAt(0);
			continueFlag = (operation != 'F' && operation != 'f');
				if (continueFlag) {
					System.out.print("Ingrese num1: ");
					num1 = input.nextInt();
					System.out.print("Ingrese num2: ");
					num2 = input.nextInt();
					switch (operation) {
					case '+': result = num1 + num2; 
					case '-': result = num1 - num2; 
					case '*': result = num1 * num2; 
					case '/': 
						if (num2 == 0) {
							System.out.println("No se puede dividir por cero");
						} else {
							result = num1 / num2;							
						}
					}
				}
				System.out.println("Resultado: " + result);
			} while (continueFlag);
		
		
		
		
		input.close();

	}

}
