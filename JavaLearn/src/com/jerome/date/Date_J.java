package com.jerome.date;
import java.util.Date;

public class Date_J {
	public static void main(String[] args) {
		Date date1 = new Date();//构造器1，使用当前日期和时间来初始化对象
		Date date2 = new Date();//接收一个参数，该参数是从1970年1月1日起的毫秒数
//		System.out.println(date1.after(date2));//(boolean)date1在date2之后返回true,否则返回false。
//		System.out.println(date1.before(date2));
		System.out.println(date1.toString());//(string)将Date类型转换为String并输出
		System.out.println(date1.getTime());//(long)返回自 1970 年 1 月 1 日 00:00:00 GMT 以来的毫秒数。
//		date1.setTime(long time);//(无返回值)设置时间
		System.out.println(date1.toString());
		System.out.println(date2.toString());
	}
}
