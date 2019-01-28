package Modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.Arrays;

import ControladoresPaneles.ControladorSelTrayecto;


	/**
	 *Clase Llamadas: Se encarga de la llamada a los datos de la BBDD: búsquedas, consultas, actualizaciones, etc. 
	 *Realizar una consultas a la BBDD: Recuperar información
	 *Modificar datos en las tablas de la BBDD
	 *Insertar datos en las tablas de la BBDD
	 * @param 
	 */
	
public class Llamadas {
	
	
	//Realizar una consulta a la BBDD: Recuperar información:
	public static void RellenarCliente (Connection con, Cliente cliente, String dni)
	{
		//Declaración e inicialización de variables:
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
				cliente.setSexo(rs.getString("sexo"));
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
	
	public static void busquedaLinea(Connection con, String busqueda, ControladorSelTrayecto controladorSelTrayecto)
	{
		//Declaración e inicialización de variables:
				Statement stmt = null;
				int contador = 1;
				String query;
				query = "select nombre, cod_linea from linea where upper(nombre) like '%" + busqueda.toUpperCase() + "%'";	
				System.out.println("Query: " + query);
					//Inicio programa:
				try {
					stmt = con.createStatement(); 
					ResultSet rs = stmt.executeQuery (query);
					while (rs.next()) {

						controladorSelTrayecto.resultadoBusqueda=Arrays.copyOf(controladorSelTrayecto.resultadoBusqueda, contador); 
						controladorSelTrayecto.resultadoBusquedaCod=Arrays.copyOf(controladorSelTrayecto.resultadoBusquedaCod, contador);
						controladorSelTrayecto.resultadoBusquedaCod[contador-1]=rs.getString("cod_linea");
						controladorSelTrayecto.resultadoBusqueda[contador-1]=rs.getString("nombre");
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
	
	public static void busquedaParada(Connection con, String busqueda, ControladorSelTrayecto controladorSelTrayecto, String codLinea)
	{
		//Declaración e inicialización de variables:
				Statement stmt = null;
				int contador = 1;
				String query;
				query = "select nombre, cod_parada from parada where upper(nombre) like '%" + busqueda.toUpperCase() + "%' and cod_parada in(select cod_parada from linea_parada where cod_linea='" + codLinea + "');";
				System.out.println("Query: " + query);
					//Inicio programa:
				try {
					stmt = con.createStatement(); 
					ResultSet rs = stmt.executeQuery (query);
					while (rs.next()) {

						controladorSelTrayecto.resultadoBusqueda=Arrays.copyOf(controladorSelTrayecto.resultadoBusqueda, contador); 
						controladorSelTrayecto.resultadoBusquedaCod=Arrays.copyOf(controladorSelTrayecto.resultadoBusquedaCod, contador);
						controladorSelTrayecto.resultadoBusquedaCod[contador-1]=rs.getString("cod_parada");
						controladorSelTrayecto.resultadoBusqueda[contador-1]=rs.getString("nombre");
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
		//Declaración e inicialización de variables:
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
		//Declaración e inicialización de variables:
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
	
	
	//Podría hacerse verParadaL1, verParadaL2, verParadaL3, verParadaL4
	//El select creo que sería así pero no funciona en XAMPP
	//SELECT parada.nombre FROM linea, linea-parada, parada WHERE linea.Cod_Linea = linea-parada. Cod_Linea and linea-parada.Cod_Parada = parada.Cod_Parada and Cod_Linea=`L1`
	public static void verParada (Connection con, String termibus) throws SQLException
	{
		//Declaración e inicialización de variables:
		Statement stmt = null;
		String query = "select Cod_Linea, Nombre" + "from" + termibus + ".linea";
		//Inicio programa:
		try {
			stmt = con.createStatement(); 
			ResultSet rs = stmt.executeQuery (query);
			while (rs.next()) {
				String nombreParada = rs.getString("Nombre");
			}
		} catch (SQLException ex){
			printSQLException(ex);
		} finally {
		stmt.close();
		}
	}
	
	public static void verBillete (Connection con, String termibus) throws SQLException
	{
		//Declaración e inicialización de variables:
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
				Date fecha = rs.getDate("Fecha");
				Time hora = rs.getTime("Hora");
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
	//Para modificar el nPlazas del autobus ((también podría ser una transacción!!!!Pag246 libro Programación(RaMa))
	
	public static void modificarNumeroPlazasLibres(Connection con, String termibus) throws SQLException {
		//Declaración e inicialización de variables:
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
	//para añadir cliente o billetes de autobus
	
	public static void insertarCliente(Connection con, String DNI, String nombreCliente, String apellidos, Date fechaNac, String sexo, String contrasena) throws SQLException {
		//Declaración e inicialización de variables:
		Statement stmt = null;
		//Inicio programa:	
		try {
			//ResultSet.TYPE_SCROLL_SENSITIVE: trabaja datos actuales
			//ResultSet.CONCUR_UPDATABLE:para que ResultSet pueda ser actualizado
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("select * from cliente");
			rs.moveToInsertRow();
			rs.updateString("DNI", DNI);
			rs.updateString("Nombre", nombreCliente);
			rs.updateString("Apellidos", apellidos);
			rs.updateDate("Fecha_nac", fechaNac);
			rs.updateString("Sexo", sexo);
			rs.updateString("Contraseña", contrasena);
		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			stmt.close(); 
		}
	}
	
	public static void insertarBillete(Connection con, String termibus, int codBillete, int nTrayecto, int codLinea, int codBus, int codParadaInicio, int codParadaFin, Date fecha, Time hora, String DNI, float precio) throws SQLException {
		//Declaración e inicialización de variables:
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
			rs.updateDate("Fecha", fecha);
			rs.updateTime("Hora", hora);
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
		//Declaración e inicialización de variables:
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
	
	public static String ObtenerContrasena(String dni) {
		//Declaración e inicialización de variables:
				Statement stmt = null;
				String resultado = "";
				//Inicio programa:
				try {
					stmt = BBDD.connection.createStatement(); 
					ResultSet rs = stmt.executeQuery ("SELECT contrasena FROM CLIENTE WHERE DNI='"+ dni.toUpperCase() +"';");
					while (rs.next()) {
						resultado=rs.getString(1);
						System.out.println("Contraseña encriptada: " + resultado);
	
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



public static void verParadasOrdenadasL1 (Connection con, String termibus) throws SQLException
	{
		//Declaración e inicialización de variables:
		Statement stmt = null;
		String query = "SELECT NOMBRE, (SQRT(POWER((LATITUD-(SELECT LATITUD FROM PARADA WHERE COD_PARADA=1)),2) + POWER((LONGITUD-(SELECT LONGITUD FROM PARADA WHERE COD_PARADA=1)),2))) \"DISTANCIA\" FROM PARADA WHERE COD_PARADA IN(SELECT COD_PARADA FROM LINEA_PARADA WHERE COD_LINEA ='L1') ORDER BY DISTANCIA ASC;";
		//Inicio programa:
		try {
			stmt = con.createStatement(); 
			ResultSet rs = stmt.executeQuery (query);
			while (rs.next()) {
				String paradasOrdenadasL1 = rs.getString("Nombre");
			}
		} catch (SQLException ex){
			printSQLException(ex);
		} finally {
		stmt.close();
		}
	}

public static void verParadasOrdenadasL2 (Connection con, String termibus) throws SQLException
	{
		//Declaración e inicialización de variables:
		Statement stmt = null;
		String query = "SELECT NOMBRE, (SQRT(POWER((LATITUD-(SELECT LATITUD FROM PARADA WHERE COD_PARADA=1)),2) + POWER((LONGITUD-(SELECT LONGITUD FROM PARADA WHERE COD_PARADA=1)),2))) \"DISTANCIA\" FROM PARADA WHERE COD_PARADA IN(SELECT COD_PARADA FROM LINEA_PARADA WHERE COD_LINEA ='L2') ORDER BY DISTANCIA ASC;";
		//Inicio programa:
		try {
			stmt = con.createStatement(); 
			ResultSet rs = stmt.executeQuery (query);
			while (rs.next()) {
				String paradasOrdenadasL2 = rs.getString("Nombre");
			}
		} catch (SQLException ex){
			printSQLException(ex);
		} finally {
		stmt.close();
		}
	}

public static void verParadasOrdenadasL3 (Connection con, String termibus) throws SQLException
	{
		//Declaración e inicialización de variables:
		Statement stmt = null;
		String query = "SELECT NOMBRE, (SQRT(POWER((LATITUD-(SELECT LATITUD FROM PARADA WHERE COD_PARADA=1)),2) + POWER((LONGITUD-(SELECT LONGITUD FROM PARADA WHERE COD_PARADA=1)),2))) \"DISTANCIA\" FROM PARADA WHERE COD_PARADA IN(SELECT COD_PARADA FROM LINEA_PARADA WHERE COD_LINEA ='L3') ORDER BY DISTANCIA ASC;";
		//Inicio programa:
		try {
			stmt = con.createStatement(); 
			ResultSet rs = stmt.executeQuery (query);
			while (rs.next()) {
				String paradasOrdenadasL3 = rs.getString("Nombre");
			}
		} catch (SQLException ex){
			printSQLException(ex);
		} finally {
		stmt.close();
		}
	}
}