package com.package_test;

/**������
 * @author Jerome
 *
 */
public class Demo1 {
	public void name() {
		System.out.println("package_test_Demo1_Name()");
		
	}
	public static void main(String[] args) {
		//getClass���ض��������
		/*	
			class Cat{
			}
			Cat c = new Cat();
			System.out.println(c.getClass().toString());//class com.package_test.Cat
		*/	
		//�����ڲ���
		/*
			abstract class Father{
				abstract void speak();
			}
			Father f = new Father() {
				@Override
				void speak() {
				}
			};
		*/
	}
}
