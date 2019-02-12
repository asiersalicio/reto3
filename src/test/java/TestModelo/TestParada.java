package TestModelo;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Modelo.Parada;

/**
 *Clase TestParada: 
 * @param codParada
 * @param nombreParada
 * @param calle
 * @param latitud
 * @param longitud
 * 
 */

	public class TestParada {
	//Atributos o propiedades:
	public int codParada=1;
	public String nombreParada="Termibus-Bilbao";
	public String calle="Luis Briñas";
	public float latitud=(float) 43.2614;
	public float longitud=(float) -2.94974;	

	//para el test del Constructor:
	public Parada paradaTest1 = new Parada (codParada, nombreParada, calle, latitud, longitud);
	@Test
	public void testConstructor1() {
		Parada paradaTest = new Parada (codParada, nombreParada, calle, latitud, longitud);
		assertEquals(paradaTest.getCodParada (), codParada,0);
		assertEquals(paradaTest.getNombreParada (), nombreParada);
		assertEquals(paradaTest.getLatitud (), latitud,0.01);
		assertEquals(paradaTest.getLongitud (), longitud,0.01);
	}
	
	@Test
	public void testCodParada () {
		paradaTest1.setCodParada (codParada);
		assertEquals(paradaTest1.getCodParada (), codParada);
	}
	
	@Test
	public void testNombreParada () {
		paradaTest1.setNombreParada (nombreParada);
		assertEquals(paradaTest1.getNombreParada (), nombreParada);
	}

	@Test
	public void testCalle () {
		paradaTest1.setCalle (calle);
		assertEquals(paradaTest1.getCalle (), calle);
	}
	@Test
	public void testLatitud () {
	paradaTest1.setLatitud (latitud);
	assertEquals(paradaTest1.getLatitud (), latitud,0.01);
	}
	@Test
	public void testLongitud () {
	paradaTest1.setLongitud (longitud);
	assertEquals(paradaTest1.getLongitud (), longitud,0.01);
	}
}
