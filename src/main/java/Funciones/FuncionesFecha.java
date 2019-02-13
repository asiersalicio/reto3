package Funciones;

import java.util.Date;
import java.util.Calendar;
import java.util.Locale;
/**
 * Clase ControladorFecha: contiene los métodos para cambiar el formato de las variables de fechas.
 * @author IN1DM3B_18
 *
 */
public class FuncionesFecha {
	/**
	 * Método: CalendarToString
	 * @param fecha
	 * @return
	 */
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
	/**
	 * Método: DateToCalendar
	 * @param date
	 * @return
	 */
	public Calendar DateToCalendar(Date date){ 
		  Calendar cal = Calendar.getInstance();
		  cal.setTime(date);
		  return cal;
		}
	/** 
	 * Método: CalendarToDate
	 * @param calendar
	 * @return
	 */
	public Date CalendarToDate(Calendar cal){ 
		cal = Calendar.getInstance();
	    java.util.Date utilDate = cal.getTime();
	    System.out.println(utilDate);
	    return utilDate;
	}
	/**
	 * Método: CalendarToStringVisual
	 * @param fecha
	 * @return
	 */
	public static String CalendarToStringVisual(Calendar fecha)
	{
		String year=Integer.toString(fecha.get(Calendar.YEAR));
		String month=Integer.toString(fecha.get(Calendar.MONTH));
		String day=Integer.toString(fecha.get(Calendar.DAY_OF_MONTH));
		String monthVisual = fecha.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
		
		return day + " de " + monthVisual + " del " + year;

	}
}
