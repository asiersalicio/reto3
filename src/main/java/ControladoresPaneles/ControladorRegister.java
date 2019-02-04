package ControladoresPaneles;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Controlador.ControlInterfaz;
import Controlador.ControlModelo;
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
	}
		public boolean ValidarCampos() {
			boolean resultado=true;
			
			paneRegister.lblErrApe.setVisible(false);paneRegister.lblErrCont.setVisible(false);
			paneRegister.lblErrFechaNac.setVisible(false);paneRegister.lblErrNom.setVisible(false);
			paneRegister.lblErrUs.setVisible(false);
			
			
			if(paneRegister.fieldDNI.getText().length()==9) {
			paneRegister.lblErrUs.setVisible(true); resultado=false;}
			if(paneRegister.fieldNombre.getText().length()>=4) {
			paneRegister.lblErrNom.setVisible(true); resultado=false;}
			if(paneRegister.fieldApellidos.getText().length()>=4) {
			paneRegister.lblErrApe.setVisible(true); resultado=false;}
			
			int passLength=String.valueOf(paneRegister.fieldPassword.getPassword()).length();
			if(passLength<8 && passLength>16) {
			paneRegister.lblErrCont.setVisible(true); resultado=false;}
			
			return resultado;
	
}
}
	
