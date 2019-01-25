package ControladoresPaneles;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Controlador.ControlInterfaz;
import Vista.PaneRegister;

public class ControladorRegister {
	
	public ControladorRegister(PaneRegister paneRegister, ControlInterfaz controlInterfaz)
	{
		paneRegister.btnVolverALogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				controlInterfaz.setPanel(controlInterfaz.paneLogin.paneLogin);
			}
		});
	}
	
}
