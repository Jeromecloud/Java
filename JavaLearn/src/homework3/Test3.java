package homework3;

//	��1��2��3��4�����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣�
public class Test3 {
	public static void main(String[] args) {
		int count = 0;
		for (int a = 1; a < 5; a++) {
			// ��λ
			for (int b = 1; b < 5; b++) {
				// ʮλ
				for (int c = 1; c < 5; c++) {
					// ��λ
					if (a != b && a != c && b != c) {
						System.out.println(a * 100 + b * 10 + c);
						count += 1;
					}
				}
			}
		}
		System.out.println("�ܹ���" + count + "����");
	}
}
