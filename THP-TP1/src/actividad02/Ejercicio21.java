package actividad02;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		
		System.out.print("Ingrese un n�mero entre 1 y 7: ");
		number = input.nextInt();
		input.close();
		
		switch (number) {
		case 1: System.out.println("Lunes"); break;
		case 2: System.out.println("Martes"); break;
		case 3: System.out.println("Mi�rcoles"); break;
		case 4: System.out.println("Jueves"); break;
		case 5: System.out.println("Viernes"); break;
		case 6: System.out.println("S�bado"); break;
		case 7: System.out.println("Domingo"); break;
		default: System.out.println("El n�mero est� fuera del rango 1 a 7");

		}

	}

}
