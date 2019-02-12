package Funciones;
import java.text.DecimalFormat;
import java.text.ParseException;

public class FuncionesFormato {

	/**
	 * Este metodo formatea los numeros a dos decimales
	 */
	public static double Formateado2Dec(double numero)
	{
		DecimalFormat formateado2Dec=new DecimalFormat("###0.##");
		try {
			numero=formateado2Dec.parse(formateado2Dec.format(numero)).doubleValue();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return numero;
	}
	
	/**
	 * Este metodo devuelve el formato a mostrar en el billete
	 */
	public static String FormatoBillete(int codBillete)
	{
		String codBilleteVuelta=String.format("%08d", codBillete);
		return codBilleteVuelta;
	}
}
