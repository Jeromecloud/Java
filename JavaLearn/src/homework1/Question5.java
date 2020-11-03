package homework1;

import java.util.Scanner;

//5、输入一个年份，把该年的日历打印出来，格式如下：
//
//------------2019年1月-----------
//
//一   二   三   四   五   六   日
//	 1    2    3    4    5    6
//7    8    9    10   11   12   13
//14   15   16   17   18   19   20
//21   22   23   24   25   26   27
//28   29   30   31   
public class Question5 {
	public static void main(String[] args) {
		System.out.print("输入年份");
		// 输入年份
		Scanner yy = new Scanner(System.in);
		int type = yy.nextInt();
		// 未知
		String answer = "";
		// 定义月份
		int monthday;
		// 判断平年闰年
		boolean pingyear;
		// 定义年份变量
		int year = 0;
		do {
			// 判断闰年
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				pingyear = false;
			} else
				pingyear = true;
			// 对输入年份和1900年进行比较
			int sumyearday = 0, i = 1900;
			do {
				int x;
				if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
					x = 366;
				} else {
					x = 365;
				}
				sumyearday += x;
				i++;

			} while (i < year);
//			打印月份
			for (int m = 1; m < 13; m++) {
				System.out.println("------------------" + m + "月" + "--------------------------");
//			每个月的天数
				switch (m) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					monthday = 31;
					break;
				case 2:
					if (pingyear) {
						monthday = 28;
					} else {
						monthday = 29;
					}
					break;
				default:
					monthday = 30;
					break;
				}
//				 判断月初是周几
				int week = ((sumyearday + 2 % 7) % 7);
				System.out.println("\n日\t一\t二\t三\t四\t五\t六");
//				 打印空格
				for (int k = 0; k < week; k++) {
					System.out.print("\t");
				}
				// 打印天数
				for (int j = 0; j < monthday; j++) {
					System.out.print(j + 1 + "\t");
					if ((sumyearday + j + 1) % 7 == 6) {
						System.out.print("\n");
					}
				}
				System.out.print("\n");
				sumyearday = sumyearday + monthday;
			}

			answer = yy.next();

		} while (answer.equals("y"));

		System.out.println("结束");
	}

}
