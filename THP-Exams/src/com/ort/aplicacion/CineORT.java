package com.ort.aplicacion;

import java.util.ArrayList;

import com.ort.entidades.Cliente;
import com.ort.entidades.Entrada;
import com.ort.entidades.Funcion;
import com.ort.entidades.Sala;

public class CineORT {
	private ArrayList<Cliente> clientes;
	private ArrayList<Funcion> funciones;
	private ArrayList<Sala> salas;
	private ArrayList<CambioSala> cambiosDeSala;
	
	public CineORT() {
		this.clientes = new ArrayList<Cliente>();
		this.funciones = new ArrayList<Funcion>();
		this.salas = new ArrayList<Sala>();
		this.cambiosDeSala = new ArrayList<CambioSala>();
	}
	
	public ResultadoCompra comprarEntrada(String dni, String codFuncion, int cantidad) {
		ResultadoCompra resultado = ResultadoCompra.OK;
		Cliente cliente;
		Funcion funcion;
		Entrada entrada;
		
		cliente = obtenerCliente(dni);
		if (cliente != null) {
			funcion = obtenerFuncion(codFuncion);
			if(funcion != null) {
				entrada = funcion.comprarEntrada(cantidad);
				if(entrada != null) {
					cliente.asignarEntrada(entrada);
					if(cliente.decontarSaldo(entrada.getPrecioTotal()) == false) {
						resultado = ResultadoCompra.SALDO_INSUFICIENTE;
					};
				} else {
					resultado = ResultadoCompra.FUNCION_SIN_CAPACIDAD;
				}
			} else {
				resultado = ResultadoCompra.FUNCION_INEXISTENTE;
			}
		} else {
			resultado = ResultadoCompra.CLIENTE_INEXISTENTE;
		}
		
		return resultado;
	}

	public ResultadoCambiarSalaFuncion cambiarSalaFuncion(String codFuncion, int codigoNuevaSala) {
		CambioSala cambio;
		Funcion funcion;
		funcion = obtenerFuncion(codFuncion);
		Sala anteriorSala = funcion.getSala();
		Sala nuevaSala;	
		ResultadoCambiarSalaFuncion resultado;	
		if (funcion!= null) {
			nuevaSala = obtenerSala(codigoNuevaSala);
			if (nuevaSala != null) { 
				if (funcion.cambiarSala(nuevaSala)) {
					resultado = ResultadoCambiarSalaFuncion.OK;
					cambio = new CambioSala(funcion, anteriorSala, nuevaSala);
					this.cambiosDeSala.add(cambio);
				} else {
					resultado = ResultadoCambiarSalaFuncion.CAPACIDAD_SALA_INSUFICIENTE;
				}
			} else {
				resultado = ResultadoCambiarSalaFuncion.SALA_INEXISTENTE;
			}
		} else {
			resultado = ResultadoCambiarSalaFuncion.FUNCION_INEXISTENTE;
		}
		return resultado;
	}
	
	private Cliente obtenerCliente(String dni) {
		Cliente clienteEncontrado = null;
		int pos = 0;
		
		while (clienteEncontrado == null && pos < this.clientes.size()) {
			if (this.clientes.get(pos).mismoCliente(dni)) {
				clienteEncontrado = this.clientes.get(pos);
			} else {
				pos++;
			}
		}
		
		return clienteEncontrado;
	}
	
	private Funcion obtenerFuncion(String codFuncion) {
		Funcion funcionEncontrada = null;
		int pos = 0;
		
		while (funcionEncontrada == null && pos < this.funciones.size()) {
			if (this.funciones.get(pos).mismaFuncion(codFuncion)) {
				funcionEncontrada = this.funciones.get(pos);
			} else {
				pos++;
			}
		}
		
		return funcionEncontrada;
	}
	
	private Sala obtenerSala(int numero) {
		Sala salaEncontrada = null;
		int pos = 0;
		
		while (salaEncontrada == null && pos < this.salas.size()) {
			if(this.salas.get(pos).mismaSala(numero)) {
				salaEncontrada = this.salas.get(pos);
			} else {
				pos++;
			}
		}
		
		return salaEncontrada;
	}
	
	public ArrayList<Cliente> obtenerMejoresClientes(double precioPromedio){
		ArrayList<Cliente> mejoresClientes;
		mejoresClientes = new ArrayList<Cliente>();
		
        for (Cliente cliente : clientes) {
        	if(cliente.obtenerPromedioCompra() > precioPromedio) {
        		mejoresClientes.add(cliente);
        	};
            }
        
        return mejoresClientes;
		
	}

	public void mostrarUltimaEntrada(String dni) {
		Cliente cliente = null;
		ArrayList<Entrada> entradas = null;
		cliente = obtenerCliente(dni);
		if (cliente != null) {
			entradas = cliente.getEntradas();
			if (entradas != null) {
				System.out.println("OK");
				Entrada ultimaEntrada = entradas.get(entradas.size() - 1);
				//Funcion
				System.out.println(ultimaEntrada.getFuncion().toString());
				//Sala
				System.out.println(ultimaEntrada.getFuncion().getSala().toString());
				//Entrada
				System.out.println(ultimaEntrada.toString());
			} else {
				System.out.println("CLIENTE_SIN_ENTRADAS");
			}
		} else {
			System.out.println("CLIENTE_INEXISTENTE");
		}
	}
}
