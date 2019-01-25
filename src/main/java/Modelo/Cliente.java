package Modelo;

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
	public String DNI;
	public String nombreCliente;
	public String apellidos;
	public String fechaNac;
	public String sexo;
	public String contrasena;

	//Métodos 
	//constructor1: 
	public Cliente(String DNI, String nombreCliente, String apellidos, String fechaNac, String sexo, String contrasena) {
		this.setDNI(DNI);
		this.setNombreCliente(nombreCliente);
		this.setApellidos(apellidos);
		this.setFechaNac(fechaNac);
		this.setSexo(sexo);
		this.setContrasena(contrasena);
	}

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

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	//Geters y Seters

}