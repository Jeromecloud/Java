package homework3;

import java.util.Scanner;

//	��������������m��n���������Լ������С��������
public class Test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������������m��");
		int m = scanner.nextInt();
		System.out.println("������������n��");
		int n = scanner.nextInt();

		System.out.println("��С�������ǣ�" + LeastCommonMultiple(m, n));
		System.out.println("���Լ���ǣ�" + MaximumCommonDivisor(m, n));

	}

	static int LeastCommonMultiple(int i, int j) {
		// ����������ȵı���
		int min = 0; // ��С������
		int m = i;
		int n = j;
		if (m < n) {
			//	��֤m>n
			int temp = 0;
			temp = m;
			m = n;
			n = temp;
		}
		boolean flag = false;
		for (int a = m; a < m * n && !flag; a++) {
			for (int b = n; b < m * n; b++) {
				if ((a % m == 0) && (b % n == 0) && a == b) {
				//	ͨ���ж�n�ı�������m�ı���������С������
					min = b;
					flag = true;
					break;
				}
			}
		}
		return min;
	}

	static int MaximumCommonDivisor(int i, int j) {
		// ����������ȵĹ�����
		int max = 0;// ���Լ��
		int m = i;
		int n = j;
		int max_m = 0;// m���������
		for (int a = 1; a < m; a++) {
			// ��m���������
			if (m % a == 0) {
				max_m = a;
				for (int b = 1; b < n; b++) {
					// ��n��������� ֱ���ж��Ƿ���max_m��ȣ����������
					if (n % b == 0 && b == max_m) {
						max = b;
					}
				}
			}
		}

		return max;
	}
}
