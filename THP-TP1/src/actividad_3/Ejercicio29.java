package actividad_3;

import java.util.Scanner;

public class Ejercicio29 {

	public static void main(String[] args) {
		int grade;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Ingres la nota del exámen - (Rango: 0 a 10): ");
			grade = input.nextInt();
		} while (grade < 0 || grade > 10);
		System.out.println("Nota ingresada correctamente: " + grade);
		input.close();
	}
}
