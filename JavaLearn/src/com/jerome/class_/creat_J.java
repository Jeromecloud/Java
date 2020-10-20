package com.jerome.class_;

/**
 * 	类静态变量在创建类的实例时不会分配内存。
 * @author Jerome
 *
 */
public class creat_J {
	public static void main(String[] args) {
		
		/*1、实例初始化
		Dog obj = new Dog(); 
		System.out.println(obj.name);//null
		System.out.println(obj.name = "java");//java
		System.out.println(Dog.count++);//0 
		System.out.println(Dog.count);//1
		*/ 
		
		// 导包
		/*2、单类型导包
		import com.package_test.Demo1;
		方法1：com.package_test.Demo1 demo1 = new Demo1();
		方法2：Demo1 demo1 = new Demo1();
		*/
		/*3、按需导包
		import com.package_test.*;
		Demo1 demo1 = new Demo1();
		*/
		
		// 静态导入：只导入静态成员（变量/方法）
		/*4、单静态导入（import static 包.类.静态成员）
		import static java.lang.System.out;
		out.println("hello static import");//hello static import
		*/
		/*5、static-import-on-demand声明（）
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
