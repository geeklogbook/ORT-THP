package actividad_3;

import java.util.Scanner;

public class Ejercicio38 {

	public static void main(String[] args) {
		final String PASSOK = "123456";
		final String USUARIO = "admin";
		String passIngresado;
		int intentos = 3;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bienvenido "+ USUARIO + " ingrese su contraseña. Tiene 3 intentos");
		do {
			System.out.print("Ingrese contraseña: ");
			passIngresado = input.next();
			if(!passIngresado.equals(PASSOK)) {
				intentos--;
				System.out.println("Contraseña erronea. Le quedan " + intentos + " intentos");
			}
		} while (!passIngresado.equals(PASSOK) && intentos > 0);
		
		if (passIngresado.equals(PASSOK)){
			System.out.println("Acceso Concedido");
		} else {
			System.out.println("Se ha bloqueado la cuenta");
		}
		input.close();

	}

}
