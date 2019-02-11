package ControladoresPaneles;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Modelo.Modelo;
import Vista.PaneBienvenida;
import Vista.Vista;

/**
 * Clase: ControladorBienvenida
 * @author IN1DM3B_18
 *
 */
public class ControladorBienvenida {
		ControladorBienvenida controladorBienvenida;
		PaneBienvenida paneBienvenida;
		Vista vista;
		Modelo modelo;
		
		/** 
		 * Método ControladorBienvenida
		 * @param modelo 
		 * @param paneBienvenida
		 */
		public ControladorBienvenida(Vista vista, Modelo modelo)
		{
			this.vista=vista;
			this.modelo=modelo;
			this.paneBienvenida=vista.paneBienvenida;
			
			paneBienvenida.btnTocaParaEmpezar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					vista.setPanel(vista.paneLogin.pane);
				}
			});
			
		}
}
