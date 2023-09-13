package com.ort.test;

import com.ort.app.OrtTube;

public class Test {

	private static OrtTube app;
	
	public static void main(String[] args) {
		app = new OrtTube();

		app.registrarCreador("coscu@mail.com", "coscu");
		app.registrarCreador("rubius@mail.com", "rubius");
		app.registrarCreador("vegetta777@mail.com", "vegetta777");
		app.registrarCreador("elxokas@mail.com", "elxokas");
		app.registrarCreador("auronplay@mail.com", "auronplay");
		app.registrarCreador("thegrefg@mail.com", "thegrefg");
		app.registrarCreador("ibaillanos@mail.com", "ibaillanos");

		app.registrarCanal("AuronChannel", "auronplay@mail.com");
		app.registrarCanal("Ibai Llanos en Vivo", "ibaillanos@mail.com");
		app.registrarCanal("Canal de Vegetta 777", "vegetta777@mail.com");
		app.registrarCanal("CoscuMundo", "coscu@mail.com");
		app.registrarCanal("El Rubius", "rubius@mail.com");

		app.iniciarTransmision("auronplay@mail.com", "AuronChannel");
		app.iniciarTransmision("ibaillanos@mail.com", "Ibai Llanos en Vivo");
		app.iniciarTransmision("vegetta777@mail.com", "Canal de Vegetta 777");
		app.detenerTransmision("vegetta777@mail.com", "Canal de Vegetta 777");

		System.out.println("---------------- CAMBIOS DE NOMBRE USUARIO ----------------");
		cambiarNombreUsuario("mailInvalido", "coscu2"); 			// se espera un error
		cambiarNombreUsuario("auronplay@mail.com", "auron2");       // se espera un error 
		cambiarNombreUsuario("vegetta777@mail.com", "vegeta777(2)");// se espera que sea satisfactorio
		cambiarNombreUsuario("coscu@mail.com", "coscu2"); 			// se espera que sea satisfactorio
		cambiarNombreUsuario("coscu@mail.com", "coscu2"); 			// se espera un error

		System.out.println("------------------ CANALES EN VIVO AHORA ------------------");
		//TODO: descomentar la siguiente instrucción para poder probar
		//app.verCanalesEnvivo();
	}
	
	
	private static void cambiarNombreUsuario(String email, String nombre) {
		//TODO: descomentar la siguiente instrucción para poder probar
		//System.out.println("Cambiando nombre para el creador " + email + " por " + nombre + ": " + app.cambiarNombreUsuario(email, nombre));
	}

}
