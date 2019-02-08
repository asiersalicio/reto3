package Modelo;

import java.util.Calendar;
import java.util.Date;

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
	public Calendar fecha;
	public float precio;
	public Cliente cliente;
	
	//Métodos 
	//constructor1: 
	public Billete(int codBillete, int nTrayecto, String codLinea, Autobus autobus, Parada paradaInicio, Parada paradaFin, Calendar fechaIda, Cliente cliente, float precio) {
		this.codBillete=codBillete;
		this.nTrayecto=nTrayecto;
		this.codLinea=codLinea;	
		this.autobus=autobus;	
		this.paradaInicio=paradaInicio;	
		this.paradaFin=paradaFin;	
		this.fecha=fechaIda;	
		this.cliente=cliente;	
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

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente=cliente;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	
	
}