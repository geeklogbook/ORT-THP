package ar.edu.ort.thpg.actividad4;

public class Test {

	public static void main(String[] args) {
		Persona fulanoGomez = new Persona();
		fulanoGomez.ponerApellido("Gomez");
		fulanoGomez.ponerNombre("Fulano");
		System.out.println("Persona fulanoGomez -> " + fulanoGomez.obtenerNombreCompleto());

		
		Persona juanPerez = new Persona();
		juanPerez.ponerApellido("Perez");
		juanPerez.ponerNombre("Juan");
		System.out.println("Persona juanPerez -> " + juanPerez.obtenerNombreCompleto());
	}

}
