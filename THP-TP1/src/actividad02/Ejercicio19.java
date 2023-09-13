package actividad02;

import java.util.Scanner;

public class Ejercicio19 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int givenNumber;
		boolean esDeUnSoloDigito, esImpar, estaEnAmbosGrupos, noEstaEnNingunGrupo;
		
		System.out.print("Ingrese un número: ");
		givenNumber = input.nextInt();
		input.close();
		
		esDeUnSoloDigito = givenNumber >= -9 && givenNumber <= 9;
		esImpar = (givenNumber % 2) == 1;
		estaEnAmbosGrupos = esDeUnSoloDigito && esImpar;
		noEstaEnNingunGrupo = (esDeUnSoloDigito == false) && (esImpar == false);
		
		System.out.println("El numero " + givenNumber + "tiene los siguientes resultados para las variables solicitadas: ");
		System.out.println("	--> esDeUnSoloDigito: " + esDeUnSoloDigito);
		System.out.println("	--> esImpar: " + esImpar);
		System.out.println("	--> estaEnAmbosGrupos: " + estaEnAmbosGrupos);
		System.out.println("	--> noEstaEnNingunGrupo: " + noEstaEnNingunGrupo);
		
	}

}
