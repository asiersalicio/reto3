package Vista;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;

public class PaneVistaLineas {
public JPanel panel;
public JFrame frame;
	
	public PaneVistaLineas()
	{
		
		frame = new JFrame();
		frame.setBounds(0, 0, 1500, 966);
		frame.setUndecorated(true);
		panel = new JPanel();
		panel.setBounds(0, 0, 800, 600);
		frame.getContentPane().add(panel);
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
	    frame.setLocation(x, y);
		
		JLabel imgPlanoLineas = new JLabel("");
		imgPlanoLineas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		panel.setLayout(new BorderLayout(0, 0));
		imgPlanoLineas.setIcon(new ImageIcon(PaneLogin.class.getResource("/ImagenesVista/PlanoLineas.png")));
		panel.add(imgPlanoLineas);
		frame.setVisible(true);
		panel.setVisible(true);
	}
}
