package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Controlador.ControlInterfaz;

import javax.swing.JButton;

public class PaneRegister {

	public JPanel paneRegister;
	public JTextField fieldDNI;
	public JTextField fieldNombre;
	public JLabel lblNombre;
	public JLabel lblDni;
	public JButton btnVolverALogin;
	
	
	public PaneRegister(Frame1 frame1)
	{
		paneRegister = new JPanel();
		paneRegister.setBounds(0, 0, 800, 600);
		
		frame1.frame1.getContentPane().add(paneRegister);
		paneRegister.setLayout(null);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(72, 185, 56, 16);
		paneRegister.add(lblNombre);
		
		lblDni = new JLabel("DNI:");
		lblDni.setBounds(72, 157, 56, 16);
		paneRegister.add(lblDni);
		
		fieldDNI = new JTextField();
		fieldDNI.setBounds(140, 154, 116, 22);
		paneRegister.add(fieldDNI);
		fieldDNI.setColumns(10);
		
		fieldNombre = new JTextField();
		fieldNombre.setBounds(140, 182, 116, 22);
		paneRegister.add(fieldNombre);
		fieldNombre.setColumns(10);
		
		frame1.frame1.getContentPane().add(paneRegister);
		
		btnVolverALogin = new JButton("Volver al login");
		
		btnVolverALogin.setBounds(72, 511, 164, 25);
		paneRegister.add(btnVolverALogin);
		paneRegister.setVisible(false);
	}
	
}
