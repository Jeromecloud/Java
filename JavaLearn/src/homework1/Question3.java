package homework1;
//3、一个数如果恰好等于它的因子之和，这个数就称为"完数"。

//例如：6=1＋2＋3.编程找出1000以内的所有完数。

public class Question3 {
	public static void main(String[] args) {
		int s;
		System.out.print("1000以内的完数：");
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
