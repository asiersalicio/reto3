package ControladoresPaneles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import Controlador.Controlador;
import Funciones.FuncionesFecha;
import Modelo.BBDD;
import Modelo.Modelo;
import Vista.PaneSelTrayecto;
import Vista.Vista;
/**
 * Clase: ControladorSelTrayecto. contiene las instancias de los botones, los JTextField, y los arrays del paneSelTrayecto
 * @author IN1DM3B_18
 *
 */
public class ControladorSelTrayecto {
	
	public ControladorSelTrayecto controladorSelTrayecto;
	public JTextField activeTextfield;
	public String busqueda;
	public String[] resultadoBusqueda;
	public String[] resultadoBusquedaCod;
	public String codLinea;
	public String codParadaOrigen;
	public String codParadaDestino;
	public String nombreTabla;
	public String codTabla;
	public PaneSelTrayecto paneSelTrayecto;
	public String nombredosTabla;
	public int[] paradaOrigenDestino = new int[2];
	public int operationMode = 0;
	boolean btnLineaEnabled = true;
	boolean btnOrigenEnabled = false;
	boolean btnDestinoEnabled = false;
	
	/**
	 * Método: ControladorSelTrayecto, es el controlador de la ventana de seleccionar el trayecto.
	 */
	public ControladorSelTrayecto(Vista vista, Modelo modelo, Controlador controlador)
	{
		controladorSelTrayecto=this;
		this.paneSelTrayecto=vista.paneSelTrayecto;
		
		//Al pulsar el boton seleccionar linea, se ejecutan esta serie de comandos
		paneSelTrayecto.btnSelLinea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(btnLineaEnabled)
				{
				activeTextfield=paneSelTrayecto.FieldLinea;//Establece el campo de texto de seleccionar linea como activo
				operationMode = -1;//Operacion modo -1, se utiliza para que el resto de las funciones sepan que se esta selecionado una linea
				codLinea="";codParadaOrigen="";codParadaDestino="";//Resetea las variables y los botones
				btnOrigenEnabled=false;paneSelTrayecto.btnSelOrigen.setEnabled(false);paneSelTrayecto.FieldOrigen.setText("");paneSelTrayecto.btnSelDestino.setEnabled(false);paneSelTrayecto.FieldDestino.setText("");btnDestinoEnabled=false;
				setBuscadorVisible(true);//Activa la funcion del buscador
				
				resultadoBusqueda = new String[1];//Elimina los resultados obtenidos con busquedas anteriores
				resultadoBusquedaCod = new String[1];
				
				modelo.llamadas.TodasLasLineas(BBDD.connection, controladorSelTrayecto);//Obtiene todas las lineas de la base de datos de esta forma se muestran
				DefaultComboBoxModel model = new DefaultComboBoxModel(controladorSelTrayecto.resultadoBusqueda);
				paneSelTrayecto.comboBoxBusqueda.setModel(model);
				paneSelTrayecto.comboBoxBusqueda.showPopup();
				}
			}
		});
		
		//btnSelOrigen: botón para seleccionar Origen
		paneSelTrayecto.btnSelOrigen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(btnOrigenEnabled) {
				activeTextfield=paneSelTrayecto.FieldOrigen;//Establece el campo de texto de seleccionar parada de origen como activo
				operationMode = 0;//Operacion modo 0, se utiliza para que el resto de las funciones sepan que se esta selecionado una parada de origen
				setBuscadorVisible(true);//Activa la funcion del buscador
				}
			}
		});
		
		//btnSelDestino: botón seleccionar Destino
		paneSelTrayecto.btnSelDestino.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(btnDestinoEnabled)
				{
				activeTextfield=paneSelTrayecto.FieldDestino;//Establece el campo de texto de seleccionar parada de origen como activo
				operationMode = 1;//Operacion modo 0, se utiliza para que el resto de las funciones sepan que se esta selecionado una parada de origen
				setBuscadorVisible(true);//Activa la funcion del buscador
				}
			}
		});
		
		
		paneSelTrayecto.dateChooserIda.addPropertyChangeListener("date", new PropertyChangeListener() {
		    @Override
		    public void propertyChange(PropertyChangeEvent e) {
		        System.out.println(e.getPropertyName()+ ": " + e.getNewValue());
		        paneSelTrayecto.dateChooserVuelta.setMinSelectableDate((Date) e.getNewValue());
		    }
		});
		
		paneSelTrayecto.FieldBusqueda.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				System.out.println("Buscar en BBDD: " + paneSelTrayecto.FieldBusqueda.getText());
				resultadoBusqueda = new String[1];
				resultadoBusquedaCod = new String[1];
				if(operationMode<0)
					modelo.llamadas.busquedaLinea(BBDD.connection, paneSelTrayecto.FieldBusqueda.getText(), controladorSelTrayecto);
				else if (operationMode==0)
					modelo.llamadas.busquedaParada(BBDD.connection, paneSelTrayecto.FieldBusqueda.getText(), controladorSelTrayecto, codLinea);
				else
					modelo.llamadas.busquedaParadaEvitando(BBDD.connection, paneSelTrayecto.FieldBusqueda.getText(), controladorSelTrayecto, codLinea, codParadaOrigen);
				
				DefaultComboBoxModel model = new DefaultComboBoxModel(controladorSelTrayecto.resultadoBusqueda);
				paneSelTrayecto.comboBoxBusqueda.setModel(model);
				paneSelTrayecto.comboBoxBusqueda.showPopup();
				
				for(int i=0;i<resultadoBusqueda.length;i++)
				{
					System.out.println(resultadoBusqueda[i]);
					System.out.println(resultadoBusquedaCod[i]);
				}
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {}
		});
		
		
		paneSelTrayecto.comboBoxBusqueda.addActionListener (new ActionListener () {
		    @Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(paneSelTrayecto.comboBoxBusqueda.getSelectedIndex());
				System.out.println(resultadoBusquedaCod[paneSelTrayecto.comboBoxBusqueda.getSelectedIndex()]);
				System.out.println(resultadoBusquedaCod[paneSelTrayecto.comboBoxBusqueda.getSelectedIndex()]);
				if(operationMode<0) {
					codLinea=resultadoBusquedaCod[paneSelTrayecto.comboBoxBusqueda.getSelectedIndex()];
					activeTextfield.setText(codLinea + ": " + resultadoBusqueda[paneSelTrayecto.comboBoxBusqueda.getSelectedIndex()]);
					btnOrigenEnabled=true;
					paneSelTrayecto.btnSelOrigen.setEnabled(true);
				}
				else if(operationMode == 0)
				{
					codParadaOrigen=resultadoBusquedaCod[paneSelTrayecto.comboBoxBusqueda.getSelectedIndex()];
					activeTextfield.setText(codParadaOrigen + ": " + resultadoBusqueda[paneSelTrayecto.comboBoxBusqueda.getSelectedIndex()]);
					btnDestinoEnabled = true;
					paneSelTrayecto.btnSelDestino.setEnabled(true);
				}
				else {
					codParadaDestino=resultadoBusquedaCod[paneSelTrayecto.comboBoxBusqueda.getSelectedIndex()];
					activeTextfield.setText(codParadaDestino + ": " + resultadoBusqueda[paneSelTrayecto.comboBoxBusqueda.getSelectedIndex()]);
					
				}

				activeTextfield.requestFocus();
				setBuscadorVisible(false);
		    }

		    

		});
		paneSelTrayecto.chckbxVuelta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(paneSelTrayecto.chckbxVuelta.isSelected())
				{
					paneSelTrayecto.dateChooserVuelta.setEnabled(true);
					modelo.viajeDeVuelta=true;
				}
				else
				{
					paneSelTrayecto.dateChooserVuelta.setEnabled(false);
					modelo.viajeDeVuelta=false;
				}
			}
		});
		
		
		paneSelTrayecto.btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				paneSelTrayecto.lblCamposSinCompletar.setVisible(false);
				paneSelTrayecto.lblNoHayBuses.setVisible(false);
				if(ValidarCampos())
				{
				boolean busDisponible=false;
				modelo.EstablecerLinea(codLinea);
				modelo.EstablecerParadaOrigen(codParadaOrigen);
				modelo.EstablecerParadaDestino(codParadaDestino);
				modelo.fechaIda=paneSelTrayecto.dateChooserIda.getCalendar();
				System.out.println("Fecha de ida: " + modelo.fechaIda);
				if(paneSelTrayecto.chckbxVuelta.isSelected())
				{
				modelo.fechaVuelta=paneSelTrayecto.dateChooserVuelta.getCalendar();
				System.out.println("Fecha de vuelta: " + modelo.fechaVuelta);
				}
				else
				{
				modelo.precioVuelta=0;
				}
				busDisponible=modelo.CalcularDatosCompra(modelo.fechaIda, paneSelTrayecto.chckbxVuelta.isSelected(), modelo.fechaVuelta);
				if(busDisponible)
				{
					vista.setPanel(vista.paneMostrarCompra.pane);
					controlador.controladorMostrarCompra.RellenarDatos(vista.paneMostrarCompra, vista.panePago);
					
				}
				else
				{
					paneSelTrayecto.lblNoHayBuses.setVisible(true);
				}
				}
				else 
				{
					paneSelTrayecto.lblCamposSinCompletar.setVisible(true);
				}
			}
		});
		
		paneSelTrayecto.btnCerrarBusqueda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setBuscadorVisible(false);
			}
		});
	}
	
	/**
	 * Método: setBuscadorVisible
	 * Hace visible o invisible la barra de busqueda
	 * @param truefalse
	 */
	void setBuscadorVisible(boolean truefalse)
	{
		if(truefalse) {
		paneSelTrayecto.FieldBusqueda.setVisible(true);
		paneSelTrayecto.comboBoxBusqueda.setVisible(true);
		paneSelTrayecto.btnCerrarBusqueda.setVisible(true);
		paneSelTrayecto.FieldBusqueda.setText("");
		paneSelTrayecto.FieldBusqueda.requestFocus();
		try {
			//Muestra el teclado en pantalla
			Runtime.getRuntime().exec("cmd /c osk");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}
		else
		{
		paneSelTrayecto.FieldBusqueda.setVisible(false);
		paneSelTrayecto.comboBoxBusqueda.setVisible(false);
		paneSelTrayecto.btnCerrarBusqueda.setVisible(false);
		try {
			Runtime.getRuntime().exec("cmd /c taskkill /IM osk.exe /T /F");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
	/**
	 * Método: ValidarCampos
	 * Valida que los campos de la parada de origen y la parada destino (que se encuentran en el paneSelTrayecto) hayan sido seleccionado. 
	 * @return
	 */
	public boolean ValidarCampos() {
		if(paneSelTrayecto.FieldOrigen.getText().equals(""))
			return false;
		else if (paneSelTrayecto.FieldDestino.getText().equals(""))
			return false;
		else if (paneSelTrayecto.dateChooserIda.getDate()==null)
			return false;
		else if(paneSelTrayecto.chckbxVuelta.isSelected()&&paneSelTrayecto.dateChooserVuelta.getDate()==null)
		{
			return false;
		}
		else
			return true;
	}
	
}
