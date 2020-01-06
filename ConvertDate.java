package com.deloitte.empl.utils;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ConvertDate {
	public static Date parseDate(String date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		Date sqldate=null;
		try {
			java.util.Date dt = sdf.parse(date);
			sqldate = new Date(dt.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return sqldate;
	}
}
