package actividad_3;

import java.util.Scanner;

public class Ejercicio28 {
	public static void main(String args[]) {
		int cant, number;
		int highest = 0, positionHighest = 0;
		int pos = 1;
		Scanner input = new Scanner(System.in);
		
		System.out.print("�Cu�ntos n�meros ingresar�s?: ");
		cant = input.nextInt();
		
		while (cant > 0) {
			System.out.print("Ingrese n�mero: ");
			number = input.nextInt();
			
			if ((pos == 0) || (number > highest)){
				highest = number;
				positionHighest = pos;
			}
			cant--;
			pos++;
		}
		System.out.println("El numero m�s alto es: " + highest);
		System.out.println("Se encontraba en la posici�n: " + positionHighest);
		input.close();
	}
}
