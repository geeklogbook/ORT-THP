package ar.edu.ort.thpg.practicas.parcial1;

import java.util.Scanner;

public class OrtKarts {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String vuelta;
		//Información Ganador
		String ganador = null;
		int ganador_vueltas = 0;
		//Información pianitos promedio
		int Q_pianito;
		String menos_prom_pianito_nombre = null;
		double menos_prom_pianito_cant  = 0;
		//Información del usuario
		int V_vueltas = 0; 
		int V_pianitos = 0;
		double V_pianito_promedio;
		int R_vueltas = 0;
		int R_pianitos = 0;
		double R_pianito_promedio;
		
		
		do {
			
			System.out.print("¿Quién dió la vuelta?: ");
			vuelta = input.next();
			
			if(vuelta.equals("V")) {
				V_vueltas++;
			} else if(vuelta.equals("R")) {
				R_vueltas++;
			}
			
	
			if (!vuelta.equals("F")) {
				System.out.print("¿Cuántas veces pisó el pianito el coche?: ");
				Q_pianito = input.nextInt();
				
				if(vuelta.equals("V")) {
					V_pianitos += Q_pianito;
				} else if(vuelta.equals("R")) {
					R_pianitos += Q_pianito;
				}
			}
			
			
		} while (R_vueltas < 5 && V_vueltas < 5 && !vuelta.equals("F"));
		
		// Ganador
		if (V_vueltas > R_vueltas) {
			ganador = "Verde";
			ganador_vueltas = V_vueltas;
		} else if (R_vueltas > V_vueltas){
			ganador = "Rojo";
			ganador_vueltas = R_vueltas;
		}
		
		//Pianitos
		R_pianito_promedio = R_pianitos / R_vueltas;
		V_pianito_promedio = V_pianitos / V_vueltas;
		
		if(R_pianito_promedio < V_pianito_promedio) {
			menos_prom_pianito_nombre = "Rojo";
			menos_prom_pianito_cant = R_pianito_promedio;
		} else if(V_pianito_promedio < R_pianito_promedio) {
				menos_prom_pianito_nombre = "Verde";
				menos_prom_pianito_cant = V_pianito_promedio;
		}
		
		
		if (vuelta.equals("F")) {
			System.out.println("Carrera Interrumpida");
		} else {
			System.out.print("Carrera Finalizada");
			System.out.println("El ganador fue el carrito: " + ganador);
			System.out.println("Vueltas del carrito ganador: " + ganador_vueltas );
			System.out.println("Quién pisó menos veces el pianito, en promedio, fue: " +  menos_prom_pianito_nombre);
			System.out.println("Veces que en promedio pisó el pianito: " +  menos_prom_pianito_cant);
		}
		

		input.close();
	}

}
