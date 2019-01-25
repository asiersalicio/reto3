package ControladoresPaneles;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		JTextField editorComponent = (JTextField) paneSelTrayecto.comboBoxBusqueda.getEditor().getEditorComponent();
		editorComponent.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				System.out.println("Buscar en BBDD: " + editorComponent.getText());
				Llamadas.busquedaTrayecto(BBDD.connection, editorComponent.getText(), controladorSelTrayecto);
				paneSelTrayecto.comboBoxBusqueda.showPopup();
				//paneSelTrayecto.comboBoxBusqueda.setModel();
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {}
		});
		
	}
}
