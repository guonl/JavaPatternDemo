package com.guonl.dateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDifference {

	public static void main(String[] args) {

		// 方法一：
		/*
		 * 现在是2004-03-26 13：31：40 过去是：2004-01-02 11：30：24
		 * 要获得两个日期差，差的形式为：XX天XX小时XX分XX秒
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		try {
			int countdown = 15;
			Date d1 = sdf.parse("2016-11-08 14:08:00");
			Date nowdate = new Date();
			int diff = (int) (( nowdate.getTime() - d1.getTime() ) / 1000);
			if(diff >= (countdown * 60)){
				System.out.println("大于15min");
				System.out.println(diff);
			}
			else{
				System.out.println("小于15min");
				System.out.println(diff);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
