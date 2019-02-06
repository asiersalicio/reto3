package ControladoresPaneles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import Controlador.ControlInterfaz;
import Controlador.ControlModelo;
import Modelo.BBDD;
import Modelo.Llamadas;
import Vista.PaneMostrarCompra;
import Vista.PaneSelTrayecto;
import java.io.IOException;
import java.util.Calendar;
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
	
	
	public ControladorSelTrayecto(PaneSelTrayecto paneSelTrayecto, PaneMostrarCompra paneMostrarCompra)
	{
		controladorSelTrayecto=this;
		this.paneSelTrayecto=paneSelTrayecto;
		
		//btnSelLinea: botón para seleccionar la Línea
		paneSelTrayecto.btnSelLinea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(btnLineaEnabled)
				{
				activeTextfield=paneSelTrayecto.FieldLinea;
				codLinea="Error";
				operationMode = -1;
				codLinea="";codParadaOrigen="";codParadaDestino="";
				btnOrigenEnabled=false;paneSelTrayecto.btnSelOrigen.setEnabled(false);paneSelTrayecto.FieldOrigen.setText("");paneSelTrayecto.btnSelDestino.setEnabled(false);paneSelTrayecto.FieldDestino.setText("");btnDestinoEnabled=false;
				setBuscadorVisible(true);
				}
			}
		});
		
		//btnSelOrigen: botón para seleccionar Origen
		paneSelTrayecto.btnSelOrigen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(btnOrigenEnabled) {
				activeTextfield=paneSelTrayecto.FieldOrigen;
				operationMode = 0;
				setBuscadorVisible(true);
				}
			}
		});
		
		//btnSelDestino: botón seleccionar Destino
		paneSelTrayecto.btnSelDestino.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(btnDestinoEnabled)
				{
				activeTextfield=paneSelTrayecto.FieldDestino;
				operationMode = 1;
				setBuscadorVisible(true);
				}
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
					Llamadas.busquedaLinea(BBDD.connection, paneSelTrayecto.FieldBusqueda.getText(), controladorSelTrayecto);
				else if (operationMode==0)
					Llamadas.busquedaParada(BBDD.connection, paneSelTrayecto.FieldBusqueda.getText(), controladorSelTrayecto, codLinea);
				else
					Llamadas.busquedaParadaEvitando(BBDD.connection, paneSelTrayecto.FieldBusqueda.getText(), controladorSelTrayecto, codLinea, codParadaOrigen);
				
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
		
		//
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
					ControlModelo.viajeDeVuelta=true;
				}
				else
				{
					paneSelTrayecto.dateChooserVuelta.setEnabled(false);
					ControlModelo.viajeDeVuelta=false;
				}
			}
		});
		
		paneSelTrayecto.btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ControlModelo.EstablecerLinea(codLinea);
				ControlModelo.EstablecerParadaOrigen(codParadaOrigen);
				ControlModelo.EstablecerParadaDestino(codParadaDestino);
				ControlModelo.fechaIda=paneSelTrayecto.dateChooserIda.getCalendar();
				System.out.println("Fecha de ida: " + ControlModelo.fechaIda);
				if(paneSelTrayecto.chckbxVuelta.isSelected())
				{
				ControlModelo.fechaVuelta=paneSelTrayecto.dateChooserVuelta.getCalendar();
				System.out.println("Fecha de vuelta: " + ControlModelo.fechaVuelta);
				}
				ControlModelo.CalcularDatosCompra();
				ControlInterfaz.setPanel(ControlInterfaz.paneMostrarCompra.paneMostrarCompra);
				ControlInterfaz.controladorMostrarCompra.RellenarDatos(paneMostrarCompra, ControlInterfaz.panePago);
			}
		});
		
		paneSelTrayecto.btnCerrarBusqueda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setBuscadorVisible(false);
			}
		});
	}
	//Hace visible o invisible la barra de busqueda
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
}
