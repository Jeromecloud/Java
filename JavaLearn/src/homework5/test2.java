package homework5;
//2��д��������֤�ַ����Ƿ���С��������ǣ������Ϊdouble���͵����ݣ���������ݵ�ƽ��ֵ������������ء�
public class test2 {
	public static Double getValue(String a ) {
		String b = "[\\.]";
		if(b.matches("^-?\\d+\\.\\d+$")) {
			double c = Double.parseDouble(b);
			return c*c;
		}else {
			return null;
		}
	}
}
