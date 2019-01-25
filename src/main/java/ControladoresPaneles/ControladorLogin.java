package ControladoresPaneles;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Controlador.ControlInterfaz;
import Controlador.ControlModelo;
import Modelo.Llamadas;
import Vista.PaneLogin;
import Vista.PaneSelTrayecto;

public class ControladorLogin {
	
	public ControladorLogin(PaneLogin paneLogin)
	{
		paneLogin.btnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ControlInterfaz.setPanel(ControlInterfaz.paneRegister.paneRegister);
			}
		});
		
		paneLogin.btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				boolean dniValido;
				dniValido=Llamadas.validarDNI(paneLogin.textfieldUsername.getText());
				if(dniValido)
				{
					System.out.println("El dni es valido" + paneLogin.textfieldUsername.getText());
					ControlModelo.EstablecerClienteActual(paneLogin.textfieldUsername.getText());
					ControlInterfaz.setPanel(ControlInterfaz.paneSelTrayecto.pane);
				}
				else
				{
					System.out.println("El dni no es valido" + paneLogin.textfieldUsername.getText());
				}
				
				
			}
		});
	}
}
