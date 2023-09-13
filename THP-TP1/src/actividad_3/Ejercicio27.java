package actividad_3;

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		int age;
		Double agesAvg;     
		int q = 0;
		int sumaAges = 0;
		int aboveEighteen = 0;
		Scanner input = new Scanner(System.in);
		
		while (q < 5) {
			System.out.print("Ingrese Edad: ");
			age = input.nextInt();
			sumaAges += age;
			q++;
			if ((age > 18) && (age % 2 == 0)) {
				aboveEighteen++;
			}
		}
		
		agesAvg = (double)(sumaAges / q);
		
		System.out.println("Promedio de edades: " + agesAvg);
		System.out.println("Edades mayores de 18: " +aboveEighteen);
		input.close();
	}
}
