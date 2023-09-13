package actividad_3;

import java.util.Scanner;

public class Ejercicio36 {

	public static void main(String[] args) {
		int numeroIngresado;
		double promedio = 0;
		int cantidad = 0;
		int sumatoriaElementos = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese numeros enteros. Cuándo el promedio sea mayor que 20 el programa finalizará. Se le indicará la cantidad de valores ingresados");
		do {
			System.out.print("Ingrese un número: ");
			numeroIngresado = input.nextInt();
			sumatoriaElementos += numeroIngresado;
			cantidad++;
			promedio = (double) sumatoriaElementos/cantidad;
			
		} while (promedio < 20);
		System.out.println("Promedio mayor de 20. Números ingresados: " + cantidad);
		input.close();

	}

}
