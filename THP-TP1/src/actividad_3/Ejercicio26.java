package actividad_3;

import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {
		int num; 
		int contador = 1;
		Scanner input = new Scanner(System.in);
		
		do {			
			System.out.print("Ingrese un número natural - (entero >= 1): ");
			num = input.nextInt();
		} while (num < 1);
		
		do {
			if (contador % 3 == 0 && contador % 5 != 0) {
				System.out.println(contador);				
			}
			contador++;
		} while (contador <= num);

		input.close();
	}
}
