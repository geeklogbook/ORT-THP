package ar.edu.ort.thpg.actividad5;

public class Test {

	public static void main(String[] args) {
		Persona fulanoGomez = new Persona();
		fulanoGomez.setApellido("Gomez");
		fulanoGomez.setNombre("Fulano");
		System.out.println("Persona fulanoGomez -> " + fulanoGomez.obtenerNombreCompleto());
		
		Domicilio domicilioFulano = new Domicilio();
		domicilioFulano.setCalle("Avenida Siempre Viva");
		domicilioFulano.setNumero("1234");
		domicilioFulano.setCiudad("Springfield");
		
		fulanoGomez.setDomicilio(domicilioFulano);
		fulanoGomez.getDomicilio();
		
		Persona juanPerez = new Persona();
		juanPerez.setApellido("Perez");
		juanPerez.setNombre("Juan");
		System.out.println("Persona juanPerez -> " + juanPerez.obtenerNombreCompleto());
		juanPerez.setDomicilio(domicilioFulano);
		juanPerez.getDomicilio();
	}

}
