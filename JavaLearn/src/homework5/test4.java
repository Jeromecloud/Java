package homework5;

//4��дһ�����������û��������жϣ��û���ֻ�ܹ�����ĸ�����֡�_��ɣ��䳤��ֻ����6~15λ��

public class test4 {
	boolean judge(String name) {
		if(name.matches("\\w{6,15}")) {
			return true;
		}else {
			return false;
		}
	}
}
