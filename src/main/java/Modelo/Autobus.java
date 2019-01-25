package Modelo;
/**
 *Clase Autobus: 
 * @param codBus
 * @param nPlazas
 * @param consumoKM
 * @param color
 * 
 */
public class Autobus {
	//Atributos o propiedades:
	public int codBus;
	public int nPlazas;
	public float consumoKM;
	public String color;
	
	//Métodos 
	//constructor1: 
	public Autobus(int codBus, int nPlazas, float consumoKM, String color) {
		this.codBus=codBus;
		this.nPlazas=nPlazas;
		this.consumoKM=consumoKM;
		this.color=color;	
	}

	//Geters y Seters
	public int getCodBus() {
		return codBus;
	}

	public void setCodBus(int codBus) {
		this.codBus = codBus;
	}

	public int getnPlazas() {
		return nPlazas;
	}

	public void setnPlazas(int nPlazas) {
		this.nPlazas = nPlazas;
	}

	public float getConsumoKM() {
		return consumoKM;
	}

	public void setConsumoKM(float consumoKM) {
		this.consumoKM = consumoKM;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
