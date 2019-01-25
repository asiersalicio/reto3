package Controlador;


import java.sql.SQLException;

import Modelo.BBDD;
import Modelo.Llamadas;
import Vista.DebugMode;

public class Main {

		
	public static void main(String[] args) {
		
		boolean debug = true;

		BBDD.Conectar("mysql://192.168.101.16/termibus","hr","hr");
		ControlModelo controlModelo = new ControlModelo();
		
		
		//Crea un controlador de interfaz
		ControlInterfaz controlInterfaz = new ControlInterfaz();
		//Ejecuta el proceso para la creacion de la interfaz
		controlInterfaz.InicializarInterfaz();
		
		if(debug)
		{
			new DebugMode(controlInterfaz);
		}
		
	}
}
