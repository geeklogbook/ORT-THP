package actividad02;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age;
		String gender;
		
		System.out.print("Ingrese Edad: ");
		age = input.nextInt();
		System.out.print("Ingrese género: ");
		gender = input.next();
		input.close();
		
		if((age >= 1 && age <= 120) || gender.equals("F") || gender.equals("M")) {
			if (gender.equals("F") && age >= 60){
				System.out.println("Ya se encuentra en edad de jubilación");
			}
			if (gender.equals("M") && age >= 65){
				System.out.println("Ya se encuentra en edad de jubilación");
			}
		} else {
			System.out.println("Datos mal ingresados");
		}
		

	}

}
