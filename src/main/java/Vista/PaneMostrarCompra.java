package Vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import javax.swing.text.NumberFormatter;

import Controlador.ControlInterfaz;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Map;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.RenderingHints.Key;
import java.awt.Color;
import java.awt.Composite;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
/**
 * Clase PaneMostrarCompra
 * @author IN1DM3B_18
 *
 */
public class PaneMostrarCompra extends JComponent {
	
	public JPanel paneMostrarCompra;
	public JTextField fieldTipoBillete;
	public JTextField fieldTrayectoria;
	public JTextField fieldLinea;
	public JTextField fieldFechaIda;
	public JTextField fieldFechaVuelta;
	public JFormattedTextField fieldPrecio;
	public JButton btnVolverALogin;
	public JButton btnSiguiente;
	public JLabel lblTipoDeBillete;
	public JLabel lblTrayetoria;
	public JLabel lblLinea;
	public JLabel lblFechaIda;
	public JLabel lblFechaVuelta;
	public JLabel lblPrecio;
	public JLabel logoGrande;
	public JLabel logoPeke;
	public JLabel lblidaYVuelta;
	private JLabel imgResumen;
	
	public PaneMostrarCompra(Frame1 frame1)
	{
		paneMostrarCompra = new JPanel();
		paneMostrarCompra.setBackground(Color.WHITE);
		paneMostrarCompra.setBounds(0, 0, 800, 600);
		paneMostrarCompra.setLayout(null);
		
		frame1.frame1.getContentPane().add(paneMostrarCompra);
		
		logoGrande = new JLabel("");
		logoGrande.setIcon(new ImageIcon(PaneMostrarCompra.class.getResource("/ImagenesVista/logo-termibus.png")));
		logoGrande.setBounds(489, 11, 301, 117);
		paneMostrarCompra.add(logoGrande);
		
		logoPeke = new JLabel("");
		logoPeke.setIcon(new ImageIcon(PaneMostrarCompra.class.getResource("/ImagenesVista/termiLOGOpeke.png")));
		logoPeke.setBounds(10, 505, 70, 64);
		paneMostrarCompra.add(logoPeke);
		paneMostrarCompra.setVisible(false);
		
		
		btnVolverALogin = new JButton("Volver");
		

		btnVolverALogin.setBackground(Color.WHITE);
		btnVolverALogin.setForeground(new Color(0, 51, 102));
		btnVolverALogin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		
		btnVolverALogin.setBounds(82, 505, 185, 39);
		paneMostrarCompra.add(btnVolverALogin);
		
		lblTipoDeBillete = new JLabel("Tipo de Billete :");
		lblTipoDeBillete.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTipoDeBillete.setForeground(new Color(0, 51, 102));
		lblTipoDeBillete.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblTipoDeBillete.setBounds(162, 166, 161, 39);
		paneMostrarCompra.add(lblTipoDeBillete);
		
		lblTrayetoria = new JLabel("Trayetoria :");
		lblTrayetoria.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTrayetoria.setForeground(new Color(0, 51, 102));
		lblTrayetoria.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblTrayetoria.setBounds(162, 216, 161, 39);
		paneMostrarCompra.add(lblTrayetoria);
		
		lblLinea = new JLabel("Linea :");
		lblLinea.setHorizontalAlignment(SwingConstants.TRAILING);
		lblLinea.setForeground(new Color(0, 51, 102));
		lblLinea.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblLinea.setBounds(162, 266, 161, 39);
		paneMostrarCompra.add(lblLinea);
		
		lblFechaIda = new JLabel("Fecha Ida :");
		lblFechaIda.setHorizontalAlignment(SwingConstants.TRAILING);
		lblFechaIda.setForeground(new Color(0, 51, 102));
		lblFechaIda.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblFechaIda.setBounds(162, 316, 161, 39);
		paneMostrarCompra.add(lblFechaIda);
		
		lblFechaVuelta = new JLabel("Fecha Vuelta :");
		lblFechaVuelta.setHorizontalAlignment(SwingConstants.TRAILING);
		lblFechaVuelta.setForeground(new Color(0, 51, 102));
		lblFechaVuelta.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblFechaVuelta.setBounds(162, 365, 161, 39);
		paneMostrarCompra.add(lblFechaVuelta);
		
		lblPrecio = new JLabel("Precio :");
		lblPrecio.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPrecio.setForeground(new Color(0, 51, 102));
		lblPrecio.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblPrecio.setBounds(162, 415, 161, 39);
		paneMostrarCompra.add(lblPrecio);
		
		btnSiguiente = new JButton("Confirmar");
		btnSiguiente.setBackground(Color.WHITE);
		btnSiguiente.setForeground(new Color(0, 51, 102));
		btnSiguiente.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSiguiente.setBackground(Color.WHITE);
		btnSiguiente.setBounds(585, 505, 185, 39);
		paneMostrarCompra.add(btnSiguiente);
		
		fieldTipoBillete = new JTextField();
		fieldTipoBillete.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		fieldTipoBillete.setColumns(10);
		fieldTipoBillete.setBounds(333, 168, 236, 37);
		paneMostrarCompra.add(fieldTipoBillete);
		
		fieldTrayectoria = new JTextField();
		fieldTrayectoria.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		fieldTrayectoria.setColumns(10);
		fieldTrayectoria.setBounds(333, 216, 236, 37);
		paneMostrarCompra.add(fieldTrayectoria);
		
		fieldLinea = new JTextField();
		fieldLinea.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		fieldLinea.setColumns(10);
		fieldLinea.setBounds(333, 266, 236, 37);
		paneMostrarCompra.add(fieldLinea);
		
		fieldFechaIda = new JTextField();
		fieldFechaIda.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		fieldFechaIda.setColumns(10);
		fieldFechaIda.setBounds(333, 316, 236, 37);
		paneMostrarCompra.add(fieldFechaIda);
		
		fieldFechaVuelta = new JTextField();
		fieldFechaVuelta.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		fieldFechaVuelta.setColumns(10);
		fieldFechaVuelta.setBounds(333, 367, 236, 37);
		paneMostrarCompra.add(fieldFechaVuelta);
		
		MaskFormatter mfCC = null;
		/*try {
			mfCC = new MaskFormatter("#.##€");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mfCC.setPlaceholderCharacter('0');*/
		fieldPrecio = new JFormattedTextField(mfCC);
		fieldPrecio.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		fieldPrecio.setColumns(10);
		fieldPrecio.setBounds(333, 415, 236, 37);
		paneMostrarCompra.add(fieldPrecio);
		
		lblidaYVuelta = new JLabel("(Ida y Vuelta)");
		lblidaYVuelta.setVisible(false);
		lblidaYVuelta.setForeground(new Color(0, 51, 102));
		lblidaYVuelta.setFont(new Font("Dialog", Font.BOLD, 13));
		lblidaYVuelta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblidaYVuelta.setBounds(191, 445, 129, 21);
		paneMostrarCompra.add(lblidaYVuelta);
		
		imgResumen = new JLabel("");
		imgResumen.setIcon(new ImageIcon(PaneMostrarCompra.class.getResource("/ImagenesVista/Resumen.png")));
		imgResumen.setBounds(12, 60, 465, 93);
		paneMostrarCompra.add(imgResumen);
	
}
}
