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

public class PaneMostrarCompra {
	
	private JPanel PaneMostrarCompra;
	
	public PaneMostrarCompra(ControlInterfaz controlInterfaz, Frame1 frame1)
	{
		PaneMostrarCompra = new JPanel();
		PaneMostrarCompra.setBackground(Color.WHITE);
		PaneMostrarCompra.setBounds(0, 0, 800, 600);
		PaneMostrarCompra.setLayout(null);
		
		frame1.frame1.getContentPane().add(PaneMostrarCompra);
		PaneMostrarCompra.setVisible(false);
		
		JLabel logoTermibus = new JLabel("");
		logoTermibus.setIcon(new ImageIcon(PaneRegister.class.getResource("/Vista/img/logo-termibus.png")));
		logoTermibus.setBounds(489, 11, 301, 117);
		PaneMostrarCompra.add(logoTermibus);
		
		JLabel iconopeke = new JLabel("");
		iconopeke.setIcon(new ImageIcon(PaneRegister.class.getResource("/Vista/img/termiLOGOpeke.png")));
		iconopeke.setBounds(10, 505, 70, 64);
		PaneMostrarCompra.add(iconopeke);
	}
	
	public JPanel getPane()
	{
		return this.PaneMostrarCompra;
	}
}
