package actividad01;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double costHour;
		double quantityHours;
		double totalWage;
		
		System.out.print("Ingrese el valor de la hora: ");
		costHour = input.nextFloat();
		System.out.print("Ingrese la cantidad de horas trabajadas: ");
		quantityHours = input.nextFloat();
		input.close();
		
		totalWage = (quantityHours * 5.5) * costHour;	
		System.out.println("Por semana el trabajador costará: " + totalWage);

	}

}
