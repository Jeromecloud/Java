package homework4;

//1����д���򣬴��ַ�����want you to know one thing"��ͳ�Ƴ���ĸ"n"�ĳ��ִ�����
public class Test1 {
	public static void main(String[] args) {

		//	�����ַ�������charAt����ָ���������� charֵ
		String list = "want you to know one thing";
		int count = 0;
		for (int i = 0; i < list.length(); i++) {
			if (list.charAt(i) == 'n') {
				count += 1;
			}
		}
		System.out.println("n ���ֵĴ�����" + count);
	}
}
