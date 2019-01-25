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

public class PaneSelTrayecto {
	
	public JPanel pane;
	String[] resultado = new String[1];
	String[] resultado2 = {"d","p"};
	public JTextField FieldLinea;
	public JTextField FieldOrigen;
	public JTextField FieldBusqueda;
	public JComboBox comboBoxBusqueda;
	
	
	public PaneSelTrayecto(Frame1 frame1)
	{
		pane = new JPanel();
		pane.setBounds(0, 0, 800, 600);
		pane.setLayout(null);
		
		frame1.frame1.getContentPane().add(pane);
		
		comboBoxBusqueda = new JComboBox();
		comboBoxBusqueda.setVisible(false);
		comboBoxBusqueda.setFont(new Font("Tahoma", Font.PLAIN, 30));
		comboBoxBusqueda.setBounds(0, 63, 800, 4);
		
		
		pane.add(comboBoxBusqueda);
		
		JLabel lblLinea = new JLabel("Linea");
		lblLinea.setBounds(56, 247, 126, 25);
		pane.add(lblLinea);
		
		JLabel lblOrigen = new JLabel("Origen");
		lblOrigen.setBounds(56, 304, 126, 25);
		pane.add(lblOrigen);
		
		JLabel lblDestino = new JLabel("Destino");
		lblDestino.setBounds(56, 351, 126, 25);
		pane.add(lblDestino);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(363, 425, 173, 36);
		pane.add(btnBuscar);
		
		JButton btnCargarLineas = new JButton("Cargar lineas");
		btnCargarLineas.setBounds(193, 184, 135, 23);
		pane.add(btnCargarLineas);
		
		JDateChooser dateChooserIda = new JDateChooser();
		dateChooserIda.setBounds(569, 241, 148, 39);
		pane.add(dateChooserIda);
		
		Label label = new Label("Fecha de Ida");
		label.setBounds(569, 207, 115, 24);
		pane.add(label);
		
		JDateChooser dateChooserVuelta = new JDateChooser();
		dateChooserVuelta.setBounds(569, 373, 148, 36);
		pane.add(dateChooserVuelta);
		
		Label label_1 = new Label("Fecha de vuelta");
		label_1.setBounds(569, 332, 148, 24);
		pane.add(label_1);
		
		JLabel lblSeleccioneLineaDe = new JLabel("Seleccione Linea De operacion");
		lblSeleccioneLineaDe.setBounds(193, 212, 303, 16);
		pane.add(lblSeleccioneLineaDe);
		
		FieldLinea = new JTextField();

		FieldLinea.setBounds(194, 244, 344, 31);
		pane.add(FieldLinea);
		FieldLinea.setColumns(10);
		
		FieldOrigen = new JTextField();
		FieldOrigen.setBounds(194, 305, 344, 30);
		pane.add(FieldOrigen);
		FieldOrigen.setColumns(10);
		
		FieldBusqueda = new JTextField();
		FieldBusqueda.setVisible(false);
		FieldBusqueda.setFont(new Font("Tahoma", Font.PLAIN, 40));
		FieldBusqueda.setToolTipText("");
		FieldBusqueda.setBounds(0, 0, 800, 64);
		pane.add(FieldBusqueda);
		FieldBusqueda.setColumns(10);
		
		
		pane.setVisible(false);
	}
}
