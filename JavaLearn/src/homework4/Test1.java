package homework4;

//1、编写程序，从字符串“want you to know one thing"中统计出字母"n"的出现次数。
public class Test1 {
	public static void main(String[] args) {

		//	运用字符串方法charAt返回指定索引处的 char值
		String list = "want you to know one thing";
		int count = 0;
		for (int i = 0; i < list.length(); i++) {
			if (list.charAt(i) == 'n') {
				count += 1;
			}
		}
		System.out.println("n 出现的次数是" + count);
	}
}
