package homework1;

//1����ӡ�����е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ�������λ���������͵��ڸ�������
//���磺153��һ��"ˮ�ɻ���"����Ϊ153=1�����η���5�����η���3�����η���
public class Question1 {
	public static void main(String[] args) {
		System.out.println("ˮ�ɻ����ǣ�");
		for (int x = 100; x < 1000; x++) {
			int a = x / 100;// ��λ
			int b = (x / 10) % 10;// ʮλ
			int c = x % 10;// ��λ
			if (a * a * a + b * b * b + c * c * c == x) {
				System.out.println(x);
			}
		}
	}
}
