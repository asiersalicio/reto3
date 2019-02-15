package ControladoresPaneles;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Modelo.Modelo;
import Vista.Vista;
/**
 * Clase: ControladorLogin: contiene btnRegister y btnLogin
 * en el btnRegister, cuando se pulsa dirige al usuario al paneRegister
 * en el btnLogin, cuando se pulsa, valida el DNI y la contraseña y dirige al usuario al paneLogin
 * @author IN1DM3B_18
 *
 */



public class ControladorLogin {
	
	public Vista vista;
	public Modelo modelo;
	
	/**
	 * Este controlador sirve para controlar el paneLogin
	 */
	public ControladorLogin(Vista vista, Modelo modelo)
	{
		this.vista=vista;
		this.modelo=modelo;
		//Botón "Registrese Ahora"
		vista.paneLogin.btnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				vista.setPanel(vista.paneRegister.pane);
			}
		});
		
		//Botón "Login"
		vista.paneLogin.btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				boolean formatoDNIValido=false;
				boolean dniValido = false;
				boolean contrasenaValida = false;
				String dni = vista.paneLogin.textfieldUsername.getText();
				formatoDNIValido=modelo.funcionesContrasena.validarFormatoDNI(dni);
				System.out.println("El formato del dni es válido? " + formatoDNIValido);
				dniValido=modelo.llamadas.validarDNI(dni);
				System.out.println("El dni está en la BBDD? " + dniValido);
				String contrasena=String.valueOf(vista.paneLogin.fieldPassword.getPassword());
				contrasenaValida=modelo.funcionesContrasena.combrobarContrasena(modelo.funcionesContrasena.encriptarContrasena(contrasena), dni);
				
				if(formatoDNIValido && dniValido && contrasenaValida)
				{
					System.out.println("El dni es valido " + vista.paneLogin.textfieldUsername.getText());
					modelo.EstablecerClienteActual(vista.paneLogin.textfieldUsername.getText());
					vista.paneSelTrayecto.lblSaludo.setText("Hola, " + modelo.cliente.getNombreCliente());
					vista.setPanel(vista.paneSelTrayecto.pane);
				}
				else
				{
					System.out.println("El dni o la contraseña no es valida " + vista.paneLogin.textfieldUsername.getText());
					vista.paneLogin.lblUsConNoValido.setVisible(true);
				}	
			}
		});
	}
	
	
}
