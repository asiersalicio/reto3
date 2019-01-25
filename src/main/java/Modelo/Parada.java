package Modelo;

/**
 *Clase Parada: 
 * @param codParada
 * @param nombreParada
 * @param calle
 * @param latitud
 * @param longitud
 * 
 */

public class Parada{
	//Atributos o propiedades:
	public int codParada;
	public String nombreParada;
	public String calle;
	public float latitud;
	public float longitud;

	//Métodos 
	//constructor1: 
	public Parada(int codParada, String nombreParada, String calle, float latitud, float longitud) {
		this.setCodParada(codParada);
		this.setNombreParada(nombreParada);
		this.setCalle(calle);
		this.setLatitud(latitud);
		this.setLongitud(longitud);
	}
	//Geters y Seters

	public int getCodParada() {
		return codParada;
	}

	public void setCodParada(int codParada) {
		this.codParada = codParada;
	}

	public String getNombreParada() {
		return nombreParada;
	}

	public void setNombreParada(String nombreParada) {
		this.nombreParada = nombreParada;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public float getLatitud() {
		return latitud;
	}

	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}

	public float getLongitud() {
		return longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

}