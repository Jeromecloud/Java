package homework1;

import java.util.Scanner;

//5������һ����ݣ��Ѹ����������ӡ��������ʽ���£�
//
//------------2019��1��-----------
//
//һ   ��   ��   ��   ��   ��   ��
//	 1    2    3    4    5    6
//7    8    9    10   11   12   13
//14   15   16   17   18   19   20
//21   22   23   24   25   26   27
//28   29   30   31   
public class Question5 {
	public static void main(String[] args) {
		System.out.print("�������");
		// �������
		Scanner yy = new Scanner(System.in);
		int type = yy.nextInt();
		// δ֪
		String answer = "";
		// �����·�
		int monthday;
		// �ж�ƽ������
		boolean pingyear;
		// ������ݱ���
		int year = 0;
		do {
			// �ж�����
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				pingyear = false;
			} else
				pingyear = true;
			// ��������ݺ�1900����бȽ�
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
//			��ӡ�·�
			for (int m = 1; m < 13; m++) {
				System.out.println("------------------" + m + "��" + "--------------------------");
//			ÿ���µ�����
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
//				 �ж��³����ܼ�
				int week = ((sumyearday + 2 % 7) % 7);
				System.out.println("\n��\tһ\t��\t��\t��\t��\t��");
//				 ��ӡ�ո�
				for (int k = 0; k < week; k++) {
					System.out.print("\t");
				}
				// ��ӡ����
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

		System.out.println("����");
	}

}
