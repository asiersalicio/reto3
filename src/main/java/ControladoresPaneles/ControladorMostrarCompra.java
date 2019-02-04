package ControladoresPaneles;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.ResourceBundle.Control;

import Controlador.ControlInterfaz;
import Controlador.ControlModelo;
import Modelo.Formato2dec;
import Vista.PaneMostrarCompra;
import Vista.PanePago;

public class ControladorMostrarCompra {

	public ControladorMostrarCompra(PaneMostrarCompra paneMostrarCompra)
	{
		paneMostrarCompra.btnVolverALogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ControlInterfaz.setPanel(ControlInterfaz.paneSelTrayecto.pane);
			}
		});
		paneMostrarCompra.btnSiguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ControlInterfaz.setPanel(ControlInterfaz.panePago.panePago);
			}
		});
	}
	
	public void RellenarDatos(PaneMostrarCompra paneMostrarCompra, PanePago panePago) {
		paneMostrarCompra.fieldLinea.setText(ControlModelo.linea.getCodLinea() + ": " + ControlModelo.linea.getNombreLinea());
		paneMostrarCompra.fieldTrayectoria.setText(ControlModelo.paradaOrigen.getNombreParada() + " -> " + ControlModelo.paradaDestino.getNombreParada());
		paneMostrarCompra.fieldPrecio.setText(ControlModelo.precio + "€");
		paneMostrarCompra.fieldFechaIda.setText(ControlModelo.fechaIda.toLocaleString());
		panePago.txtaPagar2.setText(String.valueOf(Formato2dec.formateador(ControlModelo.precio)));
		panePago.txtfaltaporpagar.setText(String.valueOf(Formato2dec.formateador(ControlModelo.precio)));
	}
	
}
