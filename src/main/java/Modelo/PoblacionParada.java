package Modelo;

/**
 *Clase PoblacionParada: 
 * @param codParada
 * @param codPostal
 * 
 */

public class PoblacionParada{
	//Atributos o propiedades:
	public int codParada;
	public int codPostal;

	//Métodos 
	//constructor1: 
	public PoblacionParada(int codParada, int codPostal) {
		this.setCodParada(codParada);
		this.setCodPostal(codPostal);
	}
	//Geters y Seters
	public int getCodParada() {
		return codParada;
	}

	public void setCodParada(int codParada) {
		this.codParada = codParada;
	}

	public int getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}

	
	
}
