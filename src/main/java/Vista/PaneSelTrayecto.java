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
		pane.setBounds(0, 0, 800, 600);
		pane.setLayout(null);
		
		frame1.frame1.getContentPane().add(pane);
		
		comboBoxBusqueda = new JComboBox();
		comboBoxBusqueda.setVisible(false);
		
		btnCerrarBusqueda = new JButton("X");
		btnCerrarBusqueda.setVisible(false);
		btnCerrarBusqueda.setBackground(Color.RED);
		btnCerrarBusqueda.setBounds(740, 8, 50, 50);
		pane.add(btnCerrarBusqueda);
		
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
		
		btnBuscar = new JButton("Buscar");
		
		
		btnBuscar.setBounds(363, 425, 173, 36);
		pane.add(btnBuscar);
		
		dateChooserIda = new JDateChooser();
		dateChooserIda.setBounds(569, 241, 148, 39);
		pane.add(dateChooserIda);
		
		Label label = new Label("Fecha de Ida");
		label.setBounds(569, 207, 115, 24);
		pane.add(label);
		
		dateChooserVuelta = new JDateChooser();
		dateChooserVuelta.setEnabled(false);
		dateChooserVuelta.setBounds(569, 425, 148, 36);
		pane.add(dateChooserVuelta);
		
		Label label_1 = new Label("Fecha de vuelta");
		label_1.setBounds(569, 384, 148, 24);
		pane.add(label_1);
		
		JLabel lblSeleccioneLineaDe = new JLabel("Seleccione Linea De operacion");
		lblSeleccioneLineaDe.setBounds(193, 212, 303, 16);
		pane.add(lblSeleccioneLineaDe);
		
		FieldLinea = new JTextField();
		FieldLinea.setEditable(false);

		FieldLinea.setBounds(194, 244, 231, 31);
		pane.add(FieldLinea);
		FieldLinea.setColumns(10);
		
		FieldOrigen = new JTextField();
		FieldOrigen.setEditable(false);
		FieldOrigen.setBounds(194, 305, 231, 30);
		pane.add(FieldOrigen);
		FieldOrigen.setColumns(10);
		
		FieldBusqueda = new JTextField();
		FieldBusqueda.setVisible(false);
		FieldBusqueda.setFont(new Font("Tahoma", Font.PLAIN, 40));
		FieldBusqueda.setToolTipText("");
		FieldBusqueda.setBounds(0, 0, 728, 64);
		pane.add(FieldBusqueda);
		FieldBusqueda.setColumns(10);
		
		btnSelLinea = new JButton("Seleccionar");
		btnSelLinea.setBounds(427, 247, 109, 25);
		pane.add(btnSelLinea);
		
		btnSelOrigen = new JButton("Seleccionar");
		btnSelOrigen.setEnabled(false);
		btnSelOrigen.setBounds(427, 308, 109, 25);
		pane.add(btnSelOrigen);
		
		FieldDestino = new JTextField();
		FieldDestino.setEditable(false);
		FieldDestino.setColumns(10);
		FieldDestino.setBounds(194, 351, 231, 30);
		pane.add(FieldDestino);
		
		btnSelDestino = new JButton("Seleccionar");
		btnSelDestino.setEnabled(false);
		btnSelDestino.setBounds(427, 354, 109, 25);
		pane.add(btnSelDestino);
		
		chckbxVuelta = new JCheckBox("Viaje de vuelta");
		chckbxVuelta.setBounds(571, 351, 159, 25);
		pane.add(chckbxVuelta);
		
		pane.setVisible(false);
	}
}
