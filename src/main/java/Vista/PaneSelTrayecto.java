package Vista;

import javax.swing.JPanel;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.awt.Font;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;

import java.awt.Label;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import java.awt.Color;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;


/**
 * Clase PaneSelTrayecto
 * @author IN1DM3B_18
 *
 */

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
	public JLabel lblNoHayBuses;
	public JLabel lblLinea;
	public JLabel lblOrigen;
	public JLabel lblDestino;
	public Label lblFechaIda;
	public Label lblFechaVuelta;
	public JLabel lbllogoPeke ;
	public JLabel lbllogoGrande;
	public JLabel lblCamposSinCompletar;
	private JLabel imgTrayecto;
	
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
		btnCerrarBusqueda.setBounds(724, 0, 76, 64);
		pane.add(btnCerrarBusqueda);
		
		comboBoxBusqueda.setFont(new Font("Tahoma", Font.PLAIN, 30));
		comboBoxBusqueda.setBounds(0, 63, 800, 4);
		
		
		pane.add(comboBoxBusqueda);
		
		lblLinea = new JLabel("Linea :");
		lblLinea.setHorizontalAlignment(SwingConstants.TRAILING);
		lblLinea.setForeground(new Color(0, 51, 102));
		lblLinea.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblLinea.setBounds(91, 223, 126, 25);
		pane.add(lblLinea);
		
		lblOrigen = new JLabel("Origen :");
		lblOrigen.setHorizontalAlignment(SwingConstants.TRAILING);
		lblOrigen.setForeground(new Color(0, 51, 102));
		lblOrigen.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblOrigen.setBounds(91, 264, 126, 25);
		pane.add(lblOrigen);
		
		lblDestino = new JLabel("Destino :");
		lblDestino.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDestino.setForeground(new Color(0, 51, 102));
		lblDestino.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblDestino.setBounds(91, 306, 126, 25);
		pane.add(lblDestino);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setForeground(new Color(0, 51, 102));
		btnBuscar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnBuscar.setBackground(Color.WHITE);
		
		
		btnBuscar.setBounds(568, 505, 186, 44);
		pane.add(btnBuscar);
		
		dateChooserIda = new JDateChooser();
		dateChooserIda.setForeground(new Color(0, 51, 102));
		dateChooserIda.setBackground(Color.WHITE);
		dateChooserIda.setBounds(312, 351, 153, 29);
		dateChooserIda.getJCalendar().setMinSelectableDate(new Date());
		pane.add(dateChooserIda);
		
		lblFechaIda = new Label("Fecha de Ida :");
		lblFechaIda.setForeground(new Color(0, 51, 102));
		lblFechaIda.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		lblFechaIda.setBounds(191, 356, 115, 24);
		pane.add(lblFechaIda);
		
		dateChooserVuelta = new JDateChooser();
		dateChooserVuelta.setForeground(new Color(0, 51, 102));
		dateChooserVuelta.setBackground(Color.WHITE);
		dateChooserVuelta.setEnabled(false);
		dateChooserVuelta.setBounds(312, 390, 153, 29);
		dateChooserVuelta.getJCalendar().setMinSelectableDate(new Date());

		pane.add(dateChooserVuelta);
		
		lblFechaVuelta = new Label("Fecha de vuelta :");
		lblFechaVuelta.setForeground(new Color(0, 51, 102));
		lblFechaVuelta.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		lblFechaVuelta.setBackground(Color.WHITE);
		lblFechaVuelta.setBounds(168, 395, 148, 24);
		pane.add(lblFechaVuelta);
		
		FieldLinea = new JTextField();
		FieldLinea.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		FieldLinea.setBackground(Color.WHITE);
		FieldLinea.setEditable(false);

		FieldLinea.setBounds(227, 217, 238, 36);
		pane.add(FieldLinea);
		FieldLinea.setColumns(10);
		
		FieldOrigen = new JTextField();
		FieldOrigen.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		FieldOrigen.setBackground(Color.WHITE);
		FieldOrigen.setEditable(false);
		FieldOrigen.setBounds(227, 259, 238, 36);
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
		btnSelLinea.setBounds(468, 217, 159, 36);
		pane.add(btnSelLinea);
		
		btnSelOrigen = new JButton("Seleccionar");
		btnSelOrigen.setForeground(new Color(0, 51, 102));
		btnSelOrigen.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSelOrigen.setBackground(Color.WHITE);
		btnSelOrigen.setEnabled(false);
		btnSelOrigen.setBounds(468, 259, 159, 36);
		pane.add(btnSelOrigen);
		
		FieldDestino = new JTextField();
		FieldDestino.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		FieldDestino.setBackground(Color.WHITE);
		FieldDestino.setEditable(false);
		FieldDestino.setColumns(10);
		FieldDestino.setBounds(227, 300, 238, 36);
		pane.add(FieldDestino);
		
		btnSelDestino = new JButton("Seleccionar");
		btnSelDestino.setForeground(new Color(0, 51, 102));
		btnSelDestino.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSelDestino.setBackground(Color.WHITE);
		btnSelDestino.setEnabled(false);
		btnSelDestino.setBounds(468, 300, 159, 36);
		pane.add(btnSelDestino);
		
		chckbxVuelta = new JCheckBox("Viaje de vuelta");
		chckbxVuelta.setBackground(Color.WHITE);
		chckbxVuelta.setForeground(new Color(204, 0, 0));
		chckbxVuelta.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		chckbxVuelta.setBounds(478, 369, 159, 25);
		pane.add(chckbxVuelta);
		
		lbllogoPeke = new JLabel("");
		lbllogoPeke.setIcon(new ImageIcon(PaneSelTrayecto.class.getResource("/ImagenesVista/logo-termibus.png")));
		lbllogoPeke.setBounds(489, 8, 301, 117);
		pane.add(lbllogoPeke);
		
		lbllogoGrande = new JLabel("");
		lbllogoGrande.setIcon(new ImageIcon(PaneSelTrayecto.class.getResource("/ImagenesVista/termiLOGOpeke.png")));
		lbllogoGrande.setBounds(10, 505, 70, 64);
		pane.add(lbllogoGrande);
		
		lblNoHayBuses = new JLabel("*No hay buses disponbibles para esa fecha");
		lblNoHayBuses.setVisible(false);
		lblNoHayBuses.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNoHayBuses.setForeground(Color.RED);
		lblNoHayBuses.setBounds(149, 430, 325, 25);
		pane.add(lblNoHayBuses);
		
		lblCamposSinCompletar = new JLabel("*Hay campos sin completar");
		lblCamposSinCompletar.setVisible(false);
		lblCamposSinCompletar.setForeground(Color.RED);
		lblCamposSinCompletar.setFont(new Font("Arial", Font.PLAIN, 13));
		lblCamposSinCompletar.setBounds(149, 457, 329, 25);
		pane.add(lblCamposSinCompletar);
		
		imgTrayecto = new JLabel("");
		imgTrayecto.setIcon(new ImageIcon(PaneSelTrayecto.class.getResource("/ImagenesVista/Trayecto.png")));
		imgTrayecto.setBounds(10, 63, 467, 93);
		pane.add(imgTrayecto);
		
		pane.setVisible(false);
	}
	
	public void reset()
	{
		FieldOrigen.setText("");
		FieldDestino.setText("");
		FieldLinea.setText("");
		dateChooserIda.setDate(new Date());
		dateChooserVuelta.setDate(new Date());
	}
}
