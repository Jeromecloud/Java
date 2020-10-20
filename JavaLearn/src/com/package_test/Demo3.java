package com.package_test;

import java.io.File;
import java.util.Date;

/**IOÁ÷
 * @author Jerome
 *
 */
public class Demo3 {
	public static void main(String[] args) {
		File file = new File("E:\\Code");
		System.out.println(file.getName());//Code
		System.out.println(file.getPath());//E:\Code
		System.out.println(file.getParent());//E:\
		System.out.println(file.getAbsolutePath());//E:\Code
		System.out.println(file.canRead());//true
		System.out.println(file.getAbsoluteFile());//E:\Code
		System.out.println(file.isAbsolute());//true
		System.out.println(file.isFile());//false
		System.out.println(file.isDirectory());//true
		System.out.println(file.isHidden());//false
		System.out.println(file.lastModified());//1601281261797
		long time = file.lastModified();
		Date date = new Date(time);
		System.out.println(date);//Mon Sep 28 16:21:01 CST 2020
		System.out.println(file.length());//0
	}
}
