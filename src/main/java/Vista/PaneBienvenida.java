package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * Clase PaneBienvenida
 * @author IN1DM3B_18
 *
 */
public class PaneBienvenida {
	
	public JPanel paneBienvenida;
	public JButton btnTocaParaEmpezar;
	public JLabel lblAsalba;
	public JLabel logoGrande;
	public JLabel logoPeke;
	
	/**
	 * Método:PaneBienvenida 
	 * @param frame1
	 */
	public PaneBienvenida(Frame1 frame1)
	{
		paneBienvenida = new JPanel();
		paneBienvenida.setBackground(Color.WHITE);
		paneBienvenida.setBounds(0, 0, 800, 600);
		paneBienvenida.setLayout(null);
		
		frame1.frame1.getContentPane().add(paneBienvenida);
		
		btnTocaParaEmpezar = new JButton("TOCA PARA EMPEZAR");
		btnTocaParaEmpezar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnTocaParaEmpezar.setForeground(new Color(0, 51, 102));
		btnTocaParaEmpezar.setBackground(Color.WHITE);
		btnTocaParaEmpezar.setBounds(263, 227, 280, 64);
		paneBienvenida.add(btnTocaParaEmpezar);
		
		logoGrande = new JLabel("");
		logoGrande.setIcon(new ImageIcon(PaneBienvenida.class.getResource("/ImagenesVista/logo-termibus.png")));
		logoGrande.setBounds(489, 11, 301, 117);
		paneBienvenida.add(logoGrande);
		
		logoPeke = new JLabel("");
		logoPeke.setIcon(new ImageIcon(PaneBienvenida.class.getResource("/ImagenesVista/termiLOGOpeke.png")));
		logoPeke.setBounds(10, 505, 70, 64);
		paneBienvenida.add(logoPeke);
		
		lblAsalba = new JLabel("ASALBA Solutions");
		lblAsalba.setForeground(new Color(0, 51, 102));
		lblAsalba.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblAsalba.setBounds(608, 539, 116, 14);
		paneBienvenida.add(lblAsalba);
		paneBienvenida.setVisible(false);
	}
	
	public JPanel getPane()
	{
		return this.paneBienvenida;
	}
}
