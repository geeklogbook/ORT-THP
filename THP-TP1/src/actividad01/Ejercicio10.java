package actividad01;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name1, name2, name3;
		double amount1, amount2, amount3, totalAmount;
		
		// SOCIO 1
		System.out.print("Nombre socio 1: ");
		name1 = input.next();
		System.out.print("Monto socio 1: ");
		amount1 = input.nextDouble();
		// SOCIO 2
		System.out.print("Nombre socio 2: ");
		name2 = input.next();
		System.out.print("Monto socio 2: ");
		amount2 = input.nextDouble();
		// SOCIO 3
		System.out.print("Nombre socio 3: ");
		name3 = input.next();
		System.out.print("Monto socio 3: ");
		amount3 = input.nextDouble();
		input.close();
		
		totalAmount = amount1 + amount2 + amount3;
		System.out.println("Capital total aportado: " + totalAmount);
		
		//Percentage socio 1
		System.out.println("Procentaje "+ name1 + " : " + (amount1 / totalAmount) * 100);
		//Percentage socio 2
		System.out.println("Procentaje "+ name2 + " : " + (amount2 / totalAmount) * 100);
		//Percentage socio 3
		System.out.println("Procentaje "+ name3 + " : " + (amount3 / totalAmount) * 100);
		
		
	}

}
