package Modelo;
/**
 * Clase: Devolucion, se gestiona la devolución que recibirá el cliente tras realizar su pago.
 * @author IN1DM3B_18
 *
 */
public class Devolucion {
	/**
	 * Método Dinero
	 * @param cambio
	 * @param listaBilletes
	 */
	public static void Dinero (double cambio,ManejoBilletes[] listaBilletes)
	{
		int billetes=0;
		int parteEntera=0;
		double parteDecimal=0.0;
		
		parteEntera=(int) cambio; 							// Casteammos cambio a int para coger solo la parte entera
		parteDecimal=cambio-parteEntera;					// Restamos la parte entera a la parte total, nos quedamos solo con los decimales.
		parteDecimal=Formato2dec.formateador(parteDecimal); // Pasamos el formateador para reducir a dos decimales
		parteDecimal=parteDecimal*100; 				  		// Convertimos en un numero entero la parte decimal para trabajar con ella.
		
														// Disponemos de un Array de 13 posiciones correspondientes a cada billete y moneda soportado 

		if (parteEntera>=100)
		{
			billetes=(int) (parteEntera/100);			// Calculamos el cambio de las centenas
			switch (billetes)
			{
				case 1: billetes=1;
					listaBilletes[1].sumarBillete();				
					break;
				case 2: billetes=2;
					listaBilletes[0].sumarBillete();
					
					break;
			}
		}
		if (parteEntera>=10)
		{
			billetes=(int) (parteEntera%100/10);		// Calculamos el cambio de las decenas
			switch (billetes)
			{
				case 1: billetes=1;
					listaBilletes[4].sumarBillete();
					break;
				case 2: billetes=2;
					listaBilletes[3].sumarBillete();
					break;
				case 3: billetes=3;
					listaBilletes[3].sumarBillete();
					listaBilletes[4].sumarBillete();
					break;
				case 4: billetes=4;
					listaBilletes[3].sumarBillete();
					listaBilletes[3].sumarBillete();
					break;
				case 5: billetes=5;
					listaBilletes[2].sumarBillete();
					break;
				case 6: billetes=6;
					listaBilletes[2].sumarBillete();
					listaBilletes[4].sumarBillete();
					break;
				case 7: billetes=7;
					listaBilletes[2].sumarBillete();
					listaBilletes[3].sumarBillete();
					break;
				case 8: billetes=8;
					listaBilletes[2].sumarBillete();
					listaBilletes[3].sumarBillete();
					listaBilletes[4].sumarBillete();
					break;
				case 9: billetes=9;
					listaBilletes[2].sumarBillete();
					listaBilletes[3].sumarBillete();
					listaBilletes[3].sumarBillete();
					break;
			}
		}
		
		billetes=(int) (parteEntera%10);		// calculamos el cambio de las unidades
		switch (billetes)
		{
			case 1: billetes=1;
				listaBilletes[7].sumarBillete();
				break;
			case 2: billetes=2;
				listaBilletes[6].sumarBillete();
				break;
			case 3: billetes=3;
				listaBilletes[6].sumarBillete();
				listaBilletes[7].sumarBillete();

				break;
			case 4: billetes=4;
				listaBilletes[6].sumarBillete();
				listaBilletes[6].sumarBillete();
				break;
			case 5: billetes=5;
				listaBilletes[5].sumarBillete();
				break;
			case 6: billetes=6;

				listaBilletes[5].sumarBillete();
				listaBilletes[7].sumarBillete();
				break;
			case 7: billetes=7;
				listaBilletes[5].sumarBillete();
				listaBilletes[6].sumarBillete();
				break;
			case 8: billetes=8;
				listaBilletes[5].sumarBillete();
				listaBilletes[6].sumarBillete();
				listaBilletes[7].sumarBillete();
				break;
			case 9: billetes=9;
				listaBilletes[5].sumarBillete();
				listaBilletes[6].sumarBillete();
				listaBilletes[6].sumarBillete();
				break;
			}
		if (parteDecimal>=10)
		{
			billetes=(int) (parteDecimal%100/10);		// Calculamos el cambio de las decenas de la parte decimal
			switch (billetes)
			{
				case 1: billetes=1;
					listaBilletes[10].sumarBillete();
					
					break;
				case 2: billetes=2;
					listaBilletes[9].sumarBillete();
					break;
				case 3: billetes=3;
					listaBilletes[9].sumarBillete();
					listaBilletes[10].sumarBillete();
					break;
				case 4: billetes=4;
					listaBilletes[9].sumarBillete();
					listaBilletes[9].sumarBillete();
					break;
				case 5: billetes=5;
					listaBilletes[8].sumarBillete();
					
					break;
				case 6: billetes=6;
					listaBilletes[8].sumarBillete();
					listaBilletes[10].sumarBillete();
					break;
				case 7: billetes=7;
					listaBilletes[8].sumarBillete();
					listaBilletes[9].sumarBillete();
					break;
				case 8: billetes=8;
					listaBilletes[8].sumarBillete();
					listaBilletes[9].sumarBillete();
					listaBilletes[10].sumarBillete();
					break;
				case 9: billetes=9;
					listaBilletes[8].sumarBillete();
					listaBilletes[9].sumarBillete();
					listaBilletes[9].sumarBillete();
					break;
			}
		}
		
		
		billetes=(int) (parteDecimal%10);		// calculamos el cambio de las unidades de la parte decimal
		switch (billetes)
			{
				case 1: billetes=1;
				listaBilletes[13].sumarBillete();
				break;
				case 2: billetes=2;
				listaBilletes[12].sumarBillete();
				break;
				case 3: billetes=3;
				listaBilletes[12].sumarBillete();
				listaBilletes[13].sumarBillete();
				break;
				case 4: billetes=4;
				listaBilletes[12].sumarBillete();
				listaBilletes[12].sumarBillete();
				break;
				case 5: billetes=5;
				listaBilletes[11].sumarBillete();
				break;
				case 6: billetes=6;
				listaBilletes[11].sumarBillete();
				listaBilletes[13].sumarBillete();
				break;
				case 7: billetes=7;
				listaBilletes[11].sumarBillete();
				listaBilletes[12].sumarBillete();
				break;
				case 8: billetes=8;
				listaBilletes[11].sumarBillete();
				listaBilletes[12].sumarBillete();
				listaBilletes[13].sumarBillete();
				break;
				case 9: billetes=9;
				listaBilletes[11].sumarBillete();
				listaBilletes[12].sumarBillete();
				listaBilletes[12].sumarBillete();
				break;
			}
		
	}

	
}
