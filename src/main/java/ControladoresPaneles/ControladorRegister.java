package ControladoresPaneles;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Controlador.ControlInterfaz;
import Controlador.ControlModelo;
import Vista.PaneLogin;
import Vista.PaneRegister;

public class ControladorRegister {
	
	public ControladorRegister(PaneRegister paneRegister, PaneLogin paneLogin)
	{
		//Botón VolverALogin en paneRegister
		paneRegister.btnVolverALogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				ControlInterfaz.setPanel(paneLogin.paneLogin);
			}
		});
		
		
		//Botón Registrarse en paneLogin
		paneRegister.btnRegistarse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ControlModelo.RegistrarCliente(paneRegister);
				ControlInterfaz.setPanel(ControlInterfaz.paneLogin.paneLogin);
			} 
		});

	}
	
}
