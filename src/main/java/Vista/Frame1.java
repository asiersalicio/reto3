package Vista;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window.Type;

public class Frame1 {
	public JFrame frame1;
	public JPanel actualPane;
	
	//Constructor Frame1
	public Frame1()
	{
		frame1 = new JFrame();
		frame1.setType(Type.UTILITY);
		frame1.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 12));
		frame1.setForeground(new Color(0, 51, 102));
		frame1.setIconImage(Toolkit.getDefaultToolkit().getImage(Frame1.class.getResource("/ImagenesVista/termiLOGOpeke.png")));
		frame1.setTitle("TermibBus Ticket Station v1.0 by ASAlba Solutions");
		frame1.setBounds(0, 0, 800, 600);		
		
		frame1.addWindowListener(new WindowAdapter() {
			  public void windowClosing(WindowEvent we) {
			    System.exit(0);
			  }
		});
		
	}
	
	
	public void setPane(JPanel nuevoPane)
	{
		try {
		actualPane.setVisible(false);}catch(java.lang.NullPointerException ex){};
		nuevoPane.setVisible(true);
		actualPane=nuevoPane;
	}
}

