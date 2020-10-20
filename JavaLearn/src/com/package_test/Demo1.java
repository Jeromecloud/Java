package com.package_test;

/**范例包
 * @author Jerome
 *
 */
public class Demo1 {
	public void name() {
		System.out.println("package_test_Demo1_Name()");
		
	}
	public static void main(String[] args) {
		//getClass返回对象的引用
		/*	
			class Cat{
			}
			Cat c = new Cat();
			System.out.println(c.getClass().toString());//class com.package_test.Cat
		*/	
		//匿名内部类
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
