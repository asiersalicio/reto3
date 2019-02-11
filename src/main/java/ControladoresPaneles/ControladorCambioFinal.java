package ControladoresPaneles;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import Controlador.ControlFormato;
import Controlador.ControlModelo;
import Controlador.Main;
import Vista.PaneCambioFinal;
import Vista.PaneMostrarCompra;
import Vista.PanePago;


public class ControladorCambioFinal {
		public PaneCambioFinal paneCambioFinal;
		public ControladorCambioFinal controladorCambioFinal;
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
