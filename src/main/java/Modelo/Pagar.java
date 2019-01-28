package Modelo;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Pagar {
	

		public static double porPagar(int dineroIntroducido,double aPagar,JTextField txtCambio2,JTextField txtfaltaporpagar,JButton BotonValidar)
		{
			float valorBillete=0;
			switch (dineroIntroducido)            // Mostramos al usuario su dinero introducido
			{
				case 1: valorBillete=200;
					aPagar=aPagar-valorBillete;
					if (Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)>0)
					{
						txtfaltaporpagar.setText(String.valueOf(Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)));
					}
					else
					{
						if (Float.parseFloat(txtCambio2.getText())==0)
						{
							txtCambio2.setText(String.valueOf(Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)*-1));
							txtfaltaporpagar.setText("0");
							BotonValidar.setVisible(true);
						}
					}
					break;
				
				case 2: valorBillete=100;
					aPagar=aPagar-valorBillete;
					if (Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)>0)
					{
						txtfaltaporpagar.setText(String.valueOf(Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)));
					}
					else
					{
						if (Float.parseFloat(txtCambio2.getText())==0)
						{
							txtCambio2.setText(String.valueOf(Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)*-1));
							txtfaltaporpagar.setText("0");
							BotonValidar.setVisible(true);
						}
					}
					break;
				
				case 3: valorBillete=50;
					aPagar=aPagar-valorBillete;
					if (Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)>0)
					{
						txtfaltaporpagar.setText(String.valueOf(Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)));
					}
					else
					{
						if (Float.parseFloat(txtCambio2.getText())==0)
						{
							txtCambio2.setText(String.valueOf(Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)*-1));
							txtfaltaporpagar.setText("0");
							BotonValidar.setVisible(true);
						}
					}
					break;
				
				case 4: valorBillete=20;
					aPagar=aPagar-valorBillete;
					if (Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)>0)
					{
						txtfaltaporpagar.setText(String.valueOf(Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)));
					}
					else
					{
						if (Float.parseFloat(txtCambio2.getText())==0)
						{
							txtCambio2.setText(String.valueOf(Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)*-1));
							txtfaltaporpagar.setText("0");
							BotonValidar.setVisible(true);
						}
					}
					break;
				
				case 5: valorBillete=10;
					aPagar=aPagar-valorBillete;
					if (Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)>0)
					{
						txtfaltaporpagar.setText(String.valueOf(Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)));
					}
					else
					{
						if (Float.parseFloat(txtCambio2.getText())==0)
						{
						txtCambio2.setText(String.valueOf(Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)*-1));
						txtfaltaporpagar.setText("0");
						BotonValidar.setVisible(true);
						}
						
					}
					break;
				
				case 6: valorBillete=5;
					aPagar=aPagar-valorBillete;
					if (Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)>0)
					{
						txtfaltaporpagar.setText(String.valueOf(Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)));
					}
					else
					{
						if (Float.parseFloat(txtCambio2.getText())==0)
						{
							txtCambio2.setText(String.valueOf(Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)*-1));
							txtfaltaporpagar.setText("0");
							BotonValidar.setVisible(true);
						}
						
					}
					break;
				
				case 7: valorBillete=2;
					aPagar=aPagar-valorBillete;
					if (Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)>0)
					{
						txtfaltaporpagar.setText(String.valueOf(Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)));
					}
					else
					{
						if (Float.parseFloat(txtCambio2.getText())==0)
						{
							txtCambio2.setText(String.valueOf(Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)*-1));
							txtfaltaporpagar.setText("0");
							BotonValidar.setVisible(true);
						}
						
					}
					break;
				
				case 8: valorBillete=1;
					aPagar=aPagar-valorBillete;
					if (Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)>0)
					{
						txtfaltaporpagar.setText(String.valueOf(Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)));
					}
					else
					{
						if (Float.parseFloat(txtCambio2.getText())==0)
						{
						txtCambio2.setText(String.valueOf(Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)*-1));
						txtfaltaporpagar.setText("0");
						BotonValidar.setVisible(true);
						}
						
					}
					break;
				
				case 9: valorBillete=(float) 0.5;
					aPagar=aPagar-valorBillete;
					if (Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)>0)
					{
						txtfaltaporpagar.setText(String.valueOf(Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)));
					}
					else
					{
						if (Float.parseFloat(txtCambio2.getText())==0)
						{
							txtCambio2.setText(String.valueOf(Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)*-1));
							txtfaltaporpagar.setText("0");
							BotonValidar.setVisible(true);
						}
						
					}
					break;
				
				case 10: valorBillete=(float) 0.2;
					aPagar=aPagar-valorBillete;
					if (Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)>0)
					{
						txtfaltaporpagar.setText(String.valueOf(Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)));
					}
					else
					{
						if (Float.parseFloat(txtCambio2.getText())==0)
						{
						txtCambio2.setText(String.valueOf(Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)*-1));
						txtfaltaporpagar.setText("0");
						BotonValidar.setVisible(true);
						}
						
					}
					break;
				
				case 11: valorBillete=(float) 0.1;
					aPagar=aPagar-valorBillete;
					if (Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)>0)
					{
						txtfaltaporpagar.setText(String.valueOf(Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)));
					}
					else
					{
						if (Float.parseFloat(txtCambio2.getText())==0)
						{
							txtCambio2.setText(String.valueOf(Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)*-1));
							txtfaltaporpagar.setText("0");
							BotonValidar.setVisible(true);
						}
						
					}
					break;
				
				case 12: valorBillete=(float) 0.05;
					aPagar=aPagar-valorBillete;
					if (Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)>0)
					{
						txtfaltaporpagar.setText(String.valueOf(Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)));
					}
					else
					{
						if (Float.parseFloat(txtCambio2.getText())==0)
						{
						txtCambio2.setText(String.valueOf(Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)*-1));
						txtfaltaporpagar.setText("0");
						BotonValidar.setVisible(true);
						}
						
					}
					break;
				
				case 13: valorBillete=(float) 0.02;
					aPagar=aPagar-valorBillete;
					if (Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)>0)
					{
						txtfaltaporpagar.setText(String.valueOf(Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)));
					}
					else
					{
						if (Float.parseFloat(txtCambio2.getText())==0)
						{
							txtCambio2.setText(String.valueOf(Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)*-1));
							txtfaltaporpagar.setText("0");
							BotonValidar.setVisible(true);
						}
						
					}
					break;
				
				case 14: valorBillete=(float) 0.01;
				if (Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)>0)
				{
					txtfaltaporpagar.setText(String.valueOf(Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)));
				}
				else
				{
					if (Float.parseFloat(txtCambio2.getText())==0)
					{
						txtCambio2.setText(String.valueOf(Formato2dec.formateador(Float.parseFloat(txtfaltaporpagar.getText()) - valorBillete)*-1));
						txtfaltaporpagar.setText("0");
						BotonValidar.setVisible(true);
					}
					
				}
				break;
			}
			return valorBillete;
		}
}
