package actividad01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		
		System.out.print("Ingrese su nombre: ");
		name = input.next();
		input.close();

		
		System.out.println("Hello " + name);

	}

}