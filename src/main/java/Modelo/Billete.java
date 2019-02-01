package Modelo;

import java.sql.Date;
import java.sql.Time;

/**
 *Clase Billete: 
 * @param codBillete
 * @param nTrayecto
 * @param codLineaTemp
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
	public Autobus autobus;
	public Parada paradaInicio;
	public Parada paradaFin;
	public Date fecha;
	public String DNI;
	public float precio;
	
	//Métodos 
	//constructor1: 
	public Billete(int codBillete, int nTrayecto, String codLinea, Autobus autobus, Parada paradaInicio, Parada paradaFin, Date fecha, Cliente cliente, float precio) {
		this.codBillete=codBillete;
		this.nTrayecto=nTrayecto;
		this.codLinea=codLinea;	
		this.autobus=autobus;	
		this.paradaInicio=paradaInicio;	
		this.paradaFin=paradaFin;	
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

	public Autobus getAutobus() {
		return autobus;
	}

	public void setAutobus(Autobus autobus) {
		this.autobus = autobus;
	}

	public Parada getCodParadaInicio() {
		return paradaInicio;
	}

	public void setCodParadaInicio(Parada codParadaInicio) {
		this.paradaInicio = codParadaInicio;
	}

	public Parada getCodParadaFin() {
		return paradaFin;
	}

	public void setCodParadaFin(Parada paradaFin) {
		this.paradaFin = paradaFin;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
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