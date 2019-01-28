package Modelo;

public class ManejoBilletes {

		public String nombreBillete;
		public int contadorBillete;
		
		public ManejoBilletes(String nombreBillete,int contadorBillete)
		{
			this.nombreBillete=nombreBillete;
			this.contadorBillete=contadorBillete;
		}
		public String getnombreBillete()
		{
			return nombreBillete;
		}
		
		public double getcontadorBillete()
		{
			return contadorBillete;
		}
		public void sumarBillete()
		{
			this.contadorBillete=this.contadorBillete + 1;
			System.out.print(this.contadorBillete+" "+this.contadorBillete);
		
		}
}