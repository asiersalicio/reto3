package Modelo;
/**
 *Clase Modelo: 
 * 
 */
public class Modelo {
	public Linea linea;
	public Autobus autobus;
	
	//Constructor: según arranque modelo me va a crear todos los objetos
	public Modelo() {
		this.linea = new Linea(null, null);
		
	}

}
