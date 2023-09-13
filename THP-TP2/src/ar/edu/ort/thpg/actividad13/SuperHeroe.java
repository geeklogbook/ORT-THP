package ar.edu.ort.thpg.actividad13;

public class SuperHeroe {
	private String nombre;
	private int fuerza;
	private int resistencia;
	private int superpoderes;
	
	public SuperHeroe(String nombre, int fuerza, int resistencia, int superpoderes) {
		setNombre(nombre);
		setFuerza(fuerza);
		setResistencia(resistencia);
		setSuperpoderes(superpoderes);
	}
	
	// NOMBRE
	public String getNombre() {
		return this.nombre;
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// FUERZA
	public int getFuerza() {
		return this.fuerza;
	}
	
	private void setFuerza(int fuerza) {
		if (fuerza < 0) {
			this.fuerza = 0;
		} else {
			if (fuerza > 100) {
				this.fuerza = 100;
			} else {
				this.fuerza = fuerza;
			}
		}
	}
	
	// RESISTENCIA
	public int getResistencia() {
		return this.resistencia;
	}
	
	private void setResistencia(int resistencia) {
		if (resistencia < 0) {
			this.resistencia = 0;
		} else {
			if (resistencia > 100) {
				this.resistencia = 100;
			} else {
				this.resistencia = resistencia;
			}
		}
	}
		
	// SUPERPODERES
	public int getSuperpoderes() {
		return this.superpoderes;
	}
	
	private void setSuperpoderes(int superpoderes) {
		if (superpoderes < 0) {
			this.superpoderes = 0;
		} else {
			if (superpoderes > 100) {
				this.superpoderes = 100;
			} else {
				this.superpoderes = superpoderes;
			}
		}
	}
	
	// METODO TOSTRING
	public String toString() {
		return "Nombre: " + nombre + " Fuerza: " + fuerza + " Resistencia: " + resistencia + " Superpoderes: " + superpoderes;
	}
		
	// METODO competir
	public String competir(SuperHeroe competidor) {
		String resultado;
		int puntosPropios = 0;
		int puntosCompetidor = 0;
		
		//FUERZA
		if (this.fuerza > competidor.getFuerza()) {
			puntosPropios++;
		} else {
			if (this.fuerza < competidor.getFuerza()) {
			puntosCompetidor++;	
			}
		}
		
		//RESISTENCIA
		if (this.resistencia > competidor.getResistencia()) {
			puntosPropios++;
		} else {
			if (this.resistencia < competidor.getResistencia()) {
			puntosCompetidor++;	
			}
		}
		
		//SUPERPODERES
		if (this.superpoderes > competidor.getSuperpoderes()) {
			puntosPropios++;
		} else {
			if (this.superpoderes < competidor.getSuperpoderes()) {
			puntosCompetidor++;	
			}
		}
		
		//EVALUACION FINAL
		if(puntosPropios == 2) {
			resultado = "TRIUNFO";
		} else {
			if(puntosCompetidor == 2) {
				resultado = "DERROTA";
		} else {
			resultado = "EMPATE";
		}
		
	}
		return resultado;
  }

}