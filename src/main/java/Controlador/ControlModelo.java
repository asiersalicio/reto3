package Controlador;

import Modelo.Autobus;
import Modelo.BBDD;
import Modelo.Cliente;
import Modelo.Linea;
import Modelo.LineaParada;
import Modelo.Llamadas;
import Modelo.Parada;

public class ControlModelo {
	
	public static Cliente cliente;
	public static Linea linea;
	public static Parada paradaOrigen;
	public static Parada paradaDestino;
	public static LineaParada lineaParada;
	public static Autobus autobus;
	
	public static void EstablecerClienteActual(String dni)
	{
		cliente = new Cliente();
		Llamadas.RellenarCliente(BBDD.connection, cliente, dni);
	}
	
	public static void EstablecerLinea(String codLinea)
	{
		linea = new Linea();
		Llamadas.RellenarLinea(BBDD.connection, linea, codLinea);
	}
	
	public static void EstablecerParadaOrigen(String codParadaOrigen)
	{
		paradaOrigen = new Parada();
		Llamadas.RellenarParada(BBDD.connection, paradaOrigen, codParadaOrigen);
	}
	
	public static void EstablecerParadaDestino(String codParadaDestino)
	{
		paradaDestino = new Parada();
		Llamadas.RellenarParada(BBDD.connection, paradaDestino, codParadaDestino);
	}

	public static void CalcularDatosCompra() {
		int codBus;
		float precio;
		codBus=Llamadas.SeleccionarAutobus(BBDD.connection, linea.getCodLinea());
		autobus = new Autobus();
		Llamadas.RellenarAutobus(BBDD.connection, codBus, autobus);
		precio=Llamadas.CalcularPrecioBillete(BBDD.connection, linea, paradaOrigen, paradaDestino, autobus);
		
	}
}
