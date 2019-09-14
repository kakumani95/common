package com.icon.common.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringUtils {

	public static String getCurrentDateString() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		return  dateFormat.format(date);
	}
	
	public static Date getCurrentDate() throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return dateFormat.parse(getCurrentDateString());
	}
	
	public static void main(String[] args) {
		//System.out.println(getCurrentDateString());
	}
}
