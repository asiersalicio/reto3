package Vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

import Controlador.ControlInterfaz;
import Modelo.Devolucion;
import Modelo.ManejoBilletes;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.Color;
import java.awt.Font;
/*
 * Clase PaneCambioFinal
 */
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
		JList<String> listaCambio = new JList<String>(modelo2);
		listaCambio.setBackground(Color.WHITE);
		listaCambio.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(212, 208, 200), null, null, null), "Su Cambio :", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(153, 0, 0)));
		listaCambio.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		listaCambio.setBounds(243, 167, 259, 343);
		paneCambioFinal.add(listaCambio);
		
		JLabel lblLogoGrande = new JLabel("");
		lblLogoGrande.setIcon(new ImageIcon(PaneCambioFinal.class.getResource("/ImagenesVista/logo-termibus.png")));
		lblLogoGrande.setBounds(489, 11, 301, 117);
		paneCambioFinal.add(lblLogoGrande);
		
		JLabel lblLogoPeke = new JLabel("");
		lblLogoPeke.setIcon(new ImageIcon(PaneCambioFinal.class.getResource("/ImagenesVista/termiLOGOpeke.png")));
		lblLogoPeke.setBounds(10, 505, 70, 64);
		paneCambioFinal.add(lblLogoPeke);
		
		JLabel lblGraciasYBuen = new JLabel("Gracias y buen viaje ! Imprimiendo sus billetes....");
		lblGraciasYBuen.setHorizontalAlignment(SwingConstants.CENTER);
		lblGraciasYBuen.setForeground(new Color(0, 51, 102));
		lblGraciasYBuen.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblGraciasYBuen.setBounds(169, 521, 397, 25);
		paneCambioFinal.add(lblGraciasYBuen);
		
		
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

		
		int cambio=100; // Para borrar, solo para pruebas !
		Devolucion.Dinero(cambio, listaBilletes);
		
		for (int i=0;i<listaBilletes.length;i++)
		{
			if (listaBilletes[i].contadorBillete>0)
			{ 
			modelo2.addElement(listaBilletes[i].contadorBillete+" x "+listaBilletes[i].nombreBillete);
			}
		}
		paneCambioFinal.setVisible(false);
	}
}
	
	

