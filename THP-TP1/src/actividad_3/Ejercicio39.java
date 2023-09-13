package actividad_3;

import java.util.Scanner;

public class Ejercicio39 {

	public static void main(String[] args) {
		final int Q_TIROS = 3;
		int q_participantes;
		// Información participante;
		int centros_totales = 0;
		String nombre_participante;
		int distancia_participante;
		int puntos_participante;
		// Ganador
		String participante_ganador = null;
		int puntaje_ganador = 0;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Ingrese cantidad de participantes (Mayor o igual a 2) ");
			q_participantes = input.nextInt();
		} while (q_participantes < 2);
		
		
		while (q_participantes > 0) {
			System.out.print("Nombre del participante: ");
			nombre_participante = input.next();
			puntos_participante = 0;
			
			
			for(int i = Q_TIROS; i > 0; i--) {
				
				do {
					System.out.print("Ingrese la distancia al centro del disparo (Sólo se acepta mayor o igual cero): ");
					distancia_participante = input.nextInt();
				} while (distancia_participante < 0);

				if (distancia_participante == 0) {
					centros_totales++;
					puntos_participante += 500;
				} else if (distancia_participante >= 1 &&  distancia_participante <= 10) {
					puntos_participante += 250;
				} else if (distancia_participante >= 11 &&  distancia_participante <= 50) {
					puntos_participante += 100;
				}			
			}	
			
			
			if (puntos_participante > puntaje_ganador) {
				participante_ganador = nombre_participante;
				puntaje_ganador = puntos_participante;
			}
			q_participantes--;
		}
		input.close();
		System.out.println("El Ganador es: " + participante_ganador);
		System.out.println("Puntaje Ganador: " + puntaje_ganador);
		System.out.println("Tiros al centro totales: " + centros_totales);
	}
}
