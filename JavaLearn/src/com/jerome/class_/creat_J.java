package com.jerome.class_;

/**
 * 	�ྲ̬�����ڴ������ʵ��ʱ��������ڴ档
 * @author Jerome
 *
 */
public class creat_J {
	public static void main(String[] args) {
		
		/*1��ʵ����ʼ��
		Dog obj = new Dog(); 
		System.out.println(obj.name);//null
		System.out.println(obj.name = "java");//java
		System.out.println(Dog.count++);//0 
		System.out.println(Dog.count);//1
		*/ 
		
		// ����
		/*2�������͵���
		import com.package_test.Demo1;
		����1��com.package_test.Demo1 demo1 = new Demo1();
		����2��Demo1 demo1 = new Demo1();
		*/
		/*3�����赼��
		import com.package_test.*;
		Demo1 demo1 = new Demo1();
		*/
		
		// ��̬���룺ֻ���뾲̬��Ա������/������
		/*4������̬���루import static ��.��.��̬��Ա��
		import static java.lang.System.out;
		out.println("hello static import");//hello static import
		*/
		/*5��static-import-on-demand��������
		import static java.lang.Math.sqrt;
		System.out.println(sqrt(4.0));//2.0
		*/
	}  
}
class Dog{
	String name;
	static int count=0;
	String gender;
}
