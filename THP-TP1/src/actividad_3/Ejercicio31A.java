package actividad_3;

import java.util.Scanner;

public class Ejercicio31A {

	public static void main(String[] args) {
		int num = 0;
		char continuar = 'S';
		Scanner input = new Scanner(System.in);
		
		System.out.println("Se le solicitar� un n�mero. Le mostraremos el �ltimo al finalizar");	
		while ((continuar != 'N' && continuar != 'n') && (continuar != 'S' || continuar != 's')) {	
			if ((continuar != 'N' && continuar != 'n') && (continuar != 'S' && continuar != 's')) {
				System.out.print("No ingres� una opci�n v�lida: [S/N] -> ");
				continuar = input.next().charAt(0);
			}
			while (continuar == 'S' || continuar == 's') {
				System.out.print("Ingrese un n�mero entero: ");
				num = input.nextInt();
				System.out.print("�Desea continuar [S/N]? -> ");
				continuar = input.next().charAt(0);
			}
		}
		System.out.println("�ltimo n�mero ingresado: " + num);
		input.close();
	}

}
