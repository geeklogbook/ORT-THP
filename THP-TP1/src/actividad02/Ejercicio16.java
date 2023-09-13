package actividad02;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int avaiableSeats, assistants, totalSeats;
		
		System.out.print("Ingrese cantidad de inscriptos: ");
		assistants = input.nextInt();
		System.out.print("Ingrese cantidad de asientos: ");
		avaiableSeats = input.nextInt();
		input.close();
		
		totalSeats = assistants - avaiableSeats;
		
		if (totalSeats <= 0) {
			System.out.println("Suficientes Asientos");
		} else {
			System.out.println("Faltan Asientos. Cantidad: " + totalSeats);
		}
	}

}
