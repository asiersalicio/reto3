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
				controlInterfaz.setPanel(controlInterfaz.paneLogin.paneLogin);
			}
		});
		btnLogin.setBounds(10, 29, 89, 23);
		panel.add(btnLogin);
		
		JButton btnRegistro = new JButton("Registro");
		btnRegistro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controlInterfaz.setPanel(controlInterfaz.paneRegister.paneRegister);
			}
		});
		btnRegistro.setBounds(116, 29, 89, 23);
		panel.add(btnRegistro);
		
		JButton btnSelecciontr = new JButton("SelTrayecto");
		btnSelecciontr.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controlInterfaz.setPanel(controlInterfaz.paneSelTrayecto.pane);
			}
		});
		btnSelecciontr.setBounds(10, 63, 89, 23);
		panel.add(btnSelecciontr);
		
		JLabel lblCambiarDeVentana = new JLabel("Cambiar de ventana");
		lblCambiarDeVentana.setBounds(10, 11, 131, 14);
		panel.add(lblCambiarDeVentana);
		esteJPanel.setVisible(true);
		debugFrame.setVisible(true);
		System.out.println("Debug mode started!");
	}
}
