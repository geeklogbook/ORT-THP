package actividad_3;

import java.util.Scanner;

public class Ejercicio25 {
	
	public static void main(String[] args) {
		int rows;
		int columns;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ingrese filas: ");
		rows = input.nextInt();
		System.out.print("Ingrese columnas: ");
		columns = input.nextInt();

		for (int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print("|X|");	
			}
			System.out.println();
		}
		input.close();
	}
}
