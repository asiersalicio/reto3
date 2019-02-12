package TestModelo;


import static org.junit.Assert.*;

import org.junit.Test;

import Modelo.Autobus;
/**
 *Clase TestAutobus: 
 * @param codBus
 * @param nPlazas
 * @param consumoKM
 * @param color
 * 
 */

public class TestAutobus {
	
	//las variables las sacamos fuera de las clases para usarlas en todos los test, además las pone privadas porque no las va a utilizar nadie.
	private int codBus=1001;
	private int nPlazas=40;
	private float consumoKM=(float) 0.32;
	private String color="Rojo";
	
	//para el test del Constructor:
	public Autobus autobusTest1 = new Autobus(codBus, nPlazas, consumoKM, color); 
	
	//Hay que comprobar todo unitariamente:
	@Test
	public void testConstructor1() {
		Autobus autobusTest = new Autobus (codBus, nPlazas, consumoKM, color);
		assertEquals(autobusTest.getCodBus(), codBus);
		assertEquals(autobusTest.getnPlazas(), nPlazas);
		assertEquals(autobusTest.getConsumoKM(), consumoKM, 0.01);
		assertEquals(autobusTest.getCodBus(), codBus);
	}
	
	
	//Test de los geters y seters
	@Test
	public void testCodBus() {
		autobusTest1.setCodBus(codBus);
		assertEquals(codBus, autobusTest1.getCodBus());
	}
	@Test
	public void testCodBusMal() {
		autobusTest1.setCodBus(codBus);
		assertEquals(codBus, autobusTest1.getCodBus());
	}

	@Test
	public void testNPlazas() {
		autobusTest1.setnPlazas(nPlazas);
		assertEquals(nPlazas, autobusTest1.getnPlazas());
	}
	
	@Test
	public void testConsumoKM() {
		autobusTest1.setConsumoKM(consumoKM);
		assertEquals(consumoKM, autobusTest1.getConsumoKM(),0.01);
	}
	
	@Test
	public void testColor() {
		autobusTest1.setColor(color);
		assertEquals(color, autobusTest1.getColor());
	}

}
