package Controlador;

import java.util.Date;

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
	public static float precio;
	public static Date fechaIda;
	
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
		paradaOrigen=Llamadas.RellenarParada(BBDD.connection, paradaOrigen, codParadaOrigen);
		System.out.println("Parada origen: " + paradaOrigen.getNombreParada());
	}
	
	public static void EstablecerParadaDestino(String codParadaDestino)
	{
		paradaDestino = new Parada();
		paradaDestino=Llamadas.RellenarParada(BBDD.connection, paradaDestino, codParadaDestino);
		System.out.println("Parada destino: " + paradaDestino.getNombreParada());
	}

	public static void CalcularDatosCompra() {
		int codBus;
		codBus=Llamadas.SeleccionarAutobus(BBDD.connection);
		autobus = new Autobus();
		autobus=Llamadas.RellenarAutobus(BBDD.connection, codBus, autobus);
		System.out.println("Calulando distancia entre " + paradaOrigen.getNombreParada() + " y " + paradaDestino.getNombreParada() + "...");
		precio=Llamadas.CalcularPrecioBillete(BBDD.connection);
	}
}
