package Vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Controlador.ControlInterfaz;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PaneMostrarCompra {
	
	private JPanel PaneMostrarCompra;
	private JTextField fieldTipoBillete;
	private JTextField fieldTrayectoria;
	private JTextField fieldLinea;
	private JTextField fieldFechaIda;
	private JTextField fieldFechaVuelta;
	private JTextField fieldPrecio;
	
	public PaneMostrarCompra(Frame1 frame1)
	{
		PaneMostrarCompra = new JPanel();
		PaneMostrarCompra.setBackground(Color.WHITE);
		PaneMostrarCompra.setBounds(0, 0, 800, 600);
		PaneMostrarCompra.setLayout(null);
		
		frame1.frame1.getContentPane().add(PaneMostrarCompra);
		
		JLabel logoGrande = new JLabel("");
		logoGrande.setIcon(new ImageIcon(PaneMostrarCompra.class.getResource("/ImagenesVista/logo-termibus.png")));
		logoGrande.setBounds(489, 11, 301, 117);
		PaneMostrarCompra.add(logoGrande);
		
		JLabel logoPeke = new JLabel("");
		logoPeke.setIcon(new ImageIcon(PaneMostrarCompra.class.getResource("/ImagenesVista/termiLOGOpeke.png")));
		logoPeke.setBounds(10, 505, 70, 64);
		PaneMostrarCompra.add(logoPeke);
		PaneMostrarCompra.setVisible(false);
		
		
		JButton btnVolverALogin = new JButton("Volver");
		btnVolverALogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVolverALogin.setBackground(Color.WHITE);
		btnVolverALogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ControlInterfaz.setPanel(ControlInterfaz.paneLogin.paneLogin);
			}
		});
		btnVolverALogin.setForeground(new Color(0, 51, 102));
		btnVolverALogin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		
		btnVolverALogin.setBounds(82, 505, 185, 39);
		PaneMostrarCompra.add(btnVolverALogin);
		
		JLabel lblDetalles = new JLabel("Detalles de su compra :");
		lblDetalles.setForeground(new Color(0, 51, 102));
		lblDetalles.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 18));
		lblDetalles.setBounds(32, 108, 229, 45);
		PaneMostrarCompra.add(lblDetalles);
		
		JLabel lblTipoDeBillete = new JLabel("Tipo de Billete :");
		lblTipoDeBillete.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTipoDeBillete.setForeground(Color.DARK_GRAY);
		lblTipoDeBillete.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblTipoDeBillete.setBounds(108, 164, 135, 39);
		PaneMostrarCompra.add(lblTipoDeBillete);
		
		JLabel lblTrayetoria = new JLabel("Trayetoria :");
		lblTrayetoria.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTrayetoria.setForeground(Color.DARK_GRAY);
		lblTrayetoria.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblTrayetoria.setBounds(108, 214, 135, 39);
		PaneMostrarCompra.add(lblTrayetoria);
		
		JLabel lblLinea = new JLabel("Linea :");
		lblLinea.setHorizontalAlignment(SwingConstants.TRAILING);
		lblLinea.setForeground(Color.DARK_GRAY);
		lblLinea.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblLinea.setBounds(108, 264, 135, 39);
		PaneMostrarCompra.add(lblLinea);
		
		JLabel lblFechaIda = new JLabel("Fecha Ida :");
		lblFechaIda.setHorizontalAlignment(SwingConstants.TRAILING);
		lblFechaIda.setForeground(Color.DARK_GRAY);
		lblFechaIda.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblFechaIda.setBounds(108, 314, 135, 39);
		PaneMostrarCompra.add(lblFechaIda);
		
		JLabel lblFechaVuelta = new JLabel("Fecha Vuelta :");
		lblFechaVuelta.setHorizontalAlignment(SwingConstants.TRAILING);
		lblFechaVuelta.setForeground(Color.DARK_GRAY);
		lblFechaVuelta.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblFechaVuelta.setBounds(108, 363, 135, 39);
		PaneMostrarCompra.add(lblFechaVuelta);
		
		JLabel lblPrecio = new JLabel("Precio :");
		lblPrecio.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPrecio.setForeground(Color.DARK_GRAY);
		lblPrecio.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblPrecio.setBounds(108, 413, 135, 39);
		PaneMostrarCompra.add(lblPrecio);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSiguiente.setBackground(Color.WHITE);
		btnSiguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ControlInterfaz.setPanel(ControlInterfaz.panePago.panePago);
			}
		});
		btnSiguiente.setForeground(new Color(0, 51, 102));
		btnSiguiente.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSiguiente.setBackground(Color.WHITE);
		btnSiguiente.setBounds(585, 505, 185, 39);
		PaneMostrarCompra.add(btnSiguiente);
		
		fieldTipoBillete = new JTextField();
		fieldTipoBillete.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		fieldTipoBillete.setColumns(10);
		fieldTipoBillete.setBounds(253, 166, 236, 37);
		PaneMostrarCompra.add(fieldTipoBillete);
		
		fieldTrayectoria = new JTextField();
		fieldTrayectoria.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		fieldTrayectoria.setColumns(10);
		fieldTrayectoria.setBounds(253, 214, 236, 37);
		PaneMostrarCompra.add(fieldTrayectoria);
		
		fieldLinea = new JTextField();
		fieldLinea.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		fieldLinea.setColumns(10);
		fieldLinea.setBounds(253, 264, 236, 37);
		PaneMostrarCompra.add(fieldLinea);
		
		fieldFechaIda = new JTextField();
		fieldFechaIda.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		fieldFechaIda.setColumns(10);
		fieldFechaIda.setBounds(253, 314, 236, 37);
		PaneMostrarCompra.add(fieldFechaIda);
		
		fieldFechaVuelta = new JTextField();
		fieldFechaVuelta.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		fieldFechaVuelta.setColumns(10);
		fieldFechaVuelta.setBounds(253, 365, 236, 37);
		PaneMostrarCompra.add(fieldFechaVuelta);
		
		fieldPrecio = new JTextField();
		fieldPrecio.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		fieldPrecio.setColumns(10);
		fieldPrecio.setBounds(253, 413, 236, 37);
		PaneMostrarCompra.add(fieldPrecio);
		
	}
	
	public JPanel getPane()
	{
		return this.PaneMostrarCompra;
	}
}
