package com.spring.movie.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarUtil {

	public static Calendar stringToCalendar(String formatoFecha, String fecha) throws ParseException{
			 
			DateFormat dateFormat = new SimpleDateFormat(formatoFecha);
			Date date = (Date)dateFormat.parse(fecha); 
			 
			Calendar calendar = Calendar.getInstance();
			calendar.setTimeInMillis(date.getTime());			 
			return calendar;
	}
	
	public static String getDate(String formatoFecha) throws ParseException{
		 
		Calendar calendar = Calendar.getInstance();
		Date date = new Date(calendar.getTimeInMillis());
		DateFormat dateFormat = new SimpleDateFormat(formatoFecha);
		String strToday = dateFormat.format(date);
		return strToday;
	}
	
	public static String calendarToString(String formatoFecha, Calendar calendar){
		Date date = new Date(calendar.getTimeInMillis());
		DateFormat dateFormat = new SimpleDateFormat(formatoFecha);
		String strToday = dateFormat.format(date);
		return strToday;
	}

	public static boolean esFechaValida(String formatoFecha, String fecha){
		try {
			stringToCalendar(formatoFecha, fecha);
			return true;
		} catch (Exception e) {
			
			return false;
		} 
		
	}
	
	public static Date restarDias(Date date,int dias){
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(date.getTime());
		calendar.add(Calendar.DATE, -dias);
		
		return calendar.getTime();
	}
	
	public static Date agregarDias(Date date,int dias){
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(date.getTime());
		calendar.add(Calendar.DATE, dias);
		
		return calendar.getTime();
	}
}
