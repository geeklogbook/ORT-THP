package actividad_3;

import java.util.Scanner;

public class Ejercicio34 {

	public static void main(String[] args) {
		double altura = 0;
		double sumatoriaAltura = 0;
		int cantidadIngresados = 0;
		double alturaPromedio;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Se le pedirá ingresar la altura de los jugadores. Finalizará con la carga de un cero");
		do {
			System.out.print("Ingrese altura: ");
			altura = input.nextDouble();
			
			if (altura != 0) {
				sumatoriaAltura += altura;
				cantidadIngresados++;
			}
			
		} while (altura != 0);
		alturaPromedio = sumatoriaAltura/cantidadIngresados;
		
		System.out.println("La estatura promedio del equipo es: " + alturaPromedio);
		input.close();
		
	}

}
