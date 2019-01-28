package Vista;

import javax.swing.JPanel;
import javax.swing.JTextField;

import Controlador.ControlInterfaz;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class PaneLogin {
	
	public JPanel paneLogin;
	public JTextField textfieldUsername;
	public JPasswordField fieldPassword;
	public JLabel lblUsername;
	public JLabel lblPassword;
	public JButton btnLogin;
	public JLabel lblNewLabel;
	public JButton btnRegister;
	private JLabel logoGrande;
	private JLabel logoPeke;
	
	public PaneLogin(Frame1 frame1)
	{
		paneLogin = new JPanel();
		paneLogin.setBackground(Color.WHITE);
		paneLogin.setBounds(0, 0, 800, 600);
		paneLogin.setLayout(null);
		
		textfieldUsername = new JTextField();
		textfieldUsername.setBounds(204, 183, 308, 39);
		paneLogin.add(textfieldUsername);
		textfieldUsername.setColumns(10);
		
		lblUsername = new JLabel("Usuario(DNI) :");
		lblUsername.setHorizontalAlignment(SwingConstants.TRAILING);
		lblUsername.setForeground(Color.DARK_GRAY);
		lblUsername.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblUsername.setBounds(30, 181, 135, 39);
		paneLogin.add(lblUsername);
		
		lblPassword = new JLabel("Contrase\u00F1a :");
		lblPassword.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPassword.setForeground(Color.DARK_GRAY);
		lblPassword.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblPassword.setBounds(30, 233, 135, 39);
		paneLogin.add(lblPassword);
		
		fieldPassword = new JPasswordField();
		fieldPassword.setBounds(204, 235, 308, 35);
		paneLogin.add(fieldPassword);
		
		btnLogin = new JButton("Iniciar sesion");
		btnLogin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnLogin.setForeground(new Color(0, 51, 102));
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setBounds(308, 286, 210, 39);
		paneLogin.add(btnLogin);
		
		lblNewLabel = new JLabel("\u00BFNo dispone de cuenta?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblNewLabel.setBounds(30, 417, 254, 39);
		paneLogin.add(lblNewLabel);
		
		btnRegister = new JButton("Registrese Ahora");
		btnRegister.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnRegister.setForeground(new Color(0, 51, 102));
		btnRegister.setBackground(Color.WHITE);
		
		btnRegister.setBounds(308, 417, 210, 39);
		paneLogin.add(btnRegister);
		
		frame1.frame1.getContentPane().add(paneLogin);
		
		logoGrande = new JLabel("");
		logoGrande.setIcon(new ImageIcon(PaneLogin.class.getResource("/ImagenesVista/logo-termibus.png")));
		logoGrande.setBounds(489, 11, 301, 117);
		paneLogin.add(logoGrande);
		
		logoPeke = new JLabel("");
		logoPeke.setIcon(new ImageIcon(PaneLogin.class.getResource("/ImagenesVista/termiLOGOpeke.png")));
		logoPeke.setBounds(10, 505, 70, 64);
		paneLogin.add(logoPeke);
		paneLogin.setVisible(false);
	}
	
	
}
