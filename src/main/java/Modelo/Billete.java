package Modelo;

import java.sql.Date;
import java.sql.Time;

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
	public String fecha;
	public String DNI;
	public float precio;
	
	//Métodos 
	//constructor1: 
	public Billete(int codBillete, int nTrayecto, String codLinea, int codBus, int codParadaInicio, int codParadaFin, String fecha, String DNI, float precio) {
		this.codBillete=codBillete;
		this.nTrayecto=nTrayecto;
		this.codLinea=codLinea;	
		this.codBus=codBus;	
		this.codParadaInicio=codParadaInicio;	
		this.codParadaFin=codParadaFin;	
		this.fecha=fecha;	
		this.DNI=DNI;	
		this.precio=precio;	
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

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
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