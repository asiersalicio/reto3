package Modelo;

public class Devolucion {
	
	public static void Dinero (double cambio,ManejoBilletes[] listaBilletes)
	{
		int billetes=0;

		// Inicio
		
		int parteEntera=(int) cambio; 						// Casteammos cambio a int para coger solo la parte entera
		double parteDecimal=cambio-parteEntera;				// Restamos la parte entera a la parte total, nos quedamos solo con los decimales.
		parteDecimal=Formato2dec.formateador(parteDecimal); // Pasamos el formateador para reducir a dos decimales
		parteDecimal=parteDecimal*100;

		if (parteEntera>=100)
		{
			billetes=(int) (parteEntera/100);			// Calculamos el cambio de las centenas
			switch (billetes)
			{
				case 1: billetes=1;
					System.out.println("Billete de 100€");
					listaBilletes[1].sumarBillete();				
					break;
				case 2: billetes=2;
					System.out.println("Billete de 200€");
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
					System.out.println("Billete de 10€");
					listaBilletes[4].sumarBillete();
					break;
				case 2: billetes=2;
					System.out.println("Billete de 20€");
					listaBilletes[3].sumarBillete();
					break;
				case 3: billetes=3;
					System.out.println("Billete de 20€");
					System.out.println("Billete de 10€");
					listaBilletes[3].sumarBillete();
					listaBilletes[4].sumarBillete();
					break;
				case 4: billetes=4;
					System.out.println("Billete de 20€");
					System.out.println("Billete de 20€");
					listaBilletes[3].sumarBillete();
					listaBilletes[3].sumarBillete();
					break;
				case 5: billetes=5;
					System.out.println("Billete de 50€");
					listaBilletes[2].sumarBillete();
					break;
				case 6: billetes=6;
					System.out.println("Billete de 50€");
					System.out.println("Billete de 10€");
					listaBilletes[2].sumarBillete();
					listaBilletes[4].sumarBillete();
					break;
				case 7: billetes=7;
					System.out.println("Billete de 50€");
					System.out.println("Billete de 20€");
					listaBilletes[2].sumarBillete();
					listaBilletes[3].sumarBillete();
					break;
				case 8: billetes=8;
					System.out.println("Billete de 50€");
					System.out.println("Billete de 20€");
					System.out.println("Billete de 10€");
					listaBilletes[2].sumarBillete();
					listaBilletes[3].sumarBillete();
					listaBilletes[4].sumarBillete();
					break;
				case 9: billetes=9;
					System.out.println("Billete de 50€");
					System.out.println("Billete de 20€");
					System.out.println("Billete de 20€");
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
				System.out.println("Moneda de 1€");
				listaBilletes[7].sumarBillete();
				break;
			case 2: billetes=2;
				System.out.println("Moneda de 2€");
				listaBilletes[6].sumarBillete();
				break;
			case 3: billetes=3;
				System.out.println("Moneda de 2€");
				System.out.println("Moneda de 1€");
				listaBilletes[6].sumarBillete();
				listaBilletes[7].sumarBillete();

				break;
			case 4: billetes=4;
				System.out.println("Moneda de 2€");
				System.out.println("Moneda de 2€");
				listaBilletes[6].sumarBillete();
				listaBilletes[6].sumarBillete();
				break;
			case 5: billetes=5;
				System.out.println("Billete de 5€");
				listaBilletes[5].sumarBillete();
				break;
			case 6: billetes=6;
				System.out.println("Billete de 5€");
				System.out.println("Moneda de 1€");
				listaBilletes[5].sumarBillete();
				listaBilletes[7].sumarBillete();
				break;
			case 7: billetes=7;
				System.out.println("Billete de 5€");
				System.out.println("Moneda de 2€");
				listaBilletes[5].sumarBillete();
				listaBilletes[6].sumarBillete();
				break;
			case 8: billetes=8;
				System.out.println("Billete de 5€");
				System.out.println("Moneda de 2€");
				System.out.println("Moneda de 1€");
				listaBilletes[5].sumarBillete();
				listaBilletes[6].sumarBillete();
				listaBilletes[7].sumarBillete();
				break;
			case 9: billetes=9;
				System.out.println("Billete de 5€");
				System.out.println("Moneda de 2€");
				System.out.println("Moneda de 2€");
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
					System.out.println("Moneda de 10c");
					listaBilletes[10].sumarBillete();
					
					break;
				case 2: billetes=2;
					System.out.println("Moneda de 20c");
					listaBilletes[9].sumarBillete();
					break;
				case 3: billetes=3;
					System.out.println("Moneda de 20c");
					System.out.println("Moneda de 10c");
					listaBilletes[9].sumarBillete();
					listaBilletes[10].sumarBillete();
					break;
				case 4: billetes=4;
					System.out.println("Moneda de 20c");
					System.out.println("Moneda de 20c");
					listaBilletes[9].sumarBillete();
					listaBilletes[9].sumarBillete();
					break;
				case 5: billetes=5;
					System.out.println("Moneda de 50c");
					listaBilletes[8].sumarBillete();
					
					break;
				case 6: billetes=6;
					System.out.println("Moneda de 50c");
					System.out.println("Moneda de 10c");
					listaBilletes[8].sumarBillete();
					listaBilletes[10].sumarBillete();
					break;
				case 7: billetes=7;
					System.out.println("Moneda de 50c");
					System.out.println("Moneda de 20c");
					listaBilletes[8].sumarBillete();
					listaBilletes[9].sumarBillete();
					break;
				case 8: billetes=8;
					System.out.println("Moneda de 50c");
					System.out.println("Moneda de 20c");
					System.out.println("Moneda de 10c");
					listaBilletes[8].sumarBillete();
					listaBilletes[9].sumarBillete();
					listaBilletes[10].sumarBillete();
					break;
				case 9: billetes=9;
					System.out.println("Moneda de 50c");
					System.out.println("Moneda de 20c");
					System.out.println("Moneda de 20c");
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
				System.out.println("Moneda de 1c");
				listaBilletes[13].sumarBillete();
				break;
				case 2: billetes=2;
				System.out.println("Moneda de 2c");
				listaBilletes[12].sumarBillete();
				break;
				case 3: billetes=3;
				System.out.println("Moneda de 2c");
				System.out.println("Moneda de 1c");
				listaBilletes[12].sumarBillete();
				listaBilletes[13].sumarBillete();
				break;
				case 4: billetes=4;
				System.out.println("Moneda de 2c");
				System.out.println("Moneda de 2c");
				listaBilletes[12].sumarBillete();
				listaBilletes[12].sumarBillete();
				break;
				case 5: billetes=5;
				System.out.println("Moneda de 5c");
				listaBilletes[11].sumarBillete();
				break;
				case 6: billetes=6;
				System.out.println("Moneda de 5c");
				System.out.println("Moneda de 1c");
				listaBilletes[11].sumarBillete();
				listaBilletes[13].sumarBillete();
				break;
				case 7: billetes=7;
				System.out.println("Moneda de 5c");
				System.out.println("Moneda de 2c");
				listaBilletes[11].sumarBillete();
				listaBilletes[12].sumarBillete();
				break;
				case 8: billetes=8;
				System.out.println("Moneda de 5c");
				System.out.println("Moneda de 2c");
				System.out.println("Moneda de 1c");
				listaBilletes[11].sumarBillete();
				listaBilletes[12].sumarBillete();
				listaBilletes[13].sumarBillete();
				break;
				case 9: billetes=9;
				System.out.println("Moneda de 5c");
				System.out.println("Moneda de 2c");
				System.out.println("Moneda de 2c");
				listaBilletes[11].sumarBillete();
				listaBilletes[12].sumarBillete();
				listaBilletes[12].sumarBillete();
				break;
			}
		
	}

	
}
