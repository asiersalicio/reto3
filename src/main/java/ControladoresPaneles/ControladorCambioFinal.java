package ControladoresPaneles;

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
	}
	
}
