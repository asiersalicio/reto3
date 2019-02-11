package Modelo;

import javax.swing.JButton;
import javax.swing.JTextField;

import Controlador.ControlFormato;
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
		public static void pagar(int dineroIntroducido,PanePago panePago)
		{
			float aPagar=Float.parseFloat(panePago.txtfaltaporpagar.getText());
			System.out.println("aPagar "+aPagar);
			float valorBillete=0;
			switch (dineroIntroducido)            // Restamos la cantidad de dinero introducido a la cantidad total.
			{

					
					case 1: valorBillete=200;
					if (aPagar>0)
					{
						aPagar=aPagar-valorBillete;
						if (aPagar>0)
						{
							panePago.txtfaltaporpagar.setText(String.valueOf(ControlFormato.Formateado2Dec(aPagar)));
						}
						else
						{
							panePago.txtfaltaporpagar.setText("0");
							aPagar=aPagar*-1;
							panePago.txtCambio2.setText(String.valueOf(ControlFormato.Formateado2Dec(aPagar)));
							panePago.btnImpresionBillete.setVisible(true);
						}
					}
					
					break;
					case 2: valorBillete=100;
					if (aPagar>0)
					{
						aPagar=aPagar-valorBillete;
						if (aPagar>0)
						{
							panePago.txtfaltaporpagar.setText(String.valueOf(ControlFormato.Formateado2Dec(aPagar)));
						}
						else
						{
							panePago.txtfaltaporpagar.setText("0");
							aPagar=aPagar*-1;
							panePago.txtCambio2.setText(String.valueOf(ControlFormato.Formateado2Dec(aPagar)));
							panePago.btnImpresionBillete.setVisible(true);
						}
					}
					
					break;
					case 3: valorBillete=50;
					if (aPagar>0)
					{
						aPagar=aPagar-valorBillete;
						if (aPagar>0)
						{
							panePago.txtfaltaporpagar.setText(String.valueOf(ControlFormato.Formateado2Dec(aPagar)));
						}
						else
						{
							panePago.txtfaltaporpagar.setText("0");
							aPagar=aPagar*-1;
							panePago.txtCambio2.setText(String.valueOf(ControlFormato.Formateado2Dec(aPagar)));
							panePago.btnImpresionBillete.setVisible(true);
						}
					}
					
					break;
					case 4: valorBillete=20;
					if (aPagar>0)
					{
						aPagar=aPagar-valorBillete;
						if (aPagar>0)
						{
							panePago.txtfaltaporpagar.setText(String.valueOf(ControlFormato.Formateado2Dec(aPagar)));
						}
						else
						{
							panePago.txtfaltaporpagar.setText("0");
							aPagar=aPagar*-1;
							panePago.txtCambio2.setText(String.valueOf(ControlFormato.Formateado2Dec(aPagar)));
							panePago.btnImpresionBillete.setVisible(true);
						}
					}
					
					break;
					case 5: valorBillete=10;
					if (aPagar>0)
					{
						aPagar=aPagar-valorBillete;
						if (aPagar>0)
						{
							panePago.txtfaltaporpagar.setText(String.valueOf(ControlFormato.Formateado2Dec(aPagar)));
						}
						else
						{
							panePago.txtfaltaporpagar.setText("0");
							aPagar=aPagar*-1;
							panePago.txtCambio2.setText(String.valueOf(ControlFormato.Formateado2Dec(aPagar)));
							panePago.btnImpresionBillete.setVisible(true);
						}
					}
					
					break;
					case 6: valorBillete=5;
					if (aPagar>0)
					{
						aPagar=aPagar-valorBillete;
						if (aPagar>0)
						{
							panePago.txtfaltaporpagar.setText(String.valueOf(ControlFormato.Formateado2Dec(aPagar)));
						}
						else
						{
							panePago.txtfaltaporpagar.setText("0");
							aPagar=aPagar*-1;
							panePago.txtCambio2.setText(String.valueOf(ControlFormato.Formateado2Dec(aPagar)));
							panePago.btnImpresionBillete.setVisible(true);
						}
					}
					
					break;
					case 7: valorBillete=2;
					if (aPagar>0)
					{
						aPagar=aPagar-valorBillete;
						if (aPagar>0)
						{
							panePago.txtfaltaporpagar.setText(String.valueOf(ControlFormato.Formateado2Dec(aPagar)));
						}
						else
						{
							panePago.txtfaltaporpagar.setText("0");
							aPagar=aPagar*-1;
							panePago.txtCambio2.setText(String.valueOf(ControlFormato.Formateado2Dec(aPagar)));
							panePago.btnImpresionBillete.setVisible(true);
						}
					}
					
					break;
					case 8: valorBillete=1;
					if (aPagar>0)
					{
						aPagar=aPagar-valorBillete;
						if (aPagar>0)
						{
							panePago.txtfaltaporpagar.setText(String.valueOf(ControlFormato.Formateado2Dec(aPagar)));
						}
						else
						{
							panePago.txtfaltaporpagar.setText("0");
							aPagar=aPagar*-1;
							panePago.txtCambio2.setText(String.valueOf(ControlFormato.Formateado2Dec(aPagar)));
							panePago.btnImpresionBillete.setVisible(true);
						}
					}
					
					break;
					
					case 9: valorBillete=(float)0.50;
					if (aPagar>0)
					{
						aPagar=aPagar-valorBillete;
						if (aPagar>0)
						{
							panePago.txtfaltaporpagar.setText(String.valueOf(ControlFormato.Formateado2Dec(aPagar)));
						}
						else
						{
							panePago.txtfaltaporpagar.setText("0");
							aPagar=aPagar*-1;
							panePago.txtCambio2.setText(String.valueOf(ControlFormato.Formateado2Dec(aPagar)));
							panePago.btnImpresionBillete.setVisible(true);
						}
					}
			
					break;
					case 10: valorBillete=(float)0.20;
					if (aPagar>0)
					{
						aPagar=aPagar-valorBillete;
						if (aPagar>0)
						{
							panePago.txtfaltaporpagar.setText(String.valueOf(ControlFormato.Formateado2Dec(aPagar)));
						}
						else
						{
							panePago.txtfaltaporpagar.setText("0");
							aPagar=aPagar*-1;
							panePago.txtCambio2.setText(String.valueOf(ControlFormato.Formateado2Dec(aPagar)));
							panePago.btnImpresionBillete.setVisible(true);
						}
					}
					
					break;
					case 11: valorBillete=(float)0.10;
					if (aPagar>0)
					{
						aPagar=aPagar-valorBillete;
						if (aPagar>0)
						{
							panePago.txtfaltaporpagar.setText(String.valueOf(ControlFormato.Formateado2Dec(aPagar)));
						}
						else
						{
							panePago.txtfaltaporpagar.setText("0");
							aPagar=aPagar*-1;
							panePago.txtCambio2.setText(String.valueOf(ControlFormato.Formateado2Dec(aPagar)));
							panePago.btnImpresionBillete.setVisible(true);
						}
					}
					break;
					
					case 12: valorBillete=(float)0.05;
					if (aPagar>0)
					{
						aPagar=aPagar-valorBillete;
						if (aPagar>0)
						{
							panePago.txtfaltaporpagar.setText(String.valueOf(ControlFormato.Formateado2Dec(aPagar)));
						}
						else
						{
							panePago.txtfaltaporpagar.setText("0");
							aPagar=aPagar*-1;
							panePago.txtCambio2.setText(String.valueOf(ControlFormato.Formateado2Dec(aPagar)));
							panePago.btnImpresionBillete.setVisible(true);
						}
					}
					
					break;
					case 13: valorBillete=(float)0.02;
					if (aPagar>0)
					{
						aPagar=aPagar-valorBillete;
						if (aPagar>0)
						{
							panePago.txtfaltaporpagar.setText(String.valueOf(ControlFormato.Formateado2Dec(aPagar)));
						}
						else
						{
							panePago.txtfaltaporpagar.setText("0");
							aPagar=aPagar*-1;
							panePago.txtCambio2.setText(String.valueOf(ControlFormato.Formateado2Dec(aPagar)));
							panePago.btnImpresionBillete.setVisible(true);
						}
					}
					
					break;
					case 14: valorBillete=(float)0.01;
					if (aPagar>0)
					{
						aPagar=aPagar-valorBillete;
						if (aPagar>0)
						{
							panePago.txtfaltaporpagar.setText(String.valueOf(ControlFormato.Formateado2Dec(aPagar)));
						}
						else
						{
							panePago.txtfaltaporpagar.setText("0");
							aPagar=aPagar*-1;
							panePago.txtCambio2.setText(String.valueOf(ControlFormato.Formateado2Dec(aPagar)));
							panePago.btnImpresionBillete.setVisible(true);
						}
					}
					
					break;
			}
		}
}

