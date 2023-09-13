package actividad_3;

import java.util.Scanner;

public class Ejercicio37 {

	public static void main(String[] args) {
		double sueldo;
		double sueldoTotal= 0;
		int cantidad = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese el sueldo. Con número negativo finaliza");
		do {
			System.out.print("Sueldo: ");
			sueldo = input.nextDouble();
			if(sueldo > 0) {
				sueldoTotal += sueldo;
			}
			cantidad++;
		} while (sueldo > 0 && cantidad < 12);
		System.out.println("El sueldo del acumulado del empleado al momento es: " + sueldoTotal);
		input.close();
	}

}
