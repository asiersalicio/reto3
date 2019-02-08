package ControladoresPaneles;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Controlador.ControlInterfaz;
import Vista.PaneBienvenida;

public class ControladorBienvenida {
		ControladorBienvenida controladorBienvenida;
		PaneBienvenida paneBienvenida;
		
		public ControladorBienvenida(PaneBienvenida paneBienvenida)
		{
		
			paneBienvenida.btnTocaParaEmpezar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					ControlInterfaz.setPanel(ControlInterfaz.paneLogin.paneLogin);
				}
			});
			
		}
}
