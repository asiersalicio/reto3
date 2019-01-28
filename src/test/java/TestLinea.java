

import static org.junit.Assert.*;

import org.junit.Test;

import Modelo.Linea;

public class TestLinea {
	
	public String codLinea="L1";
	public String nombreLinea="Termibus-Plentzia";
		
	//para el test del Constructor:
	public Linea lineaTest1 = new Linea(codLinea, nombreLinea); 

	//Hay que comprobar todo unitariamente:
		@Test
		public void testConstructor1() {
			Linea lineaTest = new Linea(codLinea, nombreLinea); 
			assertEquals(lineaTest.getCodLinea(), codLinea);
			assertEquals(lineaTest.getNombreLinea(), nombreLinea);
			
		}
	
	//Test de los geters y seters
		@Test
		public void testCodLinea() {
			lineaTest1.setCodLinea(codLinea);
			assertEquals(lineaTest1.getCodLinea(), codLinea);
		}
		@Test
		public void testCodLineaMal() {
			lineaTest1.setCodLinea(codLinea);
			assertNotEquals(lineaTest1.getCodLinea(), "K");
		}
		
		@Test
		public void testNombreLinea() {
			lineaTest1.setNombreLinea(nombreLinea);
			assertEquals(lineaTest1.getNombreLinea(), nombreLinea);
		}
		
		@Test
		public void testNombreLineaMal() {
			lineaTest1.setNombreLinea(nombreLinea);
			assertNotEquals(lineaTest1.getNombreLinea(), "P");
		}
}