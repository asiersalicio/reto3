package TestModelo;

import static org.junit.Assert.*;

import org.junit.Test;

import Modelo.Poblacion;
/**
 *Clase TestPoblacion: 
 * @param codPostal
 * @param nombrePoblacion
 * 
 */

public class TestPoblacion {
	//Atributos o propiedades:
	private int codPostal=48013;
	private String nombrePoblacion="Bilbao";
	//para el test del Constructor:
	public Poblacion poblacionTest1 = new Poblacion(codPostal, nombrePoblacion); 

	@Test
	public void testConstructor1() {
		Poblacion poblacionTest = new Poblacion(codPostal, nombrePoblacion); 
		assertEquals(poblacionTest.getCodPostal (), codPostal); assertEquals(poblacionTest.getNombrePoblacion (), nombrePoblacion);
	}
	@Test
	public void testCodPostal () {
		poblacionTest1.setCodPostal (codPostal);
		assertEquals(poblacionTest1.getCodPostal (), codPostal);
	}
	@Test
	public void testNombrePoblacion () {
		poblacionTest1.setNombrePoblacion (nombrePoblacion);
		assertEquals(poblacionTest1.getNombrePoblacion (), nombrePoblacion);
	}


}
