package actividad_3;

import java.util.Scanner;

public class Ejercicio24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1, num2, aux;
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("Ingrese un número: ");
			num1 = input.nextInt();
			System.out.print("Ingrese un número mayor al primero: ");
			num2 = input.nextInt();	
			if (num1 >= num2) {
				System.out.println("El primer número debe ser menor al segundo. Intente nuevamente");
			}
		}while( num1 >= num2);
		aux = num1;
		
		System.out.println("Secuencia entre los números seleccionados [inclusiva]");
		while (num1 <= num2) {
			System.out.print(num1 + " ");
			num1++;
		}
		num1 = aux + 1;
		System.out.println();
		System.out.println("Secuencia entre los números seleccionados [no inclusiva]");
		while (num1 < num2) {
			System.out.print(num1 + " ");
			num1++;
		}
		
		input.close();
	}

}
