package Controlador;
import java.text.DecimalFormat;
import java.text.ParseException;

public class ControlFormato {

	static DecimalFormat formateado2Dec=new DecimalFormat("###0.##"); 
	static DecimalFormat formateadoBillete=new DecimalFormat("########"); 
	public static double Formateado2Dec(double numero)
	{
		try {
			numero=formateado2Dec.parse(formateado2Dec.format(numero)).doubleValue();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return numero;
	}
	
	public static String FormatoBillete(int codBillete)
	{
			String codBilleteVuelta=String.format("%08d", codBillete);
		return codBilleteVuelta;
	}
}
