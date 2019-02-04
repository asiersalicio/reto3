package ControladoresPaneles;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import Controlador.ControlInterfaz;
import Controlador.ControlModelo;
import Modelo.BBDD;
import Modelo.Llamadas;
import Vista.PaneLogin;
import Vista.PaneRegister;
/**
 * Clase ControladorRegister: Mediante esta clase se controlan los botones de la clase Register:  btnVolverALogin y btnRegistarse.
 * @author IN1DM3B_18
 *
 */
public class ControladorRegister {
	
	public PaneRegister paneRegister;
	
	public ControladorRegister(PaneRegister paneRegister, PaneLogin paneLogin)
	{
		this.paneRegister=paneRegister;
		//Botón VolverALogin en paneRegister: cuando se clica en el botón "Volver", aparece la ventana: paneLogin
		paneRegister.btnVolverALogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ControlInterfaz.setPanel(paneLogin.paneLogin);
			}
		});
		
		
		//Botón Registrarse en paneLogin: Cuando se clica en el botón "Registrarse", aparece la ventana paneRegister
		paneRegister.btnRegistarse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(ValidarCampos())
				{
					ControlModelo.RegistrarCliente(paneRegister);
					ControlInterfaz.setPanel(ControlInterfaz.paneLogin.paneLogin);
				}
			}
			
		});
		
			paneRegister.fieldPassword.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				ActualizarBarraSeguridad();
			}
			@Override
			public void insertUpdate(DocumentEvent e) {
				ActualizarBarraSeguridad();
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}

			});
			}
			
		
	
		public boolean ValidarCampos() {
			boolean resultado=true;
			
			paneRegister.lblErrApe.setVisible(false);paneRegister.lblErrCont.setVisible(false);
			paneRegister.lblErrFechaNac.setVisible(false);paneRegister.lblErrNom.setVisible(false);
			paneRegister.lblErrUs.setVisible(false);paneRegister.lblErrSexo.setVisible(false);
			
			
			if(paneRegister.fieldDNI.getText().length()!=9 || Llamadas.validarDNI(paneRegister.fieldDNI.getText()))
			{
				paneRegister.lblErrUs.setVisible(true); resultado=false;
			}
			if(!(paneRegister.fieldNombre.getText().length()>=3))
			{
				paneRegister.lblErrNom.setVisible(true); resultado=false;
			}
			if(!(paneRegister.fieldApellidos.getText().length()>=3))
			{
				paneRegister.lblErrApe.setVisible(true); resultado=false;
			}
			
			int passLength=String.valueOf(paneRegister.fieldPassword.getPassword()).length();
			System.out.println(passLength);
			
			boolean PassEquals=false;
			if(String.valueOf(paneRegister.fieldPassword.getPassword()).equals(String.valueOf(paneRegister.fieldPassword2.getPassword())))
			PassEquals=true;
					
			if(passLength<8 || passLength>16 || !PassEquals)
			{
				paneRegister.lblErrCont.setVisible(true); resultado=false;
			}
			
			if(paneRegister.comboBoxSexo.getSelectedIndex()==0)
			{
				paneRegister.lblErrSexo.setVisible(true); resultado=false;
			}
			
			return resultado;
		}
		public void ActualizarBarraSeguridad()
		{
			int passLength=String.valueOf(paneRegister.fieldPassword.getPassword()).length();
			if(passLength<8)
			{
				paneRegister.lblSeguridad.setText("Insegura");
				paneRegister.lblSeguridad.setForeground(Color.RED);
			}
			else if(passLength<10)
			{
				paneRegister.lblSeguridad.setText("Aceptable");
				paneRegister.lblSeguridad.setForeground(Color.ORANGE);
			}
			else if(passLength<12)
			{
				paneRegister.lblSeguridad.setText("Buena");
				paneRegister.lblSeguridad.setForeground(Color.GREEN);
			}
			else
			{
				paneRegister.lblSeguridad.setText("Segura");
				paneRegister.lblSeguridad.setForeground(Color.CYAN);
			}
			paneRegister.progSegCont.setValue(passLength);
		}
}
	
