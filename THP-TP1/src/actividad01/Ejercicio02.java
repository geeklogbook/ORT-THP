package actividad01;

import java.util.Scanner;

public class Ejercicio02 {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int score_1;
		int score_2;
		int score_3;
		float final_score;
		
		System.out.print("Ingrese Nota 1: ");
		score_1 = input.nextInt();
		System.out.print("Ingrese Nota 2: ");
		score_2 = input.nextInt();
		System.out.print("Ingrese Nota 3: ");
		score_3 = input.nextInt();
		input.close();
		
		final_score = (score_1 + score_2 + score_3) / 3;
		System.out.println("La nota promedio es: " + final_score);
		
		
	}

}
