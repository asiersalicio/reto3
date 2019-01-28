package Vista;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame1 {
	public JFrame frame1;
	public JPanel actualPane;
	
	//Constructor Frame1
	public Frame1()
	{
		frame1 = new JFrame();
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

