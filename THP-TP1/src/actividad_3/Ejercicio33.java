package actividad_3;

import java.util.Scanner;

public class Ejercicio33 {
	
	public static void main(String[] args) {
		int num; 
		int maxNum = Integer.MIN_VALUE;
		int minNum = Integer.MAX_VALUE;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Va a ingresar un n�mreo si ingresa 0 se acabar� el programa. Le devolveremos el m�ximo y el m�nimo");
		do {
			System.out.print("Ingrese n�mero: ");
			num = input.nextInt();
			if (num > maxNum) {
				maxNum = num;				
			}
			if (num < minNum && num != 0) {
				minNum = num;
			}
		} while (num != 0);
		
		System.out.println("Maximo: " + maxNum + " Minimo: " + minNum);
		input.close();
	}
	
	

}
