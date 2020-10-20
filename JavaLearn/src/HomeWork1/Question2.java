package HomeWork1;

// 2、题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
// 程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：
// (1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
// (2)如果n>k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数n,重复执行第一步。
// (3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")//自动提示加的
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个正整数：");
		int n = scanner.nextInt();//n为输入的正整数
		System.out.print(n + "=");
		for (int k = 2; k <= n; k++) { //k为查找的质因数
			while (n % k == 0 && k != n) {//判断k如果能够被整除且不等于n，即打印该因数；并将整除后的的数作为新的n重新计算。
				n /= k;
				System.out.print(k + "*");
			}
			if (n == k) {//判断n等于k，即代表已经求出最小质因数，循环结束
				System.out.println(k);
				break;
			}
		}
	}
}
