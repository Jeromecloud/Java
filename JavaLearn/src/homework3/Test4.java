package homework3;
//	������������x,y,z���������������С���������

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������x��");
		int x = scanner.nextInt();
		System.out.println("����������y��");
		int y = scanner.nextInt();
		System.out.println("����������z��");
		int z = scanner.nextInt();
		if (x < y) {
			//	��֤ x С�� y
			int temp1 = 0;
			temp1 = x;
			x = y;
			y = temp1;
		}
		if (x > z) {
			//	��֤x����С��
			int temp2 = 0;
			temp2 = x;
			x = z;
			z = temp2;
		}
		if (z > x && z < y) {
			//	��֤ z ���� y
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
