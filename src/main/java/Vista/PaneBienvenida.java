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
		btnTocaParaEmpezar.setForeground(Color.BLACK);
		btnTocaParaEmpezar.setBackground(Color.WHITE);
		btnTocaParaEmpezar.setBounds(263, 227, 280, 64);
		paneBienvenida.add(btnTocaParaEmpezar);
		
		JLabel lblTocaParaEmpezar = new JLabel("");
		lblTocaParaEmpezar.setIcon(new ImageIcon(PaneBienvenida.class.getResource("/Vista/img/termiLOGO.png")));
		lblTocaParaEmpezar.setBackground(Color.WHITE);
		lblTocaParaEmpezar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblTocaParaEmpezar.setHorizontalAlignment(SwingConstants.CENTER);
		lblTocaParaEmpezar.setBounds(0, 0, 800, 600);
		paneBienvenida.add(lblTocaParaEmpezar);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(414, 386, 6, 20);
		paneBienvenida.add(passwordField);
		paneBienvenida.setVisible(false);
	}
	
	public JPanel getPane()
	{
		return this.paneBienvenida;
	}
}
