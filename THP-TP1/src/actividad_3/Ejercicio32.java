package actividad_3;

import java.util.Scanner;

public class Ejercicio32 {

	public static void main(String[] args) {
		int grade;
		Scanner input = new Scanner(System.in);
		
		do {
			do {
				System.out.print("Ingrese la nota del examen - (Rango: 1 a 10 - Asuentes: 0 - 1 y 3 no pueden usarse) -> ");
				grade = input.nextInt();
			} while (grade == 1 || grade == 3);
		} while (grade < 0 || grade > 10);
		System.out.println("Nota ingresada correctamente: " + grade);
		input.close();
	}
}
