package Vista;

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
	}
	
	
	public void setPane(JPanel nuevoPane)
	{
		try {
		actualPane.setVisible(false);}catch(java.lang.NullPointerException ex){};
		nuevoPane.setVisible(true);
		actualPane=nuevoPane;
	}

	
	
}
