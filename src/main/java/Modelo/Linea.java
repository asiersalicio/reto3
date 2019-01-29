package Modelo;
/**
 *Clase Linea: 
 * @param codLineaTemp
 * @param nombreLinea
 * 
 */
public class Linea {
	//Atributos o propiedades:
	public String codLinea;
	public String nombreLinea;
		
		//Métodos 
		//constructor1: 
		public Linea(String codLinea,  String nombreLinea) {
			this.codLinea=codLinea;
			this.nombreLinea=nombreLinea;	
		}

		public Linea() {
			
		}

		public String getCodLinea() {
			return codLinea;
		}

		public void setCodLinea(String codLinea) {
			this.codLinea = codLinea;
		}

		public String getNombreLinea() {
			return nombreLinea;
		}

		public void setNombreLinea(String nombreLinea) {
			this.nombreLinea = nombreLinea;
		}
}
