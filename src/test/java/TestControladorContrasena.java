import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import Controlador.ControladorContrasena;

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
