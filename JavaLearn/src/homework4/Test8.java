package homework4;

//8、把字符串 "khJHUduYwyOhajdADaisfLasnNANSMBhs" 中的字符按照 26 个英文字母的先后顺序进行排列。
public class Test8 {
	public static void main(String[] args) {
		String a1 = "khJHUduYwyOhajdADaisfLasnNANSMBhs";
		char[] b1 = a1.toCharArray();
		for (int i = 0; i < b1.length; i++) {
			for (int j = 0; j < b1.length; j++) {
				if(b1[i]<b1[j]) {
					char temp = 0;
					temp = b1[i];
					b1[i] = b1[j];
					b1[j] = temp;
				}
			}
		}
		for (char c : b1) {
			System.out.print(c);
		}
	}
}
