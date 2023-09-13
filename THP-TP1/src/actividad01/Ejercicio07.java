package actividad01;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double wide;
		double length;
		double squareCost;
		double area;
		double perimeter;
		double costField;
		
		System.out.print("Ingrese el ancho del terreno: ");
		wide = input.nextDouble();
		System.out.print("Ingrese el largo del terreno: ");
		length = input.nextDouble();
		System.out.print("Ingrese el costo del metro cuadrado: ");
		squareCost = input.nextDouble();
		input.close();
		
		area = wide * length;
		costField = area * squareCost;
		perimeter = (wide * 4) + (length * 4);
		
		System.out.println("Valor total del terreno; " + costField);
		System.out.println("Cantidad de metros de alambre ncesario para tres alturas: " + (perimeter * 3));
		
	}

}
