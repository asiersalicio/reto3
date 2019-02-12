import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Funciones.FuncionesContrasena;

public class TestControladorContrasena {


	public TestControladorContrasena(){
		test();
	}
	
	@Test
	public void test()
	{
		String contrasenaEncriptada;
		contrasenaEncriptada=FuncionesContrasena.encriptarContrasena("TEST");
		assertEquals("033bd94b1168d7e4f0d644c3c95e35bf", contrasenaEncriptada);
	}

}
