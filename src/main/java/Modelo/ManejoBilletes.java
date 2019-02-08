package Modelo;


import Controlador.ControlModelo;
import Vista.PaneCambioFinal;
import Vista.PanePago;

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
		public static void rellenarLista(PanePago panePago)
		{

			ManejoBilletes[] listaBilletes=new ManejoBilletes[14];
			listaBilletes[0]=new ManejoBilletes("Billete de 200",0);
			listaBilletes[1]=new ManejoBilletes("Billete de 100",0);
			listaBilletes[2]=new ManejoBilletes("Billete de 50",0);
			listaBilletes[3]=new ManejoBilletes("Billete de 20",0);
			listaBilletes[4]=new ManejoBilletes("Billete de 10",0);
			listaBilletes[5]=new ManejoBilletes("Billete de 5",0);
			listaBilletes[6]=new ManejoBilletes("Moneda de 2",0);
			listaBilletes[7]=new ManejoBilletes("Moneda de 1",0);
			listaBilletes[8]=new ManejoBilletes("Moneda de 50c",0);
			listaBilletes[9]=new ManejoBilletes("Moneda de 20c",0);
			listaBilletes[10]=new ManejoBilletes("Moneda de 10c",0);
			listaBilletes[11]=new ManejoBilletes("Moneda de 5c",0);
			listaBilletes[12]=new ManejoBilletes("Moneda de 2c",0);
			listaBilletes[13]=new ManejoBilletes("Moneda de 1c",0);
			
			float cambio=Float.parseFloat(panePago.txtCambio2.getText());
			Devolucion.Dinero(cambio, listaBilletes);
			
			
			
			for (int i=0;i<listaBilletes.length;i++)
			{
				if (listaBilletes[i].contadorBillete>0)
				{ 
					PaneCambioFinal.modelo2.addElement(listaBilletes[i].contadorBillete+" x "+listaBilletes[i].nombreBillete);
				}
			}
		}
		
		public static void RellenarDatosBillete(PanePago panePago) {
			float precio = ControlModelo.precio;
			if(ControlModelo.viajeDeVuelta) {
				PaneCambioFinal.lblparaTipo.setText("Ida y vuelta");
				precio=precio*2;
			}
			else
			{
				PaneCambioFinal.lblparaTipo.setText("Solo ida");
				
			}

			PaneCambioFinal.lblparaLinea.setText(ControlModelo.linea.getCodLinea() + ": " + ControlModelo.linea.getNombreLinea());
			PaneCambioFinal.lblparaTrayecto.setText(ControlModelo.paradaOrigen.getNombreParada() + " -> " + ControlModelo.paradaDestino.getNombreParada());
			PaneCambioFinal.lblparaPrecio.setText(Modelo.Formato2dec.formateador(precio)+ "€");
			//System.out.println(ControlModelo.billeteIda.codBillete);
			//PaneCambioFinal.lblCodigo.setText("<<<<<<<<"+ControlModelo.billeteIda.codBillete+">>>>>>>>>");
			//paneMostrarCompra.fieldFechaIda.setText(ControlModelo.fechaIda.toLocaleString());
			//panePago.txtaPagar2.setText(String.valueOf(Formato2dec.formateador(ControlModelo.precio)));
			//panePago.txtfaltaporpagar.setText(String.valueOf(Formato2dec.formateador(ControlModelo.precio)));
		}
}