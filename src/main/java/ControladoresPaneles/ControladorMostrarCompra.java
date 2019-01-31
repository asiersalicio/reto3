package ControladoresPaneles;

import java.util.ResourceBundle.Control;

import Controlador.ControlInterfaz;
import Controlador.ControlModelo;
import Vista.PaneMostrarCompra;

public class ControladorMostrarCompra {

	public void RellenarDatos(PaneMostrarCompra paneMostrarCompra) {
		paneMostrarCompra.fieldLinea.setText(ControlModelo.linea.getCodLinea() + ": " + ControlModelo.linea.getNombreLinea());
		paneMostrarCompra.fieldTrayectoria.setText(ControlModelo.paradaOrigen.getNombreParada() + " -> " + ControlModelo.paradaDestino.getNombreParada());
		paneMostrarCompra.fieldPrecio.setText(ControlModelo.precio + "€");
		paneMostrarCompra.fieldFechaIda.setText(ControlModelo.fechaIda.toString());
	}
	
}
