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
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

/*
 * Clase PaneLogin
 */
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
	public JLabel lblUsConNoValido;
	
	public PaneLogin(Frame1 frame1)
	{
		paneLogin = new JPanel();
		paneLogin.setBackground(Color.WHITE);
		paneLogin.setBounds(0, 0, 800, 600);
		paneLogin.setLayout(null);
		
		textfieldUsername = new JTextField();
		textfieldUsername.setBounds(278, 212, 308, 39);
		paneLogin.add(textfieldUsername);
		textfieldUsername.setColumns(10);
		
		lblUsername = new JLabel("Usuario(DNI) :");
		lblUsername.setHorizontalAlignment(SwingConstants.TRAILING);
		lblUsername.setForeground(new Color(0, 51, 102));
		lblUsername.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblUsername.setBounds(133, 209, 135, 39);
		paneLogin.add(lblUsername);
		
		lblPassword = new JLabel("Contrase\u00F1a :");
		lblPassword.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPassword.setForeground(new Color(0, 51, 102));
		lblPassword.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblPassword.setBounds(133, 261, 135, 39);
		paneLogin.add(lblPassword);
		
		fieldPassword = new JPasswordField();
		fieldPassword.setBounds(278, 262, 308, 39);
		paneLogin.add(fieldPassword);
		
		btnLogin = new JButton("Iniciar sesion");
		btnLogin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnLogin.setForeground(new Color(0, 51, 102));
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setBounds(378, 321, 210, 39);
		paneLogin.add(btnLogin);
		
		lblNewLabel = new JLabel("\u00BFNo dispone de cuenta?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setForeground(new Color(0, 51, 102));
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblNewLabel.setBounds(110, 474, 254, 39);
		paneLogin.add(lblNewLabel);
		
		btnRegister = new JButton("Registrese Ahora");
		btnRegister.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnRegister.setForeground(new Color(0, 51, 102));
		btnRegister.setBackground(Color.WHITE);
		
		btnRegister.setBounds(378, 474, 210, 39);
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
		
		lblUsConNoValido = new JLabel("    *El usuario o contrase\u00F1a no es valido");
		lblUsConNoValido.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblUsConNoValido.setVisible(false);
		lblUsConNoValido.setForeground(Color.RED);
		lblUsConNoValido.setBounds(307, 181, 246, 29);
		paneLogin.add(lblUsConNoValido);
		
		JLabel lblBienvenidaLogin = new JLabel("Bienvenido, entre en su perfil :");
		lblBienvenidaLogin.setForeground(new Color(204, 0, 0));
		lblBienvenidaLogin.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 18));
		lblBienvenidaLogin.setBounds(10, 83, 378, 45);
		paneLogin.add(lblBienvenidaLogin);
		paneLogin.setVisible(false);
	}
}
