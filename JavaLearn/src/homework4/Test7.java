package homework4;

//7����ʮ��������һ��������������100����һ����ȫƽ�������ټ���268����һ����ȫƽ���������ʸ����Ƕ��٣�
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
