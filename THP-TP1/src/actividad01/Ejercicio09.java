package actividad01;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double grade1;
		double grade2;
		
		System.out.print("Ingrese grados del lado 1: ");
		grade1 = input.nextDouble();
		System.out.print("Ingrese grados del lado 2: ");
		grade2 = input.nextDouble();
		input.close();
		
		System.out.println("El tercer ángulo es de: " + (180 - (grade1 + grade2)));
	}

}
