package actividad01;

import java.util.Scanner;

public class Ejercicio05 {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String var1;
		String var2;
		String varAux;
		
		System.out.print("Ingrese variable 1: ");
		var1 = input.next();
		System.out.print("Ingrese variable 2: ");
		var2 = input.next();
		input.close();
		
		varAux = var1;
		var1 = var2;
		var2 = varAux;
		
		System.out.println("Variable 1 es igual a: " + var1);
		System.out.println("Variable 2 es igual a: " + var2);
		
		
	}

}
