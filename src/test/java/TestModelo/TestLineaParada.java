<<<<<<< HEAD:src/test/java/TestLineaParada.java
import static org.junit.Assert.assertEquals;
=======
package TestModelo;
import static org.junit.Assert.*;
>>>>>>> 6de42a32bad5139295ac4c0f3b8f29241ebc5921:src/test/java/TestModelo/TestLineaParada.java

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
