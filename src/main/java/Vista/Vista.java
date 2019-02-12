package Vista;


import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Clase ControlInterfaz: contiene las instancias de los Frame, Pane y Controladores de los diferentes paneles de la interfaz
 * @author IN1DM3B_18
 *
 */

public class Vista {
	
	public Frame1 frame1;
	public PaneBienvenida paneBienvenida; 
	public PaneLogin paneLogin;
	public PaneRegister paneRegister;
	public PaneSelTrayecto paneSelTrayecto;
	public PanePago panePago;
	public PaneCambioFinal paneCambioFinal;
	public PaneMostrarCompra paneMostrarCompra;
	
	public Vista()
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

		paneRegister = new PaneRegister(frame1);
	}

	/**
	 * Método: InicializarInterfaz()
	 */
	public void InicializarInterfaz()
	{
	
		
		//Establece como visible el JFrame
		frame1.frame1.setVisible(true);
		//Establece "paneLogin" como panel actual
		frame1.setPane(paneBienvenida.paneBienvenida);
	}
	
	/**
	 * Método: setPanel: permite cambiar de un panel a otro
	 * @param paneNuevo
	 */
	public void setPanel(JPanel paneNuevo)
	{
		frame1.setPane(paneNuevo);
	}
	
	/**
	 * Método: ActualizarTextoJLabel: permite actualizar el texto del JLabel
	 * @param label
	 * @param texto
	 */
	public void ActualizarTextoJLabel(JLabel label, String texto)
	{
		label.setText(texto);
	}
	
	/**
	 * Método: ActualizarListaJCombobox: permite actualizar la lista del JCombobox
	 * @param combobox
	 * @param texto
	 */
	public void ActualizarListaJCombobox(JComboBox combobox, String[] texto)
	{
		combobox.setModel(new DefaultComboBoxModel(texto));
	}
	
}
