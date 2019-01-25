package Vista;

import javax.swing.JPanel;
import javax.swing.JTextField;

import Controlador.ControlInterfaz;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PaneLogin {
	
	public JPanel paneLogin;
	public JTextField textfieldUsername;
	public JPasswordField fieldPass;
	public JLabel lblUsername;
	public JLabel lblPass;
	public JButton btnLogin;
	public JLabel lblNewLabel;
	public JButton btnRegister;
	
	public PaneLogin(Frame1 frame1)
	{
		paneLogin = new JPanel();
		paneLogin.setBounds(0, 0, 800, 600);
		paneLogin.setLayout(null);
		
		textfieldUsername = new JTextField();
		textfieldUsername.setBounds(204, 183, 308, 39);
		paneLogin.add(textfieldUsername);
		textfieldUsername.setColumns(10);
		
		lblUsername = new JLabel("Usuario(DNI)");
		lblUsername.setBounds(63, 183, 135, 39);
		paneLogin.add(lblUsername);
		
		lblPass = new JLabel("Contrase\u00F1a:");
		lblPass.setBounds(63, 235, 135, 39);
		paneLogin.add(lblPass);
		
		fieldPass = new JPasswordField();
		fieldPass.setBounds(204, 235, 308, 35);
		paneLogin.add(fieldPass);
		
		btnLogin = new JButton("Iniciar sesion");
		btnLogin.setBounds(308, 286, 210, 39);
		paneLogin.add(btnLogin);
		
		lblNewLabel = new JLabel("\u00BFNo dispone de cuenta?");
		lblNewLabel.setBounds(63, 417, 254, 39);
		paneLogin.add(lblNewLabel);
		
		btnRegister = new JButton("Registrese Ahora");
		
		btnRegister.setBounds(308, 417, 210, 39);
		paneLogin.add(btnRegister);
		
		frame1.frame1.getContentPane().add(paneLogin);
		paneLogin.setVisible(false);
	}
	
	
}
