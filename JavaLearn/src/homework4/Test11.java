package homework4;

import java.util.Scanner;

//11������һ����������ȡָ���ַ����У���д��ĸ��Сд��ĸ�����ֵĸ�����
public class Test11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������:");
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

		System.out.println(line + "�д�д��ĸ��:" + big + "��,Сд��ĸ��:" + small + "��,�����ַ�:" + num + "��");
	}
}
