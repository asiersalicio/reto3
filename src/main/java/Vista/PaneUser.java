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

/**
 * Clase PaneCambioFinal
 * @author IN1DM3B_18
 *
 */
public class PaneUser {
	
	public JPanel paneUser;
	public DefaultListModel<String> modelo2;
	public JList<String> listaViajesPasados;
	public JList<String> listaViajesFuturos;
	public JButton btnCambiar;
	public JLabel lblLogoGrande;
	public JLabel lblLogoPeke;
	public JLabel lblCodVuelta;
	public JButton btnVolver;
	private JPasswordField passwordNueva;
	private JPasswordField passwordNuevacheck;
	public JLabel lblCuentaDeUsuario;
	public JLabel lblNewPassword ;
	public JLabel lblNewPasswordCheck;
	public JButton btnCambiarContrasea;


	/**
	 * Método: PaneCambioFinal
	 * @param frame1
	 */
	public PaneUser(Frame1 frame1)
	{
		
		
		paneUser = new JPanel();
		paneUser.setBackground(Color.WHITE);
		paneUser.setBounds(0, 0, 800, 600);
		paneUser.setLayout(null);
		
		frame1.frame1.getContentPane().add(paneUser);

		
		modelo2=new DefaultListModel<String>();
		listaViajesPasados = new JList<String>(modelo2);
		listaViajesPasados.setForeground(new Color(0, 51, 102));
		listaViajesPasados.setBackground(Color.WHITE);
		listaViajesPasados.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(212, 208, 200), null, null, null), "Billetes de Viajes Pasados", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(204, 0, 0)));
		listaViajesPasados.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		listaViajesPasados.setBounds(75, 308, 239, 181);
		paneUser.add(listaViajesPasados);
		
		lblCodVuelta = new JLabel("");
		lblCodVuelta.setForeground(Color.GRAY);
		lblCodVuelta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCodVuelta.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblCodVuelta.setBounds(574, 354, 108, 29);
		paneUser.add(lblCodVuelta);
		
				
		lblLogoGrande = new JLabel("");
		lblLogoGrande.setIcon(new ImageIcon(PaneUser.class.getResource("/ImagenesVista/logo-termibus.png")));
		lblLogoGrande.setBounds(489, 11, 301, 117);
		paneUser.add(lblLogoGrande);
		
		lblLogoPeke = new JLabel("");
		lblLogoPeke.setIcon(new ImageIcon(PaneUser.class.getResource("/ImagenesVista/termiLOGOpeke.png")));
		lblLogoPeke.setBounds(10, 505, 70, 64);
		paneUser.add(lblLogoPeke);
		
		btnVolver = new JButton("Volver a Compra");
		btnVolver.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnVolver.setBackground(Color.WHITE);
		btnVolver.setForeground(new Color(0, 51, 102));
		
		btnVolver.setBounds(637, 523, 153, 46);
		paneUser.add(btnVolver);
		
		lblCuentaDeUsuario = new JLabel("Cuenta de Usuario :");
		lblCuentaDeUsuario.setForeground(new Color(204, 0, 0));
		lblCuentaDeUsuario.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblCuentaDeUsuario.setBounds(47, 66, 270, 46);
		paneUser.add(lblCuentaDeUsuario);
		
		listaViajesFuturos = new JList<String>(modelo2);
		listaViajesFuturos.setForeground(new Color(0, 51, 102));
		listaViajesFuturos.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		listaViajesFuturos.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(212, 208, 200), null, null, null), "Billetes de Viajes Futuros", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(204, 0, 0)));
		listaViajesFuturos.setBackground(Color.WHITE);
		listaViajesFuturos.setBounds(489, 308, 239, 181);
		paneUser.add(listaViajesFuturos);
		
		passwordNueva = new JPasswordField();
		passwordNueva.setBackground(Color.LIGHT_GRAY);
		passwordNueva.setEnabled(false);
		passwordNueva.setBounds(223, 164, 308, 39);
		paneUser.add(passwordNueva);
		
		lblNewPassword = new JLabel("Contrase\u00F1a :");
		lblNewPassword.setEnabled(false);
		lblNewPassword.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewPassword.setForeground(new Color(0, 51, 102));
		lblNewPassword.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewPassword.setBounds(78, 163, 135, 39);
		paneUser.add(lblNewPassword);
		
		passwordNuevacheck = new JPasswordField();
		passwordNuevacheck.setBackground(Color.LIGHT_GRAY);
		passwordNuevacheck.setEnabled(false);
		passwordNuevacheck.setBounds(223, 214, 308, 39);
		paneUser.add(passwordNuevacheck);
		
		lblNewPasswordCheck = new JLabel("Nueva Contrase\u00F1a :");
		lblNewPasswordCheck.setEnabled(false);
		lblNewPasswordCheck.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewPasswordCheck.setForeground(new Color(0, 51, 102));
		lblNewPasswordCheck.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewPasswordCheck.setBounds(24, 213, 189, 39);
		paneUser.add(lblNewPasswordCheck);
		
		btnCambiarContrasea = new JButton("Cambiar Contrase\u00F1a");
		btnCambiarContrasea.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnCambiarContrasea.setBackground(Color.WHITE);
		btnCambiarContrasea.setForeground(new Color(0, 51, 102));
		btnCambiarContrasea.setBounds(57, 123, 153, 39);
		paneUser.add(btnCambiarContrasea);
		
		btnCambiar = new JButton("Cambiar");
		btnCambiar.setForeground(new Color(0, 51, 102));
		btnCambiar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnCambiar.setBackground(Color.WHITE);
		btnCambiar.setBounds(305, 258, 172, 29);
		paneUser.add(btnCambiar);
		btnCambiar.setVisible(false);
		
		
		
		paneUser.setVisible(false);
	}

	public void reset() {
		lblCodVuelta.setText("");
		
	}
}
	
	

