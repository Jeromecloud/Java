package homework3;
//	判断101-200之间有多少个素数，并输出所有素数。
public class Test1 {
	public static void main(String[] args) {
		for(int i = 101; i < 201; i++) {
			//	判断是否为素数，用i/j取余是否等于0来判断
			boolean flag = false;
			for(int j = i-1 ; j > 1; j--) {
				if(i % j == 0) {
					flag = true;
					break;
				}
			}
			if(flag == false) {
				System.out.println(i + "为素数");
			}
		}
	}
}


