

import static org.junit.Assert.*;

import org.junit.Test;

import Modelo.LineaAutobus;
/**
 *Clase TestLineaAutobus: 
 * @param codLinea
 * @param codBus
 * 
 */


public class TestLineaAutobus {
	//Atributos o propiedades:
	private String codLinea;
	private int codBus;
	
	//para el test del Constructor:
	public LineaAutobus lineaAutobusTest1 = new LineaAutobus(codLinea, codBus); 

	@Test
	public void testConstructor1() {
		LineaAutobus lineaAutobusTest = new LineaAutobus(codLinea, codBus); 
		assertEquals(lineaAutobusTest.getCodLinea(), codLinea);
		assertEquals(lineaAutobusTest.getCodBus(), codBus);
		
	}
	
	@Test
	public void testCodLinea() {
		lineaAutobusTest1.setCodLinea(codLinea);
		assertEquals(lineaAutobusTest1.getCodLinea(), codLinea);
	}
	
	@Test
	public void testCodBus() {
		lineaAutobusTest1.setCodBus(codBus);
		assertEquals(lineaAutobusTest1.getCodBus(), codBus);
	}

}
