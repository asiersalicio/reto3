import static org.junit.Assert.*;

import java.sql.Date;
import java.sql.Time;

import org.junit.Test;

import Modelo. Billete;
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
 * @param precio
 * 
 */

public class TestBillete {
	//Atributos o propiedades:
	private int codBillete=1;
	private int nTrayecto=1;
	private String codLinea="L1";
	private int codBus=1001;
	private int codParadaInicio=1;
	private int codParadaFin=9;
	private Calendar fecha="2019-01-28";
	private String DNI="15236985K";
	private float precio=(float) 30.5;

	//para el test del Constructor:
	public Billete billeteTest1 = new Billete(codBillete, nTrayecto, codLinea, codBus, codParadaInicio, codParadaFin, fecha, DNI, precio);
	
	@Test
	public void testConstructor() {
		Billete billeteTest = new Billete(codBillete, nTrayecto, codLinea, codBus, codParadaInicio, codParadaFin, fecha, DNI, precio);
		assertEquals(billeteTest.getCodBillete(), codBillete);
		assertEquals(billeteTest.getnTrayecto(), nTrayecto);
		assertEquals(billeteTest.getCodLinea(), codLinea);
		assertEquals(billeteTest.getCodBus(), codBus);
		assertEquals(billeteTest.getCodParadaInicio(), codParadaInicio);
		assertEquals(billeteTest.getCodParadaFin(), codParadaFin);
		assertEquals(billeteTest.getFecha(), fecha);
		assertEquals(billeteTest.getDNI(), DNI);
		assertEquals(billeteTest.getPrecio(), precio, 0.01);
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
		billeteTest1.setCodBus(codBus);
		assertEquals(billeteTest1.getCodBus(), codBus);
	}
	@Test
	public void testCodParadaInicio() {
		billeteTest1.setCodParadaInicio(codParadaInicio);
		assertEquals(billeteTest1.getCodParadaInicio(), codParadaInicio);
	}
	@Test
	public void testCodParadaFin() {
		billeteTest1.setCodParadaFin(codParadaFin);
		assertEquals(billeteTest1.getCodParadaFin(), codParadaFin);
	}
	@Test
	public void testFecha() {
		billeteTest1.setFecha (fecha);
		assertEquals(billeteTest1.getFecha(), fecha);
	}
	
	@Test
	public void testDNI() {
		billeteTest1.setDNI(DNI);
		assertEquals(billeteTest1.getDNI(), DNI);
	}
	@Test
	public void testPrecio() {
		billeteTest1.setPrecio(precio);
		assertEquals(billeteTest1.getPrecio(), precio, 0.01);
	}

}
