package Controlador;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import Modelo.Llamadas;
/**
 * Clase: ControladorContrasena
 * Contiene los métodos: encriptarContrasena y combrobarContrasena
 * 
 * @author IN1DM3B_18
 *
 */
public class ControladorContrasena {  
	
	/**
	 * Método: encriptarContrasena. permite encriptar la contraseña:
	 * @param contrasena
	 * @return
	 */
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
	
	/**
	 * Método: combrobarContrasena: comprueba que la contraseña introducida es igual a la contraseña de la BBDD
	 * @param contrasenaEncriptada
	 * @param dni
	 * @return
	 */
	public static boolean combrobarContrasena(String contrasenaEncriptada, String dni)
	{
		if(Llamadas.ObtenerContrasena(dni).equals(contrasenaEncriptada))		
		return true;
		else
		return false;
	}
	
	/**
	 * Método: validarFormatoDNI. 
	 * Método que valida el formato del DNI: valida el DNI utilizando --> Expresiones Regulares
	 * Explicación:
	 * .matches("") --> 
	 * [0-9]{8}: o lo que es lo mismo:  \d{8} -->  Permite coger 8 dígitos.
	 * [-]? : permite introducir un guión opcional.
	 * [A-Z]{1} : coge la ultima letra, solo puede ser una.
	 * @param dni
	 * @return
	 */
	public static boolean validarFormatoDNI (String dni) {
		if(dni.matches("([0-9]{8})([-]?)([A-Z]{1})"))
		{
			System.out.println("1el formato del dni esta validado");
			return true;	
		}
		else
		return false;
	}
}
