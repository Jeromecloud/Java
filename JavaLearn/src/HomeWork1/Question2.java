package HomeWork1;

// 2����Ŀ����һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5��
// �����������n���зֽ���������Ӧ���ҵ�һ����С������k��Ȼ������������ɣ�
// (1)����������ǡ����n����˵���ֽ��������Ĺ����Ѿ���������ӡ�����ɡ�
// (2)���n>k����n�ܱ�k��������Ӧ��ӡ��k��ֵ������n����k����,��Ϊ�µ�������n,�ظ�ִ�е�һ����
// (3)���n���ܱ�k����������k+1��Ϊk��ֵ,�ظ�ִ�е�һ����
import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")//�Զ���ʾ�ӵ�
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ����������");
		int n = scanner.nextInt();//nΪ�����������
		System.out.print(n + "=");
		for (int k = 2; k <= n; k++) { //kΪ���ҵ�������
			while (n % k == 0 && k != n) {//�ж�k����ܹ��������Ҳ�����n������ӡ������������������ĵ�����Ϊ�µ�n���¼��㡣
				n /= k;
				System.out.print(k + "*");
			}
			if (n == k) {//�ж�n����k���������Ѿ������С��������ѭ������
				System.out.println(k);
				break;
			}
		}
	}
}
