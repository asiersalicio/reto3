package Modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.Arrays;

import Controlador.ControlModelo;
import ControladoresPaneles.ControladorSelTrayecto;


	/**
	 *Clase Llamadas: Se encarga de la llamada a los datos de la BBDD: búsquedas, consultas, actualizaciones, etc. 
	 *Realizar una consultas a la BBDD: Recuperar información
	 *Modificar datos en las tablas de la BBDD
	 *Insertar datos en las tablas de la BBDD
	 * @param 
	 */
	
public class Llamadas {
	
	public static final float precioGasolina = 0.8F;
	
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
				cliente.setFechaNac(rs.getDate("Fecha_nac"));
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


	public static void verLinea (Connection con) 
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
				String nombreLinea = rs.getString("Nombre");
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
	
	public static void modificarNumeroPlazasLibres(Connection con) throws SQLException {
		//Declaración e inicialización de variables:
		int ocupaPlaza=1;
		Statement stmt = null;
					
		//Inicio programa:	
		try {
			//ResultSet.TYPE_SCROLL_SENSITIVE: trabaja datos actuales
			//ResultSet.CONCUR_UPDATABLE:para que ResultSet pueda ser actualizado
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("select N_plazas from autobus ");
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
	
	
	
	public static void insertarCliente(Connection con, String DNI, String nombreCliente, String apellidos, String contrasena) throws SQLException {
		//Declaración e inicialización de variables:
		Statement stmt = null;
		String query="INSERT INTO cliente(DNI, Nombre, Apellidos, fecha_nac, sexo, Contrasena) values ('" + DNI + "', '" + nombreCliente + "', '" + apellidos + "', 20000101, 'V', '" + contrasena + "'); ";		System.out.println(query);
		//Inicio programa:	
		try {
			stmt = con.createStatement();
			stmt.executeUpdate(query);
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



public static void RellenarLinea(Connection con, Linea linea, String codLinea) {
	//Declaración e inicialización de variables:
			Statement stmt = null;
			
			String query = "select Nombre, Cod_linea from linea where Cod_linea='" + codLinea + "';";
			//Inicio programa:
			try {
				System.out.println("Crear statement");
				stmt = con.createStatement(); 
				System.out.println("Execute query");
				ResultSet rs = stmt.executeQuery (query);
				while (rs.next()) {
					linea.setCodLinea(rs.getString("cod_linea"));
					linea.setNombreLinea(rs.getString("Nombre"));
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

public static Parada RellenarParada(Connection con, Parada parada, String codParada) {
	//Declaración e inicialización de variables:
	Statement stmt = null;
	
	String query = "select Nombre, Cod_parada from parada where Cod_parada='" + codParada + "';";
	//Inicio programa:
	try {
		System.out.println("Crear statement");
		stmt = con.createStatement(); 
		System.out.println("Execute query");
		ResultSet rs = stmt.executeQuery (query);
		while (rs.next()) {
			int resultadoCod=rs.getInt("cod_parada");
			parada.setCodParada(resultadoCod);
			String resultadoNom=rs.getString("nombre");
			parada.setNombreParada(resultadoNom);
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
	return parada;
	
}

	public static int SeleccionarAutobus(Connection con)
	{
		
		//Declaración e inicialización de variables:
				Statement stmt = null;
				int codBus = 0;
				String query = "select cod_bus from autobus where cod_bus in(select cod_bus from linea_autobus where cod_linea='" + ControlModelo.linea.getCodLinea() + "') order by n_plazas desc;";
				//Inicio programa:
				try {
					stmt = con.createStatement(); 
					ResultSet rs = stmt.executeQuery (query);
					while (rs.next()) {
						codBus = rs.getInt(1);
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
				return codBus;

	}
	
	public static Autobus RellenarAutobus(Connection con, int codBus, Autobus autobus)
	{
		//Declaración e inicialización de variables:
		Statement stmt = null;
		
		String query = "select * from autobus where Cod_bus='" + codBus + "';";
		//Inicio programa:
		try {
			System.out.println("Crear statement");
			stmt = con.createStatement(); 
			System.out.println("Execute query");
			ResultSet rs = stmt.executeQuery (query);
			while (rs.next()) {
				autobus.setCodBus(rs.getInt("cod_bus"));
				autobus.setnPlazas(rs.getInt("n_plazas"));
				autobus.setConsumoKM(rs.getFloat("Consumo_km"));
				autobus.setColor(rs.getString("color"));
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
		return autobus;
	}
	
	public static float CalcularDistanciaEuclidea(Connection con)
	{
			//Declaración e inicialización de variables:
			Statement stmt = null;
			float distancia = 0;
			String query = "SELECT (SQRT(POWER(((SELECT LATITUD FROM PARADA WHERE COD_PARADA=" + ControlModelo.paradaDestino.getCodParada() + ")-(SELECT LATITUD FROM PARADA WHERE COD_PARADA=" + ControlModelo.paradaOrigen.getCodParada() + ")),2) + POWER(((SELECT LONGITUD FROM PARADA WHERE COD_PARADA=" + ControlModelo.paradaDestino.getCodParada() + ")-(SELECT LONGITUD FROM PARADA WHERE COD_PARADA=" + ControlModelo.paradaOrigen.getCodParada() + ")),2))) \"DISTANCIA\" FROM DUAL;";
			System.out.println("Query: " + query);
			//Inicio programa:
			try {
				stmt = con.createStatement(); 
				ResultSet rs = stmt.executeQuery (query);
				while (rs.next()) {
					distancia= rs.getFloat("distancia");
				}
				//Convertir distancia en grados a KM
				distancia=distancia*111.325F;
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
		
		return distancia;
	}
	
	public static int CalcularCodBillete(Connection con)
	{
			//Declaración e inicialización de variables:
			Statement stmt = null;
			int codBillete = 0;
			String query = "SELECT COUNT(*) FROM BILLETE";
			System.out.println("Query: " + query);
			//Inicio programa:
			try {
				stmt = con.createStatement(); 
				ResultSet rs = stmt.executeQuery (query);
				while (rs.next()) {
					codBillete= rs.getInt(1);
				}
				//Convertir distancia en grados a KM
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
		
		return codBillete;
	}
	
	public static float CalcularPrecioBus()
	{
		float consumoBus = ControlModelo.autobus.getConsumoKM();
		return consumoBus*precioGasolina;
	}

	public static float CalcularPrecioBillete(Connection connection) {
			float distancia;
			float precioKM;
			float precio;
			distancia=CalcularDistanciaEuclidea(BBDD.connection);
			precioKM=CalcularPrecioBus();
			System.out.println("Distancia: " + distancia);
			System.out.println("PrecioKM: " + precioKM);
			precio=precioKM*distancia;
			System.out.println("Precio del billete: " + precio + "€");
		return precio;
	}
	
	
	
}