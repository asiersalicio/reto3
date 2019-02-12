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
	

	public String[] ConsultaSQL(String[] resultado, String consultaSQL, String nombreTabla)
	{
		int contador = 1;
		try {
			s=connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			rs = s.executeQuery (consultaSQL);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado;
	}
}
