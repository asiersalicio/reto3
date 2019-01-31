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
	public String codParada;
	public String nombreParada;
	public String calle;
	public float latitud;
	public float longitud;

	//M�todos 
	//constructor1: 
	public Parada(String codParada2, String nombreParada, String calle, float latitud, float longitud) {
		this.codParada=codParada2;
		this.nombreParada=nombreParada;
		this.calle=calle;
		this.latitud=latitud;
		this.longitud=longitud;
	}
	//Geters y Seters

	public Parada() {
		// TODO Auto-generated constructor stub
	}

	public String getCodParada() {
		return codParada;
	}

	public void setCodParada(String string) {
		this.codParada = string;
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