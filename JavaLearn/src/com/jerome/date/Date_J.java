package com.jerome.date;
import java.util.Date;

public class Date_J {
	public static void main(String[] args) {
		Date date1 = new Date();//������1��ʹ�õ�ǰ���ں�ʱ������ʼ������
		Date date2 = new Date();//����һ���������ò����Ǵ�1970��1��1����ĺ�����
//		System.out.println(date1.after(date2));//(boolean)date1��date2֮�󷵻�true,���򷵻�false��
//		System.out.println(date1.before(date2));
		System.out.println(date1.toString());//(string)��Date����ת��ΪString�����
		System.out.println(date1.getTime());//(long)������ 1970 �� 1 �� 1 �� 00:00:00 GMT �����ĺ�������
//		date1.setTime(long time);//(�޷���ֵ)����ʱ��
		System.out.println(date1.toString());
		System.out.println(date2.toString());
	}
}
