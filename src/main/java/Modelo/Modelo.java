package Modelo;

import java.sql.SQLException;
import java.util.Calendar;

import Funciones.FuncionesContrasena;
/**
 * Clase: ControlModelo: contiene las instancias del modelo, incluye las instancias de los objetos así como métodos relacionados con estas funciones.
 * @author IN1DM3B_18
 *
 */
public class Modelo {
	
	public Cliente cliente;  
	public Linea linea;
	public Parada paradaOrigen;
	public Parada paradaDestino;
	public LineaParada lineaParada;
	public Billete billeteIda;
	public Billete billeteVuelta;
	public Autobus autobusIda;
	public Autobus autobusVuelta;
	public float precioIda = 0;
	public float precioVuelta = 0;
	public Calendar fechaIda;
	public Calendar fechaVuelta;
	public boolean viajeDeVuelta;
	public Llamadas llamadas;
	public FuncionesContrasena funcionesContrasena;
	
	/**
	 * Método: EstablecerClienteActual: rellena el objeto cliente con el cliente al que pertenece el dni que se pasa por parámetro. 
	 * @param dni
	 */
	
	public Modelo()
	{
		llamadas = new Llamadas(this);
		funcionesContrasena = new FuncionesContrasena(this);		
	}
	
	public void EstablecerClienteActual(String dni)
	{
		cliente = new Cliente();
		llamadas.RellenarCliente(BBDD.connection, cliente, dni);
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
	public void RegistrarCliente(String DNI, String nombreCliente, String apellidos, Calendar fechaNac, String sexo, String contrasena)
	{
		System.out.println(fechaNac);
		System.out.println("Registrando usuario: " + DNI + "/" + contrasena);
		try {
				llamadas.insertarCliente(BBDD.connection, DNI, nombreCliente, apellidos, contrasena, sexo, fechaNac);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	/**
	 * Método: EstablecerLinea: se realiza la llamada al método RellenarLinea de la clase Llamadas en el paquete Modelo y se rellena el atributo linea del objeto Linea. 
	 * @param codLinea
	 */
	public void EstablecerLinea(String codLinea)
	{ 
		linea = new Linea(codLinea, codLinea);
		llamadas.RellenarLinea(BBDD.connection, linea, codLinea); 
	}
	
	/**
	 * Método: EstablecerParadaOrigen: se realiza la llamada al método RellenarParada de la clase Llamadas en el paquete Modelo y se rellena el atributo paradaOrigen del objeto Parada. 
	 * @param codParadaOrigen
	 */
	public void EstablecerParadaOrigen(String codParadaOrigen)
	{
		paradaOrigen = new Parada();
		paradaOrigen=llamadas.RellenarParada(BBDD.connection, paradaOrigen, codParadaOrigen);
		System.out.println("Parada origen: " + paradaOrigen.getNombreParada());
	}
	
	/**
	 * Método: EstablecerParadaDestino: se realiza la llamada al método RellenarParada de la clase Llamadas en el paquete Modelo y se rellena el atributo paradaDestino del objeto Parada. 
	 * @param codParadaDestino
	 */
	public void EstablecerParadaDestino(String codParadaDestino)
	{
		paradaDestino = new Parada();
		paradaDestino=llamadas.RellenarParada(BBDD.connection, paradaDestino, codParadaDestino);
		System.out.println("Parada destino: " + paradaDestino.getNombreParada());
	}

	/**
	 * Método: CalcularDatosCompra: se calcula el código autobús y el precio del Billete
	 * @param fechaIda
	 * @param vuelta
	 * @param fechaVuelta
	 * @return
	 */
	public boolean CalcularDatosCompra(Calendar fechaIda, boolean vuelta, Calendar fechaVuelta) {
		int codBusIda = 0;
		int codBusVuelta = 0;
		codBusIda=llamadas.SeleccionarAutobus(BBDD.connection, fechaIda);
		if(vuelta)
		{
		codBusVuelta=llamadas.SeleccionarAutobus(BBDD.connection, fechaVuelta);
		}
		
		if(!(codBusIda==-1))
		{
		autobusIda = new Autobus();
		autobusIda=llamadas.RellenarAutobus(BBDD.connection, codBusIda, autobusIda);
		System.out.println("Calulando distancia entre " + paradaOrigen.getNombreParada() + " y " + paradaDestino.getNombreParada() + "...");
		precioIda=llamadas.CalcularPrecioBillete(BBDD.connection, autobusIda);
		
		if(!(codBusVuelta==-1)&&vuelta)
		{
			autobusVuelta = new Autobus();
			autobusVuelta=llamadas.RellenarAutobus(BBDD.connection, codBusVuelta, autobusVuelta);
			System.out.println("Calulando distancia entre " + paradaDestino.getNombreParada() + " y " + paradaOrigen.getNombreParada() + "...");
			precioVuelta=llamadas.CalcularPrecioBillete(BBDD.connection, autobusVuelta);
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
	public void GenerarBilletes()
	{
		int codBillete;
		codBillete=llamadas.CalcularCodBillete(BBDD.connection);
		billeteIda = new Billete(codBillete, 0, linea.getCodLinea(), autobusIda, paradaOrigen, paradaDestino, fechaIda, cliente, precioIda);
		llamadas.insertarBillete(BBDD.connection, billeteIda, viajeDeVuelta, fechaIda);
		System.out.println(precioIda);
		
		if(viajeDeVuelta) {
		codBillete=llamadas.CalcularCodBillete(BBDD.connection);
		billeteVuelta = new Billete(codBillete, 1, linea.getCodLinea(), autobusIda, paradaDestino, paradaOrigen, fechaVuelta, cliente, precioVuelta);
		llamadas.insertarBillete(BBDD.connection, billeteVuelta, viajeDeVuelta, fechaVuelta);
		System.out.println(precioVuelta);
		}
}

}
