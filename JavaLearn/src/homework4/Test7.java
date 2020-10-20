package homework4;

//7、在十万以内有一个整数，它加上100后是一个完全平方数，再加上268又是一个完全平方数，请问该数是多少？
public class Test7 {
	public static void main(String[] args) {
		for (int i = 0; i < 100001; i++) {
			for (int j = 0; j < 100001; j++) {
				if ((Math.sqrt(j) - 268) == i + 100) {
					System.out.println(Math.sqrt(i + 100));
				}
			}
		}
	}
}
