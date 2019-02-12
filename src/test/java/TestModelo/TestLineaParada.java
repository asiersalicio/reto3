package TestModelo;
import static org.junit.Assert.*;

import org.junit.Test;

import Modelo. LineaParada;
/**
 *Clase TestLineaParada: 
 * @param codLinea
 * @param codParada
 * 
 */

public class TestLineaParada {
	//Atributos o propiedades:
	private String codLinea="L1";
	private int codParada=1;
	
	//para el test del Constructor:
	public LineaParada lineaParadaTest1 = new LineaParada (codLinea, codParada); 

	@Test
	public void testConstructor1() {
		LineaParada lineaParadaTest  = new LineaParada (codLinea, codParada); 
		assertEquals(lineaParadaTest.getCodLinea(), codLinea);
		assertEquals(lineaParadaTest.getCodParada (), codParada);
	}
	
	@Test
	public void testCodLinea() {
		lineaParadaTest1.setCodLinea(codLinea);
		assertEquals(lineaParadaTest1.getCodLinea(), codLinea);
	}
	
	@Test
	public void testCodParada () {
		lineaParadaTest1.setCodParada(codParada);
		assertEquals(lineaParadaTest1.getCodParada (), codParada);
	}

}
