package ar.edu.ort.thpg.parcial1;

import java.util.Scanner;

public class PrimerParcial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int FECHA_MINIMA_VALIDA = 19010101;
		int ESCAPE = -1;
		//DATOS INGRESADOS
		int fecha_ingresada_anterior = -1;
		int fecha_ingresada_actual = 0; 
		double fecha_temperatura_min = 0, fecha_temperatura_max = 0, aux_temperatura;
		//CALCULOS
		double diferencia_temperaturas = 0;
		boolean registro_completo = false;
		int registros = 0;
		//MAXIMOS
		int diferencia_maxima_fecha = 0;
		double diferencia_maxima_valor = 0;
		
		do {
			do {
				System.out.print("Ingrese la fecha actual mayor a 19010101 y mayor que la del día anterior: ");
				fecha_ingresada_actual = input.nextInt();
			} while (fecha_ingresada_actual != ESCAPE && fecha_ingresada_actual < FECHA_MINIMA_VALIDA);
			
			if(fecha_ingresada_actual <= fecha_ingresada_anterior) {
				System.out.println("ERROR: La fecha debe ser superior");
			} else {
				
				if (fecha_ingresada_actual != ESCAPE && fecha_ingresada_actual > FECHA_MINIMA_VALIDA) {
					fecha_ingresada_anterior = fecha_ingresada_actual;
					System.out.print("Ingrese PRIMERA temperatura: ");
					fecha_temperatura_min = input.nextDouble();	
					System.out.print("Ingrese SEGUNDA temperatura: ");
					fecha_temperatura_max= input.nextDouble();
					
					if (fecha_temperatura_min > fecha_temperatura_max ) {
							aux_temperatura = fecha_temperatura_min;
							fecha_temperatura_min = fecha_temperatura_max;
							fecha_temperatura_max = aux_temperatura;
					} 
							
					diferencia_temperaturas = fecha_temperatura_max - fecha_temperatura_min;	
					if(diferencia_temperaturas > diferencia_maxima_valor) {
						diferencia_maxima_fecha = fecha_ingresada_actual;
						diferencia_maxima_valor = diferencia_temperaturas;
					}
		    		registro_completo = true;
				}
				
			}
			
			if(registro_completo) {
				System.out.println("DATOS INGRESADOS");
				System.out.println("FECHA: " + fecha_ingresada_actual);
				System.out.println("TEMPERATURA MÍNIMA: " + fecha_temperatura_min);
				System.out.println("TEMPERATURA MÁXIMA: "+ fecha_temperatura_max);
				System.out.println("DIFERENCIA: "+ diferencia_temperaturas);	
				registro_completo = false;
				registros += 1;
			}
			
		} while (fecha_ingresada_actual != ESCAPE);
		
		if(registros > 0) {
			System.out.println("El día que se registró la mayor diferencia fue: ");
			System.out.println("Fecha: " + diferencia_maxima_fecha);
			System.out.println("Diferencia: "+ diferencia_maxima_valor);
		} else {
			System.out.println("No hay suficientes datos procesados");
		}
		
	input.close();
	}
	
	

}
