package homework3;

import java.util.Scanner;

//	输入两个正整数m和n，求其最大公约数和最小公倍数。
public class Test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入正整数m：");
		int m = scanner.nextInt();
		System.out.println("请输入正整数n：");
		int n = scanner.nextInt();

		System.out.println("最小公倍数是：" + LeastCommonMultiple(m, n));
		System.out.println("最大公约数是：" + MaximumCommonDivisor(m, n));

	}

	static int LeastCommonMultiple(int i, int j) {
		// 迭代两者相等的倍数
		int min = 0; // 最小公倍数
		int m = i;
		int n = j;
		if (m < n) {
			//	保证m>n
			int temp = 0;
			temp = m;
			m = n;
			n = temp;
		}
		boolean flag = false;
		for (int a = m; a < m * n && !flag; a++) {
			for (int b = n; b < m * n; b++) {
				if ((a % m == 0) && (b % n == 0) && a == b) {
				//	通过判断n的倍数等于m的倍数来求最小公倍数
					min = b;
					flag = true;
					break;
				}
			}
		}
		return min;
	}

	static int MaximumCommonDivisor(int i, int j) {
		// 迭代两者相等的公因数
		int max = 0;// 最大公约数
		int m = i;
		int n = j;
		int max_m = 0;// m的最大质数
		for (int a = 1; a < m; a++) {
			// 求m的最大质数
			if (m % a == 0) {
				max_m = a;
				for (int b = 1; b < n; b++) {
					// 求n的最大质数 直接判断是否与max_m相等，若真则输出
					if (n % b == 0 && b == max_m) {
						max = b;
					}
				}
			}
		}

		return max;
	}
}
