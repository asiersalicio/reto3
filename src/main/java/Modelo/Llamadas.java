package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

import ControladoresPaneles.ControladorSelTrayecto;


	/**
	 *Clase Llamadas: Se encarga de la llamada a los datos de la BBDD: b�squedas, consultas, actualizaciones, etc. 
	 *Realizar una consultas a la BBDD: Recuperar informaci�n
	 *Modificar datos en las tablas de la BBDD
	 *Insertar datos en las tablas de la BBDD
	 * @param 
	 */
	
public class Llamadas {
	
	
	//Realizar una consulta a la BBDD: Recuperar informaci�n:
	public static void RellenarCliente (Connection con, Cliente cliente, String dni)
	{
		//Declaraci�n e inicializaci�n de variables:
		Statement stmt = null;
		
		String query = "select DNI, Nombre, Apellidos, Fecha_nac, Sexo, Contrasena from cliente where dni='" + dni + "';";
		//Inicio programa:
		try {
			System.out.println("Crear statement");
			stmt = con.createStatement(); 
			System.out.println("Execute query");
			ResultSet rs = stmt.executeQuery (query);
			System.out.println("PRUEBA");
			while (rs.next()) {
				cliente.setDNI(rs.getString("DNI"));
				cliente.setNombreCliente(rs.getString("Nombre"));
				cliente.setApellidos(rs.getString("Apellidos"));
				cliente.setFechaNac(rs.getString("Fecha_nac"));
				cliente.setSexo(rs.getString("Sexo"));
				cliente.setContrasena(rs.getString("Contrasena"));
			}
		} catch (SQLException ex){
			printSQLException(ex);
		} finally {
		try {
			stmt.close();
		} catch (SQLException e) {
			System.out.println("PRUEBA2");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
	public static void busquedaTrayecto(Connection con, String busqueda, ControladorSelTrayecto controladorSelTrayecto)
	{
		//Declaraci�n e inicializaci�n de variables:
				Statement stmt = null;
				int contador = 1;
				String query = "select Nombre, Cod_linea from linea where upper(Nombre) like '%" + busqueda.toUpperCase() + "%'";
				//Inicio programa:
				try {
					stmt = con.createStatement(); 
					ResultSet rs = stmt.executeQuery (query);
					while (rs.next()) {

						controladorSelTrayecto.resultadoBusqueda=Arrays.copyOf(controladorSelTrayecto.resultadoBusqueda, contador); 
						controladorSelTrayecto.resultadoBusquedaCod=Arrays.copyOf(controladorSelTrayecto.resultadoBusquedaCod, contador);
						controladorSelTrayecto.resultadoBusquedaCod[contador-1]=rs.getString("Cod_Linea");
						controladorSelTrayecto.resultadoBusqueda[contador-1]=rs.getString("Nombre");
						contador++;
					}
					
				} catch (SQLException ex){
					printSQLException(ex);
				} finally {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
	}


	
	public static void verLinea (Connection con, String nombreBBDD) 
	{
		//Declaraci�n e inicializaci�n de variables:
		Statement stmt = null;
		String query = "select Cod_Linea, Nombre" + "from" + nombreBBDD + ".linea";
		//Inicio programa:
		try {
			stmt = con.createStatement(); 
			ResultSet rs = stmt.executeQuery (query);
			while (rs.next()) {
				String codLinea = rs.getString("Cod_Linea");
				 System.out.println("codLinea es: " + codLinea);
			}
		} catch (SQLException ex){
			printSQLException(ex);
		} finally {
		try {
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
	public static void verLineas (Connection con)
	{
		//Declaraci�n e inicializaci�n de variables:
		Statement stmt = null;
		String query = "select Cod_Linea, Nombre from linea";
		//Inicio programa:
		try {
			stmt = con.createStatement(); 
			ResultSet rs = stmt.executeQuery (query);
			while (rs.next()) {
				String codLinea = rs.getString("Cod_Linea");
				 System.out.println("codLinea es: " + codLinea);
			}
		} catch (SQLException ex){
			printSQLException(ex);
		} finally {
		try {
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
	
	//Podr�a hacerse verParadaL1, verParadaL2, verParadaL3, verParadaL4
	//El select creo que ser�a as� pero no funciona en XAMPP
	//SELECT parada.nombre FROM linea, linea-parada, parada WHERE linea.Cod_Linea = linea-parada. Cod_Linea and linea-parada.Cod_Parada = parada.Cod_Parada and Cod_Linea=`L1`
	public static void verParada (Connection con, String termibus) throws SQLException
	{
		//Declaraci�n e inicializaci�n de variables:
		Statement stmt = null;
		String query = "select Cod_Linea, Nombre" + "from" + termibus + ".linea";
		//Inicio programa:
		try {
			stmt = con.createStatement(); 
			ResultSet rs = stmt.executeQuery (query);
			while (rs.next()) {
				String NombreParada = rs.getString("Nombre");
			}
		} catch (SQLException ex){
			printSQLException(ex);
		} finally {
		stmt.close();
		}
	}
	
	public static void verBillete (Connection con, String termibus) throws SQLException
	{
		//Declaraci�n e inicializaci�n de variables:
		Statement stmt = null;
		//Inicio programa:
		try {
			stmt = con.createStatement(); 
			ResultSet rs = stmt.executeQuery ("select * from" + termibus + ".billete");
			while (rs.next()) {
				int codBillete = rs.getInt("Cod_Billete");
				int nTrayecto = rs.getInt("NTrayecto");
				int codLinea = rs.getInt("Cod_Linea");
				int codBus = rs.getInt("Cod_Bus");
				int codParadaInicio = rs.getInt("Cod_Parada_Inicio");
				int codParadaFin = rs.getInt("Cod_Parada_Fin");
				int fecha = rs.getInt("Fecha");
				int hora = rs.getInt("Hora");
				String DNI = rs.getString("DNI");
				float precio = rs.getFloat("Precio");
			}
		} catch (SQLException ex){
			printSQLException(ex);
		} finally {
		stmt.close();
		}
	}
	
	//Modificar datos en las tablas utlizando Resultset
	//Para modificar el nPlazas del autobus ((tambi�n podr�a ser una transacci�n!!!!Pag246 libro Programaci�n(RaMa))
	
	public static void modificarNumeroPlazasLibres(Connection con, String termibus) throws SQLException {
		//Declaraci�n e inicializaci�n de variables:
		int ocupaPlaza=1;
		Statement stmt = null;
					
		//Inicio programa:	
		try {
			//ResultSet.TYPE_SCROLL_SENSITIVE: trabaja datos actuales
			//ResultSet.CONCUR_UPDATABLE:para que ResultSet pueda ser actualizado
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("select N_plazas from" + termibus + ".autobus");
			while(rs.next()) {
				int i = rs.getInt("N_plazas");
				rs.updateInt("N_plazas", i + ocupaPlaza);//modifica l
				rs.updateRow();//actualiza la BBDD
				}
		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close(); 
		}
	}
	
	//Insertar datos en las tablas utilizando Resulset
	//para a�adir cliente o billetes de autobus
	
	public static void insertarCliente(Connection con, String termibus, int DNI, String nombreCliente, String apellidos, String fechaNac, String sexo, String contrasena) throws SQLException {
		//Declaraci�n e inicializaci�n de variables:
		Statement stmt = null;
		//Inicio programa:	
		try {
			//ResultSet.TYPE_SCROLL_SENSITIVE: trabaja datos actuales
			//ResultSet.CONCUR_UPDATABLE:para que ResultSet pueda ser actualizado
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("select * from" + termibus + ".cliente");
			rs.moveToInsertRow();
			rs.updateInt("DNI", DNI);
			rs.updateString("Nombre", nombreCliente);
			rs.updateString("Apellidos", apellidos);
			rs.updateString("Fecha_nac", fechaNac);
			rs.updateString("Sexo", sexo);
			rs.updateString("Contrase�a", contrasena);
		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close(); 
		}
	}
	
	public static void insertarBillete(Connection con, String termibus, int codBillete, int nTrayecto, int codLinea, int codBus, int codParadaInicio, int codParadaFin, int fecha, int hora, String DNI, float precio) throws SQLException {
		//Declaraci�n e inicializaci�n de variables:
		Statement stmt = null;
		//Inicio programa:	
		try {
			//ResultSet.TYPE_SCROLL_SENSITIVE: trabaja datos actuales
			//ResultSet.CONCUR_UPDATABLE:para que ResultSet pueda ser actualizado
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("select * from" + termibus + ".billete");
			rs.moveToInsertRow();
			rs.updateInt("Cod_Billete", codBillete);
			rs.updateInt("NTrayecto", nTrayecto);
			rs.updateInt("Cod_Linea", codLinea);
			rs.updateInt("Cod_Bus", codBus);
			rs.updateInt("Cod_Parada_Inicio", codParadaInicio);
			rs.updateInt("Cod_Parada_Fin", codParadaFin);
			rs.updateInt("Fecha", fecha);
			rs.updateInt("Hora", hora);
			rs.updateString("DNI", DNI);
			rs.updateFloat("Precio", precio);
		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close(); 
		}
	}

	private static void printSQLException(SQLException e) {
		// TODO Auto-generated method stub
		
	}

	public static boolean validarDNI(String dni) {
		//Declaraci�n e inicializaci�n de variables:
				Statement stmt = null;
				boolean resultado = false;
				//Inicio programa:
				try {
					stmt = BBDD.connection.createStatement(); 
					ResultSet rs = stmt.executeQuery ("SELECT DNI FROM CLIENTE WHERE DNI='"+ dni.toUpperCase() +"';");
					while (rs.next()) {
						if(rs.getString(1).equals(dni))
						{
							resultado = true;
						}
						else
						{
							resultado = false;
						}
	
					}
				} catch (SQLException ex){
					printSQLException(ex);
				} finally {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				}
				return resultado;
	}
	
}