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
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JProgressBar;
/**
 * Clase PaneRegister
 * @author IN1DM3B_18
 *
 */
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
	public JPasswordField fieldPassword2;
	public JLabel lblErrUs;
	public JLabel lblErrNom;
	public JLabel lblRepitaSuContrasea;
	public JLabel lblErrApe;
	public JLabel lblErrFechaNac;
	public JLabel lblTamanoCont;
	public JProgressBar progSegCont;
	public JLabel lblSeguridad;
	public JLabel lblErrCont;
	public JLabel lblErrSexo;
	public JLabel logoPeke;
	public JLabel logoGrande;
	public JLabel lblUsuariodni;
	public JLabel lblNombre;
	public JLabel lblApellidos;
	public JLabel lblSexo;
	public JLabel lblNotaTodosLos;
	public JLabel lblPassword;
	private JLabel ImgRegistro;
	
	public PaneRegister(Frame1 frame1)
	{
		paneRegister = new JPanel();
		paneRegister.setBackground(Color.WHITE);
		paneRegister.setBounds(0, 0, 800, 600);
		
		frame1.frame1.getContentPane().add(paneRegister);
		paneRegister.setLayout(null);
		paneRegister.setVisible(false);
		
		fieldDNI = new JTextField();
		fieldDNI.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		fieldDNI.setBounds(264, 180, 236, 37);
		paneRegister.add(fieldDNI);
		fieldDNI.setColumns(10);
		
		fieldNombre = new JTextField();
		fieldNombre.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		fieldNombre.setBounds(264, 228, 236, 37);
		paneRegister.add(fieldNombre);
		fieldNombre.setColumns(10);
		
		frame1.frame1.getContentPane().add(paneRegister);
		
		btnVolverALogin = new JButton("Volver");
		btnVolverALogin.setBackground(Color.WHITE);
		btnVolverALogin.setForeground(new Color(0, 51, 102));
		btnVolverALogin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		
		btnVolverALogin.setBounds(82, 505, 185, 39);
		paneRegister.add(btnVolverALogin);
		
		logoGrande = new JLabel("");
		logoGrande.setIcon(new ImageIcon(PaneRegister.class.getResource("/ImagenesVista/logo-termibus.png")));
		logoGrande.setBounds(489, 11, 301, 117);
		paneRegister.add(logoGrande);
		
		logoPeke = new JLabel("");
		logoPeke.setIcon(new ImageIcon(PaneRegister.class.getResource("/ImagenesVista/termiLOGOpeke.png")));
		logoPeke.setBounds(10, 505, 70, 64);
		paneRegister.add(logoPeke);
		
		lblUsuariodni = new JLabel("Usuario(DNI) :");
		lblUsuariodni.setHorizontalAlignment(SwingConstants.TRAILING);
		lblUsuariodni.setForeground(new Color(0, 51, 102));
		lblUsuariodni.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblUsuariodni.setBounds(119, 177, 135, 39);
		paneRegister.add(lblUsuariodni);
		
		lblNombre = new JLabel("Nombre :");
		lblNombre.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNombre.setForeground(new Color(0, 51, 102));
		lblNombre.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNombre.setBounds(119, 225, 135, 39);
		paneRegister.add(lblNombre);
		
		lblApellidos = new JLabel("Apellidos :");
		lblApellidos.setHorizontalAlignment(SwingConstants.TRAILING);
		lblApellidos.setForeground(new Color(0, 51, 102));
		lblApellidos.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblApellidos.setBounds(119, 273, 135, 39);
		paneRegister.add(lblApellidos);
		
		lblPassword = new JLabel("Contrase\u00F1a :");
		lblPassword.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPassword.setForeground(new Color(0, 51, 102));
		lblPassword.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblPassword.setBounds(119, 367, 135, 39);
		paneRegister.add(lblPassword);
		
		fieldApellidos = new JTextField();
		fieldApellidos.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		fieldApellidos.setColumns(10);
		fieldApellidos.setBounds(264, 276, 236, 37);
		paneRegister.add(fieldApellidos);
		
		fieldPassword = new JPasswordField();
		fieldPassword.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		fieldPassword.setColumns(10);
		fieldPassword.setBounds(264, 370, 236, 37);
		paneRegister.add(fieldPassword);
		
		fechaNac = new JDateChooser();

	    fechaNac.setBounds(264, 324, 236, 35);
	    
	    Calendar LimitadorFecha = Calendar.getInstance(); LimitadorFecha.add(Calendar.YEAR, -18); LimitadorFecha.add(Calendar.DATE, -1); Date date = LimitadorFecha.getTime();
	    
	    fechaNac.getJCalendar().setMaxSelectableDate(date);
	    paneRegister.add(fechaNac);
		
		lblFechaNacimiento = new JLabel("Fecha Nacimiento :");
		lblFechaNacimiento.setHorizontalAlignment(SwingConstants.TRAILING);
		lblFechaNacimiento.setForeground(new Color(0, 51, 102));
		lblFechaNacimiento.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblFechaNacimiento.setBounds(119, 323, 135, 39);
		paneRegister.add(lblFechaNacimiento);
		
		btnRegistarse = new JButton("Registarse");
		btnRegistarse.setForeground(new Color(0, 51, 102));
		btnRegistarse.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnRegistarse.setBackground(Color.WHITE);
		btnRegistarse.setBounds(585, 505, 185, 39);
		paneRegister.add(btnRegistarse);
		
		comboBoxSexo = new JComboBox();
		comboBoxSexo.setBackground(Color.WHITE);
		comboBoxSexo.setForeground(new Color(0, 51, 102));
		comboBoxSexo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		comboBoxSexo.setModel(new DefaultComboBoxModel(new String[] {"-Seleccione uno-", "Mujer", "Hombre", "Otros"}));
		comboBoxSexo.setSelectedIndex(0);
		comboBoxSexo.setBounds(265, 464, 146, 20);
		paneRegister.add(comboBoxSexo);
		
		lblSexo = new JLabel("Sexo :");
		lblSexo.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSexo.setForeground(new Color(0, 51, 102));
		lblSexo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblSexo.setBounds(121, 453, 135, 39);
		paneRegister.add(lblSexo);
		
		lblErrUs = new JLabel("*El usuario ya existe o el formato es incorrecto");
		lblErrUs.setVisible(false);
		lblErrUs.setForeground(Color.RED);
		lblErrUs.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblErrUs.setBounds(506, 191, 257, 20);
		paneRegister.add(lblErrUs);
		
		lblNotaTodosLos = new JLabel("Nota: Todos los campos son obligatorios");
		lblNotaTodosLos.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblNotaTodosLos.setBounds(264, 147, 546, 20);
		paneRegister.add(lblNotaTodosLos);
		
		lblErrNom = new JLabel("*El nombre debe tener 3 o mas caracteres");
		lblErrNom.setVisible(false);
		lblErrNom.setForeground(Color.RED);
		lblErrNom.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblErrNom.setBounds(506, 239, 250, 20);
		paneRegister.add(lblErrNom);
		
		fieldPassword2 = new JPasswordField();
		fieldPassword2.setFont(new Font("Dialog", Font.PLAIN, 14));
		fieldPassword2.setColumns(10);
		fieldPassword2.setBounds(264, 418, 236, 37);
		paneRegister.add(fieldPassword2);
		
		lblRepitaSuContrasea = new JLabel("Repita su contrase\u00F1a :");
		lblRepitaSuContrasea.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRepitaSuContrasea.setForeground(new Color(0, 51, 102));
		lblRepitaSuContrasea.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblRepitaSuContrasea.setBounds(40, 413, 216, 39);
		paneRegister.add(lblRepitaSuContrasea);
		
		lblErrApe = new JLabel("*El apellido debe tener 3 o mas caracteres");
		lblErrApe.setVisible(false);
		lblErrApe.setForeground(Color.RED);
		lblErrApe.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblErrApe.setBounds(506, 285, 250, 20);
		paneRegister.add(lblErrApe);
		
		lblErrFechaNac = new JLabel("*Es obligatorio introducir una fecha de nacimiento");
		lblErrFechaNac.setVisible(false);
		lblErrFechaNac.setForeground(Color.RED);
		lblErrFechaNac.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblErrFechaNac.setBounds(506, 333, 250, 20);
		paneRegister.add(lblErrFechaNac);
		
		lblTamanoCont = new JLabel("*La contrase\u00F1a debe tener entre 8 y 16 caracteres");
		lblTamanoCont.setForeground(Color.BLACK);
		lblTamanoCont.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblTamanoCont.setBounds(506, 367, 257, 20);
		paneRegister.add(lblTamanoCont);
		
		progSegCont = new JProgressBar();
		progSegCont.setMaximum(16);
		progSegCont.setBounds(506, 392, 146, 14);
		paneRegister.add(progSegCont);
		
		lblSeguridad = new JLabel("");
		lblSeguridad.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		lblSeguridad.setBounds(604, 377, 92, 16);
		paneRegister.add(lblSeguridad);
		
		lblErrCont = new JLabel("*La contrase\u00F1a no coincide o no cumple los requisitos");
		lblErrCont.setVisible(false);
		lblErrCont.setForeground(Color.RED);
		lblErrCont.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblErrCont.setBounds(508, 422, 292, 20);
		paneRegister.add(lblErrCont);
		
		lblErrSexo = new JLabel("*Seleccione un sexo");
		lblErrSexo.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblErrSexo.setVisible(false);
		lblErrSexo.setForeground(Color.RED);
		lblErrSexo.setBounds(420, 465, 250, 20);
		paneRegister.add(lblErrSexo);
		
		ImgRegistro = new JLabel("New label");
		ImgRegistro.setIcon(new ImageIcon(PaneRegister.class.getResource("/ImagenesVista/Registrarse.png")));
		ImgRegistro.setBounds(10, 60, 488, 102);
		paneRegister.add(ImgRegistro);
		
	}
}
