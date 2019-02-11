package ControladoresPaneles;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Controlador.ControlFormato;
import Controlador.ControlInterfaz;
import Controlador.ControlModelo;
import Controlador.ControladorFecha;
import Vista.PaneCambioFinal;
import Vista.PaneMostrarCompra;

/**
 * Clase: ControladorMostrarCompra contiene: ControladorMostrarCompra y RellenarDatos
 * @author IN1DM3B_18
 *
 */

import Vista.PanePago;

/**
 * Clase:ControladorMostrarCompra
 * @author IN1DM3B_18
 *
 */
public class ControladorMostrarCompra {

	/**
	 * Método:ControladorMostrarCompra
	 * @param paneMostrarCompra
	 */
	public ControladorMostrarCompra(PaneMostrarCompra paneMostrarCompra)
	{
		//botón para volver a paneSelTrayecto
		paneMostrarCompra.btnVolverALogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ControlInterfaz.setPanel(ControlInterfaz.paneSelTrayecto.pane);
			}
		});
		//boton para ir a panePago
		paneMostrarCompra.btnSiguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ControlInterfaz.setPanel(ControlInterfaz.panePago.panePago);
			}
		});
	}
	
	/**
	 * Método:RellenarDatos: se rellenan y muestran los datos de la compra en el paneMostrarCompra
	 * @param paneMostrarCompra
	 * @param panePago
	 */
	public void RellenarDatos(PaneMostrarCompra paneMostrarCompra, PanePago panePago) {
		float precioIda = ControlModelo.precioIda;
		float precioVuelta = ControlModelo.precioVuelta;
		String precioAMostrar = null;
		if(ControlModelo.viajeDeVuelta) {
			paneMostrarCompra.fieldTipoBillete.setText("Ida y vuelta");
			System.out.println("Ida y vuelta");
			paneMostrarCompra.fieldFechaVuelta.setEnabled(true);
			paneMostrarCompra.fieldFechaVuelta.setText(ControladorFecha.CalendarToStringVisual(ControlModelo.fechaVuelta));
			precioAMostrar = ControlFormato.Formateado2Dec(precioIda + precioVuelta) + "€";
		}
		else
		{
			paneMostrarCompra.fieldTipoBillete.setText("Solo ida");
			System.out.println("Solo ida");
			paneMostrarCompra.fieldFechaVuelta.setEnabled(false);
			precioAMostrar = ControlFormato.Formateado2Dec(precioIda) + "€";
		}
		System.out.println("Precio ida: " + ControlModelo.precioIda + "Precio vuelta: " + ControlModelo.precioVuelta);
		paneMostrarCompra.fieldLinea.setText(ControlModelo.linea.getCodLinea() + ": " + ControlModelo.linea.getNombreLinea());
		paneMostrarCompra.fieldTrayectoria.setText(ControlModelo.paradaOrigen.getNombreParada() + " -> " + ControlModelo.paradaDestino.getNombreParada());
		paneMostrarCompra.fieldPrecio.setText(precioAMostrar);
		paneMostrarCompra.fieldFechaIda.setText(ControladorFecha.CalendarToStringVisual(ControlModelo.fechaIda));
		panePago.txtaPagar2.setText(String.valueOf(ControlFormato.Formateado2Dec(ControlModelo.precioIda + ControlModelo.precioVuelta)));
		panePago.txtfaltaporpagar.setText(String.valueOf(ControlFormato.Formateado2Dec(ControlModelo.precioIda + ControlModelo.precioVuelta)));
	}
	
}
