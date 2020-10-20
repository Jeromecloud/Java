package homework5;
//1、编写一个方法，将字符串中的字母全部消除。
public class test1 {
	public static String method(String a) {
		return a.replaceAll("[a-zA-Z]", "");
	}
}
