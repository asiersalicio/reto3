package ControladoresPaneles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Controlador.ControlInterfaz;
import Controlador.ControlModelo;
import Modelo.BBDD;
import Modelo.Devolucion;
import Modelo.Llamadas;
import Modelo.ManejoBilletes;
import Modelo.Pagar;
import Vista.PanePago;
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
	 * @param panePago
	 */
	public ControladorPago(PanePago panePago)
	{	
		controladorPago=this;
		this.panePago=panePago;
		
		panePago.btnImpresionBillete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ControlInterfaz.setPanel(ControlInterfaz.paneCambioFinal.paneCambioFinal);
				ManejoBilletes.rellenarLista(panePago);
				ManejoBilletes.RellenarDatosBillete(panePago);
				ControlModelo.GenerarBilletes();
			}
		});
		panePago.Boton1cent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.pagar(14,panePago);
			}
		});
		panePago.Boton50cent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.pagar(9,panePago);
			}
		});
		panePago.Boton20cent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.pagar(10,panePago);
			}
		});
		panePago.Boton10cent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.pagar(11,panePago);
			}
		});
		panePago.Boton5cent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.pagar(12,panePago);
			}
		});
		panePago.Boton2cent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.pagar(13,panePago);
			}
		});
		panePago.Boton1euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.pagar(8,panePago);
			}
		});
		panePago.Boton2euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.pagar(7,panePago);
	
			}
		});
		panePago.Boton200euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.pagar(1,panePago);
				
			}
		});
		panePago.Boton100euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.pagar(2,panePago);

			}
		});
		panePago.Boton50euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Pagar.pagar(3,panePago);
			}
		});
		panePago.Boton20euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.pagar(4,panePago);


				
			}
		});
		panePago.Boton10euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.pagar(5,panePago);

			}
		});
		panePago.Boton5euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.pagar(6,panePago);
				
			}
		});
	}
}
