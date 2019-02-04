package ControladoresPaneles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Controlador.ControlInterfaz;
import Controlador.ControlModelo;
import Modelo.Pagar;
import Vista.PanePago;


public class ControladorPago {
	public ControladorPago controladorPago;
	public PanePago panePago;
	public double aPagar; // // Valor de ejemplo a cambiar por la cantindad a pagar.
	public double faltaPorPagar;
	public double totalPagado;
	
	public ControladorPago(PanePago panePago)
	{	
		controladorPago=this;
		this.panePago=panePago;
		panePago.btnImpresionBillete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ControlInterfaz.setPanel(ControlInterfaz.paneCambioFinal.paneCambioFinal);
			}
		});
		panePago.Boton1euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panePago.txtfaltaporpagar.setText(Double.toString(Pagar.porPagar(8,aPagar, faltaPorPagar, totalPagado, panePago.txtCambio2,panePago.txtfaltaporpagar,panePago.btnImpresionBillete)));
			}
		});
		panePago.Boton1cent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.porPagar(13,aPagar, faltaPorPagar, totalPagado, panePago.txtCambio2,panePago.txtfaltaporpagar,panePago.btnImpresionBillete);
			}
		});
		panePago.Boton50cent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.porPagar(8,aPagar, faltaPorPagar, totalPagado, panePago.txtCambio2,panePago.txtfaltaporpagar,panePago.btnImpresionBillete);
			}
		});
		panePago.Boton20cent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.porPagar(9,aPagar, faltaPorPagar, totalPagado, panePago.txtCambio2,panePago.txtfaltaporpagar,panePago.btnImpresionBillete);
			}
		});
		panePago.Boton10cent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.porPagar(10,aPagar, faltaPorPagar, totalPagado, panePago.txtCambio2,panePago.txtfaltaporpagar,panePago.btnImpresionBillete);
			}
		});
		panePago.Boton5cent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.porPagar(11,aPagar, faltaPorPagar, totalPagado, panePago.txtCambio2,panePago.txtfaltaporpagar,panePago.btnImpresionBillete);
			}
		});
		panePago.Boton2cent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.porPagar(12,aPagar, faltaPorPagar, totalPagado, panePago.txtCambio2,panePago.txtfaltaporpagar,panePago.btnImpresionBillete);
			}
		});
		panePago.Boton1euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.porPagar(7,aPagar, faltaPorPagar, totalPagado, panePago.txtCambio2,panePago.txtfaltaporpagar,panePago.btnImpresionBillete);
			}
		});
		panePago.Boton2euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.porPagar(8,aPagar, faltaPorPagar, totalPagado, panePago.txtCambio2,panePago.txtfaltaporpagar,panePago.btnImpresionBillete);
	
			}
		});
		panePago.Boton200euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.porPagar(1,aPagar, faltaPorPagar, totalPagado, panePago.txtCambio2,panePago.txtfaltaporpagar,panePago.btnImpresionBillete);
				
			}
		});
		panePago.Boton100euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.porPagar(2,aPagar, faltaPorPagar, totalPagado, panePago.txtCambio2,panePago.txtfaltaporpagar,panePago.btnImpresionBillete);

			}
		});
		panePago.Boton50euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Pagar.porPagar(3,aPagar, faltaPorPagar, totalPagado, panePago.txtCambio2,panePago.txtfaltaporpagar,panePago.btnImpresionBillete);	

			}
		});
		panePago.Boton20euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.porPagar(4,aPagar, faltaPorPagar, totalPagado, panePago.txtCambio2,panePago.txtfaltaporpagar,panePago.btnImpresionBillete);


				
			}
		});
		panePago.Boton10euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.porPagar(5,aPagar, faltaPorPagar, totalPagado, panePago.txtCambio2,panePago.txtfaltaporpagar,panePago.btnImpresionBillete);

			}
		});
		panePago.Boton5euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.porPagar(6,aPagar, faltaPorPagar, totalPagado,panePago.txtCambio2,panePago.txtfaltaporpagar,panePago.btnImpresionBillete);

				
			}
		});
	}
}
