package ControladoresPaneles;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.ResourceBundle.Control;

import Controlador.ControlInterfaz;
import Controlador.ControlModelo;
import Vista.PaneMostrarCompra;

public class ControladorMostrarCompra {

	public ControladorMostrarCompra(PaneMostrarCompra paneMostrarCompra)
	{
		paneMostrarCompra.btnVolverALogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ControlInterfaz.setPanel(ControlInterfaz.controladorSelTrayecto.paneSelTrayecto.pane);
			}
		});
	}
	
	public void RellenarDatos(PaneMostrarCompra paneMostrarCompra) {
		paneMostrarCompra.fieldLinea.setText(ControlModelo.linea.getCodLinea() + ": " + ControlModelo.linea.getNombreLinea());
		paneMostrarCompra.fieldTrayectoria.setText(ControlModelo.paradaOrigen.getNombreParada() + " -> " + ControlModelo.paradaDestino.getNombreParada());
		paneMostrarCompra.fieldPrecio.setText(ControlModelo.precio + "€");
		paneMostrarCompra.fieldFechaIda.setText(ControlModelo.fechaIda.toLocaleString());
	}
	
}
