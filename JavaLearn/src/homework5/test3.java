package homework5;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//3������һ���ַ��������ա���-��-�� ʱ:��:�롱����ʽ�������ʽ��ȷ�������ΪDate���͵����ݡ�
public class test3 {
	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		DateFormat dateFormant = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
		System.out.println("������һ���ַ���������ʽ����-��-��  ʱ���֣��룩");
		String time = input.nextLine();
		String regx = "^[1-9]{4}-[0-1]\\d-[0-3]//d[0,2]\\d:[0-5]\\d:[0-5]\\d$";
		if(time.matches(regx)) {
			Date date = dateFormant.parse(time);
			System.out.println(date);
		}else {
			System.out.println("wrong");
		}
	}
}
