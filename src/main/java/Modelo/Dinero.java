package Modelo;

public class Dinero {
	String nombreBillete;
	int contadorBillete;
	
	public Dinero(String nombrebillete, int contadorBillete)
	{
		this.nombreBillete=nombrebillete;
		this.contadorBillete=contadorBillete;
	}
	
	public void sumarBillete()
	{
		this.contadorBillete=this.contadorBillete + 1;
		System.out.print(this.contadorBillete+" "+this.contadorBillete);
	}
	
}
