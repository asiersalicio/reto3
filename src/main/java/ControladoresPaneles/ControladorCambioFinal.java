package ControladoresPaneles;

import javax.swing.JPanel;

import Controlador.ControlModelo;
import Modelo.Formato2dec;
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
	}
	
}
