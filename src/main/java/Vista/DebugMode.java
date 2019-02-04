package Vista;

import javax.swing.JPanel;


import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Window.Type;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;

import Controlador.ControlInterfaz;
import Controlador.ControlModelo;
/**
 * Clase DebugMode: una pantalla de comandos para controlar las diferentes vistas de manera rápida.
 * @author IN1DM3B_18
 *
 */
public class DebugMode {
	
	public JPanel esteJPanel;
	
	public DebugMode(ControlInterfaz controlInterfaz)
	{
		System.out.println("Starting debug mode...");
		JFrame debugFrame = new JFrame();
		debugFrame.setType(Type.UTILITY);
		debugFrame.setBounds(0, 0 , 401, 423);
		
		esteJPanel = new JPanel();
		esteJPanel.setBounds(0, 0, 300, 400);
		

		debugFrame.getContentPane().add(esteJPanel);
		esteJPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		esteJPanel.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ControlInterfaz.setPanel(ControlInterfaz.paneLogin.paneLogin);
			}
		});
		btnLogin.setBounds(10, 29, 89, 23);
		panel.add(btnLogin);
		
		JButton btnRegistro = new JButton("Registro");
		btnRegistro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ControlInterfaz.setPanel(ControlInterfaz.paneRegister.paneRegister);
			}
		});
		btnRegistro.setBounds(116, 29, 89, 23);
		panel.add(btnRegistro);
		
		JButton btnSelecciontr = new JButton("SelTrayecto");
		btnSelecciontr.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ControlInterfaz.setPanel(ControlInterfaz.paneSelTrayecto.pane);
			}
		});
		btnSelecciontr.setBounds(10, 63, 89, 23);
		panel.add(btnSelecciontr);
		
		JLabel lblCambiarDeVentana = new JLabel("Cambiar de ventana");
		lblCambiarDeVentana.setBounds(10, 11, 131, 14);
		panel.add(lblCambiarDeVentana);
		
		JButton btnMostrarCompra = new JButton("MostrarCompra");
		btnMostrarCompra.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ControlInterfaz.setPanel(ControlInterfaz.paneMostrarCompra.paneMostrarCompra);
			}
		});
		btnMostrarCompra.setBounds(116, 62, 89, 23);
		panel.add(btnMostrarCompra);
		
		JButton btnPago = new JButton("Pago");
		btnPago.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ControlInterfaz.setPanel(ControlInterfaz.panePago.panePago);
			}
		});
		btnPago.setBounds(221, 28, 89, 23);
		panel.add(btnPago);
		esteJPanel.setVisible(true);
		debugFrame.setVisible(true);
		System.out.println("Debug mode started!");
	}
}
