package Modelo;

import javax.swing.JButton;
import javax.swing.JTextField;

import Funciones.FuncionesFormato;
import Vista.PanePago;
/**
 * Clase: Pagar. Se gestiona el pago de los billetes.
 * @author IN1DM3B_18
 *
 */
public class Pagar {
	/**
	 * Método pagar:
	 * @param dineroIntroducido
	 * @param panePago
	 */
		public void Pago(int dineroIntroducido,PanePago panePago, float aPagar)
		{
			System.out.println("aPagar "+aPagar);
			float valorBillete=0;
			switch (dineroIntroducido) // Restamos la cantidad de dinero introducido a la cantidad total.
			{

					case 1: valorBillete=200;
					actualizarRestante(aPagar, valorBillete, panePago);
					break;
					
					case 2: valorBillete=100;
					actualizarRestante(aPagar, valorBillete, panePago);
					break;
					
					case 3: valorBillete=50;
					actualizarRestante(aPagar, valorBillete, panePago);
					break;
					
					case 4: valorBillete=20;
					actualizarRestante(aPagar, valorBillete, panePago);
					break;
					
					case 5: valorBillete=10;
					actualizarRestante(aPagar, valorBillete, panePago);
					break;
					
					case 6: valorBillete=5;
					actualizarRestante(aPagar, valorBillete, panePago);
					break;
					
					case 7: valorBillete=2;
					actualizarRestante(aPagar, valorBillete, panePago);
					break;
					
					case 8: valorBillete=1;
					actualizarRestante(aPagar, valorBillete, panePago);
					break;
					
					case 9: valorBillete=(float)0.50;
					actualizarRestante(aPagar, valorBillete, panePago);
					break;
					
					case 10: valorBillete=(float)0.20;
					actualizarRestante(aPagar, valorBillete, panePago);
					break;
					
					case 11: valorBillete=(float)0.10;
					actualizarRestante(aPagar, valorBillete, panePago);
					break;
					
					case 12: valorBillete=(float)0.05;
					actualizarRestante(aPagar, valorBillete, panePago);
					break;
					
					case 13: valorBillete=(float)0.02;
					actualizarRestante(aPagar, valorBillete, panePago);
					break;
					
					case 14: valorBillete=(float)0.01;
					actualizarRestante(aPagar, valorBillete, panePago);
					break;
			}
		}
		
		public void actualizarRestante(float aPagar, float valorBillete, PanePago panePago)
		{
			if (aPagar>0)
			{
				aPagar=aPagar-valorBillete;
				if (aPagar>0)
				{
					//Usar el metodo actulizar el metodo para llamar desde el controlador al metodo de la vista
					panePago.txtfaltaporpagar.setText(String.valueOf(FuncionesFormato.Formateado2Dec(aPagar)));
				}
				else
				{
					panePago.txtfaltaporpagar.setText("0");
					aPagar=aPagar*-1;
					panePago.txtCambio2.setText(String.valueOf(FuncionesFormato.Formateado2Dec(aPagar)));
					panePago.btnImpresionBillete.setVisible(true);
				}
			}
		}
}

