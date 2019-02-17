package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;
/**
 * Clase PaneMostrarCompra Es la pantalla que Muestra los datos del trayecto seleccionado, incluyendo su precio,fecha,etc.
 * @author IN1DM3B_18
 *
 */
public class PaneMostrarCompra extends JComponent {
	
	public JPanel pane;
	public JTextField fieldTipoBillete;
	public JTextField fieldCodBus;
	public JTextField fieldFechaIda;
	public JTextField fieldFechaVuelta;
	public JFormattedTextField fieldPrecio;
	public JButton btnVolverALogin;
	public JButton btnSiguiente;
	public JLabel lblTipoDeBillete;
	public JLabel lblTrayetoria;
	public JLabel lblCodBus;
	public JLabel lblFechaIda;
	public JLabel lblFechaVuelta;
	public JLabel lblPrecio;
	public JLabel logoGrande;
	public JLabel logoPeke;
	public JLabel lblidaYVuelta;
	private JLabel imgResumen;
	public JLabel imgL1;
	public JLabel imgL2;
	public JLabel imgL3;
	public JLabel imgL4;
	public JLabel lblParadaOrigen;
	public JLabel lblParadaDest;
	public JLabel lblCodLinea;
	
	public PaneMostrarCompra(Frame1 frame1)
	{
		pane = new JPanel();
		pane.setBackground(Color.WHITE);
		pane.setBounds(0, 0, 800, 600);
		pane.setLayout(null);
		
		frame1.frame1.getContentPane().add(pane);
		
		logoGrande = new JLabel("");
		logoGrande.setIcon(new ImageIcon(PaneMostrarCompra.class.getResource("/ImagenesVista/logo-termibus.png")));
		logoGrande.setBounds(489, 11, 301, 117);
		pane.add(logoGrande);
		
		logoPeke = new JLabel("");
		logoPeke.setIcon(new ImageIcon(PaneMostrarCompra.class.getResource("/ImagenesVista/termiLOGOpeke.png")));
		logoPeke.setBounds(10, 505, 70, 64);
		pane.add(logoPeke);
		pane.setVisible(false);
		
		
		btnVolverALogin = new JButton("Volver");
		

		btnVolverALogin.setBackground(Color.WHITE);
		btnVolverALogin.setForeground(new Color(0, 51, 102));
		btnVolverALogin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		
		btnVolverALogin.setBounds(82, 505, 185, 39);
		pane.add(btnVolverALogin);
		
		lblTipoDeBillete = new JLabel("Tipo de Billete :");
		lblTipoDeBillete.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTipoDeBillete.setForeground(new Color(0, 51, 102));
		lblTipoDeBillete.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblTipoDeBillete.setBounds(162, 166, 161, 39);
		pane.add(lblTipoDeBillete);
		
		lblTrayetoria = new JLabel("Trayetoria :");
		lblTrayetoria.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTrayetoria.setForeground(new Color(0, 51, 102));
		lblTrayetoria.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblTrayetoria.setBounds(163, 232, 161, 39);
		pane.add(lblTrayetoria);
		
		lblCodBus = new JLabel("Autobus :");
		lblCodBus.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCodBus.setForeground(new Color(0, 51, 102));
		lblCodBus.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblCodBus.setBounds(162, 286, 161, 39);
		pane.add(lblCodBus);
		
		lblFechaIda = new JLabel("Fecha Ida :");
		lblFechaIda.setHorizontalAlignment(SwingConstants.TRAILING);
		lblFechaIda.setForeground(new Color(0, 51, 102));
		lblFechaIda.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblFechaIda.setBounds(162, 336, 161, 39);
		pane.add(lblFechaIda);
		
		lblFechaVuelta = new JLabel("Fecha Vuelta :");
		lblFechaVuelta.setHorizontalAlignment(SwingConstants.TRAILING);
		lblFechaVuelta.setForeground(new Color(0, 51, 102));
		lblFechaVuelta.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblFechaVuelta.setBounds(162, 385, 161, 39);
		pane.add(lblFechaVuelta);
		
		lblPrecio = new JLabel("Precio :");
		lblPrecio.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPrecio.setForeground(new Color(0, 51, 102));
		lblPrecio.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblPrecio.setBounds(162, 435, 161, 39);
		pane.add(lblPrecio);
		
		btnSiguiente = new JButton("Confirmar");
		btnSiguiente.setBackground(Color.WHITE);
		btnSiguiente.setForeground(new Color(0, 51, 102));
		btnSiguiente.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSiguiente.setBackground(Color.WHITE);
		btnSiguiente.setBounds(585, 505, 185, 39);
		pane.add(btnSiguiente);
		
		fieldTipoBillete = new JTextField();
		fieldTipoBillete.setEditable(false);
		fieldTipoBillete.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		fieldTipoBillete.setColumns(10);
		fieldTipoBillete.setBounds(333, 168, 236, 37);
		pane.add(fieldTipoBillete);
		
		fieldCodBus = new JTextField();
		fieldCodBus.setEditable(false);
		fieldCodBus.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		fieldCodBus.setColumns(10);
		fieldCodBus.setBounds(333, 286, 236, 37);
		pane.add(fieldCodBus);
		
		fieldFechaIda = new JTextField();
		fieldFechaIda.setEditable(false);
		fieldFechaIda.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		fieldFechaIda.setColumns(10);
		fieldFechaIda.setBounds(333, 336, 236, 37);
		pane.add(fieldFechaIda);
		
		fieldFechaVuelta = new JTextField();
		fieldFechaVuelta.setEditable(false);
		fieldFechaVuelta.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		fieldFechaVuelta.setColumns(10);
		fieldFechaVuelta.setBounds(333, 387, 236, 37);
		pane.add(fieldFechaVuelta);
		
		MaskFormatter mfCC = null;
		/*try {
			mfCC = new MaskFormatter("#.##€");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mfCC.setPlaceholderCharacter('0');*/
		fieldPrecio = new JFormattedTextField(mfCC);
		fieldPrecio.setEditable(false);
		fieldPrecio.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		fieldPrecio.setColumns(10);
		fieldPrecio.setBounds(333, 435, 236, 37);
		pane.add(fieldPrecio);
		
		lblidaYVuelta = new JLabel("(Ida y Vuelta)");
		lblidaYVuelta.setVisible(false);
		lblidaYVuelta.setForeground(new Color(0, 51, 102));
		lblidaYVuelta.setFont(new Font("Dialog", Font.BOLD, 13));
		lblidaYVuelta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblidaYVuelta.setBounds(191, 465, 129, 21);
		pane.add(lblidaYVuelta);
		
		imgResumen = new JLabel("");
		imgResumen.setIcon(new ImageIcon(PaneMostrarCompra.class.getResource("/ImagenesVista/Resumen.png")));
		imgResumen.setBounds(12, 60, 465, 93);
		pane.add(imgResumen);
		
		imgL1 = new JLabel("");
		imgL1.setIcon(new ImageIcon(PaneMostrarCompra.class.getResource("/ImagenesVista/L1.png")));
		imgL1.setBounds(378, 226, 150, 56);
		pane.add(imgL1);
		
		imgL2 = new JLabel("");
		imgL2.setVisible(false);
		imgL2.setIcon(new ImageIcon(PaneMostrarCompra.class.getResource("/ImagenesVista/L2.png")));
		imgL2.setBounds(378, 226, 150, 56);
		pane.add(imgL2);
		
		imgL3 = new JLabel("");
		imgL3.setVisible(false);
		imgL3.setIcon(new ImageIcon(PaneMostrarCompra.class.getResource("/ImagenesVista/L3.png")));
		imgL3.setBounds(378, 226, 150, 56);
		pane.add(imgL3);
		
		imgL4 = new JLabel("");
		imgL4.setVisible(false);
		imgL4.setIcon(new ImageIcon(PaneMostrarCompra.class.getResource("/ImagenesVista/L4.png")));
		imgL4.setBounds(378, 226, 150, 56);
		pane.add(imgL4);
		
		lblParadaOrigen = new JLabel("New label");
		lblParadaOrigen.setHorizontalAlignment(SwingConstants.CENTER);
		lblParadaOrigen.setBounds(322, 219, 123, 16);
		pane.add(lblParadaOrigen);
		
		lblParadaDest = new JLabel("New label");
		lblParadaDest.setHorizontalAlignment(SwingConstants.CENTER);
		lblParadaDest.setBounds(446, 219, 123, 16);
		pane.add(lblParadaDest);
		
		lblCodLinea = new JLabel("New label");
		lblCodLinea.setFont(new Font("Dialog", Font.BOLD, 16));
		lblCodLinea.setForeground(new Color(0, 51, 102));
		lblCodLinea.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodLinea.setBounds(530, 244, 74, 16);
		pane.add(lblCodLinea);
	
}
}
