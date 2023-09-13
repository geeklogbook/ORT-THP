package ar.edu.ort.thpg.actividad3;

public class Test {

	public static void main(String[] args) {
		Persona juan = new Persona();
		juan.ponerApellido("Perez");
		juan.ponerNombre("Juan");
		System.out.println("Persona Juan -> " + juan.obtenerNombreCompleto());

		
		Persona vacio = new Persona();
		System.out.println("VACIO ->" + vacio.obtenerNombreCompleto());
	}

}
