package com.package_test;

import java.io.File;

public class Demo4 {
	public static void main(String[] args) {
		String file_name = "E:\\Code";
		System.out.println(file_name);
		fileList(file_name);
	}

	public static void fileList(String file_name) {
		File file = new File(file_name);
		for (File string : file.listFiles()) {
			if (string.isFile()) {
				System.out.print("  ");
				System.out.println(string.getName());
			}
			if (string.isDirectory()) {
				for (File string_child : string.listFiles()) {
					if (string_child.isFile()) {
						System.out.print("  ");
						System.out.println(string.getName());
					}
					if (string_child.isDirectory()) {
						for (File string2_child : string.listFiles()) {
							System.out.println("    -" + string2_child.getName());
						}
					}

				}
			}

		}
	}
}
