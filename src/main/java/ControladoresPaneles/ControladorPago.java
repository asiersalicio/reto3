package ControladoresPaneles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Controlador.Controlador;
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
	Controlador controlador;
	
	/**
	 * Método: ControladorPago
	 * @param vista
	 * @param modelo 
	 */
	public ControladorPago(Vista vista, Modelo modelo, Controlador controlador, Pagar pagar)
	{	
		controladorPago=this;
		this.panePago=vista.panePago;
		this.controlador=controlador;
		
		vista.panePago.btnImpresionBillete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				vista.setPanel(vista.paneCambioFinal.paneCambioFinal);
				modelo.GenerarBilletes();
				controlador.manejoBilletes.rellenarLista(vista.panePago);
				controlador.manejoBilletes.RellenarDatosBillete(vista.panePago);
			}
		});
		
		vista.panePago.Boton1cent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pagar.Pago(14,vista.panePago, Float.parseFloat(panePago.txtfaltaporpagar.getText()));
			}
		});
		vista.panePago.Boton50cent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				pagar.Pago(9,vista.panePago, Float.parseFloat(panePago.txtfaltaporpagar.getText()));
			}
		});
		vista.panePago.Boton20cent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				pagar.Pago(10,vista.panePago, Float.parseFloat(panePago.txtfaltaporpagar.getText()));
			}
		});
		vista.panePago.Boton10cent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				pagar.Pago(11,vista.panePago, Float.parseFloat(panePago.txtfaltaporpagar.getText()));
			}
		});
		vista.panePago.Boton5cent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				pagar.Pago(12,vista.panePago, Float.parseFloat(panePago.txtfaltaporpagar.getText()));
			}
		});
		vista.panePago.Boton2cent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				pagar.Pago(13,vista.panePago, Float.parseFloat(panePago.txtfaltaporpagar.getText()));
			}
		});
		vista.panePago.Boton1euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				pagar.Pago(8,vista.panePago, Float.parseFloat(panePago.txtfaltaporpagar.getText()));
			}
		});
		vista.panePago.Boton2euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				pagar.Pago(7,vista.panePago, Float.parseFloat(panePago.txtfaltaporpagar.getText()));
	
			}
		});
		vista.panePago.Boton200euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				pagar.Pago(1,vista.panePago, Float.parseFloat(panePago.txtfaltaporpagar.getText()));
				
			}
		});
		vista.panePago.Boton100euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				pagar.Pago(2,vista.panePago, Float.parseFloat(panePago.txtfaltaporpagar.getText()));

			}
		});
		vista.panePago.Boton50euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				pagar.Pago(3,vista.panePago, Float.parseFloat(panePago.txtfaltaporpagar.getText()));
			}
		});
		vista.panePago.Boton20euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				pagar.Pago(4,vista.panePago, Float.parseFloat(panePago.txtfaltaporpagar.getText()));


				
			}
		});
		vista.panePago.Boton10euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				pagar.Pago(5,vista.panePago, Float.parseFloat(panePago.txtfaltaporpagar.getText()));

			}
		});
		vista.panePago.Boton5euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				pagar.Pago(6,vista.panePago, Float.parseFloat(panePago.txtfaltaporpagar.getText()));
				
			}
		});
	}
}
