package Vista;

import javax.swing.JPanel;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;

import Controlador.ControlInterfaz;

import java.awt.Label;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class PaneSelTrayecto {
	
	public JPanel pane;
	public JTextField FieldLinea;
	public JTextField FieldOrigen;
	public JTextField FieldBusqueda;
	public JComboBox comboBoxBusqueda;
	public JButton btnSelLinea;
	public JButton btnSelOrigen;
	public JTextField FieldDestino;
	public JButton btnSelDestino;
	public JDateChooser dateChooserIda;
	public JDateChooser dateChooserVuelta;
	public JCheckBox chckbxVuelta;
	public JButton btnBuscar;
	public JButton btnCerrarBusqueda;
	
	
	public PaneSelTrayecto(Frame1 frame1)
	{
		pane = new JPanel();
		pane.setBackground(Color.WHITE);
		pane.setBounds(0, 0, 800, 600);
		pane.setLayout(null);
		
		frame1.frame1.getContentPane().add(pane);
		
		comboBoxBusqueda = new JComboBox();
		comboBoxBusqueda.setVisible(false);
		
		btnCerrarBusqueda = new JButton("X");
		btnCerrarBusqueda.setForeground(new Color(0, 51, 102));
		btnCerrarBusqueda.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnCerrarBusqueda.setVisible(false);
		btnCerrarBusqueda.setBackground(Color.WHITE);
		btnCerrarBusqueda.setBounds(740, 8, 50, 50);
		pane.add(btnCerrarBusqueda);
		
		comboBoxBusqueda.setFont(new Font("Tahoma", Font.PLAIN, 30));
		comboBoxBusqueda.setBounds(0, 63, 800, 4);
		
		
		pane.add(comboBoxBusqueda);
		
		JLabel lblLinea = new JLabel("Linea :");
		lblLinea.setHorizontalAlignment(SwingConstants.TRAILING);
		lblLinea.setForeground(new Color(0, 51, 102));
		lblLinea.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblLinea.setBounds(0, 224, 126, 25);
		pane.add(lblLinea);
		
		JLabel lblOrigen = new JLabel("Origen :");
		lblOrigen.setHorizontalAlignment(SwingConstants.TRAILING);
		lblOrigen.setForeground(new Color(0, 51, 102));
		lblOrigen.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblOrigen.setBounds(0, 265, 126, 25);
		pane.add(lblOrigen);
		
		JLabel lblDestino = new JLabel("Destino :");
		lblDestino.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDestino.setForeground(new Color(0, 51, 102));
		lblDestino.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblDestino.setBounds(0, 307, 126, 25);
		pane.add(lblDestino);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setForeground(new Color(0, 51, 102));
		btnBuscar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnBuscar.setBackground(Color.WHITE);
		
		
		btnBuscar.setBounds(581, 505, 173, 36);
		pane.add(btnBuscar);
		
		dateChooserIda = new JDateChooser();
		dateChooserIda.setForeground(new Color(0, 51, 102));
		dateChooserIda.setBackground(Color.WHITE);
		dateChooserIda.setBounds(215, 352, 153, 29);
		pane.add(dateChooserIda);
		
		Label label = new Label("Fecha de Ida :");
		label.setForeground(new Color(0, 51, 102));
		label.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		label.setBounds(94, 357, 115, 24);
		pane.add(label);
		
		dateChooserVuelta = new JDateChooser();
		dateChooserVuelta.setForeground(new Color(0, 51, 102));
		dateChooserVuelta.setBackground(Color.WHITE);
		dateChooserVuelta.setEnabled(false);
		dateChooserVuelta.setBounds(215, 388, 153, 29);
		pane.add(dateChooserVuelta);
		
		Label label_1 = new Label("Fecha de vuelta :");
		label_1.setForeground(new Color(0, 51, 102));
		label_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(71, 387, 148, 24);
		pane.add(label_1);
		
		JLabel lblSeleccioneLineaDe = new JLabel("Seleccione su trayecto :");
		lblSeleccioneLineaDe.setForeground(new Color(102, 0, 0));
		lblSeleccioneLineaDe.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 18));
		lblSeleccioneLineaDe.setBounds(54, 150, 303, 36);
		pane.add(lblSeleccioneLineaDe);
		
		FieldLinea = new JTextField();
		FieldLinea.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		FieldLinea.setBackground(Color.WHITE);
		FieldLinea.setEditable(false);

		FieldLinea.setBounds(136, 218, 231, 31);
		pane.add(FieldLinea);
		FieldLinea.setColumns(10);
		
		FieldOrigen = new JTextField();
		FieldOrigen.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		FieldOrigen.setBackground(Color.WHITE);
		FieldOrigen.setEditable(false);
		FieldOrigen.setBounds(136, 260, 231, 30);
		pane.add(FieldOrigen);
		FieldOrigen.setColumns(10);
		
		FieldBusqueda = new JTextField();
		FieldBusqueda.setForeground(new Color(0, 51, 102));
		FieldBusqueda.setVisible(false);
		FieldBusqueda.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 40));
		FieldBusqueda.setToolTipText("");
		FieldBusqueda.setBounds(0, 0, 728, 64);
		pane.add(FieldBusqueda);
		FieldBusqueda.setColumns(10);
		
		btnSelLinea = new JButton("Seleccionar");
		btnSelLinea.setForeground(new Color(0, 51, 102));
		btnSelLinea.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSelLinea.setBackground(Color.WHITE);
		btnSelLinea.setBounds(377, 218, 159, 31);
		pane.add(btnSelLinea);
		
		btnSelOrigen = new JButton("Seleccionar");
		btnSelOrigen.setForeground(new Color(0, 51, 102));
		btnSelOrigen.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSelOrigen.setBackground(Color.WHITE);
		btnSelOrigen.setEnabled(false);
		btnSelOrigen.setBounds(377, 260, 159, 31);
		pane.add(btnSelOrigen);
		
		FieldDestino = new JTextField();
		FieldDestino.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		FieldDestino.setBackground(Color.WHITE);
		FieldDestino.setEditable(false);
		FieldDestino.setColumns(10);
		FieldDestino.setBounds(136, 301, 231, 30);
		pane.add(FieldDestino);
		
		btnSelDestino = new JButton("Seleccionar");
		btnSelDestino.setForeground(new Color(0, 51, 102));
		btnSelDestino.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSelDestino.setBackground(Color.WHITE);
		btnSelDestino.setEnabled(false);
		btnSelDestino.setBounds(377, 302, 159, 30);
		pane.add(btnSelDestino);
		
		chckbxVuelta = new JCheckBox("Viaje de vuelta");
		chckbxVuelta.setForeground(new Color(102, 0, 0));
		chckbxVuelta.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		chckbxVuelta.setBounds(387, 370, 159, 25);
		pane.add(chckbxVuelta);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(PaneSelTrayecto.class.getResource("/ImagenesVista/logo-termibus.png")));
		label_2.setBounds(489, 8, 301, 117);
		pane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(PaneSelTrayecto.class.getResource("/ImagenesVista/termiLOGOpeke.png")));
		label_3.setBounds(10, 505, 70, 64);
		pane.add(label_3);
		
		pane.setVisible(false);
	}
}
