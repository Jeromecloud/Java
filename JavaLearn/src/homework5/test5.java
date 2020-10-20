package homework5;
//5、写一个方法验证输入的电话号码字符串是否是一个整除的电话号码。
//	 电话号码的写法一般有如下几种写法：电话号码位7位或者8位
//（1）56781733
//（2）01056781733
//（3）010-56781733
//（4）(010)-56781733
//（5）(010)56781733

public class test5 {
	void telephone(String phone) {
		String regex = "[010{7,8}|\\d{7,8}]";
		boolean result = phone.matches(regex);
	}
}
