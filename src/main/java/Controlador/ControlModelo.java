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
	/**
	 * Método: EstablecerClienteActual: rellena el objeto cliente con el cliente al que pertenece el dni que se pasa por parámetro. 
	 * @param dni
	 */
	public static void EstablecerClienteActual(String dni)
	{
		cliente = new Cliente();
		Llamadas.RellenarCliente(BBDD.connection, cliente, dni);
	}
	
	/**
	 * Método:RegistrarCliente: Introduce los datos introducidos por el usuario en el paneRegister en la BBDD.
	 * @param DNI
	 * @param nombreCliente
	 * @param apellidos
	 * @param fechaNac
	 * @param sexo
	 * @param contrasena
	 */
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
	
	/**
	 * Método: EstablecerLinea: se realiza la llamada al método RellenarLinea de la clase Llamadas en el paquete Modelo y se rellena el atributo linea del objeto Linea. 
	 * @param codLinea
	 */
	public static void EstablecerLinea(String codLinea)
	{ 
		linea = new Linea(codLinea, codLinea);
		Llamadas.RellenarLinea(BBDD.connection, linea, codLinea); 
	}
	
	/**
	 * Método: EstablecerParadaOrigen: se realiza la llamada al método RellenarParada de la clase Llamadas en el paquete Modelo y se rellena el atributo paradaOrigen del objeto Parada. 
	 * @param codParadaOrigen
	 */
	public static void EstablecerParadaOrigen(String codParadaOrigen)
	{
		paradaOrigen = new Parada();
		paradaOrigen=Llamadas.RellenarParada(BBDD.connection, paradaOrigen, codParadaOrigen);
		System.out.println("Parada origen: " + paradaOrigen.getNombreParada());
	}
	
	/**
	 * Método: EstablecerParadaDestino: se realiza la llamada al método RellenarParada de la clase Llamadas en el paquete Modelo y se rellena el atributo paradaDestino del objeto Parada. 
	 * @param codParadaDestino
	 */
	public static void EstablecerParadaDestino(String codParadaDestino)
	{
		paradaDestino = new Parada();
		paradaDestino=Llamadas.RellenarParada(BBDD.connection, paradaDestino, codParadaDestino);
		System.out.println("Parada destino: " + paradaDestino.getNombreParada());
	}

	/**
	 * Método: CalcularDatosCompra: se calcula el código autobús y el precio del Billete
	 * @param fechaIda
	 * @param vuelta
	 * @param fechaVuelta
	 * @return
	 */
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
	
	/**
	 *Método: Clase GenerarBillete: se actualiza el codBillete mediante el método CalcularCodBillete de la clase Llamadas en el paquete Modelo
	 */
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

	public static void Reset() {
		cliente=null;  
		linea=null;
		paradaOrigen=null;
		paradaDestino=null;
		lineaParada=null;
		billeteIda=null;
		billeteVuelta=null;
		autobusIda=null;
		autobusVuelta=null;
		precioIda = 0;
		precioVuelta = 0;
		fechaIda=null;
		fechaVuelta=null;
		viajeDeVuelta=false;
		
	}
}
