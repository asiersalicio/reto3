
import static org.junit.Assert.*;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.Test;

import Modelo.Cliente;
/**
 *Clase TestCliente: 
 * @param DNI
 * @param nombreCliente
 * @param apellidos
 * @param fechaNac
 * @param sexo
 * @param contrasena
 * 
 */

public class TestCliente {
	//Atributos o propiedades:
	private String DNI="15236985K";
	private String nombreCliente="Popeye";
	private String apellidos="El marino";
	Calendar fechaNac = Calendar.getInstance();
	private String sexo="V";
	private String contrasena="ec5287c45f0e70ec22d52e8bcbeeb640";


	//para el test del Constructor:
	public Cliente ClienteTest1 = new Cliente (DNI, nombreCliente, apellidos, fechaNac, sexo, contrasena);
	@Test
	public void testConstructor1() {
		Cliente ClienteTest = new Cliente (DNI, nombreCliente, apellidos, fechaNac, sexo, contrasena);		
		assertEquals(ClienteTest.getDNI (), DNI);
		assertEquals(ClienteTest.getNombreCliente (), nombreCliente);
		assertEquals(ClienteTest.getApellidos (), apellidos);
		assertEquals(ClienteTest.getFechaNac (), fechaNac);
		assertEquals(ClienteTest.getSexo (), sexo);
		assertEquals(ClienteTest.getContrasena (), contrasena);
	}
	@Test
	public void testDNI () {
	ClienteTest1.setDNI (DNI);
		assertEquals(ClienteTest1.getDNI (), DNI);
	}
	@Test
	public void testNombreCliente () {
	ClienteTest1.setNombreCliente (nombreCliente);
		assertEquals(ClienteTest1. getNombreCliente (), nombreCliente);
	}
	@Test
	public void testApellidos () {
	ClienteTest1.setApellidos (apellidos);
		assertEquals(ClienteTest1. getApellidos (), apellidos);
	}
	@Test
	public void testFechaNac () {
	ClienteTest1.setFechaNac (fechaNac);
		assertEquals(ClienteTest1. getFechaNac (), fechaNac);
	}
	@Test
	public void testSexo () {
	ClienteTest1.setSexo (sexo);
		assertEquals(ClienteTest1. getSexo (), sexo);
	}
	@Test
	public void testContrasena () {
	ClienteTest1.setContrasena (contrasena);
		assertEquals(ClienteTest1. getContrasena (), contrasena);
	}


}

