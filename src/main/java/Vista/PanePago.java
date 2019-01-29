package Vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controlador.ControlInterfaz;
import Modelo.Pagar;

import java.awt.Color;
import javax.swing.SwingConstants;

public class PanePago {

	public JPanel panePago;
	private JTextField TxtaPagar1;
	private JTextField txtFaltaPorPagar;
	private JTextField txtfaltaporpagar;
	private JTextField txtaPagar2;
	private JTextField txtCambio1;
	private JTextField txtCambio2;
	public JButton btnImpresionBillete; 
	public double aPagar=100; // Valor de ejemplo a cambiar por la cantindad a pagar.
	
	public PanePago(Frame1 frame1)
	{
		panePago = new JPanel();
		panePago.setBackground(Color.WHITE);
		panePago.setBounds(0, 0, 800, 600);
		panePago.setLayout(null);
		
		frame1.frame1.getContentPane().add(panePago);
		
		JLabel logoGrande = new JLabel("");
		logoGrande.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/logo-termibus.png")));
		logoGrande.setBounds(489, 11, 301, 117);
		panePago.add(logoGrande);
		
		JLabel logoPeke = new JLabel("");
		logoPeke.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/termiLOGOpeke.png")));
		logoPeke.setBounds(10, 505, 70, 64);
		panePago.add(logoPeke);
	
	
		JButton Boton1cent = new JButton("");
		Boton1cent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.porPagar(13,aPagar,txtCambio2,txtfaltaporpagar,btnImpresionBillete);


			}
		});
		Boton1cent.setForeground(Color.WHITE);
		Boton1cent.setBackground(Color.WHITE);
		Boton1cent.setBorder(null);//Quitar borde negro al boton
		Boton1cent.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/1cent.png")));
		Boton1cent.setBounds(621, 353, 75, 75);
		panePago.add(Boton1cent);
		
		JButton Boton50cent = new JButton("");
		Boton50cent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.porPagar(8,aPagar,txtCambio2,txtfaltaporpagar,btnImpresionBillete);


			}
		});
		Boton50cent.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/50cent.png")));
		Boton50cent.setForeground(Color.WHITE);
		Boton50cent.setBorder(null);
		Boton50cent.setBackground(Color.WHITE);
		Boton50cent.setBounds(451, 267, 75, 75);
		panePago.add(Boton50cent);
		
		JButton Boton20cent = new JButton("");
		Boton20cent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.porPagar(9,aPagar,txtCambio2,txtfaltaporpagar,btnImpresionBillete);


			}
		});
		Boton20cent.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/20cent.png")));
		Boton20cent.setForeground(Color.WHITE);
		Boton20cent.setBorder(null);
		Boton20cent.setBackground(Color.WHITE);
		Boton20cent.setBounds(536, 267, 75, 75);
		panePago.add(Boton20cent);
		
		JButton Boton10cent = new JButton("");
		Boton10cent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.porPagar(10,aPagar,txtCambio2,txtfaltaporpagar,btnImpresionBillete);


				
			}
		});
		Boton10cent.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/10cent.png")));
		Boton10cent.setForeground(Color.WHITE);
		Boton10cent.setBorder(null);
		Boton10cent.setBackground(Color.WHITE);
		Boton10cent.setBounds(621,267, 75, 75);
		panePago.add(Boton10cent);
		
		JButton Boton5cent = new JButton("");
		Boton5cent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.porPagar(11,aPagar,txtCambio2,txtfaltaporpagar,btnImpresionBillete);

			}
		});
		Boton5cent.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/5cent.png")));
		Boton5cent.setForeground(Color.WHITE);
		Boton5cent.setBorder(null);
		Boton5cent.setBackground(Color.WHITE);
		Boton5cent.setBounds(452, 353, 75, 75);
		panePago.add(Boton5cent);
		
		JButton Boton2cent = new JButton("");
		Boton2cent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.porPagar(12,aPagar,txtCambio2,txtfaltaporpagar,btnImpresionBillete);


			}
		});
		Boton2cent.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/2cent.png")));
		Boton2cent.setForeground(Color.WHITE);
		Boton2cent.setBorder(null);
		Boton2cent.setBackground(Color.WHITE);
		Boton2cent.setBounds(537, 353, 75, 75);
		panePago.add(Boton2cent);
		
		JButton Boton1euro = new JButton("");
		Boton1euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.porPagar(7,aPagar,txtCambio2,txtfaltaporpagar,btnImpresionBillete);


			}
		});
		Boton1euro.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/1euro.png")));
		Boton1euro.setForeground(Color.WHITE);
		Boton1euro.setBorder(null);
		Boton1euro.setBackground(Color.WHITE);
		Boton1euro.setBounds(583, 170, 85, 86);
		panePago.add(Boton1euro);
		
		JButton Boton2euro = new JButton("");
		Boton2euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.porPagar(8,aPagar,txtCambio2,txtfaltaporpagar,btnImpresionBillete);

				
			}
		});
		Boton2euro.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/2euros.png")));
		Boton2euro.setForeground(Color.WHITE);
		Boton2euro.setBorder(null);
		Boton2euro.setBackground(Color.WHITE);
		Boton2euro.setBounds(480, 170, 85, 86);
		panePago.add(Boton2euro);
		
		JButton Boton200euro = new JButton("");
		Boton200euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.porPagar(1,aPagar,txtCambio2,txtfaltaporpagar,btnImpresionBillete);

				
			}
		});
		Boton200euro.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/200euro.png")));
		Boton200euro.setForeground(Color.WHITE);
		Boton200euro.setBorder(null);
		Boton200euro.setBackground(Color.WHITE);
		Boton200euro.setBounds(57, 181, 142, 75);
		panePago.add(Boton200euro);
		
		JButton Boton100euro = new JButton("");
		Boton100euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.porPagar(2,aPagar,txtCambio2,txtfaltaporpagar,btnImpresionBillete);

			}
		});
		Boton100euro.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/100euro.png")));
		Boton100euro.setForeground(Color.WHITE);
		Boton100euro.setBorder(null);
		Boton100euro.setBackground(Color.WHITE);
		Boton100euro.setBounds(209, 181, 142, 75);
		panePago.add(Boton100euro);
		
		JButton Boton50euro = new JButton("");
		Boton50euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Pagar.porPagar(3,aPagar,txtCambio2,txtfaltaporpagar,btnImpresionBillete);	

			}
		});
		Boton50euro.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/50euro.png")));
		Boton50euro.setForeground(Color.WHITE);
		Boton50euro.setBorder(null);
		Boton50euro.setBackground(Color.WHITE);
		Boton50euro.setBounds(57, 267, 142, 75);
		panePago.add(Boton50euro);
		
		JButton Boton20euro = new JButton("");
		Boton20euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.porPagar(4,aPagar,txtCambio2,txtfaltaporpagar,btnImpresionBillete);


				
			}
		});
		Boton20euro.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/20euro.png")));
		Boton20euro.setForeground(Color.WHITE);
		Boton20euro.setBorder(null);
		Boton20euro.setBackground(Color.WHITE);
		Boton20euro.setBounds(209, 267, 142, 75);
		panePago.add(Boton20euro);
		
		JButton Boton10euro = new JButton("");
		Boton10euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.porPagar(5,aPagar,txtCambio2,txtfaltaporpagar,btnImpresionBillete);

			}
		});
		Boton10euro.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/10euro.png")));
		Boton10euro.setForeground(Color.WHITE);
		Boton10euro.setBorder(null);
		Boton10euro.setBackground(Color.WHITE);
		Boton10euro.setBounds(57, 353, 142, 75);
		panePago.add(Boton10euro);
		
		JButton Boton5euro = new JButton("");
		Boton5euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Pagar.porPagar(6,aPagar,txtCambio2,txtfaltaporpagar,btnImpresionBillete);

				
			}
		});
		Boton5euro.setIcon(new ImageIcon(PanePago.class.getResource("/ImagenesVista/5euro.png")));
		Boton5euro.setForeground(Color.WHITE);
		Boton5euro.setBorder(null);
		Boton5euro.setBackground(Color.WHITE);
		Boton5euro.setBounds(209, 353, 142, 75);
		panePago.add(Boton5euro);
		
		TxtaPagar1 = new JTextField();
		TxtaPagar1.setHorizontalAlignment(SwingConstants.TRAILING);
		TxtaPagar1.setBackground(Color.WHITE);
		TxtaPagar1.setText(" Total a Pagar :");
		TxtaPagar1.setForeground(new Color(0, 51, 102));
		TxtaPagar1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		TxtaPagar1.setEditable(false);
		TxtaPagar1.setColumns(10);
		TxtaPagar1.setBorder(null);
		TxtaPagar1.setBounds(122, 465, 150, 28);
		panePago.add(TxtaPagar1);
		
	
		txtFaltaPorPagar = new JTextField();
		txtFaltaPorPagar.setHorizontalAlignment(SwingConstants.TRAILING);
		txtFaltaPorPagar.setBackground(Color.WHITE);
		txtFaltaPorPagar.setText("Por pagar :");
		txtFaltaPorPagar.setForeground(new Color(0, 51, 102));
		txtFaltaPorPagar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		txtFaltaPorPagar.setEditable(false);
		txtFaltaPorPagar.setColumns(10);
		txtFaltaPorPagar.setBorder(null);
		txtFaltaPorPagar.setBounds(159, 496, 113, 28);
		panePago.add(txtFaltaPorPagar);
		
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
		
		txtCambio1 = new JTextField();
		txtCambio1.setHorizontalAlignment(SwingConstants.TRAILING);
		txtCambio1.setBackground(Color.WHITE);
		txtCambio1.setText("Cambio :");
		txtCambio1.setForeground(new Color(0, 51, 102));
		txtCambio1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		txtCambio1.setEditable(false);
		txtCambio1.setColumns(10);
		txtCambio1.setBorder(null);
		txtCambio1.setBounds(387, 496, 83, 28);
		panePago.add(txtCambio1);
		
		txtCambio2 = new JTextField();
		txtCambio2.setText("0.0");
		txtCambio2.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 19));
		txtCambio2.setColumns(10);
		txtCambio2.setBounds(480, 496, 85, 28);
		panePago.add(txtCambio2);
		
		JLabel lblSeleccionePago = new JLabel("Detalles de su compra :");
		lblSeleccionePago.setForeground(new Color(0, 51, 102));
		lblSeleccionePago.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 18));
		lblSeleccionePago.setBounds(47, 114, 229, 45);
		panePago.add(lblSeleccionePago);
		
		JButton btnImpresionBillete = new JButton("Siguiente");
		btnImpresionBillete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ControlInterfaz.setPanel(ControlInterfaz.paneCambioFinal.paneCambioFinal);
			}
		});
	
		btnImpresionBillete.setForeground(new Color(0, 51, 102));
		btnImpresionBillete.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnImpresionBillete.setBackground(Color.WHITE);
		btnImpresionBillete.setBounds(585, 505, 185, 39);
		panePago.add(btnImpresionBillete);
	
		panePago.setVisible(false);
	}
}

