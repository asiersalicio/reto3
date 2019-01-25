package Modelo;
/**
 *Clase Poblacion: 
 * @param codPostal
 * @param nombrePoblacion
 * 
 */
public class Poblacion{
	//Atributos o propiedades:
	public int codPostal;
	public String nombrePoblacion;

	//Métodos 
	//constructor1: 
	public Poblacion(int codPostal, String nombrePoblacion ) {
		this.setCodPostal(codPostal);
		this.setNombrePoblacion(nombrePoblacion);
		
	}
	//Geters y Seters

	public int getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}

	public String getNombrePoblacion() {
		return nombrePoblacion;
	}

	public void setNombrePoblacion(String nombrePoblacion) {
		this.nombrePoblacion = nombrePoblacion;
	}
	
}