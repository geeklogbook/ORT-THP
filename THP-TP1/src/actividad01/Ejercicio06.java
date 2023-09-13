package actividad01;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int totalSoldAmount;
		double totalWage;
		
		System.out.print("Ingrese el monto total de ventas: ");
		totalSoldAmount = input.nextInt();
		input.close();
		
		totalWage = 44000 + totalSoldAmount * 0.16;
		
		System.out.println("El sueldo total del vendedor es: " + totalWage);

	}

}
