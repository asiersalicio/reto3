package Controlador;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

import Modelo.Autobus;
import Modelo.BBDD;
import Modelo.Billete;
import Modelo.Cliente;
import Modelo.Linea;
import Modelo.LineaParada;
import Modelo.Llamadas;
import Modelo.Parada;
import Vista.PaneRegister;
/**
 * Clase: ControlModelo: contiene las instancias del modelo, incluye las instancias de los objetos así como métodos relacionados con estas funciones.
 * @author IN1DM3B_18
 *
 */
public class ControlModelo {
	
	public static Cliente cliente;  
	public static Linea linea;
	public static Parada paradaOrigen;
	public static Parada paradaDestino;
	public static LineaParada lineaParada;
	public static Billete billeteIda;
	public static Billete billeteVuelta;
	public static Autobus autobusIda;
	public static Autobus autobusVuelta;
	public static float precioIda = 0;
	public static float precioVuelta = 0;
	public static Calendar fechaIda;
	public static Calendar fechaVuelta;
	public static boolean viajeDeVuelta;
	
	//EstablecerClienteActual: rellena el objeto cliente con el cliente al que pertenece el dni que se pasa por parámetro. 
	public static void EstablecerClienteActual(String dni)
	{
		cliente = new Cliente();
		Llamadas.RellenarCliente(BBDD.connection, cliente, dni);
	}
	
	//RegistrarCliente: Introduce los datos introducidos por el usuario en el paneRegister en la BBDD.
	public static void RegistrarCliente(String DNI, String nombreCliente, String apellidos, Calendar fechaNac, String sexo, String contrasena)
	{
		
		System.out.println(fechaNac);

		System.out.println("Registrando usuario: " + DNI + "/" + contrasena);
		try {
				Llamadas.insertarCliente(BBDD.connection, DNI, nombreCliente, apellidos, contrasena, sexo, fechaNac);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	//EstablecerLinea: se realiza la llamada al método RellenarLinea de la clase Llamadas en el paquete Modelo y se rellena el atributo linea del objeto Linea. 
	public static void EstablecerLinea(String codLinea)
	{ 
		linea = new Linea(codLinea, codLinea);
		Llamadas.RellenarLinea(BBDD.connection, linea, codLinea); 
	}
	
	//EstablecerParadaOrigen: se realiza la llamada al método RellenarParada de la clase Llamadas en el paquete Modelo y se rellena el atributo paradaOrigen del objeto Parada. 
	public static void EstablecerParadaOrigen(String codParadaOrigen)
	{
		paradaOrigen = new Parada();
		paradaOrigen=Llamadas.RellenarParada(BBDD.connection, paradaOrigen, codParadaOrigen);
		System.out.println("Parada origen: " + paradaOrigen.getNombreParada());
	}
	
	//EstablecerParadaDestino: se realiza la llamada al método RellenarParada de la clase Llamadas en el paquete Modelo y se rellena el atributo paradaDestino del objeto Parada. 
	public static void EstablecerParadaDestino(String codParadaDestino)
	{
		paradaDestino = new Parada();
		paradaDestino=Llamadas.RellenarParada(BBDD.connection, paradaDestino, codParadaDestino);
		System.out.println("Parada destino: " + paradaDestino.getNombreParada());
	}

	//clase CalcularDatosCompra: se calcula el código autobús y el precio del Billete
	public static boolean CalcularDatosCompra(Calendar fechaIda, boolean vuelta, Calendar fechaVuelta) {
		int codBusIda = 0;
		int codBusVuelta = 0;
		boolean noErrorVuelta=true;
		codBusIda=Llamadas.SeleccionarAutobus(BBDD.connection, fechaIda);
		if(vuelta)
		{
		codBusVuelta=Llamadas.SeleccionarAutobus(BBDD.connection, fechaVuelta);
		}
		
		if(!(codBusIda==-1))
		{
		autobusIda = new Autobus();
		autobusIda=Llamadas.RellenarAutobus(BBDD.connection, codBusIda, autobusIda);
		System.out.println("Calulando distancia entre " + paradaOrigen.getNombreParada() + " y " + paradaDestino.getNombreParada() + "...");
		precioIda=Llamadas.CalcularPrecioBillete(BBDD.connection, autobusIda);
		
		if(!(codBusVuelta==-1)&&vuelta)
		{
			autobusVuelta = new Autobus();
			autobusVuelta=Llamadas.RellenarAutobus(BBDD.connection, codBusVuelta, autobusVuelta);
			System.out.println("Calulando distancia entre " + paradaDestino.getNombreParada() + " y " + paradaOrigen.getNombreParada() + "...");
			precioVuelta=Llamadas.CalcularPrecioBillete(BBDD.connection, autobusVuelta);
		}
		
		return true;
		}
		else
		{
			System.out.println("No hay buses disponibles para esa fecha");
			return false;
		}
	}
	
	//Clase GenerarBillete: se actualiza el codBillete mediante el método CalcularCodBillete de la clase Llamadas en el paquete Modelo
	public static void GenerarBilletes()
	{
		int codBillete;
		codBillete=Llamadas.CalcularCodBillete(BBDD.connection);
		billeteIda = new Billete(codBillete, 0, linea.getCodLinea(), autobusIda, paradaOrigen, paradaDestino, fechaIda, cliente, precioIda);
		Llamadas.insertarBillete(BBDD.connection, billeteIda, viajeDeVuelta, fechaIda);
		System.out.println(ControlModelo.precioIda);
		
		if(ControlModelo.viajeDeVuelta) {
		codBillete=Llamadas.CalcularCodBillete(BBDD.connection);
		billeteVuelta = new Billete(codBillete, 1, linea.getCodLinea(), autobusIda, paradaDestino, paradaOrigen, fechaVuelta, cliente, precioVuelta);
		Llamadas.insertarBillete(BBDD.connection, billeteVuelta, viajeDeVuelta, fechaVuelta);
		System.out.println(ControlModelo.precioVuelta);
		}
}
}
