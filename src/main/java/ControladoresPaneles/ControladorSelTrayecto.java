package ControladoresPaneles;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import Controlador.ControlInterfaz;
import Modelo.BBDD;
import Modelo.Llamadas;
import Vista.PaneSelTrayecto;

public class ControladorSelTrayecto {
	
	public JTextField activeTextfield;
	public String busqueda;
	public String[] resultadoBusqueda;
	public String[] resultadoBusquedaCod;
	public String codLinea;
	public ControladorSelTrayecto controladorSelTrayecto;
	
	public ControladorSelTrayecto(PaneSelTrayecto paneSelTrayecto)
	{
		controladorSelTrayecto=this;
		paneSelTrayecto.FieldLinea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				activeTextfield=paneSelTrayecto.FieldLinea;
				paneSelTrayecto.FieldBusqueda.setVisible(true);
				paneSelTrayecto.comboBoxBusqueda.setVisible(true);
				paneSelTrayecto.FieldBusqueda.requestFocus();
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
				Llamadas.busquedaTrayecto(BBDD.connection, paneSelTrayecto.FieldBusqueda.getText(), controladorSelTrayecto);
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
		
	}
}
