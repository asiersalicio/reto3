package Modelo;
import java.text.DecimalFormat;
import java.text.ParseException;

public class Formato2dec {

	static DecimalFormat formateador=new DecimalFormat("###0.##"); 
	public static double formateador(double numero)
	{
		try {
			numero=formateador.parse(formateador.format(numero)).doubleValue();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return numero;
	}
}
