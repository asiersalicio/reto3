package Modelo;

/**
 *Clase LineaParada: 
 * @param codLinea
 * @param codParada
 * 
 */

public class LineaParada{
	//Atributos o propiedades:
	public String codLinea;
	public int codParada;
	
	//Métodos 
	//constructor1: 
	public LineaParada(String codLinea, int codParada) {
		this.codLinea=codLinea;
		this.codParada=codParada;	
	}

	//Geters y Seters
	public String getCodLinea() {
		return codLinea;
	}

	public void setCodLinea(String codLinea) {
		this.codLinea = codLinea;
	}

	public int getCodParada() {
		return codParada;
	}

	public void setCodParada(int codParada) {
		this.codParada = codParada;
	}

	
	
}