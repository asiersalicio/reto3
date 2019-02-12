package Core;



import Controlador.Controlador;
import Funciones.Reset;
import Modelo.Modelo;
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

	public static void ResetAll() {
		vista.setPanel(vista.paneBienvenida.paneBienvenida);
		new Reset(vista, modelo);
	}
}
