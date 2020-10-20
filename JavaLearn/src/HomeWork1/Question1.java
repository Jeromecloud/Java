package HomeWork1;

//1、打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
//例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
public class Question1 {
	public static void main(String[] args) {
		System.out.println("水仙花数是：");
		for (int x = 100; x < 1000; x++) {
			int a = x / 100;// 百位
			int b = (x / 10) % 10;// 十位
			int c = x % 10;// 个位
			if (a * a * a + b * b * b + c * c * c == x) {
				System.out.println(x);
			}
		}
	}
}
