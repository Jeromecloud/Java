package homework3;
//	�ж�101-200֮���ж��ٸ����������������������
public class Test1 {
	public static void main(String[] args) {
		for(int i = 101; i < 201; i++) {
			//	�ж��Ƿ�Ϊ��������i/jȡ���Ƿ����0���ж�
			boolean flag = false;
			for(int j = i-1 ; j > 1; j--) {
				if(i % j == 0) {
					flag = true;
					break;
				}
			}
			if(flag == false) {
				System.out.println(i + "Ϊ����");
			}
		}
	}
}


