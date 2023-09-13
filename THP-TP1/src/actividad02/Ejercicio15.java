package actividad02;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age;
		double height;
		boolean access;
		
		System.out.print("Ingres edad: ");
		age = input.nextInt();
		System.out.print("Ingres altura: ");
		height = input.nextDouble();
		input.close();
		
		if(age >= 6 || height > 1.5) {
			access = true;
		} else {
			access = false;
		}
		
		System.out.println("El usuario: ¿Puede entrar al juego?: " + access);
		
				

	}

}
