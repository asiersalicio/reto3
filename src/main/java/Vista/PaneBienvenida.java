package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import Controlador.ControlInterfaz;

import java.awt.Color;

public class PaneBienvenida {
	
	public JPanel paneBienvenida;
	private JPasswordField passwordField;
	
	public PaneBienvenida(Frame1 frame1)
	{
		paneBienvenida = new JPanel();
		paneBienvenida.setBackground(Color.WHITE);
		paneBienvenida.setBounds(0, 0, 800, 600);
		paneBienvenida.setLayout(null);
		
		frame1.frame1.getContentPane().add(paneBienvenida);
		
		JButton btnTocaParaEmpezar = new JButton("TOCA PARA EMPEZAR");
		btnTocaParaEmpezar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnTocaParaEmpezar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ControlInterfaz.setPanel(ControlInterfaz.paneLogin.paneLogin);
			}
		});
		btnTocaParaEmpezar.setForeground(new Color(0, 51, 102));
		btnTocaParaEmpezar.setBackground(Color.WHITE);
		btnTocaParaEmpezar.setBounds(263, 227, 280, 64);
		paneBienvenida.add(btnTocaParaEmpezar);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(414, 386, 6, 20);
		paneBienvenida.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PaneBienvenida.class.getResource("/ImagenesVista/logo-termibus.png")));
		lblNewLabel.setBounds(489, 11, 301, 117);
		paneBienvenida.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(PaneBienvenida.class.getResource("/ImagenesVista/termiLOGOpeke.png")));
		lblNewLabel_1.setBounds(10, 505, 70, 64);
		paneBienvenida.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ASALBA Solutions");
		lblNewLabel_2.setForeground(new Color(0, 51, 102));
		lblNewLabel_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(608, 539, 116, 14);
		paneBienvenida.add(lblNewLabel_2);
		paneBienvenida.setVisible(false);
	}
	
	public JPanel getPane()
	{
		return this.paneBienvenida;
	}
}
