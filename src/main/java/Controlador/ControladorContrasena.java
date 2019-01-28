package Controlador;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ControladorContrasena {
	
	public static boolean ComprobarContrasena(String contrasena)
	{
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(contrasena.getBytes());
			
		
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
		
	}
}
