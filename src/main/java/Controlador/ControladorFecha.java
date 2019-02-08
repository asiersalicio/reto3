package Controlador;

import java.sql.Date;
import java.util.Calendar;
import java.util.Locale;

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
	
	public static Calendar DateToCalendar(Date date){ 
		  Calendar cal = Calendar.getInstance();
		  cal.setTime(date);
		  return cal;
		}
	
	public static Date CalendarToDate(Calendar calendar){ 
		Calendar cal = Calendar.getInstance();
	    cal.clear();
	    java.util.Date utilDate = cal.getTime();
	    System.out.println(utilDate);
	    return (Date) utilDate;
	}

	public static String CalendarToStringVisual(Calendar fecha)
	{
		String year=Integer.toString(fecha.get(Calendar.YEAR));
		String month=Integer.toString(fecha.get(Calendar.MONTH));
		String day=Integer.toString(fecha.get(Calendar.DAY_OF_MONTH));
		String monthVisual = fecha.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
		
		return day + " de " + monthVisual + " del " + year;

	}
}
