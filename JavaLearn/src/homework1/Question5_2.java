package homework1;

import java.util.Scanner;

public class Question5_2 {
	public static void main(String[] args) {
		Scanner yy = new Scanner(System.in);
		int year = yy.nextInt();
		System.out.println("Enter years:");
		// 判断闰年
		int mountOfYear = 0;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			mountOfYear = 366;
		}else mountOfYear = 365;
		//判断月份天数
		int days = 0;
		for (int month = 1;month <13;month++) {
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
			case 2:
				if (mountOfYear == 366) {
					days = 29;
				}else days = 28;
			default:
				days = 30;
			}
		}
		//判断周几
	}
}
