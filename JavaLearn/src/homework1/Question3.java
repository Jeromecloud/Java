package homework1;
//3��һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ"����"��

//���磺6=1��2��3.����ҳ�1000���ڵ�����������

public class Question3 {
	public static void main(String[] args) {
		int s;
		System.out.print("1000���ڵ�������");
		for (int i = 1; i <= 1000; i++) {
			s = 0;
			for (int j = 1; j < i; j++)
				if (i % j == 0)
					s = s + j;
			if (s == i)
				System.out.print(i + " ");
		}
		System.out.println();
	}
}
