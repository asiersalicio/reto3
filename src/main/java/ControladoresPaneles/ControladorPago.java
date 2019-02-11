package ControladoresPaneles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.concurrent.TimeUnit;

import Modelo.BBDD;
import Modelo.Devolucion;
import Modelo.Llamadas;
import Modelo.ManejoBilletes;
import Modelo.Modelo;
import Modelo.Pagar;
import Vista.PanePago;
import Vista.Vista;
/**
 * Clase: ControladorPago
 * @author IN1DM3B_18
 *
 */

public class ControladorPago {
	public ControladorPago controladorPago;
	public PanePago panePago;
	public double aPagar; // // Valor de ejemplo a cambiar por la cantindad a pagar.
	public double faltaPorPagar;
	public double totalPagado;
	
	/**
	 * Método: ControladorPago
	 * @param vista
	 * @param modelo 
	 */
	public ControladorPago(Vista vista, Modelo modelo)
	{	
		controladorPago=this;
		this.panePago=vista.panePago;
		
		vista.panePago.btnImpresionBillete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				vista.setPanel(vista.paneCambioFinal.paneCambioFinal);
				modelo.GenerarBilletes();
				modelo.manejoBilletes.rellenarLista(vista.panePago);
				modelo.manejoBilletes.RellenarDatosBillete(vista.panePago);
			}
		});
		vista.panePago.Boton1cent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.pagar(14,vista.panePago);
			}
		});
		vista.panePago.Boton50cent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.pagar(9,vista.panePago);
			}
		});
		vista.panePago.Boton20cent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.pagar(10,vista.panePago);
			}
		});
		vista.panePago.Boton10cent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.pagar(11,vista.panePago);
			}
		});
		vista.panePago.Boton5cent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.pagar(12,vista.panePago);
			}
		});
		vista.panePago.Boton2cent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.pagar(13,vista.panePago);
			}
		});
		vista.panePago.Boton1euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.pagar(8,vista.panePago);
			}
		});
		vista.panePago.Boton2euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.pagar(7,vista.panePago);
	
			}
		});
		vista.panePago.Boton200euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.pagar(1,vista.panePago);
				
			}
		});
		vista.panePago.Boton100euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.pagar(2,vista.panePago);

			}
		});
		vista.panePago.Boton50euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Pagar.pagar(3,vista.panePago);
			}
		});
		vista.panePago.Boton20euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.pagar(4,vista.panePago);


				
			}
		});
		vista.panePago.Boton10euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.pagar(5,vista.panePago);

			}
		});
		vista.panePago.Boton5euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.pagar(6,vista.panePago);
				
			}
		});
	}
}
