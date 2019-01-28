package Vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

import Controlador.ControlInterfaz;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.Color;
import java.awt.Font;

public class PaneCambioFinal {
	
	public JPanel paneCambioFinal;
	
	
	public PaneCambioFinal(Frame1 frame1)
	{
		paneCambioFinal = new JPanel();
		paneCambioFinal.setBackground(Color.WHITE);
		paneCambioFinal.setBounds(0, 0, 800, 600);
		paneCambioFinal.setLayout(null);
		
		frame1.frame1.getContentPane().add(paneCambioFinal);

		
		DefaultListModel<String> modelo2=new DefaultListModel<String>();
		JList<String> list = new JList<String>(modelo2);
		list.setBackground(Color.WHITE);
		list.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(212, 208, 200), null, null, null), "Su Cambio :", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(85, 107, 47)));
		list.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 19));
		list.setBounds(243, 167, 259, 343);
		paneCambioFinal.add(list);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(PaneCambioFinal.class.getResource("/ImagenesVista/logo-termibus.png")));
		label.setBounds(489, 11, 301, 117);
		paneCambioFinal.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(PaneCambioFinal.class.getResource("/ImagenesVista/termiLOGOpeke.png")));
		label_1.setBounds(10, 505, 70, 64);
		paneCambioFinal.add(label_1);
		
		/*
		ManejoBilletes[] listaBilletes=new ManejoBilletes[14];
		listaBilletes[0]=new ManejoBilletes("Billete de 200",0);
		listaBilletes[1]=new ManejoBilletes("Billete de 100",0);
		listaBilletes[2]=new ManejoBilletes("Billete de 50",0);
		listaBilletes[3]=new ManejoBilletes("Billete de 20",0);
		listaBilletes[4]=new ManejoBilletes("Billete de 10",0);
		listaBilletes[5]=new ManejoBilletes("Billete de 5",0);
		listaBilletes[6]=new ManejoBilletes("Moneda de 2",0);
		listaBilletes[7]=new ManejoBilletes("Moneda de 1",0);
		listaBilletes[8]=new ManejoBilletes("Moneda de 50c",0);
		listaBilletes[9]=new ManejoBilletes("Moneda de 20c",0);
		listaBilletes[10]=new ManejoBilletes("Moneda de 10c",0);
		listaBilletes[11]=new ManejoBilletes("Moneda de 5c",0);
		listaBilletes[12]=new ManejoBilletes("Moneda de 2c",0);
		listaBilletes[13]=new ManejoBilletes("Moneda de 1c",0);

		
		Devolucion.Dinero(cambio, listaBilletes);
		
		for (int i=0;i<listaBilletes.length;i++)
		{
			if (listaBilletes[i].contadorBillete>0)
			{ 
			modelo2.addElement(listaBilletes[i].contadorBillete+" x "+listaBilletes[i].nombreBillete);
			}
		}
		
	}
		*/
		
		
		
		paneCambioFinal.setVisible(false);
	}
	
	
}
