package Controlador;

import java.util.Calendar;

public class ControladorFecha {

	
	public static String CalendarToString(Calendar fecha)
	{
		String year=Integer.toString(fecha.get(Calendar.YEAR));
		
		int monthInt=fecha.get(Calendar.MONTH);
		int diaInt=fecha.get(Calendar.DAY_OF_MONTH);
		String day=null;
		if(diaInt<10)
		{
			day="0"+Integer.toString(diaInt);
		}
		else
		{
			day=Integer.toString(diaInt);
		}
		
		String month=null;
		if(monthInt<10)
		{
			month="0"+Integer.toString(monthInt);
		}
		else
		{
			month=Integer.toString(monthInt);
		}
		return year+month+day;
	}
}
