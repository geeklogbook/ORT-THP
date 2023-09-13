package com.ort.aplicacion;

import com.ort.entidades.Entrada;
import com.ort.entidades.Funcion;
import com.ort.entidades.Sala;

public class Test {

	public static void main(String[] args) {
		System.out.println("INICIA SEGUNDO PARCIAL");
		
		CineORT cine = new CineORT();
		
		Sala sala1 = new Sala(1, 141);
		
		Funcion funcion1 = new Funcion("1", "Titulo 1", 101, 1, 101, sala1);

		
		Entrada entrada1 = new Entrada(1, funcion1);
		Entrada entrada2 = new Entrada(2, funcion1);
		Entrada entrada3 = new Entrada(1, funcion1);
		Entrada entrada4 = new Entrada(4, funcion1);
		Entrada entrada5 = new Entrada(2, funcion1);
		
		
		System.out.println(funcion1.toString());
		System.out.println(sala1.toString());
		System.out.println(entrada1.toString());
		System.out.println(entrada2.toString());
		System.out.println(entrada3.toString());
		System.out.println(entrada4.toString());
		System.out.println(entrada5.toString());
		
		cine.mostrarUltimaEntrada("1231");

	}

}
