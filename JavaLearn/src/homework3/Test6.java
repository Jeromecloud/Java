package homework3;

import java.util.Scanner;

//	对一个数组进行排序是得数组中的元素从小到大排序，现输入一个数，要求按原来的规律将它插入数组中。
public class Test6 {
	public static void main(String[] args) {
		int[] array = {10,20,30,40,50,60,70,80,90};
		System.out.println("请输入一个数：");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		for(int i = 0;i<array.length;i++) {
			if (x<array[i]) {
				int temp =0;
				temp = x;
				x = array[i];
				array[i] = temp;
			}
		}
		for (int element : array) {
			System.out.println(element);
		}
	}
}
