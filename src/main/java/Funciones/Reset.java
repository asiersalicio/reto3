package Funciones;

import Modelo.Modelo;
import Vista.Vista;

public class Reset {
	
	public Reset(Vista vista, Modelo modelo)
	{

	modelo.cliente=null;  
	modelo.linea=null;
	modelo.paradaOrigen=null;
	modelo.paradaDestino=null;
	modelo.lineaParada=null;
	modelo.billeteIda=null;
	modelo.billeteVuelta=null;
	modelo.autobusIda=null;
	modelo.autobusVuelta=null;
	modelo.precioIda = 0;
	modelo.precioVuelta = 0;
	modelo.fechaIda=null;
	modelo.fechaVuelta=null;
	modelo.viajeDeVuelta=false;
	
	vista.paneLogin.reset();
	vista.paneRegister.reset();
	vista.paneSelTrayecto.reset();
	
	}
}
