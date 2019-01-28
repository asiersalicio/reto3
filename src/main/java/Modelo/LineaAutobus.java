package Modelo;

/**
 *Clase LineaAutobus: 
 * @param codLineaTemp
 * @param codBus
 * 
 */

public class LineaAutobus {
	//Atributos o propiedades:
	public String codLinea;
	public int codBus;
			
	//Métodos 
	//constructor1: 
	public LineaAutobus(String codLinea,  int codBus) {
		this.codLinea=codLinea;
		this.codBus=codBus;	
	}
		
	//geters y seters
	public String getCodLinea() {
	return codLinea;
	}

	public void setCodLinea(String codLinea) {
		this.codLinea = codLinea;
	}

	public int getCodBus() {
		return codBus;
	}

	public void setCodBus(int codBus) {
		this.codBus = codBus;
	}
}
