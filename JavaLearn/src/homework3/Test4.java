package homework3;
//	输入三个整数x,y,z，请把这三个数由小到大输出。

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入整数x：");
		int x = scanner.nextInt();
		System.out.println("请输入整数y：");
		int y = scanner.nextInt();
		System.out.println("请输入整数z：");
		int z = scanner.nextInt();
		if (x < y) {
			//	保证 x 小于 y
			int temp1 = 0;
			temp1 = x;
			x = y;
			y = temp1;
		}
		if (x > z) {
			//	保证x是最小的
			int temp2 = 0;
			temp2 = x;
			x = z;
			z = temp2;
		}
		if (z > x && z < y) {
			//	保证 z 大于 y
			int temp3 = 0;
			temp3 = z;
			z = y;
			y = temp3;
		}
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}
}
