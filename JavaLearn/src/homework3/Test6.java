package homework3;

import java.util.Scanner;

//	��һ��������������ǵ������е�Ԫ�ش�С��������������һ������Ҫ��ԭ���Ĺ��ɽ������������С�
public class Test6 {
	public static void main(String[] args) {
		int[] array = {10,20,30,40,50,60,70,80,90};
		System.out.println("������һ������");
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
