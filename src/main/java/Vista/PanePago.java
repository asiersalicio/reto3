package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanePago {

	public JPanel panePago;
	public JTextField txtfaltaporpagar;
	public JTextField txtaPagar2;
	public JTextField txtCambio2;
	public JButton btnImpresionBillete;
	public JButton Boton1euro;
	public JButton Boton1cent;
	public JLabel logoGrande;
	public JLabel logoPeke;
	public JButton Boton50cent;
	public JButton Boton20cent;
	public JButton Boton10cent;
	public JButton Boton5cent;
	public JButton Boton2cent;
	public JButton Boton2euro;
	public JButton Boton200euro;
	public JButton Boton100euro;
	public JButton Boton50euro;
	public JButton Boton20euro;
	public JButton Boton10euro;
	public JButton Boton5euro;
	public JLabel lblSeleccionePago;
	public JLabel lblaPagar;
	public JLabel lblPorPagar;
	public JLabel lblCambio;
	public float aPagar;
	
	public PanePago(Frame1 frame1)
	{
		panePago = new JPanel();
		panePago.setBackground(Color.WHITE);
		panePago.setBounds(0, 0, 800, 600);
		panePago.setLayout(null);
		frame1.frame1.getContentPane().add(panePago);
		
		logoGrande = new JLabel("");
		logoGrande.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/logo-termibus.png")));
		logoGrande.setBounds(489, 11, 301, 117);
		panePago.add(logoGrande);
		
		logoPeke = new JLabel("");
		logoPeke.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/termiLOGOpeke.png")));
		logoPeke.setBounds(10, 505, 70, 64);
		panePago.add(logoPeke);
	
	
		Boton1cent = new JButton("");
		Boton1cent.setForeground(Color.WHITE);
		Boton1cent.setBackground(Color.WHITE);
		Boton1cent.setBorder(null);//Quitar borde negro al boton
		Boton1cent.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/1cent.png")));
		Boton1cent.setBounds(650, 342, 92, 88);
		panePago.add(Boton1cent);
		
		Boton50cent = new JButton("");
		Boton50cent.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/50cent.png")));
		Boton50cent.setForeground(Color.WHITE);
		Boton50cent.setBorder(null);
		Boton50cent.setBackground(Color.WHITE);
		Boton50cent.setBounds(465, 254, 92, 88);
		panePago.add(Boton50cent);
		
		Boton20cent = new JButton("");
		Boton20cent.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/20cent.png")));
		Boton20cent.setForeground(Color.WHITE);
		Boton20cent.setBorder(null);
		Boton20cent.setBackground(Color.WHITE);
		Boton20cent.setBounds(557, 254, 92, 88);
		panePago.add(Boton20cent);
		
		Boton10cent = new JButton("");
		Boton10cent.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/10cent.png")));
		Boton10cent.setForeground(Color.WHITE);
		Boton10cent.setBorder(null);
		Boton10cent.setBackground(Color.WHITE);
		Boton10cent.setBounds(650,254, 92, 88);
		panePago.add(Boton10cent);
		
		Boton5cent = new JButton("");
		Boton5cent.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/5cent.png")));
		Boton5cent.setForeground(Color.WHITE);
		Boton5cent.setBorder(null);
		Boton5cent.setBackground(Color.WHITE);
		Boton5cent.setBounds(465, 342, 92, 88);
		panePago.add(Boton5cent);
		
		Boton2cent = new JButton("");
		Boton2cent.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/2cent.png")));
		Boton2cent.setForeground(Color.WHITE);
		Boton2cent.setBorder(null);
		Boton2cent.setBackground(Color.WHITE);
		Boton2cent.setBounds(557, 342, 92, 88);
		panePago.add(Boton2cent);
		
		Boton1euro = new JButton("");
		Boton1euro.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/1euro.png")));
		Boton1euro.setForeground(Color.WHITE);
		Boton1euro.setBorder(null);
		Boton1euro.setBackground(Color.WHITE);
		Boton1euro.setBounds(598, 156, 99, 98);
		panePago.add(Boton1euro);
		
		Boton2euro = new JButton("");
		Boton2euro.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/2euros.png")));
		Boton2euro.setForeground(Color.WHITE);
		Boton2euro.setBorder(null);
		Boton2euro.setBackground(Color.WHITE);
		Boton2euro.setBounds(499, 156, 99, 98);
		panePago.add(Boton2euro);
		
		Boton200euro = new JButton("");
		Boton200euro.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/200euro.png")));
		Boton200euro.setForeground(Color.WHITE);
		Boton200euro.setBorder(null);
		Boton200euro.setBackground(Color.WHITE);
		Boton200euro.setBounds(57, 156, 142, 75);
		panePago.add(Boton200euro);
		
		Boton100euro = new JButton("");
		Boton100euro.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/100euro.png")));
		Boton100euro.setForeground(Color.WHITE);
		Boton100euro.setBorder(null);
		Boton100euro.setBackground(Color.WHITE);
		Boton100euro.setBounds(209, 156, 142, 75);
		panePago.add(Boton100euro);
		
		Boton50euro = new JButton("");
		Boton50euro.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/50euro.png")));
		Boton50euro.setForeground(Color.WHITE);
		Boton50euro.setBorder(null);
		Boton50euro.setBackground(Color.WHITE);
		Boton50euro.setBounds(57, 254, 142, 75);
		panePago.add(Boton50euro);
		
		Boton20euro = new JButton("");
		Boton20euro.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/20euro.png")));
		Boton20euro.setForeground(Color.WHITE);
		Boton20euro.setBorder(null);
		Boton20euro.setBackground(Color.WHITE);
		Boton20euro.setBounds(209, 254, 142, 75);
		panePago.add(Boton20euro);
		
		Boton10euro = new JButton("");
		Boton10euro.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/10euro.png")));
		Boton10euro.setForeground(Color.WHITE);
		Boton10euro.setBorder(null);
		Boton10euro.setBackground(Color.WHITE);
		Boton10euro.setBounds(57, 353, 142, 75);
		panePago.add(Boton10euro);
		
		Boton5euro = new JButton("");
		Boton5euro.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/5euro.png")));
		Boton5euro.setForeground(Color.WHITE);
		Boton5euro.setBorder(null);
		Boton5euro.setBackground(Color.WHITE);
		Boton5euro.setBounds(209, 353, 142, 75);
		panePago.add(Boton5euro);
		
		txtfaltaporpagar = new JTextField();
		txtfaltaporpagar.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 19));
		txtfaltaporpagar.setText(String.valueOf(aPagar));
		txtfaltaporpagar.setBounds(282, 496, 85, 28);
		panePago.add(txtfaltaporpagar);
		txtfaltaporpagar.setColumns(10);
		
		txtaPagar2 = new JTextField();
		txtaPagar2.setText(String.valueOf(aPagar));
		txtaPagar2.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 19));
		txtaPagar2.setColumns(10);
		txtaPagar2.setBounds(282, 463, 85, 28);
		panePago.add(txtaPagar2);
		
		txtCambio2 = new JTextField();
		txtCambio2.setText("0.0");
		txtCambio2.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 19));
		txtCambio2.setColumns(10);
		txtCambio2.setBounds(480, 496, 85, 28);
		panePago.add(txtCambio2);
		
		lblSeleccionePago = new JLabel("Introduzca pago:");
		lblSeleccionePago.setForeground(new Color(204, 0, 0));
		lblSeleccionePago.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 18));
		lblSeleccionePago.setBounds(10, 83, 229, 45);
		panePago.add(lblSeleccionePago);
		
		btnImpresionBillete = new JButton("Siguiente");
		btnImpresionBillete.setForeground(new Color(0, 51, 102));
		btnImpresionBillete.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnImpresionBillete.setBackground(Color.WHITE);
		btnImpresionBillete.setBounds(585, 505, 185, 39);
		panePago.add(btnImpresionBillete);
		btnImpresionBillete.setVisible(false);
		
		lblaPagar = new JLabel("Total :");
		lblaPagar.setHorizontalAlignment(SwingConstants.TRAILING);
		lblaPagar.setForeground(new Color(0, 51, 102));
		lblaPagar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblaPagar.setBounds(135, 460, 135, 39);
		panePago.add(lblaPagar);
		
		lblPorPagar = new JLabel("Por pagar :");
		lblPorPagar.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPorPagar.setForeground(new Color(0, 51, 102));
		lblPorPagar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblPorPagar.setBounds(135, 493, 135, 39);
		panePago.add(lblPorPagar);
		
		lblCambio = new JLabel("Cambio :");
		lblCambio.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCambio.setForeground(new Color(0, 51, 102));
		lblCambio.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblCambio.setBounds(335, 493, 135, 39);
		panePago.add(lblCambio);
	
		panePago.setVisible(false);
	}
}

