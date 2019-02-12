package TestModelo;


import static org.junit.Assert.*;

import org.junit.Test;

import Modelo.PoblacionParada;
/**
 *Clase TestPoblacionParada: 
 * @param codParada
 * @param codPostal
 * 
 */

public class TestPoblacionParada {
	//Atributos o propiedades:
	private int codParada=1;
	private int codPostal=48013;
	
	//para el test del Constructor:
	public PoblacionParada poblacionParadaTest1 = new PoblacionParada (codParada, codPostal); 

	@Test
	public void testConstructor1() {
		PoblacionParada poblacionParadaTest = new PoblacionParada (codParada, codPostal); 
		assertEquals(poblacionParadaTest.getCodParada (), codParada);
		assertEquals(poblacionParadaTest.getCodPostal (), codPostal);
	}
	@Test
	public void testCodParada () {
		poblacionParadaTest1.setCodParada(codParada);
		assertEquals(poblacionParadaTest1.getCodParada (), codParada);
	}
	@Test
	public void testCodPostal () {
		poblacionParadaTest1.setCodPostal (codPostal);
		assertEquals(poblacionParadaTest1.getCodPostal (), codPostal);
	}


}
