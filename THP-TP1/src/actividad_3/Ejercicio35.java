package actividad_3;

import java.util.Scanner;

public class Ejercicio35 {

	public static void main(String[] args) {
		int edad;
		String nombre = null;
		int edadMasJoven = Integer.MAX_VALUE;
		String nombreMasJoven = null;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Se le pedirá ingresar nombres y edades. La carga termina con el * - Al final verá nombre y edad de la persona más joven");
		do {
			System.out.print("Ingrese nombre: ");
			nombre = input.next();
			
			if (!nombre.equals("*")) {
				System.out.print("Ingrese edad: ");
				edad = input.nextInt();	
				if (edad < edadMasJoven) {
					edadMasJoven = edad;
					nombreMasJoven = nombre;
				}
			}
		} while (!nombre.equals("*"));
		System.out.println("La persona más joven es: " + nombreMasJoven);
		System.out.println("La edad de la persona más jovenes: " + edadMasJoven);
		
		input.close();

	}

}
