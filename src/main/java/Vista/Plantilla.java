package Vista;

import javax.swing.JPanel;

import Controlador.ControlInterfaz;

import javax.swing.JLabel;

import java.awt.Font;

public class Plantilla {
	
	public JPanel panel;
	
	public Plantilla(ControlInterfaz controlInterfaz, Frame1 frame1)
	{
		panel = new JPanel();
		panel.setBounds(0, 0, 800, 600);
		panel.setLayout(null);
		
		frame1.frame1.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("PLANTILLA");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblNewLabel.setBounds(220, 228, 354, 118);
		
		
		
		
		panel.add(lblNewLabel);
		panel.setVisible(false);
	}
	
	
}
