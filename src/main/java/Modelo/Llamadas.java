package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Calendar;

import ControladoresPaneles.ControladorSelTrayecto;
import Funciones.FuncionesFecha;

	/**
	 *Clase Llamadas: Se encarga de la llamada a los datos de la BBDD: búsquedas, consultas, actualizaciones, etc. 
	 *Realizar una consultas a la BBDD: Recuperar información
	 *Modificar datos en las tablas de la BBDD
	 *Insertar datos en las tablas de la BBDD
	 * @param precioGasolina
	 */
	
public class Llamadas {
	
	public final float precioGasolina = 0.8F;
	public final float beneficio = 1.2F;
	public final float IVA = 1.21F;
	
	public Modelo modelo;
	
	public Llamadas(Modelo modelo)
	{
		this.modelo=modelo;
	}
	
	//Realizar una consulta a la BBDD: Recuperar información del Cliente
	public void RellenarCliente (Connection con, Cliente cliente, String dni)
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
			while (rs.next()) { //rs.next(): mientras exista otro rs, se pasa al siguiente con next()
				cliente.setDNI(rs.getString("DNI"));
				cliente.setNombreCliente(rs.getString("Nombre"));
				cliente.setApellidos(rs.getString("Apellidos"));
				//cliente.setFechaNac(rs.getDate("Fecha_nac"));
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
	
	public void busquedaLinea(Connection con, String busqueda, ControladorSelTrayecto controladorSelTrayecto)
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
	
	
	public void TodasLasLineas(Connection con, ControladorSelTrayecto controladorSelTrayecto)
	{
		//Declaración e inicialización de variables:
				Statement stmt = null;
				int contador = 1;
				String query;
				query = "select nombre, cod_linea from linea;";	
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
	
	public void busquedaParada(Connection con, String busqueda, ControladorSelTrayecto controladorSelTrayecto, String codLinea)
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
	
	public void busquedaParadaEvitando(Connection con, String busqueda, ControladorSelTrayecto controladorSelTrayecto, String codLinea, String CodParadaEvitar)
	{
		//Declaración e inicialización de variables:
				Statement stmt = null;
				int contador = 1;
				String query;
				query = "select nombre, cod_parada from parada where upper(nombre) like '%" + busqueda.toUpperCase() + "%' and cod_parada in(select cod_parada from linea_parada where cod_linea='" + codLinea + "') AND NOT COD_PARADA =" + CodParadaEvitar +";";
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


/*
	 * public void verLinea (Connection con) 

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

		 */
	

	
	//Insertar datos en las tablas utilizando Resulset
	//para añadir cliente o billetes de autobus
	
	
	
	public void insertarCliente(Connection con, String DNI, String nombreCliente, String apellidos, String contrasena, String sexo, Calendar fechaNac) throws SQLException {
		//Declaración e inicialización de variables:
		Statement stmt = null;
		String fechaconcatenada=FuncionesFecha.CalendarToString(fechaNac);
		System.out.println("Fecha de nacimiento: " + fechaconcatenada);
		String query="INSERT INTO cliente(DNI, Nombre, Apellidos, fecha_nac, sexo, Contrasena) values ('" + DNI + "', '" + nombreCliente + "', '" + apellidos + "', " + fechaconcatenada +", '" + sexo +"', '" + contrasena + "'); ";		System.out.println(query);
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
	
	public void insertarBillete(Connection con, Billete billete, boolean billeteVuelta, Calendar fecha){
		//Declaración e inicialización de variables:
		int codBillete=billete.getCodBillete();
		int nTrayecto = billete.getnTrayecto();
		String codLinea=billete.getCodLinea();
		int codBus=billete.getAutobus().getCodBus();
		int codParadaInicio=billete.getParadaInicio().getCodParada();
		int codParadaFin=billete.getParadaFin().getCodParada();
		String hora="0000";
		String dni=billete.getCliente().getDNI();
		float precio=billete.getPrecio();

		String query="INSERT INTO billete(Cod_Billete, Ntrayecto, COD_LINEA, COD_BUS, COD_PARADA_INICIO, COD_PARADA_FIN, FECHA, HORA, DNI, PRECIO) values (" + codBillete + ", " + nTrayecto + ", '" + codLinea + "', " + codBus + ", " + codParadaInicio  + ", " + codParadaFin + ", " + FuncionesFecha.CalendarToString(fecha) + ", " + hora + ", '" + dni + "', " + precio + ");";		System.out.println(query);
		
		Statement stmt = null;

		
		//Inicio programa:	
		try {
			stmt = con.createStatement();
			stmt.executeUpdate(query);
		} catch (SQLException e) {
			printSQLException(e);
		} finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
	
	
	
	private void printSQLException(SQLException e) {
		// TODO Auto-generated method stub
		
	}

	public boolean validarDNI(String dni) {
		//Declaración e inicialización de variables:
				Statement stmt = null;
				boolean resultado = false;
				//Inicio programa:
				try {
					stmt = BBDD.connection.createStatement(); 
					String query="SELECT DNI FROM CLIENTE WHERE UPPER(DNI)='"+ dni.toUpperCase() +"';";
					System.out.println(query);
					ResultSet rs = stmt.executeQuery (query);
					System.out.println();
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
	
	public String ObtenerContrasena(String dni) {
		//Declaración e inicialización de variables:
				Statement stmt = null;
				String resultado = "";
				//Inicio programa:
				try {
					stmt = BBDD.connection.createStatement(); 
					ResultSet rs = stmt.executeQuery ("SELECT contrasena FROM CLIENTE WHERE UPPER(DNI)='"+ dni.toUpperCase() +"';");
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




public void RellenarLinea(Connection con, Linea linea, String codLinea) {
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

public Parada RellenarParada(Connection con, Parada parada, String codParada) {
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

	public int SeleccionarAutobus(Connection con, Calendar fecha)
	{
		
		//Declaración e inicialización de variables:
				Statement stmt = null;
				int codautobus[]=new int[1];
				int nplazasbus[]=new int[1];
				int i=0;
				String query = "select cod_bus, n_plazas from autobus where cod_bus in(select cod_bus from linea_autobus where cod_linea='" + modelo.linea.getCodLinea() + "') group by cod_bus;";
				//Inicio programa:
				try {
					stmt = con.createStatement(); 
					ResultSet rs = stmt.executeQuery (query);
					while (rs.next()) {
						codautobus=Arrays.copyOf(codautobus, i+1);
						nplazasbus=Arrays.copyOf(nplazasbus, i+1);
						
						codautobus[i]=rs.getInt("cod_bus");
						nplazasbus[i]=rs.getInt("n_plazas");
						System.out.println(codautobus[i] + " asientos: " + nplazasbus[i]);
						i++;
					}
					i--;
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
				
				int pOcupadas = 0;
				int pLibres = 0;
				int y=-1;
				do {
					y++;
				stmt = null;
				
				
				query = "select count(*) from billete where cod_bus=" + codautobus[y] + " and fecha="+ FuncionesFecha.CalendarToString(fecha) +";";
				//Inicio programa:
				try {
					stmt = con.createStatement(); 
					ResultSet rs = stmt.executeQuery (query);
					rs.next();
					pOcupadas=rs.getInt(1);
					System.out.println("Bus n: " + y + " cod: " + codautobus[y] + " plazas: " +  nplazasbus[y] + " ocupadas: " + pOcupadas);
					pLibres=nplazasbus[y]-pOcupadas;		
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
				
				
				}while(pLibres<=0&&y<i);
				
				
				if(pLibres>=1) {
					System.out.println("Autobus seleccionado Nº" + codautobus[y]);
					return codautobus[y];}
				else
					return -1;
				

	}
	
	public Autobus RellenarAutobus(Connection con, int codBus, Autobus autobus)
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
	
	public float CalcularDistanciaEuclidea(Connection con)
	{
			//Declaración e inicialización de variables:
			Statement stmt = null;
			float distancia = 0;
			String query = "SELECT (SQRT(POWER(((SELECT LATITUD FROM PARADA WHERE COD_PARADA=" + modelo.paradaDestino.getCodParada() + ")-(SELECT LATITUD FROM PARADA WHERE COD_PARADA=" + modelo.paradaOrigen.getCodParada() + ")),2) + POWER(((SELECT LONGITUD FROM PARADA WHERE COD_PARADA=" + modelo.paradaDestino.getCodParada() + ")-(SELECT LONGITUD FROM PARADA WHERE COD_PARADA=" + modelo.paradaOrigen.getCodParada() + ")),2))) \"DISTANCIA\" FROM DUAL;";
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
	
	public int CalcularCodBillete(Connection con)
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
				codBillete--;
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
	
	public float CalcularPrecioBus(Autobus autobus)
	{
		float consumoBus = autobus.getConsumoKM();
		return consumoBus*precioGasolina*beneficio*IVA;
	}

	public float CalcularPrecioBillete(Connection connection, Autobus autobus) {
			float distancia;
			float precioKM;
			float precio;
			distancia=CalcularDistanciaEuclidea(BBDD.connection);
			precioKM=CalcularPrecioBus(autobus);
			System.out.println("Distancia: " + distancia);
			System.out.println("PrecioKM: " + precioKM);
			precio=precioKM*distancia;
			System.out.println("Precio del billete: " + precio + "€");
		return precio;
	}

	
	
}