package actividad_3;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		int value, result;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ingrese un número: ");
		value = input.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			result = value * i;
			System.out.println("Valor multiplicado por " + i + " = " + result);
		}
		
		input.close();
	}

}
