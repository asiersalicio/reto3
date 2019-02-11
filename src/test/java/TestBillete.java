import static org.junit.Assert.*;

import java.sql.Date;
import java.sql.Time;
import java.util.Calendar;

import org.junit.Test;

import Modelo.Autobus;
import Modelo. Billete;
import Modelo.Cliente;
import Modelo.Parada;
/** 
 *Clase TestBillete: 
 * @param codBillete
 * @param nTrayecto
 * @param codLinea
 * @param codBus
 * @param codParadaInicio
 * @param codParadaFin
 * @param fecha
 * @param hora
 * @param DNI
 * @param precioIda
 * 
 */

public class TestBillete {
	//Atributos o propiedades:
	public int codBillete=1;
	public int nTrayecto=1;
	public String codLinea="L1";
	public Autobus autobus= new Autobus(1001,40,0.32f,"Rojo");
	public Parada paradaInicio;
	public Parada paradaFin;
	public Calendar fecha;
	public Cliente cliente;
	private float precio=(float) 30.5;

	//para el test del Constructor:
	public Billete billeteTest1 = new Billete(codBillete, nTrayecto, codLinea, autobus, paradaInicio, paradaFin, fecha, cliente, precio);
	
	@Test
	public void testConstructor() {
		Billete billeteTest = new Billete(codBillete, nTrayecto, codLinea, autobus, paradaInicio, paradaFin, fecha, cliente, precio);
		assertEquals(billeteTest.getCodBillete(), codBillete);
		assertEquals(billeteTest.getnTrayecto(), nTrayecto);
		assertEquals(billeteTest.getCodLinea(), codLinea);
		assertEquals(billeteTest.getParadaInicio(), paradaInicio);
		assertEquals(billeteTest.getParadaFin(),paradaFin);
		assertEquals(billeteTest.getFecha(), fecha);
		assertEquals(billeteTest.getPrecio(), precio, 0.01);
		assertEquals(billeteTest.getAutobus(), autobus);
		assertEquals(billeteTest.getCliente(), cliente);
	}
	
	@Test 
	public void testCodBillete() {
		billeteTest1.setCodBillete(codBillete);
		assertEquals(billeteTest1.getCodBillete(), codBillete);
	}
	@Test
	public void testNTrayecto() {
		billeteTest1.setnTrayecto(nTrayecto);
		assertEquals(billeteTest1.getnTrayecto(), nTrayecto);
	}
	@Test
	public void testCodLinea() {
		billeteTest1.setCodLinea(codLinea);
		assertEquals(billeteTest1.getCodLinea(), codLinea);
	}
	@Test
	public void testCodBus() {
		billeteTest1.setAutobus(autobus);
		assertEquals(billeteTest1.getAutobus(), autobus);
	}
	@Test
	public void testCodParadaInicio() {
		billeteTest1.setParadaInicio(paradaInicio);
		assertEquals(billeteTest1.getParadaInicio(), paradaInicio);
	}
	@Test
	public void testCodParadaFin() {
		billeteTest1.setParadaFin(paradaFin);
		assertEquals(billeteTest1.getParadaFin(), paradaFin);
	}
	@Test
	public void testFecha() {
		billeteTest1.setFecha (fecha);
		assertEquals(billeteTest1.getFecha(), fecha);
	}
	@Test
	public void testPrecio() {
		billeteTest1.setPrecio(precio);
		assertEquals(billeteTest1.getPrecio(), precio, 0.01);
	}

}

