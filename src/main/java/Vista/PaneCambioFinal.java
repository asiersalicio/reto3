package Vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

import Controlador.ControlInterfaz;
import ControladoresPaneles.ControladorCambioFinal;
import Modelo.Devolucion;
import Modelo.Formato2dec;
import Modelo.ManejoBilletes;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.Color;
import java.awt.Font;


/*
 * Clase PaneCambioFinal
 */

public class PaneCambioFinal {
	
	public JPanel paneCambioFinal;
	public static DefaultListModel<String> modelo2;
	public JList<String> listaCambio;
	public JLabel lblGraciasYBuen;
	public JLabel lblTipo;
	public static JLabel lblparaTipo;
	public JLabel lblLinea;
	public static JLabel lblparaLinea;
	public JLabel lblTrayecto;
	public static JLabel lblparaTrayecto;
	public JLabel lblBillete;
	public JLabel lblPrecio;
	public static JLabel lblparaPrecio;
	public static JLabel lblCodigo;
	public JLabel lblSuBillete;
	private JLabel lblCompraRealizadaCon;
	public JLabel lblLogoGrande;
	public JLabel lblLogoPeke;

	
	public PaneCambioFinal(Frame1 frame1)
	{
		paneCambioFinal = new JPanel();
		paneCambioFinal.setBackground(Color.WHITE);
		paneCambioFinal.setBounds(0, 0, 800, 600);
		paneCambioFinal.setLayout(null);
		
		frame1.frame1.getContentPane().add(paneCambioFinal);

		
		modelo2=new DefaultListModel<String>();
		listaCambio = new JList<String>(modelo2);
		listaCambio.setForeground(new Color(0, 51, 102));
		listaCambio.setBackground(Color.WHITE);
		listaCambio.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(212, 208, 200), null, null, null), "Su Cambio :", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(204, 0, 0)));
		listaCambio.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		listaCambio.setBounds(74, 179, 239, 244);
		paneCambioFinal.add(listaCambio);
		
		lblTipo = new JLabel("Tipo:");
		lblTipo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblTipo.setBounds(391, 253, 62, 14);
		paneCambioFinal.add(lblTipo);
		
		lblparaTipo = new JLabel("");
		lblparaTipo.setForeground(Color.GRAY);
		lblparaTipo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblparaTipo.setBounds(447, 253, 216, 14);
		paneCambioFinal.add(lblparaTipo);
		
		lblLinea = new JLabel("Linea");
		lblLinea.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblLinea.setBounds(391, 277, 62, 14);
		paneCambioFinal.add(lblLinea);
		
		lblparaLinea = new JLabel("");
		lblparaLinea.setForeground(Color.GRAY);
		lblparaLinea.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblparaLinea.setBounds(447, 277, 216, 14);
		paneCambioFinal.add(lblparaLinea);
		
		lblTrayecto = new JLabel("Trayecto:");
		lblTrayecto.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblTrayecto.setBounds(391, 302, 62, 14);
		paneCambioFinal.add(lblTrayecto);
		
		lblPrecio = new JLabel("Precio:");
		lblPrecio.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblPrecio.setBounds(391, 327, 62, 14);
		paneCambioFinal.add(lblPrecio);
		
		lblparaPrecio = new JLabel("");
		lblparaPrecio.setForeground(Color.GRAY);
		lblparaPrecio.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblparaPrecio.setBounds(447, 327, 216, 14);
		paneCambioFinal.add(lblparaPrecio);
		
		lblparaTrayecto = new JLabel("");
		lblparaTrayecto.setForeground(Color.GRAY);
		lblparaTrayecto.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblparaTrayecto.setBounds(447, 302, 216, 14);
		paneCambioFinal.add(lblparaTrayecto);
		
		lblCodigo = new JLabel("");
		lblCodigo.setBounds(391, 367, 294, 14);
		paneCambioFinal.add(lblCodigo);
		
		lblLogoGrande = new JLabel("");
		lblLogoGrande.setIcon(new ImageIcon(PaneCambioFinal.class.getResource("/ImagenesVista/logo-termibus.png")));
		lblLogoGrande.setBounds(489, 11, 301, 117);
		paneCambioFinal.add(lblLogoGrande);
		
		lblLogoPeke = new JLabel("");
		lblLogoPeke.setIcon(new ImageIcon(PaneCambioFinal.class.getResource("/ImagenesVista/termiLOGOpeke.png")));
		lblLogoPeke.setBounds(10, 505, 70, 64);
		paneCambioFinal.add(lblLogoPeke);

		lblGraciasYBuen = new JLabel("Gracias y buen viaje ! Imprimiendo sus billetes....");
		lblGraciasYBuen.setHorizontalAlignment(SwingConstants.CENTER);
		lblGraciasYBuen.setForeground(new Color(0, 51, 102));
		lblGraciasYBuen.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblGraciasYBuen.setBounds(164, 505, 459, 25);
		paneCambioFinal.add(lblGraciasYBuen);
						
		lblBillete = new JLabel("");
		lblBillete.setIcon(new ImageIcon(PaneCambioFinal.class.getResource("/ImagenesVista/billete-termibus.png")));
		lblBillete.setBounds(381, 209, 314, 184);
		paneCambioFinal.add(lblBillete);
		
		lblSuBillete = new JLabel("Su Billete :");
		lblSuBillete.setForeground(new Color(204, 0, 0));
		lblSuBillete.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblSuBillete.setBounds(381, 184, 101, 14);
		paneCambioFinal.add(lblSuBillete);
		
		lblCompraRealizadaCon = new JLabel("Compra realizada con \u00E9xito :");
		lblCompraRealizadaCon.setForeground(new Color(204, 0, 0));
		lblCompraRealizadaCon.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 18));
		lblCompraRealizadaCon.setBounds(10, 92, 303, 36);
		paneCambioFinal.add(lblCompraRealizadaCon);
		paneCambioFinal.setVisible(false);
	}
}
	
	

