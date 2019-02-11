


import java.sql.SQLException;

import Controlador.Controlador;
import Modelo.BBDD;
import Modelo.Llamadas;
import Modelo.Modelo;
import Vista.DebugMode;
import Vista.SelectorBBDD;
import Vista.Vista;
/**
 * Clase Main
 * @author IN1DM3B_18
 *
 */
public class Main {
		static Vista vista;
		static Modelo modelo;
		static Controlador controlador;
		
	public static void main(String[] args) {
		
		modelo = new Modelo();
		vista = new Vista();
		controlador = new Controlador(vista, modelo);
		
		
	}

	public void ResetAll() {
		vista.setPanel(vista.paneBienvenida.paneBienvenida);
		modelo.Reset();
		
	}
}
