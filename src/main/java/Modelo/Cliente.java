package Modelo;

import java.util.Calendar;

/**
 *Clase Cliente: 
 * @param DNI
 * @param nombreCliente 
 * @param apellidos
 * @param fechaNac
 * @param sexo
 * @param contrasena
 * 
 */

public class Cliente{
	//Atributos o propiedades:
	private String DNI;
	private String nombreCliente;
	private String apellidos;
	private Calendar fechaNac;
	private String sexo;
	private String contrasena;

	//Métodos 
	//constructor1: 
	public Cliente(String DNI, String nombreCliente, String apellidos, Calendar fechaNac, String sexo, String contrasena) {
		this.DNI=DNI;
		this.nombreCliente=nombreCliente;
		this.apellidos=apellidos;
		this.fechaNac=fechaNac;
		this.sexo=sexo;
		this.contrasena=contrasena;
	}
	//Geters y Seters
	public Cliente() {
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Calendar getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Calendar date) {
		this.fechaNac = date;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String string) {
		this.sexo = string;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	

}