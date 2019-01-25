package Modelo;

/**
 *Clase Billete: 
 * @param codBillete
 * @param nTrayecto
 * @param codLinea
 * @param codBus
 * @param codParadaInicio
 * @param codParadaFin
 * @param fecha
 * @param hora
 * @param DNI
 * @param precio
 * 
 */

public class Billete{
	//Atributos o propiedades:
	public int codBillete;
	public int nTrayecto;
	public String codLinea;
	public int codBus;
	public int codParadaInicio;
	public int codParadaFin;
	public int fecha;
	public int hora;
	public String DNI;
	public float precio;
	
	//Métodos 
	//constructor1: 
	public Billete(int codBillete, int nTrayecto, String codLinea, int codBus, int codParadaInicio, int codParadaFin, int fecha, int hora, String DNI, float precio) {
		this.setCodBillete(codBillete);
		this.setnTrayecto(nTrayecto);
		this.setCodLinea(codLinea);	
		this.setCodBus(codBus);	
		this.setCodParadaInicio(codParadaInicio);	
		this.setCodParadaFin(codParadaFin);	
		this.setFecha(fecha);	
		this.setHora(hora);	
		this.setDNI(DNI);	
		this.setPrecio(precio);	
	}
	
	//Geters y Seters
	public int getCodBillete() {
		return codBillete;
	}

	public void setCodBillete(int codBillete) {
		this.codBillete = codBillete;
	}

	public int getnTrayecto() {
		return nTrayecto;
	}

	public void setnTrayecto(int nTrayecto) {
		this.nTrayecto = nTrayecto;
	}

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

	public int getCodParadaInicio() {
		return codParadaInicio;
	}

	public void setCodParadaInicio(int codParadaInicio) {
		this.codParadaInicio = codParadaInicio;
	}

	public int getCodParadaFin() {
		return codParadaFin;
	}

	public void setCodParadaFin(int codParadaFin) {
		this.codParadaFin = codParadaFin;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	
	
}