package ControladoresPaneles;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.ResourceBundle.Control;

import Controlador.ControlInterfaz;
import Controlador.ControlModelo;
import Vista.PaneMostrarCompra;
/**
 * Clase: ControladorMostrarCompra contiene: ControladorMostrarCompra y RellenarDatos
 * @author IN1DM3B_18
 *
 */
public class ControladorMostrarCompra {

	//ControladorMostrarCompra: contiene botones
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
	
	//se rellenan y muestran los datos de la compra en el paneMostrarCompra
	public void RellenarDatos(PaneMostrarCompra paneMostrarCompra) {
		paneMostrarCompra.fieldLinea.setText(ControlModelo.linea.getCodLinea() + ": " + ControlModelo.linea.getNombreLinea());
		paneMostrarCompra.fieldTrayectoria.setText(ControlModelo.paradaOrigen.getNombreParada() + " -> " + ControlModelo.paradaDestino.getNombreParada());
		paneMostrarCompra.fieldPrecio.setText(ControlModelo.precio + "€");
		paneMostrarCompra.fieldFechaIda.setText(ControlModelo.fechaIda.toLocaleString());
	}
	
}
