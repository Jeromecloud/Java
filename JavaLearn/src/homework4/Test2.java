package homework4;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
//2������һ��������Ҫ�����������ַ������գ���ʽyyyy-MM-dd����������ѳ��������죿


public class Test2 {
	//	�����ѳ���������
	public static void main(String[] args) throws ParseException {
		fundata();
	}

	public static void fundata() throws ParseException{
		System.out.println("���������ĳ������ڣ���ʽyyyy-MM-dd:");
		String birthdayString = new Scanner(System.in).next();
//			���ַ���ת��Ϊdate����
		SimpleDateFormat StoDate = new SimpleDateFormat("yyyy-MM-dd");
		Date birthdayDate = StoDate.parse(birthdayString);

//			��ȡ��ǰ����
		Date nowDate = new Date();
//			תΪ����ֵ���л���
		long nowSecond = nowDate.getTime();
		long birthdaySecond = birthdayDate.getTime();
		long second = nowSecond - birthdaySecond;
		if (second < 0) {
			System.out.println("�޷�����");
		} else {
			System.out.println(second / 1000 / 60 / 60 / 24);
		}

	}

}
