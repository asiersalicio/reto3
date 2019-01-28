package Modelo;

import java.sql.*;


/**
 *Clase Conexion: establece la conexión con la base de datos
 *
 * @param 
 */


public class BBDD {
	
	public static Connection connection;
	public static 
	Statement s = null;
	ResultSet rs = null;


	public static void Conectar(String urlBBDD, String username, String password)
	{
		System.out.println("Intentando conectarse a la BBDD " + urlBBDD + " con el nombre de usuario " + username + "...");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			} catch (Exception e)
			{
			 e.printStackTrace();
			 System.out.println("Error en libreria SQL");
		}
			try {
				connection= DriverManager.getConnection ("jdbc:" + urlBBDD,  username, password);
				System.out.println("¡Conexion con BBDD establecida con exito!");
			} catch (com.mysql.jdbc.exceptions.jdbc4.CommunicationsException e) {
				e.printStackTrace();
				System.out.println("Error en conexion con BBDD");
			} catch (SQLException e) {
				e.printStackTrace();
			}

	}
	
	//Se utilizan SQLException, es decir, el tratamiento de excepciones se realiza en la función printSQLException:
	@SuppressWarnings("null")
	public static void printSQLException(SQLException ex) {
	    SQLException e = null;
		e.printStackTrace(System.err);
	    	System.err.println("SQLState: " + ((SQLException)e).getSQLState());
	        System.err.println("Error Code: " + ((SQLException)e).getErrorCode());
	        System.err.println("Message: " + e.getMessage());
	        Throwable t = ex.getCause();
	        while(t != null) {
	        	 System.out.println("Cause: " + t);
	             t = t.getCause();
	       }
	}
	
}
