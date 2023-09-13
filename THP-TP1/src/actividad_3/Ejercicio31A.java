package actividad_3;

import java.util.Scanner;

public class Ejercicio31A {

	public static void main(String[] args) {
		int num = 0;
		char continuar = 'S';
		Scanner input = new Scanner(System.in);
		
		System.out.println("Se le solicitará un número. Le mostraremos el último al finalizar");	
		while ((continuar != 'N' && continuar != 'n') && (continuar != 'S' || continuar != 's')) {	
			if ((continuar != 'N' && continuar != 'n') && (continuar != 'S' && continuar != 's')) {
				System.out.print("No ingresó una opción válida: [S/N] -> ");
				continuar = input.next().charAt(0);
			}
			while (continuar == 'S' || continuar == 's') {
				System.out.print("Ingrese un número entero: ");
				num = input.nextInt();
				System.out.print("¿Desea continuar [S/N]? -> ");
				continuar = input.next().charAt(0);
			}
		}
		System.out.println("Último número ingresado: " + num);
		input.close();
	}

}
