package Vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

import Controlador.ControlInterfaz;
import Modelo.Devolucion;
import Modelo.Formato2dec;
import Modelo.ManejoBilletes;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;


/*
 * Clase PaneCambioFinal
 */

public class PaneCambioFinal {
	
	public JPanel paneCambioFinal;
	public static DefaultListModel<String> modelo2;
	public JList<String> listaCambio;
	public JLabel lblGraciasYBuen;
	
	
	public PaneCambioFinal(Frame1 frame1)
	{
		paneCambioFinal = new JPanel();
		paneCambioFinal.setBackground(Color.WHITE);
		paneCambioFinal.setBounds(0, 0, 800, 600);
		paneCambioFinal.setLayout(null);
		
		frame1.frame1.getContentPane().add(paneCambioFinal);

		
		modelo2=new DefaultListModel<String>();
		listaCambio = new JList<String>(modelo2);
		listaCambio.setBackground(Color.WHITE);
		listaCambio.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(212, 208, 200), null, null, null), "Su Cambio :", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(153, 0, 0)));
		listaCambio.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		listaCambio.setBounds(73, 141, 239, 244);
		paneCambioFinal.add(listaCambio);
		
		JLabel lblLogoGrande = new JLabel("");
		lblLogoGrande.setIcon(new ImageIcon(PaneCambioFinal.class.getResource("/ImagenesVista/logo-termibus.png")));
		lblLogoGrande.setBounds(489, 11, 301, 117);
		paneCambioFinal.add(lblLogoGrande);
		
		JLabel lblLogoPeke = new JLabel("");
		lblLogoPeke.setIcon(new ImageIcon(PaneCambioFinal.class.getResource("/ImagenesVista/termiLOGOpeke.png")));
		lblLogoPeke.setBounds(10, 505, 70, 64);
		paneCambioFinal.add(lblLogoPeke);
		
		lblGraciasYBuen = new JLabel("Gracias y buen viaje ! Imprimiendo sus billetes....");
		lblGraciasYBuen.setHorizontalAlignment(SwingConstants.CENTER);
		lblGraciasYBuen.setForeground(new Color(0, 51, 102));
		lblGraciasYBuen.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblGraciasYBuen.setBounds(73, 396, 397, 25);
		paneCambioFinal.add(lblGraciasYBuen);
		
		
		paneCambioFinal.setVisible(false);
	}
}
	
	

