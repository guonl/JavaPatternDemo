package com.guonl.dateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	
	public static void main(String[] args) {
		
		/* 时间的格式：
		 * "yyyy年MM月dd日 HH时mm分ss秒"
		 * "yy/MM/dd HH:mm"
		 * "yyyy-MM-dd HH:mm:ss"
		 */
		System.out.println(getDate2String("yyyy-MM-dd HH:mm:ss"));
		
	}
	
	private static String getDate2String(String pattern){
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		Date now = new Date();
		System.out.println(now);
		return dateFormat.format(now);
	}

}
