package ar.edu.ort.thpg.actividad6;

public class Test {

	public static void main(String[] args) {
		System.out.println("Inicia Juego de Dado");
		Dado dado1 = new Dado();
		int dado1Valor = dado1.getValor();
		Dado dado2 = new Dado();
		int dado2Valor = dado2.getValor();
		int acumValorDado1 = 0;
		int acumValorDado2 = 0;
		
		if (dado1Valor == dado2Valor) {
			System.out.println("El valor es el mismo: " + dado1Valor);
		} else {
			if (dado1Valor > dado2Valor)  {
				System.out.println("Dado 1 tiene valor más alto: " + dado1Valor);
			} else {
				System.out.println("Dado 2 tiene valor más alto: " + dado2Valor);
			}
		}
		
		for (int i = 1; i <= 100; i++) {
			acumValorDado1 += dado1.getValor();
			dado1.lanzarDado();
			acumValorDado2 += dado2.getValor();
			dado2.lanzarDado();
		}
		
		System.out.println("Valor Promedio Dado 1: " + (double)(acumValorDado1 / 100));
		System.out.println("Valor Promedio Dado 2: " + (double)(acumValorDado2 / 100));



	
	}

}
