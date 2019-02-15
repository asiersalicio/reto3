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

/**
 * Clase PaneCambioFinal
 * @author IN1DM3B_18
 *
 */
public class PaneCambioFinal {
	
	public JPanel paneCambioFinal;
	public DefaultListModel<String> modelo2;
	public JList<String> listaCambio;
	public JLabel lblGraciasYBuen;
	public JLabel lblFecha;
	public JLabel lblparaFecha;
	public JLabel lblLinea;
	public JLabel lblparaLinea;
	public JLabel lblTrayecto;
	public JLabel lblparaTrayecto;
	public JLabel lblBillete;
	public JLabel lblPrecio;
	public JLabel lblparaPrecio;
	public JLabel lblSuBillete;
	public JLabel lblLogoGrande;
	public JLabel lblLogoPeke;
	public JLabel imgCambio;
	public JLabel label;
	public JLabel lblCodIda;
	public JLabel lblCodVuelta;
	public JButton btnVolver;
	public JLabel lbldni;

	/**
	 * Método: PaneCambioFinal
	 * @param frame1
	 */
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
		
		lblCodIda = new JLabel("00000000");
		lblCodIda.setForeground(Color.GRAY);
		lblCodIda.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblCodIda.setBounds(391, 341, 248, 29);
		paneCambioFinal.add(lblCodIda);
		
		lblCodVuelta = new JLabel("");
		lblCodVuelta.setForeground(Color.GRAY);
		lblCodVuelta.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblCodVuelta.setBounds(391, 365, 248, 29);
		paneCambioFinal.add(lblCodVuelta);
		
		lblFecha = new JLabel("Fecha:");
		lblFecha.setFont(new Font("Dialog", Font.BOLD, 11));
		lblFecha.setBounds(391, 253, 62, 14);
		paneCambioFinal.add(lblFecha);
		
		lblparaFecha = new JLabel("");
		lblparaFecha.setForeground(Color.GRAY);
		lblparaFecha.setFont(new Font("Courier New", Font.PLAIN, 11));
		lblparaFecha.setBounds(447, 253, 216, 14);
		paneCambioFinal.add(lblparaFecha);
		
		lblLinea = new JLabel("Linea");
		lblLinea.setFont(new Font("Dialog", Font.BOLD, 11));
		lblLinea.setBounds(391, 277, 62, 14);
		paneCambioFinal.add(lblLinea);
		
		lblparaLinea = new JLabel("");
		lblparaLinea.setForeground(Color.GRAY);
		lblparaLinea.setFont(new Font("Courier New", Font.PLAIN, 11));
		lblparaLinea.setBounds(447, 277, 216, 14);
		paneCambioFinal.add(lblparaLinea);
		
		lblTrayecto = new JLabel("Trayecto:");
		lblTrayecto.setFont(new Font("Dialog", Font.BOLD, 11));
		lblTrayecto.setBounds(391, 302, 62, 14);
		paneCambioFinal.add(lblTrayecto);
		
		lblPrecio = new JLabel("Precio:");
		lblPrecio.setFont(new Font("Dialog", Font.BOLD, 11));
		lblPrecio.setBounds(391, 327, 62, 14);
		paneCambioFinal.add(lblPrecio);
		
		lblparaPrecio = new JLabel("");
		lblparaPrecio.setForeground(Color.GRAY);
		lblparaPrecio.setFont(new Font("Courier New", Font.PLAIN, 11));
		lblparaPrecio.setBounds(447, 327, 216, 14);
		paneCambioFinal.add(lblparaPrecio);
		
		lblparaTrayecto = new JLabel("");
		lblparaTrayecto.setForeground(Color.GRAY);
		lblparaTrayecto.setFont(new Font("Courier New", Font.PLAIN, 11));
		lblparaTrayecto.setBounds(447, 302, 216, 14);
		paneCambioFinal.add(lblparaTrayecto);
		
		lblLogoGrande = new JLabel("");
		lblLogoGrande.setIcon(new ImageIcon(PaneCambioFinal.class.getResource("/ImagenesVista/logo-termibus.png")));
		lblLogoGrande.setBounds(489, 11, 301, 117);
		paneCambioFinal.add(lblLogoGrande);
		
		lblLogoPeke = new JLabel("");
		lblLogoPeke.setIcon(new ImageIcon(PaneCambioFinal.class.getResource("/ImagenesVista/termiLOGOpeke.png")));
		lblLogoPeke.setBounds(10, 505, 70, 64);
		paneCambioFinal.add(lblLogoPeke);

		lblGraciasYBuen = new JLabel("Buen viaje ! Imprimiendo sus billetes....");
		lblGraciasYBuen.setHorizontalAlignment(SwingConstants.CENTER);
		lblGraciasYBuen.setForeground(new Color(0, 51, 102));
		lblGraciasYBuen.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblGraciasYBuen.setBounds(164, 505, 459, 25);
		paneCambioFinal.add(lblGraciasYBuen);
		
		lblSuBillete = new JLabel("Su Billete :");
		lblSuBillete.setForeground(new Color(204, 0, 0));
		lblSuBillete.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblSuBillete.setBounds(381, 184, 101, 14);
		paneCambioFinal.add(lblSuBillete);
		
		imgCambio = new JLabel("");
		imgCambio.setIcon(new ImageIcon(PaneCambioFinal.class.getResource("/ImagenesVista/Gracias.png")));
		imgCambio.setBounds(10, 60, 505, 106);
		paneCambioFinal.add(imgCambio);
		
		btnVolver = new JButton("Volver a inicio");
		btnVolver.setForeground(new Color(0, 51, 102));
		btnVolver.setBackground(Color.WHITE);
		btnVolver.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		
		btnVolver.setBounds(586, 505, 172, 42);
		paneCambioFinal.add(btnVolver);
		
		lbldni = new JLabel("");
		lbldni.setForeground(Color.GRAY);
		lbldni.setFont(new Font("Consolas", Font.PLAIN, 14));
		lbldni.setBounds(613, 211, 101, 29);
		paneCambioFinal.add(lbldni);
		
		lblBillete = new JLabel("");
		lblBillete.setIcon(new ImageIcon(PaneCambioFinal.class.getResource("/ImagenesVista/billete-termibus.png")));
		lblBillete.setBounds(381, 209, 314, 184);
		paneCambioFinal.add(lblBillete);
		
		
		
		paneCambioFinal.setVisible(false);
	}

	public void reset() {
		lblCodVuelta.setText("");
		lbldni.setText("");
		
	}
}
	
	

