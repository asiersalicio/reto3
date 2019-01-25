package Controlador;

import Modelo.BBDD;
import Modelo.Cliente;
import Modelo.Llamadas;

public class ControlModelo {
	
	public static Cliente cliente;
	
	public static void EstablecerClienteActual(String dni)
	{
		cliente = new Cliente();
		Llamadas.RellenarCliente(BBDD.connection, cliente, dni);
	}
}
