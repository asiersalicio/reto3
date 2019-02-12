package Controlador;


import ControladoresPaneles.ControladorBienvenida;
import ControladoresPaneles.ControladorCambioFinal;
import ControladoresPaneles.ControladorLogin;
import ControladoresPaneles.ControladorMostrarCompra;
import ControladoresPaneles.ControladorPago;
import ControladoresPaneles.ControladorRegister;
import ControladoresPaneles.ControladorSelTrayecto;
import Modelo.ManejoBilletes;
import Modelo.Modelo;
import Vista.DebugMode;
import Vista.SelectorBBDD;
import Vista.Vista;

public class Controlador {
	
	public ControladorLogin controladorLogin;
	public ControladorSelTrayecto controladorSelTrayecto;
	public ControladorMostrarCompra controladorMostrarCompra;
	public ControladorPago controladorPago;
	public ControladorRegister controladorRegister;
	public ControladorCambioFinal controladorCambioFinal;
	public ControladorBienvenida controladorBienvenida;
	
	
	public ManejoBilletes manejoBilletes;
	

	public Controlador(Vista vista, Modelo modelo)
	{
		
		manejoBilletes = new ManejoBilletes(vista, modelo);
		
		
		controladorMostrarCompra = new ControladorMostrarCompra(vista, modelo);
		controladorSelTrayecto = new ControladorSelTrayecto(vista, modelo, this);
		controladorLogin = new ControladorLogin(vista, modelo);
		controladorPago = new ControladorPago(vista, modelo, this);
		controladorRegister = new ControladorRegister(vista, modelo);
		controladorCambioFinal = new ControladorCambioFinal(vista, modelo);
		controladorBienvenida = new ControladorBienvenida(vista, modelo);
		
		
		
		new SelectorBBDD(vista);
		
		if(true)
		{
			new DebugMode(vista, modelo);
		}
	}
}
