package Core;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class ControlBBDD {
	Connection connection;
	Statement s = null;
	ResultSet rs = null;
	
	/**
	 * Estas lineas de codigo actualemente estan no estan en uso.
	 * Servian para realizar una consulta generica a la base de datos
	 */
	public String[] ConsultaSQL(String[] resultado, String consultaSQL, String nombreTabla)
	{
		int contador = 1;
		try {
			s=connection.createStatement();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		try {
			rs = s.executeQuery (consultaSQL);
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
		try {
			while(rs.next())
			{
				resultado=Arrays.copyOf(resultado, contador); 
				resultado[contador-1]=rs.getString(nombreTabla);
				contador++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
}
