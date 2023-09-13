package ar.edu.ort.thpg.actividad6;

public class Dado {
	private int lado;
	
	public Dado() {
		setValor();
	}
	
	public int getValor() {
		return this.lado;
	}
	
	private void setValor() {
		this.lado = (int)(Math.random() * 6) + 1;
	}
	
	public void lanzarDado() {
		setValor();
	}
		
}
