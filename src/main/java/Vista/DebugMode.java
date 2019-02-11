package Vista;

import javax.swing.JPanel;


import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ResourceBundle.Control;
import java.awt.Window.Type;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;

import Controlador.ControlInterfaz;
import Controlador.ControlModelo;
import Modelo.BBDD;
import Modelo.Llamadas;
/**
 * Clase DebugMode: una pantalla de comandos para controlar las diferentes vistas de manera rápida.
 * @author IN1DM3B_18
 *
 */
public class DebugMode {
	
	public JPanel esteJPanel;
	/**
	 * Método: DebugMode
	 * @param controlInterfaz
	 */
	public DebugMode(ControlInterfaz controlInterfaz)
	{
		System.out.println("Starting debug mode...");
		JFrame debugFrame = new JFrame();
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
		
		JButton btnImprimirBillete = new JButton("Imprimir billete");
		btnImprimirBillete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ControlModelo.GenerarBilletes();
			}
		});
		btnImprimirBillete.setBounds(10, 200, 131, 25);
		panel.add(btnImprimirBillete);
		
		JButton btnNewButton = new JButton("Calcular Bus");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Llamadas.SeleccionarAutobus(BBDD.connection, ControlModelo.fechaIda);
			}
		});
		btnNewButton.setBounds(153, 200, 118, 25);
		panel.add(btnNewButton);
		esteJPanel.setVisible(true);
		debugFrame.setVisible(true);
		System.out.println("Debug mode started!");
	}
}
