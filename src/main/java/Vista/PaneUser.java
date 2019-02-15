package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.ListModel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JProgressBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Clase PaneCambioFinal
 * @author IN1DM3B_18
 *
 */
public class PaneUser {
	
	public JPanel pane;
	public DefaultListModel<String> modelo2;
	public JList<String> listaViajesPasados;
	public JList<String> listaViajesFuturos;
	public JButton btnCambiar;
	public JLabel lblLogoGrande;
	public JLabel lblLogoPeke;
	public JLabel lblCodVuelta;
	public JButton btnVolver;
	public JPasswordField passwordNueva;
	public JPasswordField passwordNuevacheck;
	public JLabel lblCuentaDeUsuario;
	public JLabel lblNewPassword ;
	public JLabel lblNewPasswordCheck;
	private JLabel lblTusDatos;
	private JLabel lblDni;
	private JLabel lblNombreYApellidos;
	public JTextField fieldDNI;
	public JTextField fieldNombre;
	public JLabel lblSeguridad;
	public JProgressBar progressBarSeguridad;
	public JLabel lblErrContra;


	/**
	 * Método: PaneCambioFinal
	 * @param frame1
	 */
	public PaneUser(Frame1 frame1)
	{
		
		
		pane = new JPanel();
		pane.setBackground(Color.WHITE);
		pane.setBounds(0, 0, 800, 600);
		pane.setLayout(null);
		
		frame1.frame1.getContentPane().add(pane);

		
		modelo2=new DefaultListModel<String>();
		listaViajesPasados = new JList<String>(modelo2);
		listaViajesPasados.setValueIsAdjusting(true);
		listaViajesPasados.setForeground(new Color(0, 51, 102));
		listaViajesPasados.setBackground(Color.WHITE);
		listaViajesPasados.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(212, 208, 200), null, null, null), "Billetes de Viajes Pasados", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(204, 0, 0)));
		listaViajesPasados.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		listaViajesPasados.setBounds(75, 308, 239, 181);
		pane.add(listaViajesPasados);
		
		lblCodVuelta = new JLabel("");
		lblCodVuelta.setForeground(Color.GRAY);
		lblCodVuelta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCodVuelta.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblCodVuelta.setBounds(574, 354, 108, 29);
		pane.add(lblCodVuelta);
		
				
		lblLogoGrande = new JLabel("");
		lblLogoGrande.setIcon(new ImageIcon(PaneUser.class.getResource("/ImagenesVista/logo-termibus.png")));
		lblLogoGrande.setBounds(489, 11, 301, 117);
		pane.add(lblLogoGrande);
		
		lblLogoPeke = new JLabel("");
		lblLogoPeke.setIcon(new ImageIcon(PaneUser.class.getResource("/ImagenesVista/termiLOGOpeke.png")));
		lblLogoPeke.setBounds(10, 505, 70, 64);
		pane.add(lblLogoPeke);
		
		btnVolver = new JButton("Volver a Compra");
		
		btnVolver.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnVolver.setBackground(Color.WHITE);
		btnVolver.setForeground(new Color(0, 51, 102));
		
		btnVolver.setBounds(637, 523, 153, 46);
		pane.add(btnVolver);
		
		lblCuentaDeUsuario = new JLabel("Cuenta de Usuario :");
		lblCuentaDeUsuario.setForeground(new Color(204, 0, 0));
		lblCuentaDeUsuario.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblCuentaDeUsuario.setBounds(47, 66, 270, 46);
		pane.add(lblCuentaDeUsuario);
		
		listaViajesFuturos = new JList<String>(modelo2);
		listaViajesFuturos.setForeground(new Color(0, 51, 102));
		listaViajesFuturos.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		listaViajesFuturos.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(212, 208, 200), null, null, null), "Billetes de Viajes Futuros", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(204, 0, 0)));
		listaViajesFuturos.setBackground(Color.WHITE);
		listaViajesFuturos.setBounds(489, 308, 239, 181);
		pane.add(listaViajesFuturos);
		
		passwordNueva = new JPasswordField();
		passwordNueva.setBackground(Color.WHITE);
		passwordNueva.setBounds(223, 164, 189, 39);
		pane.add(passwordNueva);
		
		lblNewPassword = new JLabel("Contrase\u00F1a :");
		lblNewPassword.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewPassword.setForeground(new Color(0, 51, 102));
		lblNewPassword.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewPassword.setBounds(78, 163, 135, 39);
		pane.add(lblNewPassword);
		
		passwordNuevacheck = new JPasswordField();
		passwordNuevacheck.setBackground(Color.WHITE);
		passwordNuevacheck.setBounds(223, 214, 189, 39);
		pane.add(passwordNuevacheck);
		
		lblNewPasswordCheck = new JLabel("Nueva Contrase\u00F1a :");
		lblNewPasswordCheck.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewPasswordCheck.setForeground(new Color(0, 51, 102));
		lblNewPasswordCheck.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewPasswordCheck.setBounds(24, 213, 189, 39);
		pane.add(lblNewPasswordCheck);
		
		btnCambiar = new JButton("Cambiar");
		btnCambiar.setForeground(new Color(0, 51, 102));
		btnCambiar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnCambiar.setBackground(Color.WHITE);
		btnCambiar.setBounds(240, 266, 172, 29);
		pane.add(btnCambiar);
		
		lblTusDatos = new JLabel("Tus datos");
		lblTusDatos.setBounds(430, 148, 56, 16);
		pane.add(lblTusDatos);
		
		lblDni = new JLabel("DNI:");
		lblDni.setBounds(424, 188, 114, 16);
		pane.add(lblDni);
		
		lblNombreYApellidos = new JLabel("Nombre y apellidos:");
		lblNombreYApellidos.setBounds(424, 214, 120, 16);
		pane.add(lblNombreYApellidos);
		
		fieldDNI = new JTextField();
		fieldDNI.setEditable(false);
		fieldDNI.setColumns(10);
		fieldDNI.setBounds(550, 181, 116, 22);
		pane.add(fieldDNI);
		
		fieldNombre = new JTextField();
		fieldNombre.setEditable(false);
		fieldNombre.setColumns(10);
		fieldNombre.setBounds(551, 211, 116, 22);
		pane.add(fieldNombre);
		
		lblSeguridad = new JLabel("");
		lblSeguridad.setBounds(92, 247, 114, 16);
		pane.add(lblSeguridad);
		
		progressBarSeguridad = new JProgressBar();
		progressBarSeguridad.setMaximum(16);
		progressBarSeguridad.setBounds(70, 266, 158, 29);
		pane.add(progressBarSeguridad);
		
		lblErrContra = new JLabel("*Las contrase\u00F1as no cumplen los requisitos");
		lblErrContra.setVisible(false);
		lblErrContra.setForeground(Color.RED);
		lblErrContra.setBounds(104, 134, 294, 16);
		pane.add(lblErrContra);
		
		
		
		pane.setVisible(false);
	}

	public void reset() {
		lblCodVuelta.setText("");
		
	}
}
	
	

