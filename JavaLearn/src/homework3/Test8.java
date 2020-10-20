package homework3;

import java.util.Scanner;

//	有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后
//	留下的是原来第几号的那位。
public class Test8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入人数：");
		int N = scanner.nextInt();
		int[] sum = new int[N];
		int num = N;// 剩余的人数
		int count = 0;
		for (int i = 0; i < N; i++) {// 给数组赋值
			sum[i] = i + 1;
		}
		for (int j = 1; j < N; j++) {// 循环遍历数组
			for (int k = 0; k < N; k++) {// 遍历数组
				if (sum[k] == 0) {
					continue;// 如果数组中的元素为零，结束此次循环
				} else {
					count++;// 进行计数
					if (count == 3) {
						sum[k] = 0;// 当count为3时，将其对应的元素赋值为0
						count = 0;// 计数重新开始
						num--;// 元素中不为0的个数
					}
				}
				if (num == 1 && sum[k] != 0 && count == 1) {// count可以等于1或者2，不影响输出，当为3时，数组中全部元素为0，无输出
					System.out.println("最后剩下的是第" + sum[k] + "个人");
				}
			}
		}
	}
}
