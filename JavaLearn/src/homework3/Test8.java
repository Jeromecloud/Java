package homework3;

import java.util.Scanner;

//	��n����Χ��һȦ��˳���źš��ӵ�һ���˿�ʼ��������1��3��������������3�����˳�Ȧ�ӣ������
//	���µ���ԭ���ڼ��ŵ���λ��
public class Test8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������������");
		int N = scanner.nextInt();
		int[] sum = new int[N];
		int num = N;// ʣ�������
		int count = 0;
		for (int i = 0; i < N; i++) {// �����鸳ֵ
			sum[i] = i + 1;
		}
		for (int j = 1; j < N; j++) {// ѭ����������
			for (int k = 0; k < N; k++) {// ��������
				if (sum[k] == 0) {
					continue;// ��������е�Ԫ��Ϊ�㣬�����˴�ѭ��
				} else {
					count++;// ���м���
					if (count == 3) {
						sum[k] = 0;// ��countΪ3ʱ�������Ӧ��Ԫ�ظ�ֵΪ0
						count = 0;// �������¿�ʼ
						num--;// Ԫ���в�Ϊ0�ĸ���
					}
				}
				if (num == 1 && sum[k] != 0 && count == 1) {// count���Ե���1����2����Ӱ���������Ϊ3ʱ��������ȫ��Ԫ��Ϊ0�������
					System.out.println("���ʣ�µ��ǵ�" + sum[k] + "����");
				}
			}
		}
	}
}
