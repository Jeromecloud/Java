package homework4;

//9��	�� 
//(1)public static char[] toCharArray(String str) :
//	�������Ĳ����ַ���ת�ɶ�Ӧ���ַ����飨����ֱ�ӵ���jdk�еĹ����༰String���е�tocharArray������ 
//(2) public static String getSingleString(String str) :
//	ȥ�������Ĳ����ַ����е��ط��ַ����ظ��ַ�ֻ����һ���������µ��ַ�������
//(3)public static boolean isBalancedString(String str):
//	������������ַ���ͬ�򷵻�true�����򷵻�false�� ���磺abccba�ǶԳ��ַ� ���磺abcdecba���ǶԳ��ַ�
public class Test9 {
}

class MyStringUtil {
	public static char[] toCharArray(String str) {
		// 1. ����char���͵�����, ���ȴ�С��ԭ�ַ�������һ��
		char[] arr = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			// 2. ͨ��charAt�����õ�ÿһ���ַ�,���Ҹ�ֵ�������ж�Ӧ������.
			arr[i] = str.charAt(i);
		}
		return arr;
	}

	public static String getSingleString(String str) {
		// 1. ���ַ�����ֳ��ַ�����
		char[] arr = str.toCharArray();
		// 2. �����µ�����, �����洢Ψһ���ַ�
		StringBuffer sb = new StringBuffer();
		// 3. �����ַ������õ�ÿһ���ַ�
		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];
			// 4. ����ÿһ���ַ�,�ж��������Ƿ����������ַ���.
			if (!sb.toString().contains(c + "")) {
				// 5. ����������ʹ洢
				sb.append(c);
			}
		}
		return sb.toString();

	}

	public static boolean isBalancedString(String str) {
		// 1. ��������ַ�����װ��StringBuffer����
		StringBuffer sb = new StringBuffer(str);
		// 2. �����ݷ�ת
		sb.reverse();
		// 3. �����ת��Ľ����ԭ�ַ�����ͬ, ˵���ǶԳ��ַ���
		if (str.equals(sb.toString())) {
			return true;
		} else {
			return false;
		}
	}
}
