package homework3;

//	有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
public class Test3 {
	public static void main(String[] args) {
		int count = 0;
		for (int a = 1; a < 5; a++) {
			// 百位
			for (int b = 1; b < 5; b++) {
				// 十位
				for (int c = 1; c < 5; c++) {
					// 个位
					if (a != b && a != c && b != c) {
						System.out.println(a * 100 + b * 10 + c);
						count += 1;
					}
				}
			}
		}
		System.out.println("总共有" + count + "个数");
	}
}
