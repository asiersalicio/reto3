package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Controlador.ControlInterfaz;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

public class PaneRegister {

	public JPanel paneRegister;
	public JTextField fieldDNI;
	public JTextField fieldNombre;
	public JButton btnVolverALogin;
	private JTextField fieldApellidos;
	private JTextField fieldPassword;
	
	
	public PaneRegister(Frame1 frame1)
	{
		paneRegister = new JPanel();
		paneRegister.setBackground(Color.WHITE);
		paneRegister.setBounds(0, 0, 800, 600);
		
		frame1.frame1.getContentPane().add(paneRegister);
		paneRegister.setLayout(null);
		
		fieldDNI = new JTextField();
		fieldDNI.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		fieldDNI.setBounds(200, 184, 236, 37);
		paneRegister.add(fieldDNI);
		fieldDNI.setColumns(10);
		
		fieldNombre = new JTextField();
		fieldNombre.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		fieldNombre.setBounds(200, 232, 236, 37);
		paneRegister.add(fieldNombre);
		fieldNombre.setColumns(10);
		
		frame1.frame1.getContentPane().add(paneRegister);
		
		btnVolverALogin = new JButton("Volver");
		btnVolverALogin.setBackground(Color.WHITE);
		btnVolverALogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ControlInterfaz.setPanel(ControlInterfaz.paneLogin.paneLogin);
			}
		});
		btnVolverALogin.setForeground(new Color(0, 51, 102));
		btnVolverALogin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		
		btnVolverALogin.setBounds(577, 505, 185, 39);
		paneRegister.add(btnVolverALogin);
		
		JLabel logoTermibus = new JLabel("");
		logoTermibus.setIcon(new ImageIcon(PaneRegister.class.getResource("/ImagenesVista/logo-termibus.png")));
		logoTermibus.setBounds(489, 11, 301, 117);
		paneRegister.add(logoTermibus);
		
		JLabel iconopeke = new JLabel("");
		iconopeke.setIcon(new ImageIcon(PaneRegister.class.getResource("/ImagenesVista/termiLOGOpeke.png")));
		iconopeke.setBounds(10, 505, 70, 64);
		paneRegister.add(iconopeke);
		
		JLabel lblUsuariodni = new JLabel("Usuario(DNI) :");
		lblUsuariodni.setHorizontalAlignment(SwingConstants.TRAILING);
		lblUsuariodni.setForeground(Color.DARK_GRAY);
		lblUsuariodni.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblUsuariodni.setBounds(55, 181, 135, 39);
		paneRegister.add(lblUsuariodni);
		
		JLabel lblNombre = new JLabel("Nombre :");
		lblNombre.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNombre.setForeground(Color.DARK_GRAY);
		lblNombre.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblNombre.setBounds(55, 229, 135, 39);
		paneRegister.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos :");
		lblApellidos.setHorizontalAlignment(SwingConstants.TRAILING);
		lblApellidos.setForeground(Color.DARK_GRAY);
		lblApellidos.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblApellidos.setBounds(55, 277, 135, 39);
		paneRegister.add(lblApellidos);
		
		JLabel lblPassword = new JLabel("Contrase\u00F1a :");
		lblPassword.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPassword.setForeground(Color.DARK_GRAY);
		lblPassword.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblPassword.setBounds(55, 371, 135, 39);
		paneRegister.add(lblPassword);
		
		fieldApellidos = new JTextField();
		fieldApellidos.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		fieldApellidos.setColumns(10);
		fieldApellidos.setBounds(200, 280, 236, 37);
		paneRegister.add(fieldApellidos);
		
		fieldPassword = new JTextField();
		fieldPassword.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		fieldPassword.setColumns(10);
		fieldPassword.setBounds(200, 374, 236, 37);
		paneRegister.add(fieldPassword);
		
		JDateChooser fechaNac = new JDateChooser();
	    fechaNac.setBounds(200, 328, 236, 35);
	    paneRegister.add(fechaNac);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento :");
		lblFechaNacimiento.setHorizontalAlignment(SwingConstants.TRAILING);
		lblFechaNacimiento.setForeground(Color.DARK_GRAY);
		lblFechaNacimiento.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblFechaNacimiento.setBounds(55, 327, 135, 39);
		paneRegister.add(lblFechaNacimiento);
		paneRegister.setVisible(false);
		
		Date fechaNacimiento=fechaNac.getDate();
		String nombre="";
		String apellidos="";
		
	}
}
