package homework4;

import java.util.Random;

//10������String getStr(char[] chs)��̬������������Ҫ�󣺴�chs�������ȡ4��Ԫ�أ��ٺ�1��0-9֮��
//������0��9�����������һ������ַ����ַ�����
//	����main��������������ɣ�
//��1�����峤��Ϊ26��Ԫ��ֵΪ26����дӢ����ĸ������chs
//��2����������chs����getStr(char[] chs)��������ȡ����ֵ,���ڿ���̨��ӡ����ֵ
//
public class Test10 {
	public static void main(String[] args) {
		char[] arr = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

		System.out.println(getStr(arr));
	}

	public static String getStr(char[] chs) {
		// �����ȡ, ��Ҫ����Random����
		Random r = new Random();
		// ��Ҫ���ַ�ƴ�ӵ�һ��, ����һ������
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i <= 4; i++) {
			// ��������ĳ����������������
			int index = r.nextInt(chs.length);
			// ͨ������ȥ�����л�ȡԪ��,�洢����������
			sb.append(chs[index]);
		}
		// ͨ��nextInt�����������������0-9
		int num = r.nextInt(10);
		// �����ɵĽ����ӵ���������
		sb.append(num);
		// ת���ַ���������
		return sb.toString();
	}
}
