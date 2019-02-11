package ControladoresPaneles;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import Funciones.FuncionesContrasena;
import Modelo.Llamadas;
import Modelo.Modelo;
import Vista.PaneLogin;
import Vista.PaneRegister;
import Vista.Vista;
/**
 * Clase ControladorRegister: Mediante esta clase se controlan los botones de la clase Register:  btnVolverALogin y btnRegistarse.
 * @author IN1DM3B_18
 *
 */
public class ControladorRegister {
	
	public PaneRegister paneRegister;
	public Vista vista;
	public Modelo modelo;
	/**
	 * Método: ControladorRegister
	 * @param modelo 
	 * @param panel
	 * @param pane
	 */
	public ControladorRegister(Vista vista, Modelo modelo)
	{
		this.vista=vista;
		this.modelo=modelo;
		this.paneRegister=vista.paneRegister;
		//Botón VolverALogin en paneRegister: cuando se clica en el botón "Volver", aparece la ventana: paneLogin
		paneRegister.btnVolverALogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				BorrarCampos();
				vista.setPanel(vista.paneLogin.pane);
			}
		});
		
		//Botón Registrarse en paneLogin: Cuando se clica en el botón "Registrarse", aparece la ventana paneRegister
		paneRegister.btnRegistarse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(ValidarCampos())
				{

					String DNI=paneRegister.fieldDNI.getText();
					String nombreCliente=paneRegister.fieldNombre.getText();
					String apellidos=paneRegister.fieldApellidos.getText();
					String contrasena=modelo.funcionesContrasena.encriptarContrasena(String.valueOf(paneRegister.fieldPassword.getPassword()));
					Calendar fechaNac=paneRegister.fechaNac.getCalendar();
					String sexo = null;
					switch (paneRegister.comboBoxSexo.getSelectedIndex()) {
					case 1: sexo="M";
						break;
					case 2: sexo="H";
						break;
					case 3: sexo="O";
						break;
					}
					modelo.RegistrarCliente(DNI, nombreCliente, apellidos, fechaNac, sexo, contrasena);
					BorrarCampos();
					vista.setPanel(vista.paneLogin.pane);
				}
			}
			
		});
		
			paneRegister.fieldPassword.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				ActualizarBarraSeguridad();
			}
			@Override
			public void insertUpdate(DocumentEvent e) {
				ActualizarBarraSeguridad();
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
			}

			});
			}
			
		/**
		 * Método: BorrarCampos. 
		 * Permite que los campos en los que se había escrito algún caracter se queden en blanco.
		 */
		public void BorrarCampos()
		{
			//paneRegister.fechaNac.setDate(new Date());
			paneRegister.comboBoxSexo.setSelectedIndex(0);
			paneRegister.fieldApellidos.setText(null);
			paneRegister.fieldDNI.setText(null);
			paneRegister.fieldNombre.setText(null);
			paneRegister.fieldPassword.setText(null);
			paneRegister.fieldPassword2.setText(null);
			paneRegister.lblErrApe.setVisible(false);
			paneRegister.lblErrCont.setVisible(false);
			paneRegister.lblErrFechaNac.setVisible(false);
			paneRegister.lblErrNom.setVisible(false);
			paneRegister.lblErrSexo.setVisible(false);
			paneRegister.lblErrUs.setVisible(false);
			paneRegister.progSegCont.setValue(0);
		}
	
		/**
		 * Método: ValidarCampos
		 * @return
		 */
		public boolean ValidarCampos() {
			boolean resultado=true;
			
			paneRegister.lblErrApe.setVisible(false);paneRegister.lblErrCont.setVisible(false);
			paneRegister.lblErrFechaNac.setVisible(false);paneRegister.lblErrNom.setVisible(false);
			paneRegister.lblErrUs.setVisible(false);paneRegister.lblErrSexo.setVisible(false);
			String dni=paneRegister.fieldDNI.getText();
			
			if(modelo.funcionesContrasena.validarFormatoDNI(dni)==false || modelo.llamadas.validarDNI(dni))
			{
				paneRegister.lblErrUs.setVisible(true); resultado=false;
			}
		
			if(!(paneRegister.fieldNombre.getText().length()>=3))
			{
				paneRegister.lblErrNom.setVisible(true); resultado=false;
			}
			if(!(paneRegister.fieldApellidos.getText().length()>=3))
			{
				paneRegister.lblErrApe.setVisible(true); resultado=false;
			}
			
			int passLength=String.valueOf(paneRegister.fieldPassword.getPassword()).length();
			System.out.println(passLength);
			
			boolean PassEquals=false;
			if(String.valueOf(paneRegister.fieldPassword.getPassword()).equals(String.valueOf(paneRegister.fieldPassword2.getPassword())))
			PassEquals=true;
					
			if(passLength<8 || passLength>16 || !PassEquals)
			{
				paneRegister.lblErrCont.setVisible(true); resultado=false;
			}
			
			if(paneRegister.comboBoxSexo.getSelectedIndex()==0)
			{
				paneRegister.lblErrSexo.setVisible(true); resultado=false;
			}
			
			return resultado;
		}
		
		/**
		 * Método: ActualizarBarraSeguridad
		 */
		public void ActualizarBarraSeguridad()
		{
			int passLength=String.valueOf(paneRegister.fieldPassword.getPassword()).length();
			if(passLength<8)
			{
				paneRegister.lblSeguridad.setText("Insegura");
				paneRegister.lblSeguridad.setForeground(Color.RED);
			}
			else if(passLength<10)
			{
				paneRegister.lblSeguridad.setText("Aceptable");
				paneRegister.lblSeguridad.setForeground(Color.ORANGE);
			}
			else if(passLength<12)
			{
				paneRegister.lblSeguridad.setText("Buena");
				paneRegister.lblSeguridad.setForeground(Color.GREEN);
			}
			else
			{
				paneRegister.lblSeguridad.setText("Segura");
				paneRegister.lblSeguridad.setForeground(Color.CYAN);
			}
			paneRegister.progSegCont.setValue(passLength);
		}
}
	
