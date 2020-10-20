package homework4;

import java.util.Scanner;

//11、定义一个方法：获取指定字符串中，大写字母、小写字母、数字的个数。
public class Test11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入:");
		String line = sc.nextLine();
		int big = 0;
		int small = 0;
		int num = 0;
		char[] arr = line.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];
			if (c >= 'A' && c <= 'Z') {
				big++;
			} else if (c >= 'a' && c <= 'z') {
				small++;
			} else if (c >= '0' && c <= '9') {
				num++;
			}
		}

		System.out.println(line + "中大写字母有:" + big + "个,小写字母有:" + small + "个,数字字符:" + num + "个");
	}
}
