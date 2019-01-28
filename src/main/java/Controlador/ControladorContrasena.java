package Controlador;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ControladorContrasena {
	
	public static String encriptarContrasena(String contrasena)
	{
		String contrasenaEncriptada=null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(contrasena.getBytes());
			byte [] arrayByteContrasena = md.digest();
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0;i<arrayByteContrasena.length;i++)
			{
				sb.append(Integer.toString((arrayByteContrasena[i] & 0xff) + 0x100, 16).substring(1));
			}
			contrasenaEncriptada=sb.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		return contrasenaEncriptada;
		
	}
}
