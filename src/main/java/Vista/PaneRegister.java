package Vista;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class PaneRegister {

	public JPanel paneRegister;
	public JTextField fieldDNI;
	public JTextField fieldNombre;
	public JButton btnVolverALogin;
	public JTextField fieldApellidos;
	public JPasswordField fieldPassword;
	public JButton btnRegistarse;
	public JLabel lblFechaNacimiento;
	public JDateChooser fechaNac;
	public JComboBox comboBoxSexo;
	
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
		btnVolverALogin.setForeground(new Color(0, 51, 102));
		btnVolverALogin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		
		btnVolverALogin.setBounds(90, 505, 185, 39);
		paneRegister.add(btnVolverALogin);
		
		JLabel logoGrande = new JLabel("");
		logoGrande.setIcon(new ImageIcon(PaneRegister.class.getResource("/ImagenesVista/logo-termibus.png")));
		logoGrande.setBounds(489, 11, 301, 117);
		paneRegister.add(logoGrande);
		
		JLabel logoPeke = new JLabel("");
		logoPeke.setIcon(new ImageIcon(PaneRegister.class.getResource("/ImagenesVista/termiLOGOpeke.png")));
		logoPeke.setBounds(10, 505, 70, 64);
		paneRegister.add(logoPeke);
		
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
		
		fieldPassword = new JPasswordField();
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
		
		JLabel lblRegistrese = new JLabel("Reg\u00EDstrese ahora :");
		lblRegistrese.setForeground(new Color(0, 51, 102));
		lblRegistrese.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 18));
		lblRegistrese.setBounds(32, 108, 229, 45);
		paneRegister.add(lblRegistrese);
		
		btnRegistarse = new JButton("Registarse");
		btnRegistarse.setForeground(new Color(0, 51, 102));
		btnRegistarse.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnRegistarse.setBackground(Color.WHITE);
		btnRegistarse.setBounds(542, 505, 185, 39);
		paneRegister.add(btnRegistarse);
		
		comboBoxSexo = new JComboBox();
		comboBoxSexo.setModel(new DefaultComboBoxModel(new String[] {"Mujer", "Hombre", "Otros"}));
		comboBoxSexo.setBounds(633, 323, 78, 20);
		paneRegister.add(comboBoxSexo);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSexo.setForeground(Color.DARK_GRAY);
		lblSexo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblSexo.setBounds(489, 312, 135, 39);
		paneRegister.add(lblSexo);
		paneRegister.setVisible(false);
		
		/*Date fechaNacimiento=fechaNac.getDate();
		String nombre="";
		String apellidos="";*/
		
	}
}
