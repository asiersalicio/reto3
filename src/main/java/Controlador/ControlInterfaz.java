package Controlador;


import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ControladoresPaneles.ControladorBienvenida;
import ControladoresPaneles.ControladorCambioFinal;
import ControladoresPaneles.ControladorLogin;
import ControladoresPaneles.ControladorMostrarCompra;
import ControladoresPaneles.ControladorPago;
import ControladoresPaneles.ControladorRegister;
import ControladoresPaneles.ControladorSelTrayecto;
import Vista.Frame1;
import Vista.PaneBienvenida;
import Vista.PaneCambioFinal;
import Vista.PaneLogin;
import Vista.PaneMostrarCompra;
import Vista.PanePago;
import Vista.PaneRegister;
import Vista.PaneSelTrayecto;

/**
 * Clase ControlInterfaz: contiene las instancias de los Frame, Pane y Controladores de los diferentes paneles de la interfaz
 * @author IN1DM3B_18
 *
 */

public class ControlInterfaz {
	
	public static Frame1 frame1;
	public static PaneBienvenida paneBienvenida; 
	public static PaneLogin paneLogin;
	public static PaneRegister paneRegister;
	public static PaneSelTrayecto paneSelTrayecto;
	public static PanePago panePago;
	public static PaneCambioFinal paneCambioFinal;
	public static PaneMostrarCompra paneMostrarCompra;

	public static ControladorLogin controladorLogin;
	public static ControladorSelTrayecto controladorSelTrayecto;
	public static ControladorMostrarCompra controladorMostrarCompra;
	public static ControladorPago controladorPago;
	public static ControladorRegister controladorRegister;
	public static ControladorCambioFinal controladorCambioFinal;
	public static ControladorBienvenida controladorBienvenida;
	

	/**
	 * Método: InicializarInterfaz()
	 */
	public static void InicializarInterfaz()
	{
		//Crea el frame pero no visible
		frame1 = new Frame1();
		//Crea los paneles
		paneBienvenida = new PaneBienvenida(frame1);
		paneLogin = new PaneLogin(frame1);
		paneCambioFinal = new PaneCambioFinal(frame1);
		
		panePago= new PanePago(frame1);
		paneMostrarCompra = new PaneMostrarCompra(frame1);
		paneSelTrayecto = new PaneSelTrayecto(frame1);
		
		controladorMostrarCompra = new ControladorMostrarCompra(paneMostrarCompra);
		controladorSelTrayecto = new ControladorSelTrayecto(paneSelTrayecto, paneMostrarCompra);
		controladorLogin = new ControladorLogin(paneLogin);
		controladorPago = new ControladorPago(panePago);
		paneRegister = new PaneRegister(frame1);
		controladorRegister = new ControladorRegister(paneRegister, paneLogin);
		controladorCambioFinal = new ControladorCambioFinal(paneCambioFinal,panePago);
		controladorBienvenida =new ControladorBienvenida(paneBienvenida);
		
		//Establece como visible el JFrame
		frame1.frame1.setVisible(true);
		//Establece "paneLogin" como panel actual
		frame1.setPane(paneBienvenida.paneBienvenida);
	}
	
	/**
	 * Método: setPanel: permite cambiar de un panel a otro
	 * @param paneNuevo
	 */
	public static void setPanel(JPanel paneNuevo)
	{
		frame1.setPane(paneNuevo);
	}
	
	/**
	 * Método: ActualizarTextoJLabel: permite actualizar el texto del JLabel
	 * @param label
	 * @param texto
	 */
	public static void ActualizarTextoJLabel(JLabel label, String texto)
	{
		label.setText(texto);
	}
	
	/**
	 * Método: ActualizarListaJCombobox: permite actualizar la lista del JCombobox
	 * @param combobox
	 * @param texto
	 */
	public static void ActualizarListaJCombobox(JComboBox combobox, String[] texto)
	{
		combobox.setModel(new DefaultComboBoxModel(texto));
	}
	
}
