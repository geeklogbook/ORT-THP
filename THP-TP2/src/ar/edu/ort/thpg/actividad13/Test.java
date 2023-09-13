package ar.edu.ort.thpg.actividad13;

public class Test {

	public static void main(String[] args) {
		//1 - INSTANCIO NUEVOS OBJETOS PARA CADA SUPER HEROE
		SuperHeroe batman = new SuperHeroe("Batman",90, 70, 0);
		SuperHeroe superman = new SuperHeroe("Superman",95, 60, 70);
		SuperHeroe aquaman = new SuperHeroe("Superman",-1, -1, -1);
		SuperHeroe antman = new SuperHeroe("Superman",200, 200, 200);
		
		System.out.println("DESCRIPCION DE LOS SUPER HEROES");
		System.out.println(batman.toString());
		System.out.println(superman.toString());
		System.out.println(aquaman.toString());
		System.out.println(antman.toString());
		System.out.println();
		
		System.out.println("INICIO COMPETENCIA");
		System.out.println("Batman Vs Superman: " + batman.competir(superman));
		System.out.println("Superman Vs Batman: " + superman.competir(batman));

	}

}
