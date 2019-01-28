package Modelo;

/**
 *Clase LineaParada: 
 * @param codLineaTemp
 * @param codParada
 * 
 */

public class LineaParada{
	//Atributos o propiedades:
	public String codLinea;
	public String codParada;
	
	//Métodos 
	//constructor1: 
	public LineaParada(String codLinea, String codParada) {
		this.setCodLinea(codLinea);
		this.setCodParada(codParada);	
	}

	//Geters y Seters
	public String getCodLinea() {
		return codLinea;
	}

	public void setCodLinea(String codLinea) {
		this.codLinea = codLinea;
	}

	public String getCodParada() {
		return codParada;
	}

	public void setCodParada(String codParada) {
		this.codParada = codParada;
	}

	
	
}