package homework4;

//9、	： 
//(1)public static char[] toCharArray(String str) :
//	将给定的参数字符串转成对应的字符数组（不能直接调用jdk中的工具类及String类中的tocharArray方法） 
//(2) public static String getSingleString(String str) :
//	去除给定的参数字符串中的重符字符（重复字符只保留一个），将新的字符串返回
//(3)public static boolean isBalancedString(String str):
//	如果左右两边字符相同则返回true，否则返回false， 例如：abccba是对称字符 例如：abcdecba不是对称字符
public class Test9 {
}

class MyStringUtil {
	public static char[] toCharArray(String str) {
		// 1. 创建char类型的数组, 长度大小跟原字符串长度一致
		char[] arr = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			// 2. 通过charAt方法拿到每一个字符,并且赋值给数组中对应的索引.
			arr[i] = str.charAt(i);
		}
		return arr;
	}

	public static String getSingleString(String str) {
		// 1. 将字符串拆分成字符数组
		char[] arr = str.toCharArray();
		// 2. 定义新的容器, 用来存储唯一的字符
		StringBuffer sb = new StringBuffer();
		// 3. 遍历字符数组拿到每一个字符
		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];
			// 4. 拿着每一个字符,判断容器中是否包含传入的字符串.
			if (!sb.toString().contains(c + "")) {
				// 5. 如果不包含就存储
				sb.append(c);
			}
		}
		return sb.toString();

	}

	public static boolean isBalancedString(String str) {
		// 1. 将传入的字符串封装成StringBuffer对象
		StringBuffer sb = new StringBuffer(str);
		// 2. 将数据翻转
		sb.reverse();
		// 3. 如果翻转后的结果跟原字符串相同, 说明是对称字符串
		if (str.equals(sb.toString())) {
			return true;
		} else {
			return false;
		}
	}
}
