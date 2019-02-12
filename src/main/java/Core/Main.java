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
		
		/**
		 * Estas lineas de codigo son las primeras que se ejecutan al iniciar el programa
		 * 
		 *
		 */
	public static void main(String[] args) {
		
		modelo = new Modelo();
		vista = new Vista();
		controlador = new Controlador(vista, modelo);
		
		
	}
	/**
	 * Estas lineas de codigo sirven para ejecutar los programas que borran todos los campos de todas las pantallas
	 * 
	 *
	 */
	public static void ResetAll() {
		vista.setPanel(vista.paneBienvenida.paneBienvenida);
		new Reset(vista, modelo);
	}
}
