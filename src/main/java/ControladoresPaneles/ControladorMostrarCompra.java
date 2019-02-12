package ControladoresPaneles;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Funciones.FuncionesFecha;
import Funciones.FuncionesFormato;
import Modelo.Modelo;
import Vista.PaneMostrarCompra;

/**
 * Clase: ControladorMostrarCompra contiene: ControladorMostrarCompra y RellenarDatos
 * @author IN1DM3B_18
 *
 */

import Vista.PanePago;
import Vista.Vista;

/**
 * Clase:ControladorMostrarCompra
 * @author IN1DM3B_18
 *
 */
public class ControladorMostrarCompra {

	/**
	 * Este controlador sirve para controlar el paneMostrarCompra
	 */
	public Modelo modelo;
	public Vista vista;
	public ControladorMostrarCompra(Vista vista, Modelo modelo)
	{
		this.vista=vista;
		this.modelo=modelo;
		//botón para volver a paneSelTrayecto
		vista.paneMostrarCompra.btnVolverALogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				vista.setPanel(vista.paneSelTrayecto.pane);
			}
		});
		//boton para ir a panePago
		vista.paneMostrarCompra.btnSiguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				vista.setPanel(vista.panePago.pane);
			}
		});
	}
	
	/**
	 * Método:RellenarDatos: se rellenan y muestran los datos de la compra en el paneMostrarCompra
	 * @param paneMostrarCompra
	 * @param panePago
	 */
	public void RellenarDatos(PaneMostrarCompra paneMostrarCompra, PanePago panePago) {
		float precioIda = modelo.precioIda;
		float precioVuelta = modelo.precioVuelta;
		String precioAMostrar = null;
		if(modelo.viajeDeVuelta) {
			paneMostrarCompra.fieldTipoBillete.setText("Ida y vuelta");
			System.out.println("Ida y vuelta");
			paneMostrarCompra.fieldFechaVuelta.setEnabled(true);
			paneMostrarCompra.fieldFechaVuelta.setText(FuncionesFecha.CalendarToStringVisual(modelo.fechaVuelta));
			precioAMostrar = FuncionesFormato.Formateado2Dec(precioIda + precioVuelta) + "€";
		}
		else
		{
			paneMostrarCompra.fieldTipoBillete.setText("Solo ida");
			System.out.println("Solo ida");
			paneMostrarCompra.fieldFechaVuelta.setEnabled(false);
			precioAMostrar = FuncionesFormato.Formateado2Dec(precioIda) + "€";
		}
		System.out.println("Precio ida: " + modelo.precioIda + "Precio vuelta: " + modelo.precioVuelta);
		paneMostrarCompra.fieldLinea.setText(modelo.linea.getCodLinea() + ": " + modelo.linea.getNombreLinea());
		paneMostrarCompra.fieldTrayectoria.setText(modelo.paradaOrigen.getNombreParada() + " -> " + modelo.paradaDestino.getNombreParada());
		paneMostrarCompra.fieldPrecio.setText(precioAMostrar);
		paneMostrarCompra.fieldFechaIda.setText(FuncionesFecha.CalendarToStringVisual(modelo.fechaIda));
		panePago.txtaPagar2.setText(String.valueOf(FuncionesFormato.Formateado2Dec(modelo.precioIda + modelo.precioVuelta)));
		panePago.txtfaltaporpagar.setText(String.valueOf(FuncionesFormato.Formateado2Dec(modelo.precioIda + modelo.precioVuelta)));
	}
	
}
