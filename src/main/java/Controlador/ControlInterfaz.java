package Controlador;


import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ControladoresPaneles.ControladorLogin;
import ControladoresPaneles.ControladorMostrarCompra;
import ControladoresPaneles.ControladorPago;
import ControladoresPaneles.ControladorSelTrayecto;
import Vista.Frame1;
import Vista.PaneBienvenida;
import Vista.PaneCambioFinal;
import Vista.PaneLogin;
import Vista.PaneMostrarCompra;
import Vista.PanePago;
import Vista.PaneRegister;
import Vista.PaneSelTrayecto;

public class ControlInterfaz {
	
	public static Frame1 frame1;
	public static PaneBienvenida paneBienvenida;
	public static PaneLogin paneLogin;
	public static PaneRegister paneRegister;
	public static PaneSelTrayecto paneSelTrayecto;
	public static PanePago panePago;
	public static ControladorLogin controladorLogin;
	public static ControladorSelTrayecto controladorSelTrayecto;
	public static PaneCambioFinal paneCambioFinal;
	public static PaneMostrarCompra paneMostrarCompra;
	public static ControladorMostrarCompra controladorMostrarCompra;
	public static ControladorPago controladorPago;
	
	public static void InicializarInterfaz()
	{
		//Crea el frame pero no visible
		frame1 = new Frame1();
		//Crea los paneles
		paneBienvenida = new PaneBienvenida(frame1);
		paneLogin = new PaneLogin(frame1);
		paneRegister = new PaneRegister(frame1);
		paneLogin = new PaneLogin(frame1);
		paneCambioFinal = new PaneCambioFinal(frame1);
		paneLogin = new PaneLogin(frame1);
		paneRegister = new PaneRegister(frame1);
		paneLogin = new PaneLogin(frame1);
		controladorLogin = new ControladorLogin(paneLogin);
		panePago= new PanePago(frame1);
		paneRegister = new PaneRegister(frame1);
		paneMostrarCompra = new PaneMostrarCompra(frame1);
		controladorMostrarCompra = new ControladorMostrarCompra(paneMostrarCompra);
		paneSelTrayecto = new PaneSelTrayecto(frame1);
		
		controladorSelTrayecto = new ControladorSelTrayecto(paneSelTrayecto, paneMostrarCompra);
		controladorLogin = new ControladorLogin(paneLogin);
		controladorPago = new ControladorPago(panePago);
		controladorSelTrayecto = new ControladorSelTrayecto(paneSelTrayecto, paneMostrarCompra);

		
		//Establece como visible el JFrame
		frame1.frame1.setVisible(true);
		//Establece "paneLogin" como panel actual
		frame1.setPane(paneBienvenida.paneBienvenida);
	}
	
	
	//Cambia de un pane a otro
	public static void setPanel(JPanel paneNuevo)
	{
		frame1.setPane(paneNuevo);
	}
	
	public static void ActualizarTextoJLabel(JLabel label, String texto)
	{
		label.setText(texto);
	}
	
	
	public static void ActualizarListaJCombobox(JComboBox combobox, String[] texto)
	{
		combobox.setModel(new DefaultComboBoxModel(texto));
	}
	
}
