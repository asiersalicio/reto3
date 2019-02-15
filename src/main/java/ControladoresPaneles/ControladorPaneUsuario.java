package ControladoresPaneles;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import Core.ControlBBDD;
import Funciones.FuncionesContrasena;
import Funciones.FuncionesFecha;
import Modelo.BBDD;
import Modelo.Billete;
import Modelo.Cliente;
import Modelo.Modelo;
import Vista.Vista;

public class ControladorPaneUsuario {
	
	private Vista vista;
	private Modelo modelo;
	
	public ControladorPaneUsuario(Vista vista, Modelo modelo)
	{
		this.vista=vista;
		this.modelo=modelo;
		
		
		vista.paneUser.btnCambiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(ValidarCampos())
				{
					String contrasenaEncriptada = modelo.funcionesContrasena.encriptarContrasena(String.valueOf(vista.paneUser.passwordNueva.getPassword()));
					modelo.llamadas.cambiarContrasena(BBDD.connection, contrasenaEncriptada, modelo.cliente);
					System.out.println(contrasenaEncriptada);
					vista.paneUser.passwordNueva.setText("");
					vista.paneUser.passwordNuevacheck.setText("");
					vista.paneUser.lblErrContra.setVisible(false);
				}
				else
				{
					vista.paneUser.lblErrContra.setVisible(true);
				}
				
				
			}
		});
		
		vista.paneUser.btnVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				vista.frame1.setPane(vista.paneSelTrayecto.pane);
			}
		});
		
		
		vista.paneUser.passwordNueva.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				ActualizarBarraSeguridad();
			}
			@Override
			public void insertUpdate(DocumentEvent e) {
				ActualizarBarraSeguridad();
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
			}

			});

		
	}
	
	public void ActualizarBarraSeguridad()
	{
		int passLength=String.valueOf(vista.paneUser.passwordNueva.getPassword()).length();
		vista.paneUser.progressBarSeguridad.setValue(passLength);
		if(passLength<8)
		{
			vista.paneUser.lblSeguridad.setForeground(Color.RED);
			vista.paneUser.lblSeguridad.setText("Insegura");
			
		}
		else if(passLength<10)
		{
			vista.paneUser.lblSeguridad.setForeground(Color.ORANGE);
			vista.paneUser.lblSeguridad.setText("Aceptable");
			
		}
		else if(passLength<12)
		{
			vista.paneUser.lblSeguridad.setForeground(Color.GREEN);
			vista.paneUser.lblSeguridad.setText("Buena");
			
		}
		else
		{
			vista.paneUser.lblSeguridad.setForeground(Color.CYAN);
			vista.paneUser.lblSeguridad.setText("Segura");
			
		}
		
	}

	public void rellenarDatos() {
		DefaultListModel<String> model = new DefaultListModel<String>();
		DefaultListModel<String> model2 = new DefaultListModel<String>();
		try {
		String[] billetes;
		billetes=modelo.llamadas.ObtenerBilletesPasados(BBDD.connection, modelo.cliente);
		
		for(int i=0;i<billetes.length;i++)
		{
			model.addElement(billetes[i].toString());
		}
		vista.paneUser.listaViajesPasados.setModel(model);
		
		billetes=modelo.llamadas.ObtenerBilletesFuturos(BBDD.connection, modelo.cliente);
		
		for(int i=0;i<billetes.length;i++)
		{
			model2.addElement(billetes[i].toString());
		}
		
		}
		catch(java.lang.NullPointerException ex) {
			model.addElement("Todavia no tienes ningun viaje pasado");
			model2.addElement("Todavia no tienes ningun viaje");
			model2.addElement("Hoy puede ser el dia ;)");
			
		}
		
		vista.paneUser.listaViajesPasados.setModel(model);
		vista.paneUser.listaViajesFuturos.setModel(model2);
		
		vista.paneUser.fieldNombre.setText(modelo.cliente.getNombreCliente() + " " + modelo.cliente.getApellidos());
		vista.paneUser.fieldDNI.setText(modelo.cliente.getDNI());

	}
	
	public boolean ValidarCampos() {
		boolean resultado=true;

		int passLength=String.valueOf(vista.paneUser.passwordNueva.getPassword()).length();
		System.out.println(passLength);
		
		boolean PassEquals=false;
		if(String.valueOf(vista.paneUser.passwordNueva.getPassword()).equals(String.valueOf(vista.paneUser.passwordNuevacheck.getPassword())))
		PassEquals=true;
				
		if(passLength<8 || passLength>16 || !PassEquals)
		{
			vista.paneUser.lblErrContra.setVisible(true); resultado=false;
		}
		
		return resultado;
	}
}
