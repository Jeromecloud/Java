package homework3;

//	����ƹ����ӽ��б������������ˡ��׶�Ϊa,b,c���ˣ��Ҷ�Ϊx,y,z���ˡ��ѳ�ǩ������������������
//	���Ա����������������a˵������x�ȣ�c˵������x,z�ȣ��������ҳ��������ֵ������� 
public class Test5 {
	public static void main(String[] args) {
		String[] A = { "a", "b", "c" };
		String[] B = { "x", "y", "z" };
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if (!((i == 0 && j == 0) || (i == 2 && j == 0) || (i == 2 && j == 2))) {
					System.out.println("����������" + A[i] + "  VS  " + B[j]);
				}
			}
		}
	}
}
