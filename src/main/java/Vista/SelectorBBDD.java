package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.crypto.Data;

import Controlador.ControlInterfaz;
import Controlador.ControlModelo;
import Controlador.Main;
import Modelo.BBDD;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*; 
/**
 * Clase SelectorBBDD
 * @author IN1DM3B_18
 *
 */
public class SelectorBBDD {

	private JPanel contentPane;
	private JTextField DatabaseURL;
	private JPasswordField DatabasePassword;
	private JTextField DatabaseUser;
	private JFrame frame;
	private JButton btnLogin;


	/**
	 * Create the frame.
	 */
	public SelectorBBDD() {
		String url = "";
		String user = "";
		String pass = "";
		File file = null;
		boolean error = false;
		boolean autologin=false;
		
		file = new File("./conf.ini"); 
		
		boolean FileConf = file.exists();
		
		if(FileConf)
		{
			BufferedReader br = null;
			autologin=true;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		} 
		   
		try {
			url = br.readLine();
		} catch (IOException e1) {}
		try {
			user = br.readLine();
		} catch (IOException e1) {}
		try {
			pass = br.readLine();
		} catch (IOException e1) {}
		}
		
		boolean debug = true;
		frame = new JFrame();
		frame.setTitle("Initial configuration");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		DatabaseURL = new JTextField();
		DatabaseURL.setText(url);
		DatabaseURL.setBounds(162, 115, 212, 22);
		contentPane.add(DatabaseURL);
		DatabaseURL.setColumns(10);
		
		JLabel lblIpBaseDe = new JLabel("Database URL:");
		lblIpBaseDe.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIpBaseDe.setBounds(39, 118, 111, 16);
		contentPane.add(lblIpBaseDe);
		
		JLabel lblNewLabel = new JLabel("ASAlba S.A.");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setBounds(26, 13, 187, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblTicketVending = new JLabel("Ticket vending");
		lblTicketVending.setForeground(Color.GRAY);
		lblTicketVending.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTicketVending.setBounds(225, 31, 198, 22);
		contentPane.add(lblTicketVending);
		
		JLabel lblDatabaseIp = new JLabel("Database User:");
		lblDatabaseIp.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDatabaseIp.setBounds(39, 151, 111, 16);
		contentPane.add(lblDatabaseIp);
		
		JLabel lblDatabaseUser = new JLabel("Database Password:");
		lblDatabaseUser.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDatabaseUser.setBounds(12, 183, 138, 16);
		contentPane.add(lblDatabaseUser);
		
		btnLogin = new JButton("Login");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				conectar();
			}
		});
		btnLogin.setBounds(162, 215, 97, 25);
		contentPane.add(btnLogin);
		
		DatabasePassword = new JPasswordField();
		DatabasePassword.setToolTipText("");
		DatabasePassword.setText(pass);
		DatabasePassword.setBounds(162, 180, 212, 22);
		contentPane.add(DatabasePassword);
		
		DatabaseUser = new JTextField();
		DatabaseUser.setText(user);
		DatabaseUser.setColumns(10);
		DatabaseUser.setBounds(162, 148, 212, 22);
		contentPane.add(DatabaseUser);
		
		frame.setVisible(true);
		if(autologin)
		error=conectar();
		
	}
	
	public boolean conectar() {
		btnLogin.setText("Connecting...");
		btnLogin.setEnabled(false);
		boolean error=true;
		error=BBDD.Conectar("mysql://" + DatabaseURL.getText() ,DatabaseUser.getText(),String.valueOf(DatabasePassword.getPassword()));
		if(!error)
		{
			ControlModelo controlModelo = new ControlModelo();
			//Crea un controlador de interfaz
			Main.controlInterfaz = new ControlInterfaz();
			//Ejecuta el proceso para la creacion de la interfaz
			ControlInterfaz.InicializarInterfaz();
			if(true)
			{
				new DebugMode(Main.controlInterfaz);
				
			}
			
			PrintWriter writer = null;
			try {
				writer = new PrintWriter("./conf.ini", "UTF-8");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			writer.println(DatabaseURL.getText());
			writer.println(DatabaseUser.getText());
			writer.println(String.valueOf(DatabasePassword.getPassword()));
			writer.close();
			
			frame.dispose();
			return false;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Cannot connect to the database, check if you have connection to database or username and passwords are correct", "Database connection error", JOptionPane.ERROR_MESSAGE);
			btnLogin.setEnabled(true);
			btnLogin.setText("Login");
			return true;
		}
		
	}
}
