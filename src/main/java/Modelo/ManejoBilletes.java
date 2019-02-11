package Modelo;


import Funciones.FuncionesFormato;
import Vista.PaneCambioFinal;
import Vista.PanePago;
import Vista.Vista;
/**
 * Clase: ManejoBilletes
 * @author IN1DM3B_18
 * @param nombreBillete
 * @param contadorBillete
 */
public class ManejoBilletes {

		public String nombreBillete;
		public int contadorBillete;
		
		public Vista vista;
		public Modelo modelo;
		
		public ManejoBilletes(Vista vista, Modelo modelo)
		{
			this.vista=vista;
			this.modelo=modelo;
		}
		
		public ManejoBilletes(String nombreBillete,int contadorBillete)
		{
			this.nombreBillete=nombreBillete;
			this.contadorBillete=contadorBillete;
		}

		public ManejoBilletes() {
		}

		public String getnombreBillete()
		{
			return nombreBillete;
		}
		
		public double getcontadorBillete()
		{
			return contadorBillete;
		}
		
		/**
		 * Método: sumarBillete
		 */
		public void sumarBillete()
		{
			this.contadorBillete=this.contadorBillete + 1;
			System.out.print(this.contadorBillete+" "+this.contadorBillete);
		}
		
		/**
		 * Método. rellenarLista
		 * @param panePago
		 */
		public void rellenarLista(PanePago panePago)
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
					vista.paneCambioFinal.modelo2.addElement(listaBilletes[i].contadorBillete+" x "+listaBilletes[i].nombreBillete);
				}
			}
		}
		
		/**
		 * Método: RellenarDatosBillete
		 * @param panePago
		 */
		public void RellenarDatosBillete(PanePago panePago) {
			float precio = modelo.precioIda;
			if(modelo.viajeDeVuelta) {
				vista.paneCambioFinal.lblparaTipo.setText("Ida y vuelta");
				precio=precio*2;
			}
			else
			{
				vista.paneCambioFinal.lblparaTipo.setText("Solo ida");
				
			}

			vista.paneCambioFinal.lblparaLinea.setText(modelo.linea.getCodLinea() + ": " + modelo.linea.getNombreLinea());
			vista.paneCambioFinal.lblparaTrayecto.setText(modelo.paradaOrigen.getNombreParada() + " -> " + modelo.paradaDestino.getNombreParada());
			vista.paneCambioFinal.lblparaPrecio.setText(FuncionesFormato.Formateado2Dec(precio)+ "€");
			vista.paneCambioFinal.lblCodIda.setText(FuncionesFormato.FormatoBillete(modelo.billeteIda.getCodBillete()));
			if(modelo.viajeDeVuelta)
				vista.paneCambioFinal.lblCodVuelta.setText(FuncionesFormato.FormatoBillete(modelo.billeteVuelta.getCodBillete()));
			//System.out.println(ControlModelo.billeteIda.codBillete);
			//PaneCambioFinal.lblCodigo.setText("<<<<<<<<"+ControlModelo.billeteIda.codBillete+">>>>>>>>>");
			//paneMostrarCompra.fieldFechaIda.setText(ControlModelo.fechaIda.toLocaleString());
			//panePago.txtaPagar2.setText(String.valueOf(Formato2dec.formateador(ControlModelo.precio)));
			//panePago.txtfaltaporpagar.setText(String.valueOf(Formato2dec.formateador(ControlModelo.precio)));
		}
}