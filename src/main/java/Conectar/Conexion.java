package Conectar;

import java.sql.*;

import Modelo.Llamadas;

/**
 *Clase Conexion: establece la conexión con la base de datos
 *
 * @param 
 */
public class Conexion {
	
	static Connection connection;
	Statement s = null;
	ResultSet rs = null;

	public static void main(String[] args) {
		
		conectar ();
		try {
			Llamadas.verBillete(connection, "termibus");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void conectar ()
	{
		

		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			} catch (Exception e)
			{
			 e.printStackTrace();
			 System.out.println("error");
		}
		try {
			connection= DriverManager.getConnection ("jdbc:mysql://localhost/termibus","hr", "hr");
		} catch (SQLException e1) {
			System.out.println("error en conexion");
			// TODO Auto-generated catch block
			e1.printStackTrace();
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
