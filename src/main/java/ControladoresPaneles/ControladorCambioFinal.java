package ControladoresPaneles;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import Controlador.ControlFormato;
import Controlador.ControlModelo;
import Controlador.Main;
import Vista.PaneCambioFinal;
import Vista.PanePago;

/**
 * Clase: ControladorCambioFinal
 * @author IN1DM3B_18
 *
 */
public class ControladorCambioFinal {
		public PaneCambioFinal paneCambioFinal;
		public ControladorCambioFinal controladorCambioFinal;
	
	/**
	 * Método: ControladorCambioFinal
	 * @param paneCambioFinal
	 * @param panePago
	 */
	public ControladorCambioFinal(PaneCambioFinal paneCambioFinal, PanePago panePago)
	{
		controladorCambioFinal=this;
		this.paneCambioFinal=paneCambioFinal;
		
		paneCambioFinal.btnVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Main.ResetAll();
			}
		});
	}
	
	
}
